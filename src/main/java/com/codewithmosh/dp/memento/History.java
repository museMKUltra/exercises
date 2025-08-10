package com.codewithmosh.dp.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<State> list = new ArrayList<>();

    public void push(State state) {
        list.add(state);
    }

    public State pop() {
        if (list.isEmpty()) {
            throw new IllegalStateException("No memento has been pushed");
        }

        return list.remove(list.size() - 1);
    }
}
