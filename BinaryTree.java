/*******************************************************************************************************************************
 * @purpose Implementing Binary Search Tree Program, This program shows , how the Binary Search tree method works
 * Here we will be assigning one int base root key , based on that root key the next key will be added or inserted
 * If the new key is lesser then base key it will be adding to left side of base key else it will be added to right side of base key.
 * @author rekha
 * @version 1.0
 * @since 14-062021
 *************************************************************************************************************************************/

package com;

/**
 * @author rekha BinaryTree is an class it is in public AS
 * @param <K> k= generic initialized root has private
 */
public class BinaryTree<K extends Comparable<K>> {
	
	private BinaryNode<K> root;

	/**
	 * add is a method with public AS Here add method used to add or insert the
	 * elements or nodes
	 * 
	 * @param root Here first it compares the root key with the present key
	 * @param key  is an element taking compare to compare the present key with the
	 *             root key Has shown in if condition , if the present key is lesser
	 *             then root key it goes to left side or else it will assign to
	 *             right side of root key
	 */

	public void add(K key) {
		this.root = addRecursively(root, key); // comparing the present key with the root key
	}

	private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
		if (current == null) {
			return new BinaryNode<>(key);
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0) {
			return current;
		}
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	/**
	 * displayNode is method of void type here diplayNode method is using to display
	 * the nodes
	 * 
	 * @param root, this root is taking to initializing base value has mentioned in
	 * if condition if root is not equal to null it display the nodes
	 * has instructed in add method
	 */

	public void displayNode() {
		displayNode(root);
	}

	public void displayNode(BinaryNode<K> root) {
		if (root != null) {
			displayNode(root.left);
			System.out.println(root.key);
			displayNode(root.right);
		}
	}
}
