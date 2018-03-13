/*****************************************************************************
 * Code for the Single Number exercise in Arrays in the easy collection from
 * LeetCode.com that receives an int array with only duplicates except for one
 * and you have to return that number that is unique in the array. 
 * @author Jason Narrainen
 * @version 13/03/2018
 *
 */
public class SingleNumber {
	
	// Attributs
	int[] array;
	int[] count;
	
	public int singleNumber(int[] nums) {
		
		int i = 0;
		
		countNumberOccurences(nums);
		
		while (count[i] != 1) {
			
			i++;
		}
		
		return 
	}
	
	public int countNumberOccurences(int[] array) {
		
		
	}
}
