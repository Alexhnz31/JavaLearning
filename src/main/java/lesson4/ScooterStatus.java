package lesson4;

public class ScooterStatus {
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public enum Status {
        BUSY,
        FREE,
        BEING_REPAIRED;
    }
}
