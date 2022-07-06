package exemplosTemplateMethod;

public class Arma {
	private float xDamage;
	private int minInt;
	private int minDex;
	private int minStr;
	private int alcance;
	private String nome;

	public int getMinStr() {
		return minStr;
	}

	public int getAlcance() {
		return alcance;
	}

	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}
	
	public void setMinStr(int minStr) {
		this.minStr = minStr;
	}

	public int getMinDex() {
		return minDex;
	}

	public void setMinDex(int minDex) {
		this.minDex = minDex;
	}

	public int getMinInt() {
		return minInt;
	}

	public void setMinInt(int minInt) {
		this.minInt = minInt;
	}

	public float getxDamage() {
		return xDamage;
	}

	public void setxDamage(float xDamage) {
		this.xDamage = xDamage;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
