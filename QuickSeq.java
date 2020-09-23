public class values
{
  public statis void show( Sequence f, int maxN)
  { 
    double max = 0;
    for (int N = 0; N<maxN; N++)
      if(f.eval(N)>max ) max = f.eval(N); 
      
      
    for (int N = 0; N < maxN; N++)
    { 
      double x = 1.0*N/maxN; 
      double y = 1.0*f.eval(N)/max; 
      StdDraw.filledCirecle(x,y,.002); 
      
   } 
   
   
   stdDraw.show(); 
   
  }
  
  
} 



public class QuickSeq implements Sequence
{ 

    public static void main(String[] args)
    { 
        int maxN = Integer.parseInt(args[0]); 
        QuickSeq q = new Quickseq(maxN); 
        values.show(q, maxN); 
        
     }
     
     
     
 } 
 
 
 
 
