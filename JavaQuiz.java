import javax.swing.JOptionPane;

public class JavaQuiz {
  static int points = 0;
  
 public static void main(String[] args) {
     JOptionPane.showMessageDialog(null, "Mirë se vini!");
     pyetja1();
     pyetja2();
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
