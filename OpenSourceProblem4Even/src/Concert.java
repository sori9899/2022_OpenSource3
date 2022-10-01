import java.util.Scanner;

class Sarray{
    String name=null;
    String[] string = {"---","---","---","---","---","---","---","---","---","---"};

    public Sarray(String name){
        this.name = name;
    }


}
class Sit{
    static int printTop(Sarray[] sarrays, Scanner scanner){
        System.out.print("좌석 구분 S(1), A(2), B(3) >>");
        int where = scanner.nextInt();

        if( (where!=1 && where!=2 && where!=3) ){
            System.out.println("잘못된 좌석입니다.");
            return 0;
        }

        System.out.print(sarrays[where-1].name+">> ");
        for(int i=0; i<sarrays[where-1].string.length; i++){
            System.out.print(sarrays[where-1].string[i]+" ");
        }
        System.out.println();
        return where;
    }

    static void show(Sarray[] sarrays){
        for(int i=0; i<sarrays.length; i++){
            System.out.print(sarrays[i].name+">> ");
            for(int j=0; j<sarrays[i].string.length; j++){
                System.out.print(sarrays[i].string[j]+" ");
            }
            System.out.println();
        }
        System.out.println("<<< 조회를 완료하였습니다 >>>");
    }

    static void cancel(Sarray[] sarrays, Scanner scanner){
        int where = printTop(sarrays, scanner);
        if(where==0){
            return;
        }

        System.out.print("이름 >>");
        String name = scanner.next();

        int i=1;
        for(; i<sarrays[where-1].string.length; i++){
            if(sarrays[where-1].string[i].equals(name)){
                sarrays[where-1].string[i] = "---";
                break;
            }
        }

        if(i==sarrays[where-1].string.length){
            System.out.println("예약자 "+name+"은 존제하지 않습니다.");
        }

    }

    static void reservation(Sarray[] sarrays, Scanner scanner){
        int where = printTop(sarrays, scanner);
        if(where==0){
            return;
        }

        System.out.print("이름 >>");
        String name = scanner.next();
        System.out.print("번호 >>");
        int sit_num = scanner.nextInt();


        for(int i=0; i<sarrays.length; i++){
            for(int j=0; j<sarrays[i].string.length; j++){
                if(sarrays[i].string[j].equals(name)){
                    System.out.println(name+"은 이미 예약한 사람입니다.");
                    return;
                }
            }
        }

        if(sit_num>sarrays[where-1].string.length || sit_num <1){
            System.out.println(sit_num+"번은 존재하지 않는 좌석입니다");
        }else if(sarrays[where-1].string[sit_num-1].equals("---")){
            sarrays[where-1].string[sit_num-1] = name;
        }else{
            System.out.println("이미 예약되어있는 좌석입니다");
        }
    }
}

public class Concert {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Sarray[] sarrays = new Sarray[3];
        sarrays[0]=new Sarray("S");
        sarrays[1]=new Sarray("A");
        sarrays[2]=new Sarray("B");


        System.out.println("명품 콘서트 예약 시스템입니다.");
        
        while(true){

            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
            int odder = scanner.nextInt();


            if(odder == 4){
                break;
            }
            
            switch (odder){
                case 1:
                    Sit.reservation(sarrays, scanner);
                    break;
                case 2:
                    Sit.show(sarrays);
                    break;
                case 3:
                    Sit.cancel(sarrays, scanner);
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}

