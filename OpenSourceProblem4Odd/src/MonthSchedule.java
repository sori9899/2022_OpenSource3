import java.util.Scanner;

import static java.sql.Types.NULL;

class Day{
    private String work;

    public void set(String work){this.work= work;}

    public String get(){return work;}

    public void show(){
        if(work == null) System.out.println("없습니다");
        else System.out.println(work+"입니다.");
    }
}

public class MonthSchedule {

    int month;
    public MonthSchedule(int month){
        this.month = month;
    }

    void run(){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("이번달 스케쥴 관리 프로그램.");


        Day [] days = new Day[this.month];
        for(int i=0; i<days.length; i++){
            days[i] = new Day();
        }

        int i=0;

        while (i!=3) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            i = scanner.nextInt();
            scanner.nextLine();
            switch (i){
                case 1:
                    input(days, scanner);
                    break;
                case 2:
                    view(days, scanner);
                    break;
                case 3:
                    finish();
                    break;
            }
        }

    }

    void input(Day[] days, Scanner scanner){
        System.out.print("날짜(1~30)?");
        int d = scanner.nextInt();
        scanner.nextLine();
        if(days[d-1].get()==null){
            System.out.print("할일(빈칸없이입력)?");
            String work = scanner.nextLine();
            days[d-1].set(work);
        }else{
            System.out.print("이미 할일이 있습니다.");
        }

    }
    void view(Day[] day, Scanner scanner){
        System.out.println("날짜(1~30)?");
        int d = scanner.nextInt();
        scanner.nextLine();
        System.out.print(d+"일의 할 일은 " );
        day[d-1].show();
    }
    void finish(){
        System.out.println("프로그램을 종료합니다.");
    }

    public static void main(String[] args){
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }
}
