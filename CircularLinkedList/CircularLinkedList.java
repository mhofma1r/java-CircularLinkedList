package CircularLinkedList;

/**
 * @package: CircularLinkedList;
 * @created: 12.09.2019 by Coderbay
 * @licence: proprietary
 */
public class CircularLinkedList {

    private Node head;
    private Node lastInsert;
    //  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.
    //          SETTER
    //  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.

    public void setLastInsert(Node lastInsert) {
        this.lastInsert = lastInsert;
    }

    public void setHead(Node node) {
        if (this.head != null) {
            return;
        }
        node.setHead(true);
        this.head = node;
    }

    //  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.
    //          GETTER
    //  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.  -.
    public Node getHead() {
        return head;
    }

    public Node getLastInsert() {
        return lastInsert;
    }

    public void insert(Node newNode) {
        if (head == null) {
            // handle first node
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
        Node localLastInsert=getLastInsert();
        localLastInsert.setNext(newNode);
        newNode.setNext(localHead);
        setLastInsert(newNode);
    }

    private void updateHead(Node node) {
        if (node.isHead()) {
            this.head = node;
        }
    }
}
