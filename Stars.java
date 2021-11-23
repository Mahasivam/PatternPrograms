package pattern;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// rule is simple - step1: find how many triangles needs to be printed
		// Then step2 is remember this key thing --> For increasing triangle - the inner loop condition will be j<=i
										//       --> For decreasing triangle - the inner loop intialization will be j=i
		Stars s = new Stars();
		s.square();
		s.increasingTri();
		s.decreasingTri();
		s.rightsidedTri();
		s.rightSidedDecreasingTri();
		s.hill();
		s.reverseHill();
		s.diamond();
	}
	
	void square() 
	{
		System.out.println();
		for(int i=1; i<=5; i++)
		{
		for(int j= 1; j<=5; j++)
		{
		System.out.print("* ");
		}
		System.out.println();
		}
	}
	
	void increasingTri() 
	{
		System.out.println();
		for(int i=1; i<=5; i++)
		{
		for(int j= 1; j<=i; j++)
		{
		System.out.print("* ");
		}
		System.out.println();
		}
	}
	
	void decreasingTri() 
	{
		System.out.println();
		for(int i=1; i<=5; i++)				
		{
		for(int j=i; j<=5; j++)			
		{
		System.out.print("* ");
		}
		System.out.println();
		}
	}
	
	void rightsidedTri()
	{
		System.out.println();
		for(int i=1; i<=5; i++)
		{
		for(int j=i; j<=5; j++)
		{
		System.out.print("  ");
		}
		for(int j=1; j<=i; j++)
		{
		System.out.print("* ");
		}
		System.out.println();
		}
	}
	
	void rightSidedDecreasingTri()
	{
		System.out.println();
		for(int i=1; i<=5; i++)
		{
		for(int j=1; j<=i; j++)
		{
		System.out.print("  ");
		}
		for(int j=i; j<=5; j++)
		{
		System.out.print("* ");
		}
		System.out.println();
		}
	}
	
	void hill()
	{
		System.out.println();
		for(int i=1; i<=5; i++)
		{
		for(int j=i; j<=5; j++)
		{
		System.out.print("  ");
		}
		for(int j=1; j<i; j++)
		{
		System.out.print("* ");
		}
		for(int j=1; j<=i; j++)
		{
		System.out.print("* ");
		}
		System.out.println();
		}
	}
	
	void reverseHill()
	{
		System.out.println();
		for(int i=1; i<=5; i++) 
		{
		for(int j=1; j<=i; j++)
		{
		System.out.print("  ");
		}
		for(int j=i; j<5; j++)
		{
		System.out.print("* ");
		}
		for(int j=i; j<=5; j++)
		{
		System.out.print("* ");
		}
		System.out.println();
		}
	}
	
	void diamond()
	{
		System.out.println();
		for(int i=1; i<5; i++)
		{
		for(int j=i; j<=5; j++)
		{
		System.out.print("  ");
		}
		for(int j=1; j<i; j++)
		{
		System.out.print("* ");
		}
		for(int j=1; j<=i; j++)
		{
		System.out.print("* ");
		}
		System.out.println();
		}
		for(int i=1; i<=5; i++) 
		{
		for(int j=1; j<=i; j++)
		{
		System.out.print("  ");
		}
		for(int j=i; j<5; j++)
		{
		System.out.print("* ");
		}
		for(int j=i; j<=5; j++)
		{
		System.out.print("* ");
		}
		System.out.println();
		}
	}
}