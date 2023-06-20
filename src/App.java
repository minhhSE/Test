public class App {
    public static void main(String[] args) throws Exception {
       int[] arr = {1,2,3,4,5};
       int minValue = 0;
       int maxValue = 0;
       for (int i = 1; i < arr.length; i++) {
        minValue += arr[i-1];
        maxValue += arr[i];
       }
       System.out.println("Exercises 1: ");

       System.out.println("Result: " + minValue);
       System.out.println("Result: " + maxValue);

       System.out.println("Exercises 2: ");

    int sumExcept1 = 0;
    int sumExcept2 = 0;
    int sumExcept3 = 0;
    int sumExcept4 = 0;
    int sumExcept5 = 0;
    for (int i = 0; i < arr.length; i++) {
        sumExcept1 += arr[i];
        sumExcept2 += arr[i];
        sumExcept3 += arr[i];
        sumExcept4 += arr[i];
        sumExcept5 += arr[i];
       }
       sumExcept1 = sumExcept1 - arr[0];
       sumExcept2 = sumExcept2 - arr[1];
       sumExcept3 = sumExcept3 - arr[2];
       sumExcept4 = sumExcept4 - arr[3];
       sumExcept5 = sumExcept5 - arr[4];

       System.out.println("Result: " + sumExcept1);
       System.out.println("Result: " + sumExcept2);
       System.out.println("Result: " + sumExcept3);
       System.out.println("Result: " + sumExcept4);
       System.out.println("Result: " + sumExcept5);
    }
   
}
