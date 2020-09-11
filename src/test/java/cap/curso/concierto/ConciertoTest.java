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
	private MusicoInterface solista;
	
	

	private Trompeta getTrompeta() {
		return trompeta;
	}
	

	private Tambor getTambor() {
		return tambor;
	}



	private Guitarra getGuitarra() {
		return guitarra;
	}

	
	@Test
	public void trompetaTest() {
		System.out.println(getTrompeta().getSonido());
		getTrompeta().setSonido("tu,tu,tu desde test");
		assertNotNull(getTrompeta().sonar());
	}

	@Test
	public void tamborTest() {
		System.out.println(getTambor().getSonido());
		getTambor().setSonido("pom,pom,pom desde test");
		assertNotNull(getTambor().sonar());
	}
	
	@Test
	public void guitarraTest() {
		System.out.println(getGuitarra().getSonido());
		getGuitarra().setSonido("tran,tran,tran desde test");
		assertNotNull(getGuitarra().sonar());
	}

	@Test
	public void trompetaTestNegativo() {
		getTrompeta().setSonido(null);
		assertNull(getTrompeta().sonar());
	}

	@Test
	public void tamborTestNegativo() {
		getTambor().setSonido(null);
		assertNull(getTambor().sonar());
	}


	@Test
	public void guitarraTestNegativo() {
		getGuitarra().setSonido(null);
		assertNull(getGuitarra().sonar());
	}


	@Test
	public void solistaTest() {
		assertNotNull(getSolista());
	}



	private MusicoInterface getSolista() {
		return solista;
	}

}
