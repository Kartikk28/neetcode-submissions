class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      
        int n  = temperatures.length;
        int[] hehe= new int[n];
        Stack<Integer> stack = new Stack<>();


        for(int i = 0 ; i< n ; i++){
            while(!stack.isEmpty() && temperatures[i]> temperatures[stack.peek()]){
                int prevD= stack.pop();
                hehe[prevD]= i - prevD;

            }

            stack.push(i);}
            return hehe;}}

            
