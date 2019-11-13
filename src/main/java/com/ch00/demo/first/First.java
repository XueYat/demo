package com.ch00.demo.first;

public class First {
    private String say;
    public First(String say){
        this.say = say;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public void sayHello(){
        System.out.println(say);

    }
}
