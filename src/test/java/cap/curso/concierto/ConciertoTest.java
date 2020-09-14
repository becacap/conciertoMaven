package cap.curso.concierto;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cap.curso.concierto.configuracion.Configuracion;
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

	//@Test
	public void TrompetaTest()
	{
		System.out.println(getTrompeta().getSonido());
		assertNotNull(getTrompeta().sonar());
	}
	//@Test
	public void TrompetaTestNegativo()
	{
		getTrompeta().setSonido(null);
		assertNull(getTrompeta().sonar());
	}
	
	@Test
	public void testSolista() {
		assertNotNull(getSolista());
	}

	public MusicoInterface getSolista()
	{
		return solista;
	}

	public void setSolista(MusicoInterface solista)
	{
		this.solista = solista;
	}

}
