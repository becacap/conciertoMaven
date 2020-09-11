package cap.curso.concierto.teatros;

import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Instrumento;
import cap.curso.concierto.musicos.Musico;
import cap.curso.concierto.musicos.Solista;

public class ConciertoSolista
{

	public static void main(String[] args)
	{
		Instrumento tambor= new Instrumento();
		tambor.setSonido("pom, pom, pom");
		Musico  solista= new Solista();
		solista.setInstrumento(tambor);
		try
		{
			solista.tocar(1);
		} catch (SinSonidoException e)
		{
			System.err.println(e.getMessage());
		}
	}

}
  