package Module4;

final class Animal {
    void eat() {
        System.out.println(" i am veg ");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println(" I am nonveg ");
    }
}
class display{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
    }
}
