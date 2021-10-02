public class CharacterCount
{
public static void main(String args[])
{
String str="Programming";
Map<Character,Integer> charMapCount = new HashMap<>();
for(Character c : str.toCharArray())
{
if(charMapCount.containskey(c))
{
charMapCount.put(c,charMapCount.get(c) + 1 );
}
else{

charMapCount.put(c,1);
}

}
System.out.println(charMapCount);
}
}