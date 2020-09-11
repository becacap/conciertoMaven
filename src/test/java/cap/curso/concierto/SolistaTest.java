package cap.curso.concierto;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Trompeta;
import cap.curso.concierto.musicos.Musico;
import cap.curso.concierto.musicos.MusicoInterface;
import cap.curso.concierto.musicos.Solista;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configuracion.class)
public class SolistaTest
{
	@Autowired
	private MusicoInterface solista;
	
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
	public void testSetInstrumento() {		
		//getSolista().setInstrumento(getTrompeta());
		assertNotNull(((Solista) getSolista()).getInstrumento().getSonido());
		
	}

	public MusicoInterface getSolista()
	{
		return solista;
	}

	public void setSolista(MusicoInterface solista)
	{
		this.solista = solista;
	}

	
	/*@Test
	public void testException() {
		getTrompeta().setSonido("nada");
		
		Exception exception = assertThrows(SinSonidoException.class, () -> {solista.tocar(0);});
	    System.out.println(exception.getMessage() + " " + getTrompeta().getSonido());

		String expectedMessage = "esta";
	    String actualMessage = exception.getMessage();
	    
	 
	    assertTrue(actualMessage.contains(expectedMessage));
	}*/
	
	/*
	@Test(expected = SinSonidoException.class)
	public void testException() throws SinSonidoException {
		
		getTrompeta().setSonido("nada");
		try
		   {		
			solista.tocar(1);
		   }
		catch(SinSonidoException re)
		   {
		      String message = "esta roto";
		      assertTrue(re.getMessage().contains(message));

		      throw re;
		    }
	}*/

}
