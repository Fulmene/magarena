[
    new EntersBattlefieldTrigger() {
        @Override
        public MagicEvent executeTrigger(final MagicGame game,final MagicPermanent permanent, final MagicPayedCost payedCost) {
            return new MagicEvent(
                permanent,
                this,
                "Each player loses a third of his or her life, rounded up."
            );
        }
        @Override
        public void executeEvent(final MagicGame game, final MagicEvent event) {
            game.getAPNAP().each {
                final int life = it.getPositiveLife();
                final int amount = (int)(life + 2).intdiv(3);
                game.doAction(new ChangeLifeAction(it, -amount));
            }
        }
    }
]

