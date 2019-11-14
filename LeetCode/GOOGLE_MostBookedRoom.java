package Leetcode;

import java.util.HashMap;

public class GOOGLE_MostBookedRoom {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		String[] test1 = { "+1A", "+3E", "-1A", "+4F", "+1A", "-3E" };
		String[] test = { "+1A", "+3E", "-1A", "+4F", "+1A", "-3E", "+3E", "-3E" };
		mostBookedHotelRoom(test1);
	}

	public static void mostBookedHotelRoom(String[] booked) {
		String most = "A";
		int max = 0;

		HashMap<String, Integer> map = new HashMap<>();

		for (String s : booked) {

			String room = s.substring(1);
			if (s.substring(0, 1).equals("+")) {
				map.put(room, map.get(room)==null? 1 : map.get(room)+1);
			}
		}

		for (String room : map.keySet()) {
			if (map.get(room) > max) {
				max = map.get(room);
				most = room;
			} else if (map.get(room) == max) {
				if (room.charAt(room.length() - 1) > most.charAt(room.length() - 1)) {
					max = map.get(room);
					most = room;
				}
			}
		}

		System.out.println(most);

	}

}
