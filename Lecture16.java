public class MergeLinkedLists {
    public static Node mergeKLists(Node arr[]) {

        int i = 0;
        int k = arr.length - 1;
        while (i < k) {
            arr[i] = mergeTwoSortedLinkedLists(arr[i], arr[k]);
            i++;
            k--;
        }
        return arr[0];
    }

    private static Node mergeTwoSortedLinkedLists(Node l1, Node l2) {
		
	Node sortedResult = null;
	
	if(l1.getData() <= l2.getData()) {
		sortedResult = l1;
		sortedResult.next = mergeTwoSortedLinkedLists(l1.next, l2);
	} else {
		sortedResult = l2;
		sortedResult.next = mergeTwoSortedLinkedLists(l1, l2.next);
		
	}
	return sortedresult
	}

    public static void main(String[] args) {
		
		Node [] arr = new Node[4];
		
		Node node1 = new Node(data: 1);
		node1.next = new Node(data:3);
		node1.next.next = new Node(data: 5),
		node1.next.next.next = new Node(data: 8),
		node1.next.next.next.next = new Node(data: 11),
		
		arr[0] = node1;
		
		Node node2 = new Node(data:2);
		node2.next = new Node(data:6);
		node2.next.next = new Node(data:12);
		arr[1] = node2;
		
		Node node3 = new Node(data:4);
		node3.next = new Node(data:8);
		node3.next.next = new Node(data:11);
		arr[2] = node3;
		
		Node head mergekLists (arr);
		NodeUse.printLinkedList (head);
	}

}