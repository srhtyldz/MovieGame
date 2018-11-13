import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

public class MovieGame {

    public MovieGame() {

    }

    public static void main(String[] args) throws Exception {

        String wrongguess="";
        String f="";
        String d="";
        int counter=0;


        Scanner scanner = new Scanner(System.in);
        GameDatabase db = new GameDatabase();
          String[] moviest = db.moviesfromDB();
          String chosenMovie = db.choseMovie(moviest);
         String a = db.checkMovie(chosenMovie);
         System.out.println(chosenMovie);

        //System.out.println("You're guessing :" + a +"\n You have guessed (0) wrong letters:");
        JFrame frame = new JFrame("Welcome to hell");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setBounds(50,150,200,30);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("You're guessing :" + a +"\n You have guessed (0) wrong letters:");
        JPanel panel = new JPanel();
        JButton button = new JButton("Tip");
        label.setText(label.getText()+  "something");
        panel.add(button);
        button.addActionListener(new Action());
        frame.add(panel);
        panel.add(label);
        String guess = scanner.nextLine();
        JTextField fn= new JTextField(scanner.nextLine());
        frame.add(fn);
        frame.setLayout(null);


        String[] h = new String[2000];
        h[0]=a;
int i=0;


       while(true) {
            if (chosenMovie.contains(guess)) {
                h[i+1]=db.updateStatus(chosenMovie, guess.charAt(0),h[i]);
                System.out.println("You're guessing :" + h[i+1] +"\n You have guessed"+ "("+counter+")" +"wrong letters:"+ wrongguess );
                if(h[i+1].contains("_")==false){
                    System.out.println("-----------------------------------------------------------------------------------"+"\n The Game is done !"+"\n You WIN");
                    break;
                }
                guess=scanner.nextLine();
            }
            else {
                counter ++;



                    wrongguess=wrongguess+ " " + guess;
                    System.out.println("You're guessing :" + h[i+1] +"\n You have guessed"+ "("+counter+")"+"wrong letters:"+ wrongguess  );
                    if(counter==10){
                        System.out.println("-----------------------------------------------------------------------------------"+
                                "\n You lose 10 points and GAME OVER");
                        break;
                    }
                guess=scanner.nextLine();
                }

           i++;
            }



        }

        static class Action implements ActionListener{
        public void actionPerformed (ActionEvent e){
           String newline = "\n";

            JFrame frame2= new JFrame("clicked");
            JFrame frame = new JFrame("asdasd");
            frame.setVisible(true);
            frame.setSize(200,200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel label2 = new JLabel("fuckn");
            JPanel panel = new JPanel();
            frame2.add(panel);
            panel.add(label2);

            JTextField fn= new JTextField();
            frame.add(fn);
            frame.setLayout(null);

        }
        }
    }





