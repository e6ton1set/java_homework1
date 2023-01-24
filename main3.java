package homework1;

/*Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
а остальные - равны ему.*/

public class main3 {

    public static void main(String[] args)
    {
        int []arr = {3, 2, 2, 3};
        int var = 3;
        int []ans = moveVarToEnd(arr, var);

        for(int i = 0; i < arr.length; i++)
            System.out.print(ans[i] + " ");
    }
    static int[] moveVarToEnd(int []array, int toMove)
    {
        int left = 0;
        int right = array.length - 1;

        while (left < right)
        {
            while (left < right && array[right] == toMove)
                right--;

            if (array[left] == toMove)

                swap(array, left, right);

            left++;
        }
        return array;
    }
    static int[] swap(int []arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

}