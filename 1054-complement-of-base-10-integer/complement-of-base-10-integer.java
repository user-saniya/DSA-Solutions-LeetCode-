class Solution {
    public int bitwiseComplement(int n) {
StringBuilder binary = new StringBuilder(Integer.toBinaryString(n));
       for(int i=0;i<binary.length();i++){
        if(binary.charAt(i)=='0'){
            binary.setCharAt(i,'1');
        }
        else{
            binary.setCharAt(i,'0');
        }
       }
        int num = Integer.parseInt(binary.toString(), 2);
        return num;
    }
}