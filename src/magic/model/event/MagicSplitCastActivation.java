package magic.model.event;

import magic.data.CardDefinitions;
import magic.model.MagicCard;
import magic.model.MagicCardDefinition;
import magic.model.MagicColor;
import magic.model.MagicGame;
import magic.model.MagicAbility;
import magic.model.MagicLocationType;
import magic.model.MagicManaCost;
import magic.model.MagicSource;
import magic.model.MagicSubType;
import magic.model.MagicType;
import magic.model.MagicPayedCost;
import magic.model.MagicMessage;
import magic.model.condition.MagicCondition;
import magic.model.stack.MagicCardOnStack;
import magic.model.action.MagicPlayMod;
import magic.model.action.PutItemOnStackAction;
import magic.model.action.RemoveCardAction;
import magic.model.action.PlayCardFromStackAction;

import java.util.Collections;

public class MagicSplitCastActivation extends MagicHandCastActivation {

    protected final MagicCardDefinition cdef;

    public MagicSplitCastActivation(final MagicCardDefinition cdef) {
        super(
            MagicHandCastActivation.CARD_CONDITION,
            cdef.getActivationHints(),
            cdef.getName()
        );
        this.cdef = cdef;
    }

    @Override
    public Iterable<? extends MagicEvent> getCostEvent(final MagicCard source) {
        final MagicCardOnStack spell = genSplitSpell(source);
        final MagicManaCost modCost = source.getGame().modCost(
            MagicCard.createTokenCard(spell, spell.getController()),
            cdef.getCost()
        );
        return Collections.singletonList(
            new MagicPayManaCostEvent(
                spell,
                modCost
            )
        );
    }

    @Override
    public MagicEvent getEvent(final MagicSource source) {
        return new MagicEvent(
            source,
            EVENT_ACTION,
            "Play SN (" + cdef.getName() + ")"
        );
    }

    private MagicCardOnStack genSplitSpell(final MagicCard card) {
        return new MagicCardOnStack(
            card,
            MagicSplitCastActivation.this,
            card.getGame().getPayedCost()
        ) {
            @Override
            public MagicCardDefinition getCardDefinition() {
                return cdef;
            }
            @Override
            public boolean hasColor(final MagicColor color) {
                return cdef.hasColor(color);
            }
            @Override
            public boolean hasAbility(final MagicAbility ability) {
                return cdef.hasAbility(ability);
            }
            @Override
            public boolean hasSubType(final MagicSubType subType) {
                return cdef.hasSubType(subType);
            }
            @Override
            public boolean hasType(final MagicType type) {
                return cdef.hasType(type);
            }
            @Override
            public boolean canBeCountered() {
                return !hasAbility(MagicAbility.CannotBeCountered);
            }
            @Override
            public int getConvertedCost() {
                return cdef.getConvertedCost();
            }
            @Override
            public String getName() {
                return cdef.getName();
            }
        };
    }

    private final MagicEventAction EVENT_ACTION = (final MagicGame game, final MagicEvent event) -> {
        final MagicCard card = event.getCard();
        game.doAction(new RemoveCardAction(card,MagicLocationType.OwnersHand));
        game.doAction(new PutItemOnStackAction(genSplitSpell(card)));
    };

    /*
    @Override
    public MagicEvent getEvent(final MagicCardOnStack cardOnStack,final MagicPayedCost payedCost) {
        return new MagicEvent(
            cardOnStack,
            this,
            "Put " + MagicMessage.getCardToken("face-down creature", cardOnStack.getCard()) + " onto the battlefield."
        );
    }

    @Override
    public void executeEvent(final MagicGame game, final MagicEvent event) {
        final MagicCardOnStack spell = event.getCardOnStack();
        final MagicCardDefinition carddef = spell.getSource().getCardDefinition();
        game.doAction(new PlayCardFromStackAction(spell, carddef, MagicPlayMod.MORPH));
    }
    */
}
