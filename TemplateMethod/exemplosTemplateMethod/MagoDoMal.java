package exemplosTemplateMethod;

import java.util.ArrayList;

public class MagoDoMal extends Criatura{
	private int mana;
	private ArrayList<Magia> listaDeMagias;

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	

	public void lancarMagiaDano(Magia spell) {
	
	}
	
	public void lancarMagiaCura(Magia spell) {
	
}

	@Override
	public void atacar(int atributoDeDano, Arma equip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void andar(float velocidade, int direcao) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Magia> getListaDeMagias() {
		return listaDeMagias;
	}

	public void setListaDeMagias(ArrayList<Magia> listaDeMagias) {
		this.listaDeMagias = listaDeMagias;
	}
}
