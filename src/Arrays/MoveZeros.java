package Arrays;

import java.util.ArrayList;

public class MoveZeros {
    public static void moveZeros(int n, int[] arr) {
        //temporary array:
        ArrayList<Integer> temp = new ArrayList<>();
        //copy non-zero elements
        //from original -> temp array:
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                temp.add(arr[i]);
        }

        // number of non-zero elements.
        int nz = temp.size();

        //copy elements from temp
        //fill first nz fields of
        //original array:
        for (int i = 0; i < nz; i++) {
            arr[i] = temp.get(i);
        }

        //fill rest of the cells with 0:
        for (int i = nz; i < n; i++) {
            arr[i] = 0;
        }

    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int n = 5;
        moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
