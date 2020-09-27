public class MergeLinearTerm implements Sequence
{ 


  private final double[] c; 
  public MergeLinear(int maxN)
  { 
    c = new double[maxN +1]; 
    c[0] = 0; 
    for (int N = 1; N<= maxN; N++)
        c[N] = N+c[N/2] + c[N-(N/2)]; 
    for (int N=1; N<= maxN; N++) 
        c[n] -=N*Math.log(N)/Math.log(2)) + N; 
        
        
    } 
    
    
    public double eval(int N) 
    {
    
        return c[N]; 
        
    } 
    
    
    public static void main(String[] args)
    { 
    
        int maxN = Integer.parseInt(args[0]); 
        MergeLinearTerm M  = new MergeLinearTerm{maxN); 
        Values.show(M,maxN); 
        
        
    } 
    
    
 } 
 
 
 
 
 
