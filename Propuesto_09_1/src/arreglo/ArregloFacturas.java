package arreglo;

import java.util.ArrayList;

import clase.Factura;

public class ArregloFacturas {
	
	private ArrayList<Factura> fac;
	
	public ArregloFacturas() {
		fac = new ArrayList<Factura>();
		fac.add(new Factura("2213242133784","MAYIMBA",16,35.6));
		fac.add(new Factura("2213242454546","TIRTION",19,32.3));
		fac.add(new Factura("2353535333584","MOROCCO",36,21.9));
		fac.add(new Factura("2235272748484","ZIPZIP",45,80.4));
		fac.add(new Factura("3535353533784","TIERLIST",43,32.5));
		fac.add(new Factura("2236464747474","XUIMNO",21,12.5));
		fac.add(new Factura("8589500606666","QUILOTO",67,10.4));
		fac.add(new Factura("8586756566454","ZIPSSION",59,22.6));
	}
	
	public void adicionar(Factura x) {
		fac.add(x);
	}

	public int tamanio() {
		return fac.size();
	}

	public Factura obtener(int i) {
		return fac.get(i);
	}
	
	public double sumaImportesFacturados() {
		double suma = 0;
		for(int i=0; i<tamanio(); i++){
			suma += obtener(i).importeFacturado() ;
		}
		return suma;
	}
	
	public double importeFacturadoPromedio() {
		double suma = 0 ;
		for(int i=0; i<tamanio(); i++){
			suma += obtener(i).importeFacturado(); 
		}
		return suma/tamanio();
	}
	
	public double menorImporteFacturado() {
		double menor = obtener(0).importeFacturado();
		for(int i=1; i<tamanio(); i++){
			if(menor>obtener(i).importeFacturado()) {
				menor = obtener(i).importeFacturado();
			}
		}
		return menor;
	}
	
	public double mayorImporteFacturado() {
		double mayor = 0;
		for(int i=0; i<tamanio(); i++){
			if(mayor<obtener(i).importeFacturado()){
				mayor = obtener(i).importeFacturado();
			}
		}
		return mayor;
	}
	
	public String empresaMenorQuePromedio() {
		double importe = obtener(0).importeFacturado();
		for (int i=0; i<tamanio(); i++) {
			if( importe < importeFacturadoPromedio()) {
				return obtener(i).getEmpresa();
			}
		 }
		return null;
	}
	
}
