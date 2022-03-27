package com.sda.lesson;

import java.util.concurrent.Callable;

public class MultiplayTask implements Callable {
    private Integer numri;
    private Integer numri2;

    public MultiplayTask(Integer numri, Integer numri2) {
        this.numri = numri;
        this.numri2 = numri2;
    }

    @Override
    public Integer call() throws Exception {

        Thread.sleep(5000);

        return (numri*numri2);
    }
}
