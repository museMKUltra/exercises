package com.codewithmosh.state;

public class Brush implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Mouse up by brush");
    }

    @Override
    public void mouseDown() {
        System.out.println("Mouse down by brush");
    }
}
