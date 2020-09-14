package cap.curso.concierto.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import cap.curso.concierto.excepciones.SinSonidoException;
import cap.curso.concierto.instrumentos.Instrumento;
import cap.curso.concierto.musicos.HombreOrquesta;
import cap.curso.concierto.musicos.Musico;
import cap.curso.concierto.musicos.Solista;

@Aspect
@Component
public class PropietarioDelTeatro
{

	@Pointcut("execution(@cap.curso.concierto.anotaciones.Propietario * *.*(..))")
	public void sujetador()
	{

	}

	@Around("sujetador()")
	public Object arreglar(ProceedingJoinPoint joinPoint) throws SinSonidoException
	{

		Musico musico = (Musico) joinPoint.getTarget();
		Object salida = null;
		try
		{
			// BEFORE
			if((int)joinPoint.getArgs()[0]==1)
			System.err.println("Señores apaguen los moviles que va a empezar el concierto.\n");
			salida = joinPoint.proceed();
			System.err.println("Señores el concierto ha terminado, pueden encender sus moviles");
			return salida;
		} catch (Throwable e)
		{
			System.out.println(e.getMessage());
			// AFTER THROWING
			if (musico instanceof Solista)
			{
				
				musico.getInstrumento()
						.setSonido("sonido arreglado(" + musico.getInstrumento().getClass().getSimpleName() + ")");
				musico.tocar(2);

			} else
			{
				
				for (Instrumento instrumento : musico.getInstrumentos())
				{
					if (instrumento.getSonido().equals("nada"))
					{
						instrumento.setSonido("sonido arreglado(" + instrumento.getClass().getSimpleName() + ")");
						musico.tocar(2);
					}
				}

			}

		} finally
		{
			
		}
		System.out.println("Señores todos los instrumentos estan arreglados, vamos a continuar el concierto");
		//musico.tocar(2);
		return salida;
	}

}
