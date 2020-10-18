package Sort;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-18
 * Time:15:52
 **/
public class sort {


    public static void selectSort(long[] array){
        for (int i = 0; i < array.length-1; i++) {
            int maxIndex = 0;
            for (int j = 1; j < array.length-i; j++) {
                if (array[j] > array[maxIndex]){
                    maxIndex = j;
                }

            }
           long tmp = array[maxIndex];
            array[maxIndex] = array[array.length-1-i];
            array[array.length-1-i] = tmp;

        }
    }

    public static void insert(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int key = array[i+1];

            int j;
            for (j =i; j >= 0 ; j--) {
                if (key < array[j]) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = key;
        }
    }

}
