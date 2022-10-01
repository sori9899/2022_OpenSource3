public class Song {
    String title;
    String artist;
    int year;
    String country;

    public Song(String title, String artist, int year, String country){
        this.artist = artist;
        this.title =title;
        this.year=year;
        this.country =country;
    }

    public Song(){
        this.country="";
        this.title="";
        this.year=0;
        this.title="";
    }

    void show(){
        System.out.println(year+"년 "+country+"국적의 "+artist+"가 부른 "+title);
    }

    public static void  main(String[] args){
        Song song = new Song("Dancing Queen","ABBA", 1978,"스웨덴");
        song.show();
    }
}
