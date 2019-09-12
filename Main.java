import CircularLinkedList.*;

import java.util.LinkedList;

/**
 * @package: PACKAGE_NAME;
 * @created: 12.09.2019 by Coderbay
 * @licence: proprietary
 */
public class Main {
    public static void main(String[] args) {
        CharNode charNodeA = new CharNode('A');
        CharNode charNodeB = new CharNode('B');
        CharNode charNodeC = new CharNode('C');
        CharNode charNodeD = new CharNode('D');

        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insert(charNodeA);
        circularLinkedList.insert(charNodeB);
        circularLinkedList.insert(charNodeC);
        circularLinkedList.insert(charNodeD);
        circularLinkedList.insert(new CharNode('E'));
        circularLinkedList.insert(new CharNode('F'));


    }
}
