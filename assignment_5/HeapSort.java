class Heap<A extends Comparable<A>> {

  // fields: TODO

  /** Initialize heapsort. */
  Heap(A[] a) {

    // TODO

  }

  // private auxiliary methods: TODO

  /** Perform heap-sort. */
  public void sort() {

    // TODO

  }
}

public class HeapSort {

  /** Run heap-sort on the program arguments. */
  public static void main (String[] args) {
    new Heap<String>(args).sort();
    for (String arg : args) System.out.println(arg);
  }
}