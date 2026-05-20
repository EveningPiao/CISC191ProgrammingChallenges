package edu.sdmesa.cisc191;
/**
 * Lead Author(s):TianLin Zhao
 * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         <<add more references here>>
 * 
 * Version/date: 5/19/2026
 * 
 * Responsibilities of class:
 * Represents a node in a binary search tree of names. Each node stores a name
 * and references to a left subtree (names that come before alphabetically)
 * and a right subtree (names that come after). Provides recursive operations
 * for inserting names, finding the first/last name in order, and producing
 * an in-order string of all names in the tree.
 */
public class NameNode
{
	// A NameNode has-a left node
	private NameNode left;
	
	// A NameNode has-a name
	private String name;
	
	// A NameNode has-a right node 
	private NameNode right;
	
 
	/**
	 * Construct a new NameNode storing the given name. Left and right children
	 * start as null.
	 * @param newName the String stored in the node
	 */
	public NameNode(String newName)
	{
		// Store newName in this node; children default to null.
		name = newName;
		left = null;
		right = null;
	}
	
	/**
	 * 
	 * @return the String stored in the node
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Set the left node of this node
	 * @param newLeft
	 */
	public void setLeft(NameNode newLeft)
	{
		left = newLeft;
	}
	
	/**
	 * Set the right node of this node
	 * @param newRight
	 */
	public void setRight(NameNode newRight)
	{
		right = newRight;
	}
	
	/**
	 * 
	 * @return the left node of this node
	 */
	public NameNode getLeft()
	{
		return left;
	}
	
	/**
	 * 
	 * @return the right node of this node
	 */
	public NameNode getRight()
	{
		return right;
	}
	
	/**
	 * Find the least name in the tree.
	 * In a BST, the smallest value is the leftmost node.
	 * @return the first name of the names in the tree in lexicographical order
	 */
	public String getFirstName()
	{
		if (left == null)
		{
			// Base case: no smaller name exists, this is the smallest
			return name;
		}
		else
		{
			// Recursive case: smallest name is somewhere in the left subtree
			return left.getFirstName();
		}
	}
	
	/**
	 * Find the largest name in the tree.
	 * In a BST, the largest value is the rightmost node.
	 * @return the last name of the names in the tree in lexicographical order
	 */
	public String getLastName()
	{
		if (right == null)
		{
			// Base case: no larger name exists, this is the largest
			return name;
		}
		else
		{
			// Recursive case: largest name is somewhere in the right subtree
			return right.getLastName();
		}
	}
 
	/**
	 * Insert a new name into the tree, preserving BST ordering.
	 * Names less than this node go left; names greater go right.
	 * Duplicate names are not inserted.
	 * 
	 * @param newName the name to be inserted
	 */
	public void insert(String newName)
	{
		if (newName.compareTo(name) < 0)
		{
			// newName comes before this node's name: it belongs on the left.
			if (left == null)
			{
				// Place newName here because no child left.
				left = new NameNode(newName);
			}
			else
			{
				// Left child exists: insert the left subtree.
				left.insert(newName);
			}
		}
		else if (newName.compareTo(name) > 0)
		{
			// newName comes after this node's name: it belongs on the right.
			if (right == null)
			{
				//Place newName here, no right child left.
				right = new NameNode(newName);
			}
			else
			{
				// Right child exists: insert the right subtree.
				right.insert(newName);
			}
		}
		// newName equals this node's name, do nothing (no duplicates).
	}
 
	/**
	 * Produce a string of the names in the tree using in-order traversal,
	 * which yields the names in lexicographical (alphabetical) order.
	 * @return the names in the tree in lexicographical order
	 */
	public String toString()
	{
		String returnValue = "";
 
		// In-order traversal:
		// recursively visit and append the left subtree
		// append this node's name
		// recursively visit and append the right subtree
		if (left != null)
		{
			returnValue += left.toString();
		}
		returnValue += name;
		if (right != null)
		{
			returnValue += right.toString();
		}
 
		return returnValue;
	}
 
}