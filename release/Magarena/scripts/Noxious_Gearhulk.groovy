[
    new EntersBattlefieldTrigger() {
        @Override
        public MagicEvent executeTrigger(final MagicGame game,final MagicPermanent permanent, final MagicPayedCost payedCost) {
            return new MagicEvent(
                permanent,
                MagicTargetChoice.Negative("another target creature"),
                this,
                "PN may destroy another target creature.\$ If a creature is destroyed this way, PN gains life equal to its toughness."
            );
        }
        @Override
        public void executeEvent(final MagicGame game, final MagicEvent event) {
            event.processTargetPermanent(game, {
                def destroyAction = new DestroyAction(it);
                game.doAction(destroyAction);
                if (destroyAction.isDestroyed()) {
                    final int amount = MagicAmountFactory.SN_Toughness.getAmount(it, MagicPlayer.NONE);
                    game.doAction(new ChangeLifeAction(event.getPlayer(), amount));
                }
            });
        }
    }
]

