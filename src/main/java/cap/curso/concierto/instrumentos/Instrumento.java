package cap.curso.concierto.instrumentos;

public class Instrumento implements InstrumentoInterface,Comparable<Instrumento>
{

	private String sonido;
	
	

	@Override
	public String sonar()
	{

		return getSonido();
	}

	public String getSonido()
	{
		return sonido;
	}

	public void setSonido(String sonido)
	{
		this.sonido = sonido;
	}

	@Override
	public int compareTo(Instrumento otro)
	{
		
		return otro.getSonido().compareTo(this.getSonido());
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Instrumento otro= (Instrumento) obj;
		return this.getSonido().length()==otro.getSonido().length();
	}

	@Override
	public int hashCode()
	{
		int resultado=this.getSonido().length();
		return Integer.valueOf( resultado)+1;
	}
	
	

}
