package exemplo02;

import javax.swing.JOptionPane;

public class UsaContas {
    public static void main(String[] args) {
        
        /*
        int agencia = Integer.parseInt(JOptionPane.showInputDialog("Digita a agencia: "));
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digita o número da conta: "));
        Conta c1 = new Conta(agencia, numero);
        c1.depositar(100);
        c1.sacar(50);
        JOptionPane.showMessageDialog(null, c1.imprimirDados());
        */
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digita o número da conta: "));
        Conta c1 = new Conta(numero);
        c1.depositar(100);
        c1.sacar(50);
        JOptionPane.showMessageDialog(null, c1.imprimirDados());
    }
}
