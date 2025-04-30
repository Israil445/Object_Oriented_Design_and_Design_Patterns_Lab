package Bridge_Pattern;

public class Circle extends Shape {
    private int x, y, radius;
 
    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
       super(drawAPI);//call the constructor of the super class
       this.x = x;  
       this.y = y;  
       this.radius = radius;
    }
 
    public void draw() {
       drawAPI.drawCircle(radius,x,y);
    }
 }