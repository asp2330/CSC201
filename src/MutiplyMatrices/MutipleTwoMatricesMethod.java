package MutiplyMatrices;

/**
 * Created by Clue on 2/5/2017.
 */
public class MutipleTwoMatricesMethod
{
    public static double [][] multiplyMatrix(double [][] a, double [][] b)
    {
        double[][] result = new double[a.length][b[0].length];

        for (int i = 0; i < result.length; i++)
        {
            for (int j = 0; j < result[0].length; j++)
            {
                for (int n = 0; n < a[0].length; n++)
                {
                    result[i][j] += a[i][n] * b[n][j];
                }

            }

        }
        return result;
    }

}

