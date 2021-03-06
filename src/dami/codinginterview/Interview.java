package dami.codinginterview;

import dami.codinginterview.common.ListNode;
import dami.codinginterview.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Interview {
	public void solutions() {
		//new Array3().twoSum(new int[] {2, 3, 4, 7, 8, 9}, 12);
		//new Array4().sorting(new int[]{10, 5, 8, 7, 3, 9});

		//new List1().reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(6, new ListNode(7))))));
		//new List2().findNthNodeFromEnd(2, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(6, new ListNode(7))))));
		//new List3().distinct(new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(4)))))));
		//new List4().circleOrNot(circleNode());

		//new Stack1().reverse(stack());
		//new Stack2().isPair("[{1+2*(2+2)}-[1-3)]");
		//new Stack2().isPair("())))");
		//new Stack3().calculatePostfix("123+-5*");
		//new Stack4().span(new int[] {5,3,2,6,7,1,4});

		//new Queue1().reverseQueue(queue());
		//new Queue2().lruCache();
		//new Queue3().levelSum(treeNode());
		//new Queue4().implementStackByQueue();

		//new Tree1().findNthNode(treeNode(), 5);
		//new Tree1_1().findTreeDepth(treeNode());
		//new Tree2().makeBinaryTree(new int[] {4,2,5,1,3}, new int[] {1,2,4,5,3});
		//new Tree2().makeBinaryTree_최적화(new int[] {4,2,5,1,3}, new int[] {1,2,4,5,3});
	}

	private ListNode circleNode() {
		ListNode three = new ListNode(3);
		ListNode node = new ListNode(1, new ListNode(2));
		node.add(three);
		node.add(new ListNode(4, new ListNode(5)));
		node.add(three);
		return node;
	}

	private Stack<Integer> stack() {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		return stack;
	}

	private Queue<Integer> queue() {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		return queue;
	}

	private TreeNode treeNode() {
		TreeNode tree = new TreeNode(9, new TreeNode(2, new TreeNode(1), new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)));
		return tree;
	}
}
