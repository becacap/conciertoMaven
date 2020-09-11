package cap.curso.concierto;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.instrumentos.Tambor;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configuracion.class)
public class TamborTest
{
	@Autowired
	private Tambor tambor;
	
	@Test
	public void test()
	{
		System.out.println("Tamborcillo " + getTambor().getSonido());
		assertNotNull(getTambor().sonar());	}

	@Test
	public void testNegativo() {
		
		getTambor().setSonido(null);
		assertNull(getTambor().sonar());		
	}
	
	
	public Tambor getTambor()
	{
		return tambor;
	}

	public void setTambor(Tambor tambor)
	{
		this.tambor = tambor;
	}

}
