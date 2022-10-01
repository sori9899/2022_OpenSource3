import java.util.Scanner;

public class Rectangle {

    int width;
    int height;

    public int getArea(){
        return width*height;
    }

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");

        rectangle.width = scanner.nextInt();
        rectangle.height = scanner.nextInt();

        System.out.println("사각형의 면적은 "+rectangle.getArea());
        scanner.close();
    }
}
