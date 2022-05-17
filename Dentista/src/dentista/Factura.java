package dentista;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
	private int numero;
	private String descripcion;
	private Date fecha;

	private ArrayList<LineaTratamiento> lineas = new ArrayList<LineaTratamiento>();

	private Paciente paciente;

	public float calculaImporteFactura() {
		float importe = 0;
		for (LineaTratamiento lt : lineas) {
			importe = importe + lt.calculaImporte();
		}

		return importe;
	}
}
