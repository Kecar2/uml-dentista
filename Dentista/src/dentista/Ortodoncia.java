package dentista;

public class Ortodoncia extends LineaTratamiento {
	public Ortodoncia(String concepto) {
		super(concepto);
		// TODO Auto-generated constructor stub
	}

	public int numDientesAfectado;

	public float calcularImporte() {
		return 1000;
	}
}
