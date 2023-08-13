class S.Calculator extends B.Calculator implements S.CalculatorInterface{
	
	public double factorial(double x){
		double sum=1;
		for(int i=1; i<=x; i++)
			sum*=i;
		return sum;
	}
	public double XtoY(double x, double y){
		return (Math.pow(x,y));
	}
	
	public void decmialToBinary(int x){
		int i = 0;
		int [] binaryNum=new int[1000]; 
        while (x > 0)  
        { 
            binaryNum[i] = x % 2;
            x = x / 2; 
            i++; 
        } 

        System.out.print("Decmial To Binary : ");
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]); 
        System.out.println();

    }
}