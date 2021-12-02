public class main {
        static float harmonicMean(float arr[], int n)
        {
            float sum = 0;
            for (int i = 0; i < n; i++)
                sum = sum + (float) 1 / arr[i];

            return (float) n / sum;
        }

    public static void main(String args[])
    {
        float arr[]= { 14f, 15f, 16f, 17f, 18f };
        int n = arr.length;
        System.out.println(harmonicMean(arr, n));
    }
}

