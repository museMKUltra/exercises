package com.codewithmosh.state;

public class Selection implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Mouse up in selection");
    }

    @Override
    public void mouseDown() {
        System.out.println("Mouse down in selection");
    }
}
