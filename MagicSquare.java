import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * This is where files will be read or written with magic squares in them. 
 * There are methods that read files, write files, get an alias of the magic squares, and
 * determine if the matrix really is a magic square.
 * 
 * @author Madi Knapp
 */
public class MagicSquare implements MagicSquareInterface {

    public int[][] matrixArray;
    private boolean trueMatrix;

    /**
     * This is the first constructor to be able to read the file given.
     * If the file is not found there will be a FileNotFoundException thrown
     * @param filename
     */
    public MagicSquare(String fileName) throws FileNotFoundException{
        readMatrix(fileName);
    }

    public MagicSquare(String fileName, int dimensionN) throws IOException{
        writeMatrix(fileName, dimensionN);
    }

    /**
     * This method wil read in a file and add the numbers to an array
     * @param fileName
     * @return int[][]
     * @throws FileNotFoundException
     */
    private int [][] readMatrix(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        Scanner fileScan = new Scanner(file);
        int dimension = fileScan.nextInt();
        int[][] matrixArray;
        while (fileScan.hasNextLine()) {
            matrixArray = new int[dimension][dimension];
            for (int i = 0; i <= dimension; i++){
                for (int j = 0; j <= dimension; j++){
                    matrixArray[i][j]=fileScan.nextInt();
                }
            }
        }
        return matrixArray;
    }

    private void writeMatrix(int[][] matrix, String fileName) throws IOException{

    }

    private 
    /**
	 * Evaluate the matrix (whether read from file or
	 * generated) and return a boolean verdict of
	 * whether the matrix is a magic square.
	 * 
	 * @return true if matrix is a magic square, else false
	 */
    @Override
    public boolean isMagicSquare() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isMagicSquare'");
    }

    /**
	 * Return a copy of the matrix (whether read from file 
	 * or generated) as a 2D array of ints. Be sure this
	 * method does not compromise encapsulation.
	 * 
	 * @return 2D array of ints that may or may not be a valid magic square
	 */
    @Override
    public int[][] getMatrix() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMatrix'");
    }

    /**
	 * Return a string formatted as in these examples:
	 *   The matrix
	 *     4 9 2
	 *     3 5 7
	 *     8 1 6
	 *   is a magic square.
	 *  or
	 *    The matrix
	 *      5 3 7
	 *      9 4 2
	 *      1 6 5
	 *    is not a magic square.
	 *    
	 * @return formatted string showing the matrix and whether it is a valid magic square
	 */
    public String toString(){
        return "";
    }
    
}
