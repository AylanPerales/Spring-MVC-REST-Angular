package uia.com.appi.ContabilidadUIA.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControler 
{
	@RequestMapping("/home")
	public String hello()
	{
		return "Hola Mundo, estoy ocupando RESTful con SPRING BOOT.";
	}
}
