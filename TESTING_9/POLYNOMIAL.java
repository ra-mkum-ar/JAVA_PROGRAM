package TESTING_9;

public class POLYNOMIAL 
{
	private int degree[]=new int[200];
	
	public void set(int degree,int coeff)
	{
		this.degree[degree]=coeff;
	}
	
	public POLYNOMIAL add(POLYNOMIAL p)
	{
		for(int i=0;i<200;i++)
		{
			this.degree[i]=this.degree[i]+p.degree[i];
		}
		return this;
	}
	
	public POLYNOMIAL subtract(POLYNOMIAL p)
	{
		for(int i=0;i<200;i++)
		{
			this.degree[i]=this.degree[i]+p.degree[i];
		}
		return this;
	}
	
	public POLYNOMIAL multiply(POLYNOMIAL p)
	{
		int x[] = new int[200];
		for(int i=0;i<200;i++)
		{
			for(int j=0;j<200;j++)
			{
				int deg = i+j;
				if(deg<200)
				{
					x[deg]+=this.degree[i]+p.degree[j];
				}
			}
		}
		for(int i=0;i<200;i++)
		{
			degree[i]=x[i];
		}
		return this;
	}
	
	public void print()
	{
		for(int i=0;i<200;i++)
		{
			System.out.print(degree[i]+"x"+(i)+" ");
		}
	}
		

}
