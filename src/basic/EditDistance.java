package basic;

public class EditDistance {
	static int min(int x, int y, int z) {
		if (x <= y && x <= z)
			return x;
		if (y <= x && y <= z)
			return y;
		else
			return z;
	}

	static int editDistance(String str1, String str2, int m, int n) {
		if (m == 0) {
			return n;
		}
		if (n == 0) {
			return n;
		}
		if (str1.charAt(m - 1) == str2.charAt(n - 1))
			return editDistance(str1, str2, m - 1, n - 1);

		return 1 + min(editDistance(str1, str2, m, n - 1), editDistance(str1, str2, m - 1, n),
				editDistance(str1, str2, m - 1, n - 1));
	}
	
	public void calledByTestClass() {
		 String str1 = "corona"; 
	        String str2 = "virus"; 
	        int result =  editDistance(str1, str2, str1.length(), str2.length());
	        System.out.println(String.valueOf("DISTANCE TO EDIT IS: "+result));
	}
}
