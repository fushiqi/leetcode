/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public int eraseOverlapIntervals(Interval[] intervals) {
        int count=1;
        
        if(intervals.length==0)
        return count=0;
        
        Arrays.sort(intervals,new intervalComparator());
        int end=intervals[0].end;
        
        for(int i=1;i<intervals.length;i++){
            if(end<=intervals[i].start){
                end=intervals[i].end;
                count++;
            }
            
        }
        return intervals.length-count;
    }
    
}

class intervalComparator implements Comparator<Interval>{
        public int compare(Interval t1, Interval t2){
            return t1.end-t2.end;
    }
}