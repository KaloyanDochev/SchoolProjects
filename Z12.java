package Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Z12 {
public static void main (String[] args) {
	int[] list = {2,4,7,8};
	int sum = 15;
	System.out.println(dvaMasiva(list,sum));
	System.out.println(binary(list,sum));
	System.out.println(bothEnds(list,sum));
	System.out.println(HSet(list,sum));
}
 public static  boolean dvaMasiva(int[] list, int sum) {
	 for(int i=0;i<list.length; i++) {
		 for(int j=i+1; j<list.length; j++) {
			 if(list[i] + list[j] == sum) {
				 return true;
			 }
		 }
	 }return false;
 }
 public static boolean binary(int[] list, int sum) {
	 for(int i=0;i<list.length; i++) {
		 if(BinarySearch.binarySearch(list,sum-list[i])>0) {return true;}
	 }
	 return false;
 }
 
 public static boolean bothEnds(int[] list, int sum) {
	 int lastIndex = list.length - 1;
	 int firstIndex = 0;
	 while(lastIndex>firstIndex) {
		 int currentSum = list[lastIndex] + list[firstIndex];
		 if(currentSum>sum) {
			 lastIndex--;
		 }else if(currentSum<sum) {
		 firstIndex++;
		 }
		 else {return true;}
		 }
	 return false;
	 }
 public static boolean HSet(int[] list, int sum) {
	 Set<Integer> rests = new HashSet<Integer>();
	 for(int i=0; i<list.length; i++) {
		 if(rests.contains(list[i])){
			 return true;
		 }
		 rests.add(sum-list[i]);
	 }
	 return false;
 }
 }

