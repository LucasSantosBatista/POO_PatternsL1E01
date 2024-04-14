/**
 * 
 */
package model;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public abstract interface Veiculo {
	public static String placa = "";
	public static String marca = "";
	public static String modelo = "";
	public static String cor = "";
	public static float velocidadeMax = 0;
	public static int qtdRodas = 0;
	public static Motor Motor = new Motor();

	public static String getPlaca() {
		return placa;
	}

	public static void setPlaca(String placa) {
		placa = placa;
	}

	public static String getMarca() {
		return marca;
	}

	public static void setMarca(String marca) {
		marca = marca;
	}

	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		modelo = modelo;
	}

	public static String getCor() {
		return cor;
	}

	public static void setCor(String cor) {
		cor = cor;
	}

	public static float getVelocidadeMax() {
		return velocidadeMax;
	}

	public static void setVelocidadeMax(float velocidadeMax) {
		velocidadeMax = velocidadeMax;
	}

	public static int getQtdRodas() {
		return qtdRodas;
	}

	public static void setQtdRodas(int qtdRodas) {
		qtdRodas = qtdRodas;
	}

	public static Motor getMotor() {
		return Motor;
	}

	public static void setMotor(Motor motor) {
		Motor = motor;
	}

	public abstract float calcVel(float velocidadeMax);
}
