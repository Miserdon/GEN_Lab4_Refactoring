package ch.heigvd.gen.lab4;

public class Product {
    public static final int SIZE_NOT_APPLICABLE = -1;
    private String code;
    private int color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, int color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public int getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    String getSizeFor() {
        return size.name();
    }

    String getColorFor() {
        switch (getColor()) {
            case 1:
                return "blue";
            case 2:
                return "red";
            case 3:
                return "yellow";
            default:
                return "no color";
        }
    }

    void getProductContents(StringBuffer sb) {
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(getColorFor());
        sb.append("\", ");

        if (getSize() != Size.SIZE_NOT_APPLICABLE) {
            sb.append("\"size\": \"");
            sb.append(getSizeFor());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(getCurrency());
        sb.append("\"}, ");
    }

}