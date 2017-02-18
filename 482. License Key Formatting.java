public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        //replace dash and toUppercase
        String S1=S.replace("-","");
        S1=S1.toUpperCase();
        
        //new stringbuilder;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<S1.length();i++){
            str=str.append(S1.charAt(i));
        }
        
        //add dashes
        for(int i=K;i<S1.length();i=i+K){
            str=str.insert(S1.length()-i,"-");
        }
        return str.toString();
    }
}