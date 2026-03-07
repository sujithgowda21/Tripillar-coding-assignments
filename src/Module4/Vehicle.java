package Module4;

public interface Vehicle {
    void start();
}

class Car implements Vehicle{
    public void start(){
        System.out.println(" Turn on the key ");
    }
}
class Driver{
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
    }
}