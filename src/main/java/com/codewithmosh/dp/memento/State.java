package com.codewithmosh.dp.memento;

public class State {
    private String content;

    public State(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
