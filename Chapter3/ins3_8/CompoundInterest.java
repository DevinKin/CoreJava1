/*************************************************************************
    @ File Name: CompoundInterest.java
    @ Author: King
    @ Mail: arturiapendragon_1@163.com 
    @ Created Time: 2018年01月04日 星期四 15时46分25秒
 ************************************************************************/


/**
 * This program shows how to store tabular data in a 2D array
 * @version 1.40
 * @authoer DevinKin
 */

public class CompoundInterest
{
	public static void main(String[] args)
	{
		final double STARTRATE = 10;
		final int NRATES = 6;
		final int NYEARS = 10;

		// set interest rates to 10 ... 15%
		double[] interestRate = new double[NRATES];
		for (int j = 0; j < interestRate.length; j++)
			interestRate[j] = (STARTRATE + j) / 100.0;

		double[][] balances = new double[NYEARS][NRATES];

		// set initial balances to 10000
		for (int j = 0; j < balances[0].length; j++)
			balances[0][j] = 10000;

		// compute interest for future years
		for (int i = 1; i < balances.length; i++)
		{
			for (int j = 0; j < balances[i].length; j++)
			{
				//get last years balances from previous row
				double oldbalance = balances[i - 1][j];
				
				// compute interest
				double interest = oldbalance * interestRate[j];

				// compute this year's balances
				balances[i][j] = oldbalance + interest;
			}
		}

		// print one row of interst rates
		for (int j = 0; j < interestRate.length; j++)
			System.out.printf("%9.0f%%", 100 * interestRate[j]);

		System.out.println();

		// print balance table
		for (double[] row : balances)
		{
			// print table row
			for (double b : row)
				System.out.printf("%10.2f", b);
			System.out.println();
		}
	}
}
