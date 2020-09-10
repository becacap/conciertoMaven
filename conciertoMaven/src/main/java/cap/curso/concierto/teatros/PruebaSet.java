package cap.curso.concierto.teatros;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import cap.curso.concierto.instrumentos.Instrumento;

public class PruebaSet
{

	public static void main(String[] args)
	{
		Instrumento a = new Instrumento();
		Instrumento c = new Instrumento();
		Instrumento b = new Instrumento();
		a.setSonido("a");
		b.setSonido("b");
		c.setSonido("c");
		System.out.println(a.equals(b));
List<Instrumento> l= new ArrayList();
		
		l.add(b);
		l.add(a);
		l.add(c);
		l.add(b);
		l.add(a);
		l.add(c);
		l.add(b);
		l.add(a);
		l.add(c);
		
		
		for (Instrumento instrumento : l)
		{
			System.out.println(instrumento.getSonido());
		}
		System.out.println();
		Set<Instrumento> i = new TreeSet(l);

		for (Instrumento instrumento : i)
		{
			System.out.println(instrumento.getSonido());
		}

	}

}
