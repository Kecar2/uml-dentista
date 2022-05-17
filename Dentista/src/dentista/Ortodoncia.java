package dentista;

public class Ortodoncia extends LineaTratamiento {

	public int numDientesAfectado;
	
	public Ortodoncia(String concepto) {
		super(concepto);
	}

	public float calcularImporte() {
		return 1000;
	}
}
