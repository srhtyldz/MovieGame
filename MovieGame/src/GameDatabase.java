import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class GameDatabase {





    public String[] moviesfromDB() throws FileNotFoundException {

        String line = null;
        File file = new File("filmlist.txt");
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {

            line = line + "\n" + fileScanner.nextLine();
        }
        line = line.substring(line.indexOf('\n') + 1);
        String[] moviest = line.split("\n", 25);
        return moviest;

    }

    public String choseMovie(String[] films){

    int randomNumber=(int)(Math.random()*10+15);
    String chosenMovie=films[randomNumber];
   // System.out.println(chosenMovie);
    return chosenMovie;
}


public String checkMovie(String chosenMovie){
      String b="";
    for(int i=0;i<chosenMovie.length();i++){
        b=b.concat("_");
    }
    StringBuilder str = new StringBuilder(b);
    for (int i = 0; i < chosenMovie.length(); i++) {
        char c = chosenMovie.charAt(i);
        if(c == ' ' ){
            str.setCharAt(i,' ');
        }
        if(c=='\'' ){
            str.setCharAt(i,' ');
        }
    }
    return str.toString();
}

    public String updateStatus(String chosenMovie,char guess,String a){
        StringBuilder str = new StringBuilder(a);
        for (int i = 0; i < chosenMovie.length(); i++) {
            char c = chosenMovie.charAt(i);
            if(c==guess) {
                str.setCharAt(i,guess);
            }

        }
        return str.toString();
    }
    }
