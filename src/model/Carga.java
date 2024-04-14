/**
 * 
 */
package model;

/**
 * @author Lucas Batista 14 de abr. de 2024
 */
public class Carga implements Veiculo {
	private Veiculo veiculo;
	private int cargaMax;
	private int tara;

	public Carga() {
		super();
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public final void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getTara() {
		return tara;
	}

	public final void setTara(int tara) {
		this.tara = tara;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public float calcVel(float velocidadeMax) {
		return velocidadeMax * 100000;
	}

}