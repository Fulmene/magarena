package magic.data;

public enum MagicIcon {

    // White transparent icons used by various components of AbstractScreen.
    HEADER_ICON("headerIcon.png"),
    OPTIONS_ICON("w_book.png"),
    OPTIONBAR_ICON("w_book24.png"),
    REFRESH_ICON("w_refresh.png"),
    MULLIGAN_ICON("w_mulligan.png"),
    HAND_ICON("w_hand.png"),
    TILED_ICON("w_tiled.png"),
    SAVE_ICON("w_save.png"),
    LOAD_ICON("w_load.png"),
    SWAP_ICON("w_swap.png"),
    DECK_ICON("w_deck.png"),
    NEXT_ICON("w_next.png"),
    BACK_ICON("w_back.png"),
    LIFE_ICON("w_life.png"),
    TARGET_ICON("w_target.png"),
    CUBE_ICON("w_cube.png"),
    LANDS_ICON("w_lands.png"),
    CREATURES_ICON("w_creatures.png"),
    SPELLS_ICON("w_spells.png"),
    EDIT_ICON("w_edit.png"),
    HELP_ICON("w_help.png"),
    OPEN_ICON("w_open.png"),
    RANDOM_ICON("w_random32.png"),
    CLEAR_ICON("w_clear28.png"),
    FILTER_ICON("w_filter24.png"),
    ARROWDOWN_ICON("w_arrowdown.png"),
    ARROWUP_ICON("w_arrowup.png"),
    PLUS_ICON("w_plus28.png"),
    MINUS_ICON("w_minus28.png"),
    
    MISSING_ICON("missing2.png"),
    ARENA("arena.png"),
    ANY("any.png"),
    FOLDER("folder.png"),
    LOG("log.png"),
    OK("ok.gif"),
    CANCEL("cancel.gif"),
    FORWARD("forward.png"),
    FORWARD2("forward2.png"),
    START("start.png"),
    STOP("stop.png"),
    UNDO("undo.png"),
    BUSY("busy.gif"),
    BUSY16("busy16.gif"),
    ALL("all.gif"),
    LEFT("left.gif"),
    RIGHT("right.gif"),
    CREATURE("creature.png"),
    ARTIFACT("artifact.png"),
    EQUIPMENT("equipment.gif"),
    ENCHANTMENT("enchantment.gif"),
    AURA("aura.png"),
    SPELL("spell.gif"),
    ABILITY("ability.png"),
    TRIGGER("trigger.png"),
    TOKEN("token.png"),
    LAND("land.gif"),
    LAND2("land2.gif"),
    LIFE("life.gif"),
    PREVENT("prevent.gif"),
    PREVENT2("prevent2.gif"),
    POISON("poison.png"),
    HAND("hand.gif"),
    HAND2("hand2.png"),
    LIBRARY2("library2.gif"),
    GRAVEYARD("graveyard.gif"),
    GRAVEYARD2("graveyard2.gif"),
    EXILE("exile.png"),
    DIFFICULTY("difficulty.png"),
    CANNOTTAP("cannottap.png"),
    SLEEP("sleep.gif"),
    REGENERATED("regenerated.gif"),
    DAMAGE("damage.gif"),
    COMBAT("combat.gif"),
    ATTACK("attack.gif"),
    BLOCK("block.gif"),
    BLOCKED("blocked.gif"),
    MESSAGE("message.png"),
    PROGRESS("progress.png"),
    TROPHY("trophy.gif"),
    GOLD("gold.png"),
    SILVER("silver.png"),
    BRONZE("bronze.png"),
    CLOVER("clover.gif"),
    LOSE("lose.png"),
    TARGET("target.gif"),
    VALID("valid.gif"),
    STRENGTH("strength.png"),
    DELAY("delay.png"),
    PICTURE("picture.png"),
    
    // ability icons
    FLYING("flying.png"),
    TRAMPLE("trample.png"),
    STRIKE("strike.png"),
    DEATHTOUCH("deathtouch.png"),
    PROTBLACK("protblack.png"),
    PROTBLUE("protblue.png"),
    PROTGREEN("protgreen.png"),
    PROTRED("protred.png"),
    PROTWHITE("protwhite.png"),
    PROTALLCOLORS("protallcolors.png"),
    DEFENDER("defender.png"),
    VIGILANCE("vigilance.png"),
    DOUBLESTRIKE("doublestrike.png"),
    INFECT("infect.png"),
    WITHER("wither.png"),
    LIFELINK("lifelink.png"),
    REACH("reach.png"),
    SHROUD("shroud.png"),
    HEXPROOF("hexproof.png"),
    FEAR("fear.png"),
    INTIMIDATE("intimidate.png"),
    INDESTRUCTIBLE("indestructible.png"),

    // counters
    PLUS("plus.png"),
    MINUS("minus.png"),
    CHARGE("charge.png"),
    FEATHER("feather.gif"),
    GOLDCOUNTER("goldcounter.png"),
    BRIBECOUNTER("bribecounter.png"),
    TIMECOUNTER("time-counter.png"),
    FADECOUNTER("fade-counter.png"),
    QUESTCOUNTER("quest-counter.png"),
    LEVELCOUNTER("level-counter.png"),
    HOOFPRINTCOUNTER("hoofprint-counter.png"),
    AGECOUNTER("age-counter.png"),
    ICECOUNTER("ice-counter.png"),
    SPORECOUNTER("spore-counter.png"),
    ARROWHEADCOUNTER("arrowhead-counter.png"),
    LOYALTYCOUNTER("loyalty-counter.png"),
    KICOUNTER("ki-counter.png"),
    DEPLETIONCOUNTER("depletion-counter.png"),
    MININGCOUNTER("mining-counter.png"),
    MUSTERCOUNTER("muster-counter.png"),
    TREASURECOUNTER("treasure-counter.png"),
    STRIFECOUNTER("strife-counter.png"),
    STUDYCOUNTER("study-counter.png"),
    TRAPCOUNTER("trap-counter.png"),
    SHIELDCOUNTER("shield-counter.png"),
    WISHCOUNTER("wish-counter.png"),
    SHELLCOUNTER("shell-counter.png"),
    BLAZECOUNTER("blaze-counter.png"),
    TIDECOUNTER("tide-counter.png"),
    GEMCOUNTER("gem-counter.png"),
    PRESSURECOUNTER("pressure-counter.png"),
    VERSECOUNTER("verse-counter.png"),
    MUSICCOUNTER("verse-counter.png")
    ;

    private final String iconFilename;

    private MagicIcon(final String iconFilename) {
        this.iconFilename = iconFilename;
    }

    public String getFilename() {
        return iconFilename;
    }

}
