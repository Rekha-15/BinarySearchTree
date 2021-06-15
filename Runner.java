/*******************************************************************************
 * @purpose Implementing Binary Search Tree
 * This is an Runner class it contains main method , and the the key values.
 * @author rekha
 * @version 1.0
 * @since 14-062021
 **********************************************************************************/

package com;

/**
 * Runner is a class of public AS 
 * All the function called by Runner class 
 * @author rekha
 *Printing the tree size
 */

public class Runner {

	public static void main(String[] args) {

		BinaryTree<Integer> BinaryTree = new BinaryTree<>();

		BinaryTree.add(56);
		BinaryTree.add(30);
		BinaryTree.add(3);
		BinaryTree.add(22);
		BinaryTree.add(40);
		BinaryTree.add(11);
		BinaryTree.add(16);
		BinaryTree.add(60);
		BinaryTree.add(95);
		BinaryTree.add(65);
		BinaryTree.add(67);
		BinaryTree.add(63);
		BinaryTree.add(70);
		BinaryTree.displayNode();
		BinaryTree.getSize();
		System.out.println("Size of the tree is : " +BinaryTree.getSize());

	}
}
