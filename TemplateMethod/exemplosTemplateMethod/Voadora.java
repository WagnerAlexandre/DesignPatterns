package exemplosTemplateMethod;

public abstract class Voadora extends Criatura {
	private int VelVoo;

	@Override
	public abstract void atacar(int atributoDeDano, Arma equip);

	@Override
	public  abstract void andar(float velocidade, int direcao);

	public int getVelVoo() {
		return VelVoo;
	}

	public void setVelVoo(int velVoo) {
		VelVoo = velVoo;
	}
	
	public abstract void levantarVoo();
	
	public abstract void voar();

}
