package cap.curso.concierto.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("tocameami")
public class Tambor extends Instrumento
{
	@Override
	@Value("bpom, pom, pom con anotaciones")
	public void setSonido(String sonido)
	{
		// TODO Auto-generated method stub
		super.setSonido(sonido);
	}
}
