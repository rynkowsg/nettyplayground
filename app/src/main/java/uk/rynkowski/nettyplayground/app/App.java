package uk.rynkowski.nettyplayground.app;

import uk.rynkowski.nettyplayground.lib.Library;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println("VAL FROM LIB: " + new Library().someLibraryMethod());
    }
}
