import java.io.*;
class ADSCharacter
{
    public static void main(String[] args)
    {
        char character;
        Scanner sc=new Scanner(System.in);
        character=sc.next().character(0);
        if(character>=48 && character<=57)
        {
            System.out.println("the character is digit");
        }
        else if((character>='a' && character<='z') || (character>='A' && character<='Z'))
        {
            System.out.println("the character is alphabet");
        }
        else
        {
            System.out.println("the character is a special character ");
        }
        
    }
}