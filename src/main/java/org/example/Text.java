package org.example;

public class Text {
    private String text;
    private int caretPosition;
    private String color;
    private String language;

    public Text(String text, int caretPosition) {
        this.text = text;
        this.caretPosition = caretPosition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCaretPosition() {
        return caretPosition;
    }

    public void setCaretPosition(int caretPosition) {
        this.caretPosition = caretPosition;
    }
}
