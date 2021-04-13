package uia.com.api.Contabilidad.modelo.gestor;

public class DecoradorRequisicion extends Decorador {
	
	public DecoradorRequisicion(IGestor gestor, String tipo)
	{
		super(gestor, tipo);
	}
	
	
	public DecoradorRequisicion()
	{		
	}
	
	public void validaRequisicion()
	{
		super.Print();
	}

}
