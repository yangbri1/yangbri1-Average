
public class Average {
    /*
     * Now that we can get the sum of all numbers in an array, we could also figure out how to get the average of an
     * array. The return type of this method double, so a decimal value is expected (as is common in averages).
     *
     * Part of the challenge is that the method receives an array of ints, which do not produce decimal values
     * even in operations where they should! (eg: 3/2=1 if 3 is of type int.)
     *
     * So, before you divide the sum of all numbers by the amount of numbers in order to produce the average,
     * you'll need do convert the sum to type double. How can we do that?
     *
     * @param nums an array to be manipulated.
     * @return the average of all the values of nums.
     */
    public double getAvg(int[] nums){
        // declare variable 'avg' to later find average from array 'nums'
        double avg = 0.0;
        // create an array of 'double' data type w/ length set to 'nums' array length
        double[] numsDouble = new double[nums.length];

        // iterate through each 'int' element in 'nums' array --- converting from 'int' to 'double'
        int itr = 0;
        while(itr < nums.length){
            // type-cast element from 'int' -> 'double' data type
            double temp = (double)nums[itr];
            // append newly converted double 'temp' to 'numsDouble' double array
            numsDouble[itr] = temp;
            // increment by 1 to keep loop going
            ++ itr;
        }

        // use for-each loop to find the sum of all the 'nums' combine
        for(double elem : numsDouble){
            // add each element up
            avg += elem;
        }

        // recursively find the quotient of 'nums'
        avg = avg / numsDouble.length;

        return avg;
    }
}
