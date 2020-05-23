public class Player {

    private PointType pointType = PointType.ZERO;

    public PointType score(){
        return pointType;
    }

    public void win(){
        int ordinal = pointType.ordinal();
        pointType = PointType.values()[ordinal + 1];
    }
}
