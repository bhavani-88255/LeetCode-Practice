public int findLoopLength(ListNode head) {

    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {

        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) { // cycle found

            int count = 1;
            
            while (slow != fast) {
                count++;
                slow = slow.next;
            }

            return count;
        }
    }

    return 0; // no cycle
}