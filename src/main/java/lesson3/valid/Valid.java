package lesson3.valid;

import lesson3.exception.NotAvailableException;
import java.time.LocalDateTime;

public class Valid {
    public static  void checkIfPersonLate(LocalDateTime personCameAt, LocalDateTime boardingTimeWillStartAt, LocalDateTime airplaneWillFlyAt) {
        if (personCameAt.isAfter(boardingTimeWillStartAt)) {
            throw new NotAvailableException("Person late on airplane");
        }
    }

    public static  void checkIfPersonComeEarly(LocalDateTime personCameAt, LocalDateTime boardingTimeWillStartAt, LocalDateTime airplaneWillFlyAt) {
        if (personCameAt.isBefore(boardingTimeWillStartAt)) {
            throw new NotAvailableException("Person come early on airplane");
        }
    }
}
