import CircularLinkedList.*;

import java.util.LinkedList;

/**
 * @package: PACKAGE_NAME;
 * @created: 12.09.2019 by Coderbay
 * @licence: proprietary
 */
public class Main {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        Node node = new CharNode('A');
        circularLinkedList.insert(node);
        circularLinkedList.insert(new CharNode('B'));
        circularLinkedList.insert(new CharNode('C'));
        circularLinkedList.insert(new CharNode('D'));

    }
}
