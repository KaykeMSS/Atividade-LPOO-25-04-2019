package view;


import model.Aluno;

import javax.swing.JOptionPane;

public class Execucao {

	public static void main (String[] args) {

		Aluno al = new Aluno();
		
		al.setNome(JOptionPane.showInputDialog(null, "Nome: "));
		al.setEndereco(JOptionPane.showInputDialog(null, "Endereço: "));
		al.setBairro(JOptionPane.showInputDialog(null, "Bairro: "));
		al.setCep(JOptionPane.showInputDialog(null, "cep: "));
		al.setCidade(JOptionPane.showInputDialog(null, "Cidade: "));
		al.setEstado(JOptionPane.showInputDialog(null, "Estado: "));
		
		System.out.println("Nome: " + al.getNome());
		System.out.println("Endereço: " + al.getEndereco());
		System.out.println("Bairro: " + al.getBairro());
		System.out.println("cep: " + al.getCep());
		System.out.println("Cidade: " + al.getCidade());
		System.out.println("Estado: " + al.getEstado());
		
		
		
	}
}