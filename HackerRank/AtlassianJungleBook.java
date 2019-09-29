package Hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AtlassianJungleBook {

	public static void main(String[] args) {

		List<Integer> predators = new ArrayList<Integer>();
		predators.add(-1);
		predators.add(8);
		predators.add(6);
		predators.add(0);
		predators.add(7);
		predators.add(3);
		predators.add(8);
		predators.add(9);
		predators.add(-1);
		predators.add(6);

		reply(predators);
	}

	static int reply(List<Integer> predators) {

		int max = 1;
		int len = predators.size();

		for (int i = 0; i < predators.size(); i++) {
			int a = i;
			int counter = 1;

			while (predators.get(a) > -1 && predators.get(a) < len && counter < len) {
				a = predators.get(a);
				counter++;
			}

			if (counter > max)
				max = counter;
		}
		return max;

	}
}
