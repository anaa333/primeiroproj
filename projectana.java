
import javax.swing.JOptionPane;

public class primeiroproj {

    public static void main(String[] args) {
        String primeironumero = 
                JOptionPane.showInputDialog(" primeiro numero"); 
        String segundonumero =     
                JOptionPane.showInputDialog(" segundo numero");
        int numero1 = Integer.parseInt(primeironumero);
        int numero2 = Integer.parseInt(segundonumero);
        
        int sum= numero1+numero2; 
        
        JOptionPane.showMessageDialog(null, "a soma é "  + sum, "soma dos inteiros", JOptionPane.PLAIN_MESSAGE);
    }
}
