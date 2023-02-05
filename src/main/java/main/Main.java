package main;

import lesson2.Order;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
public class Main {
    public static void main(String[] args){
        Order order1 = new Order();
        System.out.println(order1.countOrderPrice(LocalDateTime.now(), LocalDateTime.of(2023, Month.FEBRUARY, 5, 15, 30), new BigDecimal("0.005")));
    }
}
