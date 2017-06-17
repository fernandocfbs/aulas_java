import javax.swing.JOptionPane;

public class Variaveis {
	
	public static void main(String[] args) {
		String number1 = JOptionPane.showInputDialog("Digite o número 1");
		
		String number2 = JOptionPane.showInputDialog("Digite o número 2");
		
		//String soma = number1 + number2;
		
		Integer numeroUm = Integer.parseInt(number1);
		Integer numeroDois = Integer.parseInt(number2);
		
		JOptionPane.showMessageDialog(null, numeroUm + numeroDois);
		//System.out.println(soma);
	}
}
