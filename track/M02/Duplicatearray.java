class Freq
{
    int count = 0;

    void count(int arr[], int key)
    {
        for(int i = 0; i <= arr.length - 1; i++)
        {
            if(arr[i] == key)
            {
                count++;
            }
        }

        System.out.println("Frequency of " + key + ": " + count);
    }
}

public class Duplicatearray
{
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 10, 30, 10, 40};

        Freq f = new Freq();
        f.count(arr, 20);
    }
}