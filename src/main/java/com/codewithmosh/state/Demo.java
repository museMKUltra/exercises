package com.codewithmosh.state;

public class Demo {
    public static void main(String[] args) {
        var canvas = new Canvas();

        canvas.setTool(new Selection());
        canvas.mouseUp();
        canvas.mouseDown();

        canvas.setTool(new Brush());
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
