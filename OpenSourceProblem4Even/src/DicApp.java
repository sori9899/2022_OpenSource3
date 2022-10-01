import java.util.Scanner;

class Dictionary{
    private static String [] kor ={"사랑", "아기","돈", "미래","희망"};
    private static String [] eng = {"love", "baby", "moeny", "future","hope"};

    public static String kor2Eng(String word){
        int key = 0;
        for(int i=0; i<kor.length; i++){
            if(kor[i].equals(word)) {
                key=i;
                return "은 "+eng[key];
            }
        }
        return "는 저의 사전에 없습니다";
    }
}

public class DicApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word=null;
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true){
            System.out.print("한글 단어?");
            word = scanner.next();
            if(word.equals("그만"))
                break;
            System.out.print(word);
            System.out.println(Dictionary.kor2Eng(word));
        }
    }
}
