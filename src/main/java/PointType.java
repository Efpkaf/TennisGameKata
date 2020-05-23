public enum PointType {
    ZERO("love"), FIFTEEN("fifteen"), THIRTY("thirty"), FORTY("forty"), ADVANTAGE("advantage");

    private String translated;

    public String getTranslated() {
        return translated;
    }

    PointType(String s) {
        translated = s;
    }

    public static String getByOrdinal(int i){
        return values()[i].getTranslated();
    }
}

