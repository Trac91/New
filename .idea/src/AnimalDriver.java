import javax.swing.*;

public class AnimalDriver {
    public static void main(String[] args)
    {
        String type;
      //  String[] continent ;
        double weight;
        int age;
        //continent c;

        type = JOptionPane.showInputDialog("Please enter type of animal");

        String continent[] = new String[5];

        for (int i =0; i < continent.length;i++)
        {
            continent[i] = JOptionPane.showInputDialog("Please enter continent: ");
            continent [i] = c;

        }

        weight = (Double.parseDouble(JOptionPane.showInputDialog("Please enter weight of animal")));
        age = (Integer.parseInt(JOptionPane.showInputDialog("Please enter age of animal")));













    }
}
