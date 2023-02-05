package lesson2;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Order {
    public  BigDecimal countOrderPrice(LocalDateTime startRideAt , LocalDateTime finishRideAt,BigDecimal price){
        Long start = startRideAt.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond();
        Long end = finishRideAt.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond();
        return BigDecimal.valueOf(end - start).multiply(price) ;
    }
}