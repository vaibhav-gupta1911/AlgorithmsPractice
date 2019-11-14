package Leetcode;

public class GOOGLE_MaximumTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String time = "??:??";
		char[] t = time.toCharArray();
		
		if(t[0]=='?')
		{
			t[0] = t[1] <= 3 || t[1] == '?' ? '2': '1';   
		}
		
		if(t[1]=='?')
		{
			t[1] = t[0] <= 1 ? '9': '3';   
		}
		

	    t[3] = (t[3] == '?') ? '5' : t[3];
	    t[4] = (t[4] == '?') ? '9' : t[4];
	    
		 System.out.println(t);
		
	}

}
