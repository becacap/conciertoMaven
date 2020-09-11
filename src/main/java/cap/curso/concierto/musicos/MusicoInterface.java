package cap.curso.concierto.musicos;

import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Instrumento;

public interface MusicoInterface
{
	public void tocar(int estado) throws SinSonidoException;

}
