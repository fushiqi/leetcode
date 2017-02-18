public class MovingAverage {
    Queue<Integer> window;
    int windowSize;
    double sum;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        window=new LinkedList<Integer>();
        windowSize=size;
        
    }
    
    public double next(int val) {
        if(window.size()==windowSize){
            sum=sum-window.poll();
        }
        sum=sum+val;
        window.offer(val);
        
    
    return sum/window.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */