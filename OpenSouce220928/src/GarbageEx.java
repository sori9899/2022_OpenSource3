public class GarbageEx {
    public static void main(String[] args){
        String a= new String("Good");
        String b= new String("Bad");
        String c= new String("Nomal");

        String d,e;

        a=null;
        d=c;
        c=null;
    }
}

/*
1. a에 null 값을 넣게 되어 기존에 연결되어있던 String객체("Good")에 연결이 끊어졌고, 이를 가리키는 변수가 없으므로
   초기에 a에 할당된 String객체 Good이 가비지가 된다

2. d=c일때, 객체가 복사되는 것이 아닌 c가 가리키던 String객체 Nomal을 d또한 가르키게 된다

3. c=NUll일때, 기존 c가 가리키던 string객체 Nomal과의 연결이 끊어지지만 d가 이를 가리키고 있으므로 가비지가 발생하지 않는다
 */
