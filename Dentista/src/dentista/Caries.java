package dentista;

public class Caries extends LineaTratamiento {
	
	public int numDientesAfectado;
	
	public Caries(String concepto) {
		super(concepto);
	}
	
	public float calculaImporte() {
		return 50;
	}
}
