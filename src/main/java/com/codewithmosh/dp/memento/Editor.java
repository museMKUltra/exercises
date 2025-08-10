package com.codewithmosh.dp.memento;

public class Editor {
    private String content;

    public State createState() {
        return new State(content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void restore(State state) {
        content = state.getContent();
    }
}
