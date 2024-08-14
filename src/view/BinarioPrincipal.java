package view;

import javax.swing.JOptionPane;

import controller.BinarioController;

public class BinarioPrincipal {
	public static void main (String[] args) {
		BinarioController binCon = new BinarioController();
		int num = 2001;
		while (num > 2000 || num < -2000) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número entre -2000 e 2000: "));
			if (num > 2000 || num < -2000) {
				JOptionPane.showMessageDialog(null, "Número inválido, tente novamente.");
			}
		}
		binCon.conversorBinario(num);
	}
}
