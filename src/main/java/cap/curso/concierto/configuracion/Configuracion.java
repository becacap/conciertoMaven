package cap.curso.concierto.configuracion;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import cap.curso.concierto.instrumentos.Guitarra;
import cap.curso.concierto.instrumentos.Tambor;
import cap.curso.concierto.instrumentos.Trompeta;
import cap.curso.concierto.musicos.HombreOrquesta;

@Configuration
@ComponentScan({"cap.curso.concierto.instrumentos",
	"cap.curso.concierto.musicos",
	"cap.curso.concierto.aspectos"})
@EnableAspectJAutoProxy
public class Configuracion
{

	@Bean(name = "federico")
	public HombreOrquesta getHombreOrquesta() {
		HombreOrquesta hombreOrquesta= new HombreOrquesta();
		hombreOrquesta.getInstrumentos().add(getTambor());
		hombreOrquesta.getInstrumentos().add(getGuitarra());
		hombreOrquesta.getInstrumentos().add(getTrompeta());
		return hombreOrquesta;
	}
	
	@Bean
	public Tambor getTambor() {
		return new Tambor();
	}
	
	@Bean
	public Guitarra getGuitarra()
	{
		Guitarra guitarra= new Guitarra();
		guitarra.setSonido("sonido puesto en clase");
		return guitarra;
		
	}
	@Bean(name = "trompeta")
	public Trompeta getTrompeta()
	{
		return new Trompeta();
	}
}
