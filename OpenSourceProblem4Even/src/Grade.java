import java.util.Scanner;

public class Grade {

    int math_grade;
    int science_grade;
    int english_grade;

    public Grade(int math_grade, int science_grade, int english_grade){
        this.english_grade =english_grade;
        this.math_grade = math_grade;
        this.science_grade = science_grade;
    }

    int average(){
        return (english_grade+math_grade+science_grade)/3;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math =scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 "+me.average());

        scanner.close();
    }
}
