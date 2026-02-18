import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'matrixRotation' function below.
     *
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY matrix
     *  2. INTEGER r
     */

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
    // Write your code here
    
        int m = matrix.size();
        int n = matrix.get(0).size();

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

            // Top row
            for (int j = layer; j < n - layer; j++)
                elements.add(matrix.get(layer).get(j));

            // Right column
            for (int i = layer + 1; i < m - layer - 1; i++)
                elements.add(matrix.get(i).get(n - layer - 1));

            // Bottom row
            for (int j = n - layer - 1; j >= layer; j--)
                elements.add(matrix.get(m - layer - 1).get(j));

            // Left column
            for (int i = m - layer - 2; i > layer; i--)
                elements.add(matrix.get(i).get(layer));

            // Rotate
            int size = elements.size();
            int rotate = r % size;

            Collections.rotate(elements, -rotate);

            int index = 0;

            // Put back Top row
            for (int j = layer; j < n - layer; j++)
                matrix.get(layer).set(j, elements.get(index++));

            // Right column
            for (int i = layer + 1; i < m - layer - 1; i++)
                matrix.get(i).set(n - layer - 1, elements.get(index++));

            // Bottom row
            for (int j = n - layer - 1; j >= layer; j--)
                matrix.get(m - layer - 1).set(j, elements.get(index++));

            // Left column
            for (int i = m - layer - 2; i > layer; i--)
                matrix.get(i).set(layer, elements.get(index++));
        }

        // Print result
        for (List<Integer> row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        int r = Integer.parseInt(firstMultipleInput[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] matrixRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> matrixRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int matrixItem = Integer.parseInt(matrixRowTempItems[j]);
                matrixRowItems.add(matrixItem);
            }

            matrix.add(matrixRowItems);
        }

        Result.matrixRotation(matrix, r);

        bufferedReader.close();
    }
}
