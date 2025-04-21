public class Rectangle{
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public Rectangle(double length){
        this.length=length;
        this.width=8;
    }
    public Rectangle(){
        this.length=4;
        this.width=8;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
}