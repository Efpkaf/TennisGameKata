public class Player {

    private PointType pointType = PointType.ZERO;

    public String score(){
        return pointType.getTranslated();
    }

    public void win(){
        int ordinal = pointType.ordinal();
        pointType = PointType.values()[ordinal + 1];
    }
}
