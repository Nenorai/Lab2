import java.util.Scanner;

public class Programm
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your string, please:");
        String test_string=in.nextLine();
        StringChager task=new StringChager();
        task.String_changer(test_string);
        //
        System.out.println("Now string transform into 'little':");
        String way1=task.String_Down();
        System.out.println(way1);
        //
        System.out.println("Now string transform into 'big':");
        String way2=task.String_Upp();
        System.out.println(way2);
        //
        System.out.println("Now we calculate the string size:");
        int way3=task.String_size();
        System.out.println(way3);
        //
        System.out.println("Now we transform to string in one common, enter addon string:");
        String add=in.nextLine();
        String way4=task.String_Addon(add);
        System.out.println(way4);
        in.close();
    }
}
