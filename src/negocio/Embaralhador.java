package negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Embaralhador {
	  public static Integer[] oddPermutation(Integer[] items) {
		    List<Integer[]> permutations = new ArrayList<>();
		    oddPermutations(items, 0, permutations);
		    Integer[] permutation = getRandom(permutations);
		    return permutation;
	  }

	  private static void oddPermutations(Integer[] items, int index, List<Integer[]> permutations) {
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
	  
	  public static Integer[] evenPermutation(Integer[] items) {
		List<Integer[]> permutations = new ArrayList<>();
	    evenPermutations(items, 0, permutations);
	    Integer[] permutation = getRandom(permutations);
	    return permutation;
	  }

	  private static void evenPermutations(Integer[] items, int index, List<Integer[]> permutations) {
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

	  private static void swap(Integer[] items, int i, int j) {
	    Integer temp = items[i];
	    items[i] = items[j];
	    items[j] = temp;
	  }
	  
	  private static Integer[] getRandom(List<Integer[]> list) {
		    int rnd = new Random().nextInt(list.size());
		    return list.get(rnd);
		}
}
