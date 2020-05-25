package ch.heigvd.gen.lab4;

public class Product {
    public static final int SIZE_NOT_APPLICABLE = -1;
    private Price price;
    private String code;
    private Color color;
    private Size size;

    public Product(String code, Color color, Size size, Price price) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;

    }

    public String getCode() {
        return code;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price.getPrice();
    }

    public String getCurrency() {
        return price.getCurrency();
    }

    String getSizeFor() {
        return size.name();
    }

    String getColorFor() {
        return getColor().getColorName();
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
        sb.append(price.getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(price.getCurrency());
        sb.append("\"}, ");
    }

}