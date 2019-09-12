package CircularLinkedList;

/**
 * @package: CircularLinkedList;
 * @created: 12.09.2019 by Coderbay
 * @licence: proprietary
 */
public abstract class Node {
    private Node next;
    private boolean isHead;
    private boolean isTail;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean isHead() {
        return isHead;
    }

    public void setHead(boolean head) {
        isHead = head;
    }

    public boolean isTail() {
        return isTail;
    }

    public void setTail(boolean tail) {
        isTail = tail;
    }
    public boolean hasNext(){
        if (next!=null){
            return false;
        }
        return true;
    }

    public Node() {
    }

  }
