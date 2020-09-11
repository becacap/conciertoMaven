package cap.curso.concierto.instrumentos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("pepe")
public class Guitarra extends Instrumento
{
	@Override
	//@Value("atlan, tlan, tlan con anotaciones")
	public void setSonido(String sonido)
	{
		// TODO Auto-generated method stub
		super.setSonido(sonido);
	}
}
