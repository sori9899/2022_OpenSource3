import java.util.Scanner;
class Player{
    String name;
    String word;

    static void run(int num, Scanner scanner){
        Player players[] = new Player[num];
        String word = "아버지";

        for(int i=0; i< players.length; i++){
            players[i] = new Player();
            System.out.print("참가자의 이름을 입력하세요 >>");
            players[i].name = scanner.nextLine();
        }

        System.out.println("시작하는 단어는 아버지입니다");
        int i=0;
        while(true){
            if(i == players.length){
                i=0;
            }
            System.out.print(players[i].name+" >> ");
            getWordFromUser(players[i], scanner);
            if( checkSuccess(word, players[i])){
                System.out.println(players[i].name+"이 졌습니다");
                break;
            }
            word = players[i].word;
            i++;
        }
    }

    static void getWordFromUser(Player player, Scanner scanner){
        player.word = scanner.nextLine();
    }

    static boolean checkSuccess(String word, Player player){
        int lastIndex = word.length()-1;
        char lastChar = word.charAt(lastIndex);
        char firstChar = player.word.charAt(0);
        if( lastChar == firstChar){
            return false;
        }else {
            return true;
        }
    }
}

public class WordGameApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("끝말잇기 게임을 시작합니다,,,");
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        int num = scanner.nextInt();
        scanner.nextLine();

        Player.run(num, scanner);
        scanner.close();
    }
}
