package lesson3.entity;

import lesson3.valid.Valid;

import java.time.LocalDateTime;

public class Airoport {
    public void passPersonToAirplane(LocalDateTime personCameAt, LocalDateTime boardingTimeWillStartAt, LocalDateTime airplaneWillFlyAt) {
        Valid.checkIfPersonLate(personCameAt, boardingTimeWillStartAt, airplaneWillFlyAt);
        Valid.checkIfPersonComeEarly(personCameAt, boardingTimeWillStartAt, airplaneWillFlyAt);
        System.out.println("человек успешно зашел на борт");
    }
}