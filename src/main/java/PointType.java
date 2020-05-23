public enum PointType {
    ZERO("love"), FIFTEEN("15"), THIRTY("30"), FORTY("40");

    private String translated;

    public String getTranslated() {
        return translated;
    }

    PointType(String s) {
        translated = s;
    }
}

