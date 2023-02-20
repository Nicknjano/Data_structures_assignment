/**
 * mmustlinkedin
 */
public class MmustLinkedin {

        private Node head;
        private int size;
    
        public void Mmustlinkedin() {
            head = null;
            size = 0;
        }
    
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node currentNode = head;
                while (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = newNode;
            }
            size++;
        }
    
        public void remove(int data) {
            if (head == null) {
                return;
            }
    
            if (head.data == data) {
                head = head.next;
                size--;
                return;
            }
    
            Node prevNode = head;
            Node currentNode = head.next;
            while (currentNode != null) {
                if (currentNode.data == data) {
                    prevNode.next = currentNode.next;
                    size--;
                    return;
                }
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }
    
        public int size() {
            return size;
        }
    
        public void print() {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    
        private class Node {
            int data;
            Node next;
    
            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }  
}