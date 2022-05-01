package penguin.collections.lerning;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList <Integer> linkedNums = new LinkedList<>();
        linkedNums.add(532);
        linkedNums.add(765);
        linkedNums.add(6523);
        linkedNums.add(6987);
        linkedNums.add(32654);
        linkedNums.add(98576);

        System.out.println(linkedNums);

        linkedNums.addFirst(52);
        linkedNums.addFirst(574);
        linkedNums.addFirst(354);
        linkedNums.addFirst(75);
        linkedNums.addFirst(554322);

        linkedNums.addLast(634);
        linkedNums.addLast(253);
        linkedNums.addLast(768);
        linkedNums.addLast(26);
        linkedNums.addLast(48);
        System.out.println(linkedNums);

        linkedNums.add(linkedNums.size() / 2,52);
        System.out.println(linkedNums);


    }
}
