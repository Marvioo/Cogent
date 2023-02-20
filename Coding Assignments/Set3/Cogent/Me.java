package Cogent;

public class Me implements Human {

    @Override
    public void eat() {
        System.out.println("I'm eating");
    }

    @Override
    public void sleep() {
        System.out.println("I'm sleeping");
    }
}
