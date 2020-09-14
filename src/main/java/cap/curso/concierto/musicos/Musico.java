package cap.curso.concierto.musicos;

import java.util.HashSet;
import java.util.Set;

import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Instrumento;

public abstract class Musico implements MusicoInterface
{

	
	private Instrumento instrumento;
	
	private Instrumento instrumento2;
	
	private Set<Instrumento> instrumentos= new HashSet<>();
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

	public Instrumento getInstrumento2()
	{
		return instrumento2;
	}

	public void setInstrumento2(Instrumento instrumento2)
	{
		this.instrumento2 = instrumento2;
	}

	
	

}
