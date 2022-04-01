public class Travel {
    public static void main(String[] args) {
    ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        a.next=b;
        b.next=c;
        tra(a);

    }
    public static void tra(ListNode head){
        if(head!=null){
            System.out.println(head.val);
            tra(head.next);
        }
    }

}
