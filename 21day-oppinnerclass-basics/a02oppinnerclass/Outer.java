package a02oppinnerclass;

public class Outer {
    String name;

    private class Inner{

    }
    public Inner getInstance(){
        return new Inner();
    }

}
