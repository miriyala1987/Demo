public class multiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //prints maximum num
		int a[][]= {{3,2,5},{2,4,6},{5,7,9}};
		int max=0;
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		} System.out.println(max);
		
	}

}
