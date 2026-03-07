package Module4;

abstract class Shape {
    abstract void display();

}
class Circle extends Shape{
    void display(){
        System.out.println("The given shape is a circle");
    }
}
class driver{
    public static void main(String[] args) {
      Circle c=new Circle();
        c.display();
    }
}

