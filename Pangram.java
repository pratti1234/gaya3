import java.util.Scanner;

public class Pangram 
{
    public static boolean isPangram(String s) 
	{
        boolean[] found = new boolean[26];
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) 
	{
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') 
	    {
                found[ch - 'a'] = true;
            }
        }

        boolean isPangram = true;
        StringBuilder missing = new StringBuilder();

        for (int i = 0; i < 26; i++) 
	{
            if (!found[i]) 
	    {
                isPangram = false;
                missing.append((char) ('a' + i)).append(" ");
            }
        }

        if (!isPangram) 
	{
            System.out.println("Missing letters: " + missing.toString().trim());
        }

        return isPangram;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String word = sc.nextLine();

        if (isPangram(word))
	{
            System.out.println("Yes, it's a pangram.");
        } else 
	{
            System.out.println("No, it's not a pangram.");
        }

        sc.close();
    }
}
