package com.google.training.helloworld;

import java.util.Random;

public class HelloClass {
    public String message = "Hello World";

    private String smth0 = "Hope you will have a nice day/night :)";
    private String smth1 = "You are so beautiful :*";
    private String smth2 = "Alright! you can deal with all your problems. Keep working ;)";

    public HelloClass (){
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }

    public String getMessage() {
        return message;
    }

    public HelloClass(String name, String period){
        this.message = "Good " + period +" "+ name + "!";
    }

    public HelloClass(int rand){
        if(rand == 0)
            this.message = smth0;
        else if(rand == 1)
            this.message = smth1;
        else
            this.message = smth2;
    }
}
