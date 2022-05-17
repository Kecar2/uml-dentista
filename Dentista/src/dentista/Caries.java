package dentista;

public class Caries extends LineaTratamiento {
	public Caries(String concepto) {
		super(concepto);
	}

	public int numDientesAfectado;

	public float calculaImporte() {
		return 50;
	}
}
