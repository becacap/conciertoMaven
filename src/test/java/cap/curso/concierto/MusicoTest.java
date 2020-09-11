package cap.curso.concierto;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.instrumentos.Guitarra;
import cap.curso.concierto.instrumentos.Tambor;
import cap.curso.concierto.instrumentos.Trompeta;
import cap.curso.concierto.musicos.HombreOrquesta;
import cap.curso.concierto.musicos.Musico;
import cap.curso.concierto.musicos.MusicoInterface;
import cap.curso.concierto.musicos.Solista;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configuracion.class)
public class MusicoTest
{
	
	
	@Autowired
	@Qualifier("solista")
	private MusicoInterface solista;
	
	@Autowired
	@Qualifier("federico")
	private HombreOrquesta hombreOrquesta;

	//
	@Autowired
	private Tambor tambor;
	@Autowired
	private Guitarra guitarra;
	@Autowired
	private Trompeta trompeta;
	
	public MusicoInterface getSolista()
	{
		return solista;
	}

	public MusicoInterface getHombreOrquesta()
	{
		return hombreOrquesta;
	}

	

	public Tambor getTambor()
	{
		return tambor;
	}

	public void setTambor(Tambor tambor)
	{
		this.tambor = tambor;
	}

	public Guitarra getGuitarra()
	{
		return guitarra;
	}

	public void setGuitarra(Guitarra guitarra)
	{
		this.guitarra = guitarra;
	}

	public Trompeta getTrompeta()
	{
		return trompeta;
	}

	public void setTrompeta(Trompeta trompeta)
	{
		this.trompeta = trompeta;
	}

	
	
	
	
	
	@Test
	public void solistaSetTest()
	{
		System.out.println("A ver " + getGuitarra().getSonido());
		((Musico) getSolista()).setInstrumento(getGuitarra());	
		assertNotNull(((Musico) getSolista()).getInstrumento());
	}

}
