package com.vidiri.library;

import java.util.ArrayList;
import java.util.Scanner;

import com.vidiri.library.objects.Item;

public class Main {

	ArrayList<Item> lista = new ArrayList<Item>();
	Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println("Master lista telefonica by IFBirds");
		while(true) {
			m.ShowMenu();
			int selectedOption = m.GetMenuOption();
			
			switch (selectedOption) {
				case 1: {
					System.out.println("Opção 1.");
					m.listarTelefones();
					break;
				}
				case 2: {
					System.out.println("Opção 2.");
					m.cadastrarTelefone();
					break;
				}
				case 3: {
					System.out.println("Opção 3.");
					m.editarTelefone();
					break;
				}
				case 4: {
					System.out.println("Opção 4.");
					m.removerTelefone();
					break;
				}
				case 5: {
					System.out.println("Opção 5.");
					m.procurarTelefone();
					break;
				}
				case 6: {
					break;
				}
				default:
					System.out.println("Opção inválida.");
					break;
			}
		}		
	}

	private void procurarTelefone() {
		tec.nextLine();
		System.out.println("Insira o nome do dono do telefone: ");
		String nome = tec.nextLine();
		for(int i=0;i<lista.size();i++){
			if(lista.get(i).getDonoEndereco().contains(nome)){
				System.out.println(lista.get(i));
			}
		}
		
	}

	private void removerTelefone() {
		listarTelefones();
		System.out.println("Selecione o objeto para remover: ");
		int obj = tec.nextInt();
		lista.remove(obj);
		
	}

	private void editarTelefone() {
		listarTelefones();
		System.out.println("Selecione o objeto para editar: ");
		int obj = tec.nextInt();
		Item s = new Item();
		tec.nextLine();
		System.out.println("Insira seu telefone: ");
		s.setTelefone(tec.nextLine());
		
		
		System.out.println("Insira seu endereco: ");
		s.setEndereco(tec.nextLine());
		
		
		System.out.println("Insira seu nome: ");
		s.setDonoEndereco(tec.nextLine());
		lista.set(obj, s);
		
	}

	private void cadastrarTelefone() {
		
		Item s = new Item();
		tec.nextLine();
		System.out.println("Insira seu telefone: ");
		s.setTelefone(tec.nextLine());
		
		
		System.out.println("Insira seu endereco: ");
		s.setEndereco(tec.next());
		tec.nextLine();
		
		System.out.println("Insira seu nome: ");
		s.setDonoEndereco(tec.nextLine());
		s.setId(lista.size());
		lista.add(s);
	}

	private void listarTelefones() {
		for(int i=0;i<lista.size();i++){
			System.out.println(lista.get(i));
		}
	}

	private void ShowMenu() {
		System.out.println("Por favor selecione uma das opções");
		System.out.println("1 - Listar");
		System.out.println("2 - Cadastrar");
		System.out.println("3 - Editar");
		System.out.println("4 - Remover");
		System.out.println("5 - Procurar");
	}
	
	private int GetMenuOption(){
	    return tec.nextInt();
	}

}
