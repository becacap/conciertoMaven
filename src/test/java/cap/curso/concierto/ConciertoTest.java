package cap.curso.concierto;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.AopTestUtils;

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
public class ConciertoTest
{
	
	@Autowired
	private Trompeta trompeta;
	@Autowired
	private Tambor tambor;
	@Autowired
	private Guitarra guitarra;
	@Autowired
	@Qualifier("solista")
	private MusicoInterface musicoSolista;
	@Autowired
	@Qualifier("federico")
	private MusicoInterface musicoOrquesta;
	
	

	@Test
	public void trompetaTest()
	{
		getTrompeta().setSonido("TURURU");
		assertNotNull(getTrompeta().sonar());
	}
		
	@Test
	public void tamborTest()
	{
		getTambor().setSonido("POM");
		assertNotNull(getTambor().sonar());
	}
	
	@Test
	public void guitarraTest()
	{
		getGuitarra().setSonido("Chunda");
		assertNotNull(getGuitarra().sonar());
	}
	
	@Test
	public void testSolista()
	{
		Solista solista = AopTestUtils.getTargetObject(musicoSolista);
		assertNotNull(solista.getInstrumento());
	}
	
	@Test
	public void testHombreOrquesta()
	{
		HombreOrquesta ho = AopTestUtils.getTargetObject(musicoOrquesta);
		assertNotNull(ho.getInstrumentos());
	}

	@Test
	public void trompetaTestException()
	{
		getTrompeta().setSonido(null);
		assertNull(getTrompeta().sonar());
	}
	
	@Test
	public void tamborTestException()
	{
		getTambor().setSonido(null);
		assertNull(getTambor().sonar());
	}
	
	@Test
	public void guitarraTestException()
	{
		getGuitarra().setSonido(null);
		assertNull(getGuitarra().sonar());
	}

	public Trompeta getTrompeta()
	{
		return trompeta;
	}

	public void setTrompeta(Trompeta trompeta)
	{
		this.trompeta = trompeta;
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

	public MusicoInterface getSolista()
	{
		return musicoSolista;
	}

	public void setSolista(MusicoInterface solista)
	{
		this.musicoSolista = solista;
	}

	public MusicoInterface getMusicoOrquesta()
	{
		return musicoOrquesta;
	}

	public void setMusicoOrquesta(MusicoInterface musicoOrquesta)
	{
		this.musicoOrquesta = musicoOrquesta;
	}
	
	
	
	
	
	
}
