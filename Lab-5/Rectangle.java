
public class Rectangle {
    public static void main(String[] args) {
        
        Rectangle a = new Rectangle(2, 3);
        System.out.println("Area:"+a.Arearect());
    }

    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        
    }
    public int Arearect(){
        return this.width * this.height;

    }
    

}