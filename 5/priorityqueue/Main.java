import java.io.*;
import java.util.*;

class Node implements Comparable<Node> {
    public int y;
    public Node(int y){
        this.y = y;
    }
    @Override
    public int compareTo(Node arg0) { 
        System.out.println(this.y);
        System.out.println(arg0.y);
        System.out.println(this.y - arg0.y);
        return this.y - arg0.y; 
    }
}

public class Main {
    int v[];

    public static void main(String[] args) throws IOException {
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        for(int i = 1; i<=3; i++)
            pq.add(new Node(i));
        while(!pq.isEmpty())
            System.out.println(pq.poll().y);
    }
}