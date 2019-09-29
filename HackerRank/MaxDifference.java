package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class AtlassianMaxDifference {


	public static int maxDiffernce(List<Integer> nums) {

		int maxDiff = 0;//nums.get(1) - nums.get(0);
		int min = nums.get(0);

		for (int i = 1; i < nums.size(); i++) {
			  
			int ielemnt = nums.get(i);
			int iMinDiff = ielemnt - min;

			if (iMinDiff > maxDiff)
				maxDiff = iMinDiff;
			
			if (ielemnt < min)
				min = ielemnt;
			
		}

		return maxDiff;

	}
	
	
	public static void main(String[] args) {
		List<Integer> x = new ArrayList<Integer>();

		x.add(4);
		x.add(5);
		x.add(10);
		x.add(1);
		x.add(4);
		x.add(8);
		x.add(1); 

		System.out.println(maxDiffernce(x));
	}

}
