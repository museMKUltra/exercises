package com.codewithmosh.dp.memento;

public class Demo {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("one");
        System.out.println(editor.getContent());

        history.push(editor.createState());
        editor.setContent("two");
        System.out.println(editor.getContent());

        history.push(editor.createState());
        editor.setContent("three");
        System.out.println(editor.getContent());

        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}
