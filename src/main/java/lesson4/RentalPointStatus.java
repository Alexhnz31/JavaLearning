package lesson4;

public class RentalPointStatus {

    String address;
    rentalStatus status1;
    rentalPointStatusPaid status2;
    rentalStatus status3;

    public enum rentalPointStatus {
        BUSY,
        FREE,
        RESERVED
    }

    public enum rentalPointStatusPaid {
        PAID,
        NOT_PAID,
    }

    public enum rentalStatus {
        AVAILABLE,
        NOT_AVAILABLE

    }


}
