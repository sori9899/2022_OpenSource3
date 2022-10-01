import java.util.Scanner;

class Phone{
    String name;
    String tel;

    public Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }

    void show(){
        System.out.println(name+"의 번호는 "+tel+" 입니다");
    }
}

public class PhoneBook {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수 >>");
        int num = scanner.nextInt();


        Phone [] phones = new Phone[num];

        for(int i=0; i<phones.length; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name =scanner.next();
            String tel =scanner.next();

            phones[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        String n = "하이";
        int i=0;

        while(true){
            System.out.print("검색할 이름>>");
            n=scanner.next();

            i=0;
            for(; i<phones.length; i++){
                if(n.equals(phones[i].name)){
                    phones[i].show();
                    break;
                }
            }

            if(n.equals("그만")){
                break;
            }

            if(i== phones.length)
                System.out.println(n+"이 없습니다");

        }
    }
}
