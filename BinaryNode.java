/*******************************************************************************
 * @purpose Implementing Binary Search Tree
 * This is an Binary Node class , initialized key and node
 * @author rekha
 * @version 1.0
 * @since 14-062021
 **********************************************************************************/

package com;

/**
 * @author rekha
 * @param <K> is used to make generic
 * key will be extends Comparable
 * because when we put key we will be putting in sorting order that is lest lesser right greater 
 * to compare that we were using compare
 */

public class BinaryNode<K extends Comparable<K>> {
	K key;
	public BinaryNode<K> left;// left pointer
	public BinaryNode<K> right;// for right pointer

	public BinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}
