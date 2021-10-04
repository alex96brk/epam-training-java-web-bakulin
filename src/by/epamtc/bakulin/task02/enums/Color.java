package by.epamtc.bakulin.task02.enums;

import java.io.Serializable;

public enum Color implements Serializable {
    RED("Red"), BLUE("Blue"), GREEN("Green"), YELLOW("Yellow");

    private String colorName;

    Color(String color) {
        this.colorName = color;
    }

    public String getColorName() {
        return colorName;
    }
}
