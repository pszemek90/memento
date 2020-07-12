package org.example;

public class TextSnapshot {
    private String text;
    private int caretPosition;

    public TextSnapshot(Text text) {
        this.text = text.getText();
        caretPosition = text.getCaretPosition();
    }

    public Text restoreFromSnapshot(){
        return new Text(text, caretPosition);
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
