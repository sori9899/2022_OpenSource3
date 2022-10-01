import java.util.Scanner;

class Add{
    int a;
    int b;
    void setValue(int a,int b){
        this.a = a;
        this.b=b;
    }

    int calculate(){
        return a+b;
    }
}

class Sub{
    int a;
    int b;

    void setValue(int a,int b){
        this.a = a;
        this.b=b;
    }

    int calculate(){
        return a-b;
    }
}

class Mul{
    int a;
    int b;
    void setValue(int a,int b){
        this.a = a;
        this.b=b;
    }

    int calculate(){
        return a*b;
    }
}

class Div{
    int a;
    int b;
    void setValue(int a,int b){
        this.a = a;
        this.b=b;
    }

    int calculate(){
        return a/b;
    }
}

public class Calc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a=0, b=0;
        String c;

        System.out.print("두 정수와 연산자를 입력하시오>>");
        a = scanner.nextInt();
        b= scanner.nextInt();
        c =scanner.next();


        if(c.equals("+")){
            Add add = new Add();
            add.setValue(a,b);
            System.out.println(add.calculate());
        }
        if(c.equals("-")){
            Sub sub = new Sub();
            sub.setValue(a,b);
            System.out.println(sub.calculate());
        }
        if(c.equals("*")){
            Mul mul = new Mul();
            mul.setValue(a,b);
            System.out.println(mul.calculate());
        }
        if(c.equals("/")){
            Div div = new Div();
            div.setValue(a,b);
            System.out.println(div.calculate());
        }

    }
}
