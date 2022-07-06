package exemplosSemTemplateMethod;

import java.util.ArrayList;

public class MagoDoMal {
	private int mana;
	private int pontosDeVida;
	private int forca;
	private int destreza;
	private int inteligencia;
	private float velocidade;
	private String nome;
	private Arma weapon;
	private ArrayList<Magia> listaDeMagias; 

	public int getPontosDeVida() {
		return pontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}

	public Arma getWeapon() {
		return weapon;
	}

	public void setWeapon(Arma weapon) {
		this.weapon = weapon;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public void atacar(int atributoDeDano, Arma equip) {
	}

	public void andar(float velocidade, int direcao) {
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	

	public void lancarMagiaDano(Magia spell) {
	
	}
	
	public void LancarMagiaCura(Magia spell) {
	
	}

	public ArrayList<Magia> getListaDeMagias() {
		return listaDeMagias;
	}

	public void setListaDeMagias(ArrayList<Magia> listaDeMagias) {
		this.listaDeMagias = listaDeMagias;
	}

}
