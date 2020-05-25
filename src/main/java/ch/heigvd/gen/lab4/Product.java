package ch.heigvd.gen.lab4;

public class Product {
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

    void getProductContents(StringBuffer sb) {
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(code);
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(color.getColorName());
        sb.append("\", ");

        if (size != Size.SIZE_NOT_APPLICABLE) {
            sb.append("\"size\": \"");
            sb.append(size);
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