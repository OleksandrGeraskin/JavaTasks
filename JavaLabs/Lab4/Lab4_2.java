package JavaLabs.Lab4;

public class Lab4_2
{
    public static int findMaxAbsIndex(int[] array)
    {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++)      //Підрахунок індексу, найбульшого числа за модулем
        {
            if (Math.abs(array[i]) > Math.abs(array[maxIndex]))
            {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args)
    {
        int[] array1 = {-1, 3, -8, 2};
        int[] array2 = {0, -10, 5};
        int[] array3 = {7};

        System.out.println("Номер найбільшого за модулем елемента у масиві 1: " + findMaxAbsIndex(array1));
        System.out.println("Номер найбільшого за модулем елемента у масиві 2: " + findMaxAbsIndex(array2));
        System.out.println("Номер найбільшого за модулем елемента у масиві 3: " + findMaxAbsIndex(array3));
    }
}
