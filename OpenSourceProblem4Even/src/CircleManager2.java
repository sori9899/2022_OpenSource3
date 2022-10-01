import java.util.Scanner;

class Circle2{
    private double x,y;
    private int radius;
    public Circle2(double x, double y, int radius){
        this.x= x;
        this.y = y;
        this.radius =radius;
    }

    double getX(){
        return x;
    }

    double getY(){
        return y;
    }
    int getRadius(){
        return radius;
    }
}

public class CircleManager2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Circle2 c[] = new Circle2[3];
        int max=0;

        for(int i=0; i<c.length; i++){
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle2(x, y, radius);
        }

        for(int i=0; i<c.length; i++){
            if(c[max].getRadius() < c[i].getRadius())
                max =i;
        }

        System.out.println("가장 면적인 큰 원은 ("+c[max].getX()+","+c[max].getY()+")"+c[max].getRadius());
        scanner.close();
    }
}