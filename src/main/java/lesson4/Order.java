package lesson4;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order {
    private String id;
    private BigDecimal price;
    private int finalPrice;

    private final LocalDate timoOfBegin = LocalDate.of(2023, 3, 19);

    private final LocalDate timeOfEnd = LocalDate.of(2023, 3, 20);

    public void priceOfOrder(BigDecimal price, LocalDate timoOfBegin, LocalDate timeOfEnd) {
        finalPrice = price.intValue()*(timoOfBegin.compareTo(timeOfEnd));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
    }

}
