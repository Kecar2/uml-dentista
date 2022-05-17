package dentista;

import java.util.ArrayList;

public class ResgistroPacientes {
	private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

	public float importeFacturas(String nif) {
		float importe = 0;

		for (Paciente p : pacientes) {
			if (p.getNif().equals(nif)) {
					importe = importe + p.calculaImporteFactura();
				break;
			}
		}
		return importe;
	}
}
