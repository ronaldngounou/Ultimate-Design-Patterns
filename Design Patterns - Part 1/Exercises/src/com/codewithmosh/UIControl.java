package com.codewithmosh;

public abstract class UIControl {
    public void enabled(){
        System.out.println("Enabled");
    }

    public abstract void draw(); //abstract doesn't have an implementation

}
