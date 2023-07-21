import javax.swing.JOptionPane;
public class test{
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("enter your name:"); //to generate input dialouge box
        JOptionPane.showMessageDialog(null, "hello "+ name); //takes input from user and generates personalised response
        int height= Integer.parseInt( JOptionPane.showInputDialog("enter your height in cm:"));
        JOptionPane.showMessageDialog(null, "you are "+ height+ "cm tall");
        double age= Double.parseDouble( JOptionPane.showInputDialog("enter your height in cm:"));
        JOptionPane.showMessageDialog(null, "you are "+ age+ "years old");
    }
}
