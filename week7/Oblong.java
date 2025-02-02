package week7;

public class Oblong {

    private double height;
    private double width;


    // constructor 
    public Oblong(){
        height = 0.0;
        width = 0.0;
    }

    // methods
    public double getHeight(){

        return height;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double h){
        height = h; 
    }

    public void setWidth(double w){
        width = w;
    }

    public double calculateArea(){
        return width * height;
    }



    
}
