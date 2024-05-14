package TESTING_8;

public class DYNAMIC 
{
	private int data[];
	private int next;
	
	public DYNAMIC()
	{
		data=new int[5];
		next=0;
	}
	public int size()
	{
		return next;
	}
	public int get(int i)
	{
		if(i>=next)
		{
			return -1;
		}
		return data[i];
	}
	public void set(int i,int element)
	{
		if(i>=next)
		{
			return;
		}
		data[i]=element;
	}
	public boolean isEmpty()
	{
		return next==0;
	}
	public void add(int element)
	{
		if(next==data.length)
		{
			doublecapacity();
		}
		data[next]=element;
		next++;
	}
	private void doublecapacity() 
	{
		int temp[]=data;
		data = new int[2*temp.length];
		for(int i=0;i<temp.length;i++)
		{
			data[i]=temp[i];
		}
	}
	public int removeLast()
	{
		int temp = data[next-1];
		data[next-1]=0;
		next--;
		return temp;
	}
	
	public void print()
	{
		System.out.println(data);
	}
	
}
