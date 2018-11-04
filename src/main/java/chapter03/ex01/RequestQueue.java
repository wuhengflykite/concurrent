package chapter03.ex01;

import java.util.LinkedList;
import java.util.Queue;

public class RequestQueue {
    private final Queue<Request> queue = new LinkedList<Request>();

    public synchronized Request getRequest(){
        while (queue.peek()==null){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        return queue.remove();
    }

    public synchronized void putRequest(Request request){
        queue.offer(request);
        System.out.println(queue.size());
        notifyAll();
    }

}
