package com.charles.types;

public class Color {

    private String colorStr;

    public Color(String colorStr) {
        this.colorStr = colorStr;
    }

    public String getColorStr() {
        return colorStr;
    }

    public void setColorStr(String colorStr) {
        this.colorStr = colorStr;
    }

    @Override
    public String toString() {
        return "Color{" +
                "colorStr='" + colorStr + '\'' +
                '}';
    }
}
