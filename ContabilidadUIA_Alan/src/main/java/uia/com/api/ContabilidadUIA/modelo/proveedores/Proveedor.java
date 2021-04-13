package uia.com.api.ContabilidadUIA.modelo.proveedores;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import uia.com.api.ContabilidadUIA.modelo.clientes.Cliente;
import uia.com.api.ContabilidadUIA.modelo.clientes.InfoUIA;
import uia.com.api.ContabilidadUIA.modelo.cuentas.Cuenta;

public class Proveedor extends InfoUIA
{
	
	private static final int List = 0;
	private static final int Cliente = 0;
	Double saldo = 0.0;
	Cuenta miCuenta = null;
	private ArrayList<Cliente> lista = null;
	
	@JsonCreator
    public Proveedor(@JsonProperty("id")int id, @JsonProperty("name")String name, @JsonProperty("saldo")double p1) 
	{
        super(id, name);
        super.type =  this. getClass(). getSimpleName();        
        this.saldo = p1;
    }

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void validaCobranza() 
	{
			getItems().forEach(t->
	 				{
	 					t.validaCobranza();
		 			}
	 				);
		
	}
	

}

