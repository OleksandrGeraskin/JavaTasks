package JavaLabs.Lab6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lab6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте розмір масиву:");
        int size = scanner.nextInt();

        float[] array = generateRandomArray(size);
        System.out.println("Сгенерований масив:");
        System.out.println(Arrays.toString(array));

        System.out.println("Оберіть метод сортування: 1 - Bubble sort, 2 - Selection sort:");

        int method;
        while (true)
        {
            method = scanner.nextInt();
            if (method == 1 || method == 2)
            {
                break;
            }
            else
            {
                System.out.println("Нажаль цей метод поки недоступний, оберіть з доступних (1 - Bubble sort, чи 2 - Selection sort)");
            }
        }

        switch (method)
        {
            case 1:
                bubbleSort(array);
                System.out.println("Відсортований масив метедом Bubble sort:");
                break;
            case 2:
                selectionSort(array);
                System.out.println("Відсортований масив методом Selection sort):");
                break;
        }
        System.out.println(Arrays.toString(array));
    }

    public static float[] generateRandomArray(int size)
    {
        Random random = new Random();
        float[] array = new float[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = random.nextFloat() * 100;
        }
        return array;
    }

    public static void bubbleSort(float[] array)
    {
        int size = array.length;
        for (int i = 0; i < size - 1; i++)
        {
            for (int j = 0; j < size - i - 1; j++)
            {
                if (array[j] < array[j + 1])
                {
                    float temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(float[] array)
    {
        int size = array.length;
        for (int i = 0; i < size - 1; i++)
        {
            int maxIndex = i;
            for (int j = i + 1; j < size; j++)
            {
                if (array[j] > array[maxIndex])
                {
                    maxIndex = j;
                }
            }
            float temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }
}