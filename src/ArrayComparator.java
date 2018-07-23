public class ArrayComparator {
    boolean compare(int[] tablica1, int[] tablica2) {
        int size1 = tablica1.length;
        int size2 = tablica2.length;
        if (size1 != size2) {
            return false;
        }
        for (int i = 0; i < tablica1.length; i++) {
            if (tablica1[i] != tablica2[i]) {
                return false;
            }
        }
        return true;
    }

}

