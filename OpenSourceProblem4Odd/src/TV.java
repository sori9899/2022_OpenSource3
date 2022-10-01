public class TV {

    String logo;
    int year;
    int inch;


    public TV(String logo, int year, int inch){
        this.inch = inch;
        this.logo = logo;
        this.year = year;
    }
    void show(){
        System.out.println(logo+"에서 만든 "+year+"년 "+inch+"인치");
    }

    public static void main(String[] args){
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
