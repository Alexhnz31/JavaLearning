package main;

import lesson3.entity.Airoport;
import java.time.LocalDateTime;

public class Main {
        public static void main(String[] args){
            Airoport airport1 = new Airoport();
            airport1.passPersonToAirplane(LocalDateTime.of(2023, 3, 8, 16, 0), LocalDateTime.of(2023, 3, 8, 16, 0), LocalDateTime.of(2023, 3, 8, 17, 0));
        }
    }