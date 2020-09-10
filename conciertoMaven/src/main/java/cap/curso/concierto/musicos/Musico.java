package cap.curso.concierto.musicos;

import java.util.Set;
import java.util.TreeSet;

import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Instrumento;

public abstract class Musico implements MusicoInterface
{

	
	private Instrumento instrumento;
	
	private Set<Instrumento> instrumentos= new TreeSet<>();
	@Override
	public abstract void tocar(int estado) throws SinSonidoException;
	
	public Instrumento getInstrumento()
	{
		return instrumento;
	}
	public void setInstrumento(Instrumento instrumento)
	{
		this.instrumento = instrumento;
	}

	public Set<Instrumento> getInstrumentos()
	{
		return instrumentos;
	}

	public void setInstrumentos(Set<Instrumento> instrumentos)
	{
		this.instrumentos = instrumentos;
	}

	
	

}
