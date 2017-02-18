public class Solution {
    public int lengthLongestPath(String input) {
        String[] files=input.split("\n");
        int pathLen=0;
        int maxLen=0;
        Stack<Integer> dirPath=new Stack<>();
        
        for(int i=0;i<files.length;i++){
            String curDir=files[i];
            int curLev=findLev(curDir);
            while(dirPath.size()>curLev){
                pathLen=pathLen-dirPath.pop();
            }
            
            int dotPos=curDir.indexOf('.');
            if (dotPos>-1){
                maxLen=Math.max(maxLen,pathLen+curDir.length()-curLev);
            }
            else{
                pathLen=pathLen+curDir.length()-curLev+1;
                dirPath.push(curDir.length()-curLev+1);
            }
        }
        return maxLen;
    }
    
    public int findLev(String curDir){
        int count=0;
        while(curDir.charAt(count)=='\t'){
            count++;
        }
        return count;
    }
    
}