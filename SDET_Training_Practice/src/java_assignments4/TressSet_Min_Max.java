/**
 * 
 */
package java_assignments4;

import java.util.TreeSet;

/**
 * @author NelaturiR
 *
 */
public class TressSet_Min_Max {

	/**
	 * @param Treeset
	 */
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
	      treeSet.add(5550);
	      treeSet.add(6100);
	      treeSet.add(1750);
	      treeSet.add(2080);
	      treeSet.add(2590);
	      treeSet.add(2300);
	      treeSet.add(4600);
	      treeSet.add(5070);
	      treeSet.add(8020);
	      treeSet.add(10100);
	      System.out.println("TreeSet Lowest value = " + treeSet.first());
	      System.out.println("TreeSet Highest value = " + treeSet.last());


	}

}
