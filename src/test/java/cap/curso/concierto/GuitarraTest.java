package cap.curso.concierto;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cap.curso.concierto.configuracion.Configuracion;
import cap.curso.concierto.instrumentos.Guitarra;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Configuracion.class)
public class GuitarraTest
{
	@Autowired
	private Guitarra guitarra;

	@Test
	public void test()
	{
		System.out.println("Guitarrilla " + getGuitarra().getSonido());
		assertNotNull(getGuitarra().sonar());
	}

	@Test
	public void testNegativo() {
		
		getGuitarra().setSonido(null);
		assertNull(getGuitarra().sonar());		
	}
	
	public Guitarra getGuitarra()
	{
		return guitarra;
	}

	public void setGuitarra(Guitarra guitarra)
	{
		this.guitarra = guitarra;
	}

}
