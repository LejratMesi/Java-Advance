package com.sda.lesson.files;

import java.io.Serializable;
import java.util.List;

public class Words implements Serializable {
    private List<String> fjalet;

    public Words(List<String> fjalet) {
        this.fjalet = fjalet;
    }

    public List<String> getFjalet() {
        return fjalet;
    }

    public void setFjalet(List<String> fjalet) {
        this.fjalet = fjalet;
    }
}
