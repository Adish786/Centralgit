import java.util.Random;
public class RandomGenerator 
{
public static void main(String[] args) 
{
Random rand = new Random(123456);
for (int j = 0; j<5; j++)
{
int nextRandom = rand.nextInt(5);
System.out.print(nextRandom+ " ");
}
}
}