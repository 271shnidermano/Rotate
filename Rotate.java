/*Begin by using the attached zipped folder to create a project in VS code. 
Then write the Rotate class from scratch which contains the static rotateArraymethod.  
rotateArray accepts a square (number of rows equals number of columns) two-dimensional 
integer array as a parameter, and then returns a properly rotated two-dimensional 
array of the same size.

When you are finished, demonstrate your work to me by successfully running the RotateTest class.
Note that while the array to be rotated will always be square, it will not necessarily be 3 x 3. 
In fact, both the size of the array, and the individual integer values themselves are randomly
generated each time the tester runs.

 */
public class Rotate {
    public static int[][] rotateArray(int[][] ogArray)
    {
        int[][] tempArray = new int[ogArray.length][ogArray[0].length];
        for (int i = 0; i < ogArray.length; i++)
        {
            for (int j = 0; j < ogArray.length; j++)
            {
                tempArray[j][ogArray.length - 1 - i] = ogArray[i][j];
            }
        }
        return tempArray;
        
    }

}


