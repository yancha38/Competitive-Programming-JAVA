Rain Sound
 * You like the sound of rain only if the sound ranges from 'l' to 'r' units. Every cloud makes 's' unit of sound. 
 Determine the minimum and the maximum number of clouds that can produce the sound in the provided range.

   Input format
   First line: One integer T denoting the number of test cases
   Next lines: Three integers l, r and s denoting the provided range of the rain sound and the units of sound produced by each 
   cloud
  
   Output format
   In T lines, print two space-separated integers that represent the minimum and the maximum number of the clouds that can 
   produce the sound in the provided range.
 
   Note: Print "-1 -1" if no answer is available.
  
   Constraints :
   1 <= T <= 100000
   1 <= l <= r <= 10^9
   1 <= s <= 10^9
  
   Input :           Output :
   3                 2 3
   5 10 3            2 3
   7 12 4            50 60
   50 60 1
 
 * Explanation :
   In the first test of the sample the answer 2 3 is because 2 * 3 = 6 which is in [5,10] and 3 * 3 = 9 which is also in 
   [5,10] . Also which exceeds Parmis's interval and is considered noise.
