// The `class Biggest_no` is defining a Java class that finds the biggest number in an array.
class Biggest_no {
    // The code is defining the main method of the `Biggest_no` class.
    public static void main(String[] args) {
        int number, BiggestNo, size = 10;
        int[] Array = { 0, 1, 2, 3, 4, 5, 6, 7, -1, -7 };
        BiggestNo = Array[0];
        for (number = 1; number < size; number++) {
            if (Array[number] > BiggestNo) {
                BiggestNo = Array[number];
            }
        }
        // `System.out.println("The biggest number is: " +BiggestNo);` is printing the
        // message "The biggest
        // number is: " followed by the value of the variable `BiggestNo`. It is used to
        // display the result of
        // finding the biggest number in the array.
        System.out.println("The biggest number is: " + BiggestNo);
    }
}
