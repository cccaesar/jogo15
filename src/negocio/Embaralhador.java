package negocio;

import java.util.ArrayList;
import java.util.List;

public class Embaralhador {
	  private static ArrayList<Integer> embaralhar(List<Integer> lista) {
		  ArrayList<Integer> listaEmbaralhada = new ArrayList<Integer>();
		  listaEmbaralhada.addAll(lista);
		  java.util.Collections.shuffle(listaEmbaralhada);
		  return listaEmbaralhada;
	  }
	  
	  //** retorna true se a permutação for par e false para impar */
	  public static boolean verificarParidadeDaPermutacao(List<Integer> lista) {
		  int inversoes=0;
		    for(int i=0;i<lista.size();i++)
		        for(int j=i+1;j<lista.size();j++)
		            if (lista.get(i)>lista.get(j)) inversoes++;
		  return inversoes%2 == 0;
	  }
	  
	  public static ArrayList<Integer> embaralhamentoPar(List<Integer> lista) {
		  ArrayList<Integer> listaEmbaralhada = new ArrayList<Integer>();
		  do {
			  listaEmbaralhada = embaralhar(lista);
		  } while (verificarParidadeDaPermutacao(listaEmbaralhada));
		  return listaEmbaralhada;
	  }
	  
	  public static ArrayList<Integer> embaralhamentoImpar(List<Integer> lista) {
		  ArrayList<Integer> listaEmbaralhada = new ArrayList<Integer>();
		  do {
			  listaEmbaralhada = embaralhar(lista);
		  } while (verificarParidadeDaPermutacao(listaEmbaralhada) == false);
		  return listaEmbaralhada;
	  }
}
