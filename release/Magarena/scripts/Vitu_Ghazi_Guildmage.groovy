[
    new MagicPermanentActivation(
        [
            MagicManaCost.FOUR_GREEN_WHITE.getCondition(),
        ],
        new MagicActivationHints(MagicTiming.Flash),
        "Token") {
        @Override
        public MagicEvent[] getCostEvent(final MagicPermanent source) {
            return [new MagicPayManaCostEvent(source, source.getController(), MagicManaCost.FOUR_GREEN_WHITE)];
        }
        @Override
        public MagicEvent getPermanentEvent(final MagicPermanent source,final MagicPayedCost payedCost) {
            return new MagicEvent(
                source,
                this,
                "Put a 3/3 green Centaur creature token onto the battlefield."
            );
        }
        @Override
        public void executeEvent(
                final MagicGame game,
                final MagicEvent event,
                final Object[] choiceResults) {
            game.doAction(new MagicPlayTokenAction(event.getPlayer(), TokenCardDefinitions.get("Centaur3")));
        }
    },
    new MagicPermanentActivation(
        [
            MagicManaCost.TWO_GREEN_WHITE.getCondition(),
        ],
        new MagicActivationHints(MagicTiming.Flash),
        "Populate") {
        @Override
        public MagicEvent[] getCostEvent(final MagicPermanent source) {
            return [new MagicPayManaCostEvent(source, source.getController(), MagicManaCost.TWO_GREEN_WHITE)];
        }
        @Override
        public MagicEvent getPermanentEvent(final MagicPermanent source,final MagicPayedCost payedCost) {
            return new MagicEvent(
                source,
                this,
                "Populate."
            );
        }
        @Override
        public void executeEvent(
                final MagicGame game,
                final MagicEvent event,
                final Object[] choiceResults) {
            game.addEvent(new MagicPopulateEvent(event.getSource()));
        }
    }
]
