import java.util.Arrays;

public class MinimumDifferenceInArray {
    static int findMinDiff(int[] arr)
    {
        int length = arr.length;
        int diff = Integer.MAX_VALUE;

//        Arrays.sort(arr);

//        for (int i=0; i < length - 1; i++)
//            if (arr[i+1] - arr[i] < diff)
//                diff = arr[i+1] - arr[i];

        for (int i=0; i<length-1; i++)
            for (int j=i+1; j<length; j++)
                if (Math.abs((arr[i] - arr[j]) )< diff)
                    diff = Math.abs((arr[i] - arr[j]));

        return diff;
    }

    public static void main(String[] args)
    {
        int arr[] = new int[] {1, 19, -4, 31, 38, 25, 100};
        System.out.println("Minimum difference is "+
                findMinDiff(arr));
    }
}
