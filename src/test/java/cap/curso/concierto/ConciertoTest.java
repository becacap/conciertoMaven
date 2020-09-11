package cap.curso.concierto;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.instrumentos.Guitarra;
import cap.curso.concierto.instrumentos.Tambor;
import cap.curso.concierto.instrumentos.Trompeta;
import cap.curso.concierto.musicos.MusicoInterface;
import cap.curso.concierto.musicos.Solista;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configuracion.class)
public class ConciertoTest
{
	@Autowired
	private Trompeta trompeta;
	
	@Autowired
	@Qualifier("solista")
	private MusicoInterface solista; 
	
	public Trompeta getTrompeta()
	{
		return trompeta;
	}

	public void setTrompeta(Trompeta trompeta)
	{
		this.trompeta = trompeta;
	}
	
	@Test
	//@Order(value = 1)
	public void trompetaTest()
	{
		System.out.println(getTrompeta().sonar());
		assertNotNull(getTrompeta().sonar());
	}
	
	@Test
	//@Order(value = 4)
	public void trompetaTestNegativo()
	{
		getTrompeta().setSonido(null);
		assertNull(getTrompeta().sonar());
	}
	/*
	//GUITARRA
	@Autowired
	private Guitarra guitarra;
	

	public Guitarra getGuitarra()
	{
		return guitarra;
	}

	public void setGuitarra(Guitarra guitarra)
	{
		this.guitarra = guitarra;
	}
	
	@Test
	@Order(value = 2)
	public void guitarraTest()
	{
		System.out.println(getGuitarra().sonar());
		assertNotNull(getGuitarra().sonar());
	}
	
	@Test
	@Order(value = 5)
	public void guitarraTestNegativo()
	{
		getGuitarra().setSonido(null);
		assertNull(getGuitarra().sonar());
	}
	
	@Autowired
	private Tambor tambor;
	

	public Tambor getTambor()
	{
		return tambor;
	}

	public void setTambor(Tambor tambor)
	{
		this.tambor = tambor;
	}
	
	@Test
	@Order(value = 3)
	public void tamborTest()
	{
		System.out.println(getTambor().sonar());
		assertNotNull(getTambor().sonar());
	}
	
	@Test
	@Order(value = 6)
	public void tamborTestNegativo()
	{
		getTambor().setSonido(null);
		assertNull(getTambor().sonar());
	}*/
	
	public MusicoInterface getSolista()
	{
		return solista;
	}

	public void setSolista(MusicoInterface solista)
	{
		this.solista = solista;
	}

	@Test
	public void testSolista()
	{
		assertNotNull(getSolista());
	}
	

}
