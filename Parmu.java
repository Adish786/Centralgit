import java.util.ArrayList; 
public class Parmu { 
	static void printArrayList(ArrayList<String> arrL) 
	{ 
		arrL.remove(""); 
		for (int i = 0; i < arrL.size(); i++) 
			System.out.print(arrL.get(i) + " "); 
	} 
	public static ArrayList<String> getPermutation(String str) 
	{  
		if (str.length() == 0) { 
			ArrayList<String> empty = new ArrayList<>(); 
			empty.add(""); 
			return empty; 
		}  
		char ch = str.charAt(0); 
		String subStr = str.substring(1); 
		ArrayList<String> prevResult = getPermutation(subStr); 
		ArrayList<String> Res = new ArrayList<>(); 

		for (String val : prevResult) { 
			for (int i = 0; i <= val.length(); i++) { 
				Res.add(val.substring(0, i) + ch + val.substring(i)); 
			} 
		}  
		return Res; 
	} 
	public static void main(String[] args) 
	{ 
		String str = "abc"; 
		printArrayList(getPermutation(str)); 
	} 
} 
