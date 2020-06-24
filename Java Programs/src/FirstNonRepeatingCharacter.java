
public class FirstNonRepeatingCharacter 
{

	public static void main(String[] args)
	{
		String s="satish";
		for(int i=0;i<s.length();i++)
{
	boolean uniq=true;
	for(int j=0;j<s.length();j++)
	{
		if(i!=j&&s.charAt(i)==s.charAt(j))
		{
			uniq=false;
			break;
		}
	}
	if(uniq)
	{
		System.out.println(s.charAt(i));
		break;
	}
}
	}

}
