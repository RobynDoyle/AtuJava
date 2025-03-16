package week7;

public class OblongTester {
    
    public static void main(String[] args){

        Oblong myOblong = new Oblong();

        myOblong.setHeight(10);
        myOblong.setWidth(40);

        System.out.println("Width: " + myOblong.getWidth());
        System.out.println("Height: " + myOblong.getHeight());

        System.out.println("Area: " + myOblong.calculateArea());


    } 
}
