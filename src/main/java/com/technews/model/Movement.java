package com.technews.model;

public interface Movement {
    public void run();
    public void jump();
}

class Dog implements Movement {

    @Override
    public void run() {
        System.out.println("This dog can run a long time!");
    }

    @Override
    public void jump() {
        System.out.println("This dog can jump very high!");
    }
}

class Cat implements Movement {

    @Override
    public void run() {
        System.out.println("This cat can run really fast!");
    }

    @Override
    public void jump() {
        System.out.println("This cat jumps really high!");
    }
}
