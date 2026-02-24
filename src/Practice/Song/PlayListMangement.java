package Practice.Song;

import java.time.Duration;
import java.util.LinkedList;
import java.util.Scanner;

class Data{
    String SongName;
    String Artist;
   String Durations;
   public Data(String SongName,String Artist,String Durations){
       this.SongName=SongName;
       this.Artist=Artist;
       this.Durations=Durations;
   }
   void addSong(String SongName,String Artist,String Durations){
       LinkedList<Data>list=new LinkedList<>();
       list.addFirst(new Data(SongName,Artist,Durations));
       list.addLast(new Data(SongName,Artist,Durations));
       list.add(3,new Data(SongName,Artist,Durations));
   }
   void deleteSong(String SongName,String removeSongName){
       LinkedList<Data>list=new LinkedList<>();
       for(Data d:list){
           if(d.SongName.equals(SongName)){
               list.remove(d);
           }
       }
   }
    public void  display(){
        System.out.println("SongName"+SongName + " " +"Artist Name "+ Artist + " " +"Its durution will be "+ Durations);
    }

}
public class PlayListMangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String songName = sc.nextLine();
            String artist = sc.nextLine();
            String durations = sc.nextLine();
            String removeSongName = sc.nextLine();
            Data d = new Data(songName, artist, durations);
            d.addSong(songName, artist, durations);
             d.deleteSong(songName,removeSongName);

            d.display();
        }
    }
}