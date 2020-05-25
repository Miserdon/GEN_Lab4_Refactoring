package ch.heigvd.gen.lab4;

public class Price {
    private final double price;
    private final String currency;

    public Price(double price, String currency) {
        this.price = price;
        this.currency = currency;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}