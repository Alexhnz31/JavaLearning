package lesson4;

public class ScooterStatus {
    private Status status;
    private Status2 status2;
    private Status3 status3;
    public enum Status {
        BUSY,
        FREE,
        BEING_REPAIRED;
    }
    public enum Status2{
        AVAILABLE,
        NOT_AVAILABLE
    }
    public enum Status3{
        PAID,
        NOT_PAID
    }
}
