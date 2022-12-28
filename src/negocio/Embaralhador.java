package negocio;

import java.util.ArrayList;
import java.util.List;

public class Embaralhador {
	  public static <T> List<T[]> oddPermutations(T[] items) {
		    List<T[]> permutations = new ArrayList<>();
		    oddPermutations(items, 0, permutations);
		    return permutations;
	  }

	  private static <T> void oddPermutations(T[] items, int index, List<T[]> permutations) {
	    if (index == items.length - 1) {
	      permutations.add(items.clone());
	      return;
	    }

	    for (int i = index; i < items.length; i++) {
	      if (i % 2 == 1) {
	        swap(items, index, i);
	        oddPermutations(items, index + 1, permutations);
	        swap(items, index, i);
	      }
	    }
	  }
	  
	  public static <T> List<T[]> evenPermutations(T[] items) {
	    List<T[]> permutations = new ArrayList<>();
	    evenPermutations(items, 0, permutations);
	    return permutations;
	  }

	  private static <T> void evenPermutations(T[] items, int index, List<T[]> permutations) {
	    if (index == items.length - 1) {
	      permutations.add(items.clone());
	      return;
	    }

	    for (int i = index; i < items.length; i++) {
	      if (i % 2 == 0) {
	        swap(items, index, i);
	        evenPermutations(items, index + 1, permutations);
	        swap(items, index, i);
	      }
	    }
	  }

	  private static <T> void swap(T[] items, int i, int j) {
	    T temp = items[i];
	    items[i] = items[j];
	    items[j] = temp;
	  }
}
