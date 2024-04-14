package model;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class Passeio implements Veiculo {
	private Veiculo veiculo;
	private int qtdPassageiros;

	public Passeio() {
		super();
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public final void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public float calcVel(float velocidadeMax) {
		return velocidadeMax * 1000;
	}

}