package com.epam.rd.autotasks;

public class CompleteByRequestTask implements Task {
    private boolean isFinished;
    private boolean markFinished;

    public CompleteByRequestTask() {
        super();
        this.isFinished = false;
        this.markFinished = false;
    }

    @Override
    public void execute() {

        //throw new UnsupportedOperationException();
        if (this.markFinished) {
            this.isFinished = true;
        }

    }

    @Override
    public boolean isFinished() {

        //throw new UnsupportedOperationException();

        return this.isFinished;
    }

    public void complete() {

        //throw new UnsupportedOperationException();
        this.markFinished = true;
    }
}
