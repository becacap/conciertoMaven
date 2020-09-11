package cap.curso.concierto.instrumentos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component("pepe")   // Se lo cambio por @Component sin nombre pa las pruebas
@Component
public class Guitarra extends Instrumento
{
	@Override
	@Value("tlan, tlan, tlan")
	public void setSonido(String sonido)
	{
		// TODO Auto-generated method stub
		super.setSonido(sonido);
	}
}
