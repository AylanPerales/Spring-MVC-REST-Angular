package uia.com.appi.ContabilidadUIA.controladores;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uia.com.api.Contabilidad.modelo.gestor.ClientesRepositorio;
import uia.com.api.ContabilidadUIA.modelo.clientes.InfoUIA;
import uia.com.api.ContabilidadUIA.modelo.proveedores.Proveedor;

@RestController
public class ClienteController
{
	
	private ClientesRepositorio clientes = new ClientesRepositorio();
	
	
	@RequestMapping("clientes")
	public ResponseEntity<List<InfoUIA>> getAllClientes()
	{
		System.out.println("Saludos desde getAllClientes()");
		return ResponseEntity.ok(clientes.getListaproveedores());
	}
	
	 @RequestMapping(value="clientes/{clientesId}",method = RequestMethod.GET)
	 public ResponseEntity<InfoUIA> clienteById(@PathVariable String clienteId) throws ClassNotFoundException
	 {
		 System.out.println("Saludos desde clienteById()");
		return ResponseEntity.ok((InfoUIA)clientes.getProveedor(clienteId));
	 }
	 
	 public Object getProveedor(String clienteId)
	 {
		 Object contabilidad;
		 proveedor = (Proveedor) contabilidad.busca(clienteId);
		 return getProveedor(null);
	 }
	 
	 
	 @RequestMapping(method=RequestMethod.POST)
	 public ResponseEntity<List> saveCliente(@RequestParam String newCliente)
	 {
		 System.out.println("Saludos desde saveCliente()");
		 return ResponseEntity.ok(clientes.setProveedor(newCliente);
	 }
}
