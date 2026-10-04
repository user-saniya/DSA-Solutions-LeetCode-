class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer>extraOpenBracket=new Stack<>();
         Stack<Integer>aestrick=new Stack<>();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
            extraOpenBracket.push(i);
        }
        else if(ch=='*'){
            aestrick.push(i);
        }
        else{
            if(!extraOpenBracket.isEmpty()){
                extraOpenBracket.pop();
            }
            else if(!aestrick.isEmpty()){
                aestrick.pop();
            }
            else{
                return false;
            }
        }
       }
       while(!extraOpenBracket.isEmpty()){
        if(aestrick.isEmpty()){
            return false;
        }
        int openIndex=extraOpenBracket.pop();
        int closeIndex=aestrick.pop();
        if(openIndex>closeIndex){
            return false;
        }

       }
       return extraOpenBracket.isEmpty();
    }
}