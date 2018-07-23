public class ArrayTest {
    public static void main(String[] args) {
        ArrayComparator arrayComparator = new ArrayComparator();
        int[] tablica1 = new int[3];
        int[] tablica2 = new int[3];
        tablica1[0] = 1;
        tablica1[1] = 1;
        tablica1[2] = 3;
        tablica2[0] = 1;
        tablica2[1] = 1;
        tablica2[2] = 3;
        boolean porownajTablice = arrayComparator.compare(tablica1, tablica2);
        System.out.println(porownajTablice);
    }

}
