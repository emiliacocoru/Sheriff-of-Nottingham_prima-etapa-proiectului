package players.type;

public abstract class Player {
    private char type;
    private int hp;
    private int xp = 0;
    private int level = 0;
    private int maxHP;
    private int lineMap;
    private int columnMap;
    private int damageExtra = 0;
    private int extraRounds = 0;
    private int damageThisRound = 0;
    private double receivedDamage = 0;
    private int incapacityOfMovement = 0;
    private int wasFighting = 0;
    private int dead = 0;

    public Player(final char type) {
        this.type = type;
    }

    public Player() {

    }

    public final char getType() {
        return type;
    }

    public final int getHp() {
        return hp;
    }

    public final void setHp(final int hp) {
        this.hp = hp;
    }

    public final void setType(final char type) {
        this.type = type;
    }

    public final int getLineMap() {
        return lineMap;
    }

    public final int getColumnMap() {
        return columnMap;
    }

    public final void setLineMap(final int lineMap) {
        this.lineMap = lineMap;
    }

    public final void setColumnMap(final int columnMap) {
        this.columnMap = columnMap;
    }

    public final int getXp() {
        return xp;
    }

    public final void setXp(final int xp) {
        this.xp = xp;
    }

    public final int getLevel() {
        return level;
    }

    public final void setLevel(final int level) {
        this.level = level;
    }

    public final int getMaxHP() {
        return maxHP;
    }

    public final void setMaxHP(final int maxHP) {
        this.maxHP = maxHP;
    }

    public abstract void accept(PlayerVisitor player);

    public final void poisonDamage(final Player player) {
        if (player.getExtraRounds() > 0) {
            player.setHp(player.getHp() - player.getDamageExtra());
            player.setExtraRounds(player.getExtraRounds() - 1);
        }
    }

    public final int getDamageExtra() {
        return damageExtra;
    }

    public final void setDamageExtra(final int damageExtra) {
        this.damageExtra = damageExtra;
    }

    public final int getExtraRounds() {
        return extraRounds;
    }

    public final void setExtraRounds(final int extraRounds) {
        this.extraRounds = extraRounds;
    }

    public final  int getDamageThisRound() {
        return damageThisRound;
    }

    public final void setDamageThisRound(final int damageThisRound) {
        this.damageThisRound = damageThisRound;
    }

    public final double getReceivedDamage() {
        return receivedDamage;
    }

    public final void setReceivedDamage(final double receivedDamage) {
        this.receivedDamage = receivedDamage;
    }

    public final int getIncapacityOfMovement() {
        return incapacityOfMovement;
    }

    public final void setIncapacityOfMovement(final int incapacityOfMovement) {
        this.incapacityOfMovement = incapacityOfMovement;
    }

    public final int getWasFighting() {
        return wasFighting;
    }

    public final void setWasFighting(final int wasFighting) {
        this.wasFighting = wasFighting;
    }

    public final int getDead() {
        return dead;
    }

    public final void setDead(final int dead) {
        this.dead = dead;
    }
}
