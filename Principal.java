package br.edu.fatecpg.tp.main;

import java.util.Scanner;

import br.edu.fatecpg.tp.abstracao.Carro;

public class Principal{
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Digite a marca do veiculo: ");
	        String marca = scan.nextLine();
	        System.out.print("Digite o modelo do veiculo: ");
	        String modelo = scan.nextLine();
	        Carro meuCarro = new Carro(marca, modelo, "abcde");
	        System.out.println("Digite o preço da gasolina: ");
	        double litro = scan.nextDouble();
	        System.out.println("O preço do tanque de gasolina é de: " + meuCarro.gasolina(litro));
	        meuCarro.girarChave();
	        for (int i = 0; i < 3; i++) {
	            System.out.print("Digite a aceleração: ");
	            double acc = scan.nextDouble();
	            meuCarro.acelerar(acc);
	            System.out.println(meuCarro.getVelAtual());
	        }
	        meuCarro.frear(30);
	        System.out.println(meuCarro.getVelAtual());
	        meuCarro.acelerar(100);
	        System.out.println(meuCarro.getVelAtual());
	        meuCarro.girarChave();
	        System.out.println("Marca do carro: " + meuCarro.getMarca());
	    }
}