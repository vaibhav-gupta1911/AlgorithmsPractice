package Hackerrank;

import java.util.ArrayList;
import java.util.List;

public class AtlassianBeautifulArray {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(4);
		a.add(5);
		a.add(8);
		int m = 1;
		
		int n = a.size();
	

		int count = 0;

		for (int i = 0; i < n; i++) {
			int odd = 0;
			for (int j = i; j < n; j++) {
				
				if (a.get(j) % 2 == 0)
					odd++;

				if (odd == m)
					count++;
				
			}
		}

	}
}



//int N = (int) Math.pow(2d, Double.valueOf(n));
//System.out.println(N);

//
////for (int i = 0; i < n; i++) {
////
////numbers[oddcnt]++;
////
////if(arr[i]%2 ==0)
////	oddcnt++;
////
////if(oddcnt>=m)
////count = count + numbers[oddcnt-m];
////}
////
//System.out.println(count);
//
////for (int i = 1; i < N; i++) {
////String code = Integer.toBinaryString(N | i).substring(1);
////
////System.out.println("code-" + code);
////
////for (int j = 0; j < n; j++) {
////	if (code.charAt(j) == '1') {
////		System.out.print(arr[j]);
////	}
////}
////System.out.println();
////}

//public static long combinations(int n, int r) {
//
//	long res = 1;
//
//	if (n >= r) {
//		res = getFact(n) / (getFact(n - r) * getFact(r));
//		return res;
//	}
//	return res;
//}
//
//public static long getFact(int n) {
//	long f = 1;
//
//	for (int i = n; i >= 1; i--) {
//		f *= i;
//	}
//
//	return f;
//}
