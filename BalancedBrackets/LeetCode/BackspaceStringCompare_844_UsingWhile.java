package Leetcode;

import java.util.Stack;

public class BackspaceStringCompare_844_UsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(backspaceCompare("dcc", "dddd###cc"));
	}

	public static boolean backspaceCompare(String S, String T) {

		int slen = S.length() - 1, tlen = T.length() - 1;
		int sbk = 0, tbk = 0;

		while (slen >= 0 || tlen >= 0) {

			if (slen >= 0) {
				if (S.charAt(slen) == '#') {
					sbk++;
					slen--;
					continue;
				}
				
				if(sbk>0) {
					slen--;
					sbk--;
					continue;
				}
			}

			if (tlen >= 0) {
				if (T.charAt(tlen) == '#') {
					tbk++;
					tlen--;
					continue;
				}
				
				if(tbk>0) {
					tlen--;
					tbk--;
					continue;
				}
			}

			if(slen<0 || tlen<0) {
				
				if(slen == tlen) {
					return true;
				}
				return false;
			}
				
			if(S.charAt(slen) != T.charAt(tlen))
				return false;
			
			slen--;
			tlen--;
			
		}

		
		return true;
	}

}
