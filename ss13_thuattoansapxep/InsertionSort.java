package ss13_thuattoansapxep;

public class InsertionSort {
    static int[] list = {5,6,4,7,9,3,-2,-6,11,15};

    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length ; i++) {
            int x = list[i];
            int pos = i;
            while(pos>0 && x < list[pos-1]){
                list[pos] = list[pos-1];
                pos -- ;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int e : list
        ) {
            System.out.print(e + "\t");
        }
    }
}
