package Set4;

import java.util.PriorityQueue;
import java.util.Queue;

public class FindThirdLargestElement {
    public int find3rdLargest(int[] array) {
        Queue<Integer> minHeap = new PriorityQueue<>(3);
        int count = 3;
        for(int num: array) {
            if(count-- > 0) {
                minHeap.offer(num);
            } else if(minHeap.peek() < num) {
                minHeap.poll();
                minHeap.offer(num);
            }
        }
        return minHeap.poll();
    }
}
