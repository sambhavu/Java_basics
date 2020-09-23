c[0] = 0; 
for (int N = 1; N<= maxN; N++) 
{ 

  c[N] = N+1; 
  for (int k = 0; k<N; k++)
    c[N] += (c[k] + c[N-1-k])/N;
} 
