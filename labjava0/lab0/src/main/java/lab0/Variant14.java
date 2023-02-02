package lab0;

public class Variant10 {

    /*Given a three digits number. Print its last digit (ones) first, and then its middle digit (tens).*/
    public static int integerNumbersTask(int a) {
        if(a<100 || a>999) {
            throw new IllegalArgumentException("99 < a < 1000");
        }
        int []arr = new int[2];
        arr[0] = a%10;
        arr[1] = a%100;
        arr[1] = arr[1]/10;
        int z = Integer.parseInt(String.valueOf(arr[0]) + String.valueOf(arr[1]));
        return z;
    }
    /*Two integers are given: A ,  B . Check the truth of the statement: "Exactly one of the numbers  A and  B is odd."*/
    public boolean booleanTask(int a, int b) {
        return ((a % 2 != 0) && (b % 2 == 0) || (a % 2 == 0) && (b % 2 != 0));
    }
    /*Given two integer type variables:  A and  B .
    If their values are not equal, then assign the sum of these values to each variable, and if they are equal,
    then assign zero values to the variables.
    Output new values of variables  A and  B .*/

    public int ifTask(int a, int b) {
        int result = 0;
        if(a==b){
            a = 0;
            b = 0;
            result = 0;
        }
        else{
            result = a+b;
            a = result;
            b = result;
        }
        return result;
    }
    /*The robot can move in four directions ("N" - north, "W" - west, "S" - south, "E" - east)
    and receive three digital commands: 0 - continue moving, 1 - turn left, -1 - right turn.
    The symbol  C  is the initial direction of the robot and the integer N  is the command sent to it.
    Output the direction of the robot after executing the received command.*/

    public String switchTask(char direction, int n) {
        String result = "";
        int a = 0;
        switch (direction) {
            case 'N':
                switch (n) {
                    case 1 -> result = "West";
                    case 0 -> result = "North";
                    case -1 -> result = "East";
                }
                break;
            case 'E':
                switch (n) {
                    case 1 -> result = "North";
                    case 0 -> result = "East";
                    case -1 -> result = "South";
                }
                break;
            case 'S':
                switch (n) {
                    case 1 -> result = "East";
                    case 0 -> result = "South";
                    case -1 -> result = "West";
                }
                break;
            case 'W':
                switch (n) {
                    case 1 -> result = "South";
                    case 0 -> result = "West";
                    case -1 -> result = "North";
                }
                break;
        }
        return result;
    }

    /*An integer  N (> 0) is given. Find the amount

    1 + 1/2 + 1/3 + … + 1/ N
    (real number).*/
    public float forTask(int n) {
        float sum = 0;
        if(n <= 0){
            throw new IllegalArgumentException("n shouldn't be < 0");
        }
        for(int i = 1; i <= n;i++){
            sum += 1/i;
        }
        return sum;
    }

    /*An integer  N (> 1) is given. Find the largest integer  K that satisfies the inequality 3^K  <  N .*/

    public int whileTask(int n) {
        if(n <= 1){
            throw new IllegalArgumentException("n > 1");
        }
        int k = 0;
        while(Math.pow(3, k)<n){
            k++;
        }
        k--;
        return k;
    }
    /*An integer array of size  N is given .
    Print first all the even numbers contained in the given array in ascending order of their indices,
    and then print all the odd numbers in descending order of their indices.*/

    public int[] arrayTask(int[] array, int n) {
        if(n <= 0){
            throw new IllegalArgumentException("n > 0");
        }
        int k = 0;
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            if (array[i] % 2 == 0) {
                arr[k] = array[i];
                k++;
            }
        }
        for(int i = n-1; i >= 0; i--){
            if (array[i] % 2 != 0) {
                arr[k] = array[i];
                k++;
            }
        }
        return arr;
    }

    /*Given a matrix of size  M  ґ  N . Output its elements located in columns with odd numbers (1, 3, ...).
    Display elements in columns, do not use a conditional operator.*/
    public static int[][]  twoDimensionArrayTask(int[][] array, int n, int m) {
        int l = m/2;
        int k = 0;
        int[][] matrix = new int[n][l];
        for(int j = 1; j < m; j = j +2){
            for(int i = 0; i < n; i++){
                matrix[i][k] = array[i][j];
               // System.out.println(matrix[i][k]);
            }
            k++;
        }
        return matrix;
    }

    public static void main(String... strings) {

        System.out.println("Done!!!");
    }

}