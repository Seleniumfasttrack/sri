package multipleTestcases;

public class minororadult {

	public static void main(String[] args)
	
	{
		int a=26;
		minororadult m1=new minororadult();
		m1.MorA(a);
		
	}

	public void MorA(int a)
	{
		
		if (a>18) {
			
			System.out.println("adult");
			
		}else {
			System.out.println("Minor");
		}
	}
}


