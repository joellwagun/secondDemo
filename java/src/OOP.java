class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Write Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
public class OOP{
    public static void main(String args[]){
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        pen1.color = "Blue";
        pen2.color ="Black";
        pen1.write();
        pen1.printColor();
        pen2.printColor();
    }
}
