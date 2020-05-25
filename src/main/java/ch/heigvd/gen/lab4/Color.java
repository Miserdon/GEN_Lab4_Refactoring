package ch.heigvd.gen.lab4;

public enum Color {

    NO_COLOR("no color"),  BLUE("blue"), RED("red"),YELLOW("yellow");

    private String colorName;

    Color(String cName){
        this.colorName = cName;
    }
    public final String getColorName() {
        return colorName;
    }
}
