package enumerations;

public enum Place {
    WINDOWSILL,
    LADDER,
    GADGE_ROOM,
    EXHIBITION,
    ENTRANCE,
    HALL;
    private static int leveloflighting;
    public void setLeveloflighting(int levelofLighting) {
        leveloflighting = levelofLighting;
    }
    public int getLeveloflighting() {
        return leveloflighting;
    }
}
