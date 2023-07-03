import java. util.Deque;
import java. util.LinkedList;

public class MaximumlnEachWindow {

    public static void printMaximum(int[] arr, int k) {
    Deque<Integer> deque = new LinkedList<>();
    int currentIndex = 0;

    for(currentIndex = 0; currentIndex < k; currentIndex++) {

        while(!deque.isEmpty() && arr[currentIndex] >= arr[deque.peekLast()]){
            deque.removeLast();
        }

        deque.addLast(currentIndex);

    }

    for(; currentIndex < arr.length; currentIndex++){
        System.out.println(deque.peek());

        while(!deque.isEmpty() && deque.peek() <= currentIndex - k){
            deque.removeFirst();
        }

        while(!deque.isEmpty() && arr[currentIndex] >= arr[deque.peekLast()]){
            deque.removeLast();
        }

        deque.addLast(currentIndex);
    }

    System.out.println(arr[deque.peek()]);

    while(deque.isEmpty()){
        deque.removeLast();
    }

}

    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8};

        printMaximum(arr, 3);

    }
}