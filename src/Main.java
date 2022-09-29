

class Solution {
    public static void main(String[] args) {
        long n = 9_999_999;
        long m = 9_999;
        System.out.println(n);
        System.out.println(m);
        System.out.println("=====");
        ListNode l1 = ListNode.convertToList(n);
        System.out.println(ListNode.convertToLong(l1));
        ListNode l2 = ListNode.convertToList(m);
        System.out.println(ListNode.convertToLong(l2));
        ListNode l3 = ListNode.addTwoNumbers(l1, l2);
        System.out.println(ListNode.convertToLong(l3));
    }
}