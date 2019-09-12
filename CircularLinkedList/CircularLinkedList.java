package CircularLinkedList;

/**
 * @package: CircularLinkedList;
 * @created: 12.09.2019 by Coderbay
 * @licence: proprietary
 */
public class CircularLinkedList {
    private Node head;
    private Node lastInsert;
    private Node pointer;
    private Node priviousPointer;

    //  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.
    //          SETTER
    //  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.

    private void setLastInsert(Node lastInsert) {
        this.lastInsert = lastInsert;
    }

    public void setPointer(Node pointer) {
    }

    private void setHead(Node node) {
        if (this.head != null) {
            return;
        }
        node.setHead(true);
        setPointer(node);
        this.head = node;
    }


    public void setPriviousPointer(Node priviousPointer) {
        this.priviousPointer = priviousPointer;
    }

    //  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.
    //          GETTER
    //  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.
    public Node getIndex() {
        return this.pointer;
    }

    public Node getPriviousPointer() {
        return priviousPointer;
    }

    public Node getPointer() {
        return pointer;
    }

    public Node next() {
        return pointer.getNext();
    }

    public Node getHead() {
        return head;
    }

    public Node getLastInsert() {
        return lastInsert;
    }

    public void insert(Node newNode) {
        if (head == null) {
            this.pointer = newNode;
            setHead(newNode);
            return;
        }
        Node localHead = getHead();
        if (localHead.hasNext()) {
            // handle second node
            localHead.setNext(newNode);
            updateHead(localHead);
            setLastInsert(newNode);
            return;

        }
        Node localLastInsert = getLastInsert();
        localLastInsert.setNext(newNode);
        newNode.setNext(localHead);
        setLastInsert(newNode);
    }

    private void updateHead(Node node) {
        if (node.isHead()) {
            this.head = node;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
