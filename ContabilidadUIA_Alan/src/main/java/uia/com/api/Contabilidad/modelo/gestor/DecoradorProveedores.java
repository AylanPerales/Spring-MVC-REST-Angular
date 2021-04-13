package uia.com.api.Contabilidad.modelo.gestor;

import java.util.ArrayList;

import uia.com.api.ContabilidadUIA.modelo.clientes.InfoUIA;


public class DecoradorProveedores extends Decorador {
	
	public DecoradorProveedores(IGestor gestor, String tipo)
	{
		super(gestor, tipo);
	}
	
	
	public DecoradorProveedores()
	{		
	}
	
	public void validaProveedores()
	{
		super.Print();
	}

	
}
