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
        sb.append("{\"code\": \"" + code + "\", \"color\": \"" + color.getColorName() + "\", ");

        if (size != Size.SIZE_NOT_APPLICABLE) {
            sb.append("\"size\": \"" + size + "\", ");
        }

        sb.append("\"price\": " + price.getPrice() + ", \"currency\": \"" + price.getCurrency() + "\"}, ");
    }

}