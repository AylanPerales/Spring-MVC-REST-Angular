package uia.com.api.Contabilidad.modelo.gestor;

public class DecoradorCompras extends Decorador {
	
	public DecoradorCompras(IGestor gestor, String tipo)
	{
		super(gestor, tipo);
	}
	
	public DecoradorCompras()
	{		
	}
	
	public void validaCompras()
	{
		super.Print();
	}


}
