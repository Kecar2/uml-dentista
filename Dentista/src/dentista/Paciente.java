package dentista;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
	private String nif;
	private String nombre;
	private String direccion;
	private ArrayList<Factura> facturas = new ArrayList<Factura>();

	public String getNif() {
		return nif;
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public float calculaImporteFactura() {
		return 0;
	}

}
