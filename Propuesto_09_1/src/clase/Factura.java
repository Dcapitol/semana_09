package clase;

public class Factura {
	private String ruc, empresa;
	private int unidades;
	private double precioUnit;
	
	public Factura(String ruc, String empresa, int unidades, double precioUnit) {
		super();
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.precioUnit = precioUnit;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecioUnit() {
		return precioUnit;
	}

	public void setPrecioUnit(double precioUnit) {
		this.precioUnit = precioUnit;
	}
	
	public double importeFacturado() {
		return unidades * precioUnit;
	}
	
}
