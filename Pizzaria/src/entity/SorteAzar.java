package entity;

import java.util.Random;

import tad.Lista;
import tad.Pilha;

public class SorteAzar {
	
	Pilha p = new Pilha();
	Lista l = new Lista();
	
	public SorteAzar() {
		l.insereUltimo("Sorte\nSeus amigos compraram ingredientes demais\nPegue 1 ingrediente de um jogador");
		l.insereUltimo("Sorte\nSeu tempero est� perfeito\nGanhe 1 ingrediente");
		l.insereUltimo("Sorte\nSua massa est� no ponto certo\nGanhe 1 ingrediente");
		l.insereUltimo("Sorte\nFaltou a luz na cozinha\nPerca 1 ingrediente");
		l.insereUltimo("Azar\nSeus amigos compraram ingredientes demais\nPerca 1 ingrediente");
		l.insereUltimo("Azar\nVoc� exagerou no tempero\nPerca 1 ingrediente");
		l.insereUltimo("Sorte\nTodos adoraram suas �ltimas pizzas\nGanhe 2 ingredientes");
		l.insereUltimo("Azar\nSua pizza queimou\nPerca todos os ingredientes");
		l.insereUltimo("Sorte\nVoc� fez compras na feira\nGanhe 1 ingrediente");
		l.insereUltimo("Azar\nSua cozinha alagou\nPerca 2 ingredientes");
		l.insereUltimo("Sorte\nSeus amigos esqueceram as sacolas na sua pizzaria\nPegue 1 ingrediente de um jogador");
		l.insereUltimo("Azar\nVoc� colocou muito sal\nPerca 1 ingrediente");
		l.insereUltimo("Azar\nVoc� colocou muita pimenta\nPerca 1 ingrediente");
		l.insereUltimo("Sorte\nSeus amigos n�o tem como guardar ingredientes\nPegue 2 ingredientes de um jogador");
		l.insereUltimo("Azar\nO forno n�o esquentou\nPerca 1 ingrediente");
		l.insereUltimo("Sorte\nVoc� foi ao supermecado\nGanhe 1 ingrediente");
		l.insereUltimo("Sorte\nSeus amigos esqueceram de ligar a geladeira\nPegue 1 ingrediente de um jogador");
		l.insereUltimo("Azar\nO supermercado est� fechado\nPerca 2 ingredientes");
		l.insereUltimo("Sorte\nSua pizza est� deliciosa\nGanhe 1 ingrediente");
		l.insereUltimo("Sorte\nSua pizzaria est� cheia hoje\nGanhe 2 ingredientes");
		
		
		while(!l.vazio()){
			reembaralha();
		}
	}
	
	public void reembaralha(){
		Random r = new Random();
		int pos = r.nextInt(l.comprimento())+1;
		System.out.println(pos+ " "+ l.comprimento());
		p.empilhar(l.retornaNaPos(pos).ingrdiente);
		l.removeNaPos(pos);
	}
	
	public static void main(String[] args) {
		SorteAzar sa = new SorteAzar();
		//System.out.println(sa.l.vazio());		
	}
}
