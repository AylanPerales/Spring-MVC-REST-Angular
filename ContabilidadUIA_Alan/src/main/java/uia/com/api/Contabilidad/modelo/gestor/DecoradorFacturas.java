package uia.com.api.Contabilidad.modelo.gestor;

public class DecoradorFacturas extends Decorador {
	
	public DecoradorFacturas(IGestor gestor, String tipo)
	{
		super(gestor, tipo);
	}
	
	
	public DecoradorFacturas()
	{		
	}
	
	public void validaFacturas()
	{
		super.Print();
	}

}
