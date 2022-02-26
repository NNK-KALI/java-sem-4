/*
    22) WAP to search all the names starting with 'Y' character
*/

public class SearchStartingCharacter
{
    public static void main(String args[])
    {
        String names[] = {"Yamuna", "Ram", "Yahoo", "Yandex"};

        for(int i=0; i<names.length; i++)
        {
            String temp = names[i];
            if(names[i].charAt(0) == 'Y')
            {
                System.out.println(names[i]);
            }
        }        

    }
}