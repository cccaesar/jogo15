package negocio;

import java.util.ArrayList;
import java.util.List;

public class Embaralhador {
	  
	  private static int getNumeroDeInversoes(List<Integer> listaEmbaralhada) {
		  int inv_count = 0;
		  	for (int i = 0; i < listaEmbaralhada.size() - 1; i++)
			  for (int j = i + 1; j < listaEmbaralhada.size(); j++)
				  if (listaEmbaralhada.get(i) > listaEmbaralhada.get(j))
					  inv_count++;
		  return inv_count;
	  }
	  
	  public static ArrayList<Integer> embaralhamentoPar(List<Integer> lista) {
		  ArrayList<Integer> listaEmbaralhada = new ArrayList<Integer>();
		  int inversoes;
		  do {
			  inversoes = 0;
			  listaEmbaralhada.clear();
			  listaEmbaralhada.addAll(lista);
			  java.util.Collections.shuffle(listaEmbaralhada);
			  inversoes = getNumeroDeInversoes(listaEmbaralhada);
		  } while ( inversoes != 0 &&  inversoes % 2 != 0 && listaEmbaralhada.equals(lista) == false);
		  System.out.println(inversoes);
		  return listaEmbaralhada;
	  }
	  
	  public static ArrayList<Integer> embaralhamentoImpar(List<Integer> lista) {
		  ArrayList<Integer> listaEmbaralhada = new ArrayList<Integer>();
		  int inversoes;
		  do {
			  inversoes = 0;
			  listaEmbaralhada.clear();
			  listaEmbaralhada.addAll(lista);
			  java.util.Collections.shuffle(listaEmbaralhada);
			  inversoes = getNumeroDeInversoes(listaEmbaralhada);
		  } while (inversoes % 2 == 0 || inversoes == 0 || listaEmbaralhada.equals(lista));
		  System.out.println(inversoes);
		  return listaEmbaralhada;
	  }
}
