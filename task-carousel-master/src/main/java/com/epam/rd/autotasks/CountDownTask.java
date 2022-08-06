package com.epam.rd.autotasks;

public class CountDownTask implements Task{
    private int countDown;
    public CountDownTask(int value) {

        //throw new UnsupportedOperationException();

        this.countDown = Math.max(value, 0);
    }

    public int getValue() {

        //throw new UnsupportedOperationException();
        return this.countDown;
    }


    @Override
    public void execute() {

        //throw new UnsupportedOperationException();

        if (this.countDown > 0) {
            this.countDown--;
        }
    }

    @Override
    public boolean isFinished() {

        //throw new UnsupportedOperationException();
        return this.countDown == 0;
    }
}
