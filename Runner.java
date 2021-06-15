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
 *
 */

public class Runner {

	public static void main(String[] args) {

		BinaryTree<Integer> BinaryTree = new BinaryTree<>();

		BinaryTree.add(56);
		BinaryTree.add(30);
		BinaryTree.add(70);
		BinaryTree.displayNode();

	}
}
