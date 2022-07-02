우선순위 큐
========
* 기존의 큐 : FIFO 형식의 자료구조
* 우선순위 큐 : 우선순위가 높은 데이터가 먼저 Out / 일반적으로 힙을 이용하여 구현한다.

힙(Heap)
=======
* 우선순위 큐에 고안해 만든 완전이진트리 형태의 자료구조
* 완전이진트리 : 부모 노드의 좌측 노드부터 우측노드 순으로 데이터를 삽입
* 종류 : 최대 힙 / 최소 힙
  ![image](https://user-images.githubusercontent.com/70207093/176988977-beda5c73-e3a7-4960-9416-f1b77e6bf3d3.png)

최대 힙
=====
```java
import java.util.*

class MaxHeap{
  public static void main(String[] args){
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
    pq.add(1);
    pq.add(3);
    pq.add(2);
    pq.add(4);
    System.out.println("Max Value : " + pq.peek());
    pq.poll();
    pq.remove(3);
    System.out.println("After removing 3 : ");
    Iterator<Integer> it = pq.iterator();
    while(it.hasNext())
      System.out.println(it.next());
  }
}
```
