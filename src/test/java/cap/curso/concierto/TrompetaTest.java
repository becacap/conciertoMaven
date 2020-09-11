package cap.curso.concierto;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Trompeta;

/*
 * Con esto, se creará el context y demás
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configuracion.class)
public class TrompetaTest
{
	@Autowired
	private Trompeta trompeta;

	public Trompeta getTrompeta()
	{
		return trompeta;
	}

	public void setTrompeta(Trompeta trompeta)
	{
		this.trompeta = trompeta;
	}

	@Test
	@Order(value = 1)
	public void test()
	{
		System.out.println("Trompetilla " + getTrompeta().getSonido());
		assertNotNull(getTrompeta().sonar());
	}
	
	
	@Test
	@Order(value = 2)
	public void testNegativo() {
		
		getTrompeta().setSonido(null);
		assertNull(getTrompeta().sonar());		
	}
	
	


}
