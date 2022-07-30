import javax.swing.JOptionPane;

public class JavaQuiz {
  static int points = 0;
  
 public static void main(String[] args) {
     JOptionPane.showMessageDialog(null, "Mirë se vini!");
     pyetja1();
     pyetja2();
     pyetja3();
     pyetja4();
     pyetja5();
     rezultati();
 }
 
 public static void pyetja1() {
        String answer = JOptionPane.showInputDialog(null, "Pyetja 1 nga 5:\n" +
                "Cilat jane ngjyrat e flamurit te Kosoves ?\n" +
                "A. Kalter, Verdhë, Bardh\n" +
                "B. Kalter, Zi, Gjelbër\n" +
                "C. Bardh, Kuq, Kalter\n" +
                "D. Kuq, Verdhë, Zi");
        switch (answer){
            case "A", "a" -> points++;
        }
    }
  public static void pyetja2() {
        String answer =  JOptionPane.showInputDialog(null, "Pyetja 2 nga 5:\n" +
                "Kur u shpall pavarësia e Kosovës?\n" +
                "A. 28 Nentor 1912\n" +
                "B. 7 Korrik 1776\n" +
                "C. 17 Shkurt 2008.\n" +
                "D. 10 Qershor 1999");
        switch (answer){
            case "C", "c" -> points++;
        }
    }
  public static void pyetja3() {
        String answer =  JOptionPane.showInputDialog(null, "Pyetja 3 nga 5:\n" +
                "Sa ka siperfaqe katrore Republika e Kosovës?\n" +
                "A. 25300 metra katrorë\n" +
                "B. 12000 metra katrorë\n" +
                "C. 5432 metra katrorë\n" +
                "D. 10887 metra katrorë");
        switch (answer){
            case "D", "d" -> points++;
        }
    }

  public static void pyetja4() {
        String answer =  JOptionPane.showInputDialog(null, "Pyetja 4 nga 5:\n" +
                "Me kë kufizohet Kosova?\n" +
                "A. Shqipërinë, Maqedoninë, Malin e Zi, Serbinë\n" +
                "B. Shqipërinë, Greqinë, Malin e Zi, Slloveninë\n" +
                "C. Shqipërinë, Kroacinë, Bosnjen dhe Herzegovinen\n" +
                "D. Shqipërinë, Maqedoninë, Bosnjen dhe Herzegovinen, Malin e Zi");
        switch (answer){
            case "A", "a" -> points++;
        }
    }


  public static void pyetja5() {
        String answer =  JOptionPane.showInputDialog(null, "Pyetja 5 nga 5:\n" +
                "Sa është mosha mesatare në Kosovë?\n" +
                "A. 25.4\n" +
                "B. 42\n" +
                "C. 30.2\n" +
                "D. 17.5");
        switch (answer){
            case "C", "c" -> points++;
        }
    }
  
  
  public static void rezultati() {
        String name = JOptionPane.showInputDialog(null,"Ju perfunduat kuizin.\nShënoni emrin tuaj: ");
        if (points == 5)
        {
            JOptionPane.showMessageDialog(null, "Emri: " + name + "\nRezulati: " + points + "\nJu lumtë!");
        }else if(points >= 3) {
            JOptionPane.showMessageDialog(null, "Emri: " + name + "\nRezulati: " + points + "\nJu kaluat kuizin.");
        }else{
            JOptionPane.showMessageDialog(null, "Emri: " + name + "\nRezulati: " + points + "\nJu duhet të studioni ende");
        }
    }
  
  
}
