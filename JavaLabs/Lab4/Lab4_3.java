package JavaLabs.Lab4;

public class Lab4_3
{
    public static int[] transform(int[] array)
    {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++)      //Трансофрмація масиву за умовами
        {
            if (array[i] < 0)
            {
                result[i] = array[i] * -1;
            }
            else if (array[i] > 0)
            {
                result[i] = array[i] - 3;
            }
            else
            {
                result[i] = -2;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] array1 = {-1, 3, 0, -4};
        int[] array2 = {0, 5, -7};

        System.out.println("Трансформований масив 1: " + java.util.Arrays.toString(transform(array1)));
        System.out.println("Трансформований масив 2: " + java.util.Arrays.toString(transform(array2)));
    }
}
