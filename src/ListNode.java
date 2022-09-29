class ListNode {
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){this.val = val; this.next = next;}
    public static long convertToLong(ListNode l){
        if (l==null) return 0;
        long n=0;
        long degree=1;
        do {
            n=l.val*degree+n;
            degree*=10;
            l=l.next;
        }while(l!=null);
        return n;
    };
    public static ListNode convertToList(long n){
        ListNode l = new ListNode((int)(n%10));
        n=n/10;
        ListNode l2 = l;
        ListNode l3;
        while (n!=0){
            l3 = new ListNode((int)(n%10));
            n=n/10;
            l2.next = l3;
            l2 = l3;
        }
        return l;
    };
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        int n1 = l1.val;
        int n2 = l2.val;
        ListNode l3 = new ListNode((n1+n2)%10);
        int save=(n1+n2)/10;
        l1 = l1.next;
        l2 = l2.next;
        ListNode lSave = l3;
        ListNode lRun;
        while(l1!=null || l2!=null || save!=0){
            n1=(l1==null)?0:l1.val;
            n2=(l2==null)?0:l2.val;
            lRun = new ListNode();
            lRun.val = (n1+n2+save)%10;
            save = (n1+n2+save)/10;
            lSave.next=lRun;
            lSave = lRun;
            if (l1!=null)l1=l1.next;
            if (l2!=null)l2=l2.next;
        }
        return l3;
    }
}