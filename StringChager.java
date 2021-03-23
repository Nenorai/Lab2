public class StringChager
{
    String str;
    //Method to change one string to another
    public void String_changer(String new_string)
    {
        this.str=new_string;
    }
    //Method to set all words to Upper Case
    public String String_Upp()
    {
       return str.toUpperCase();
    }
    //Method to set all words to lower Case
    public String String_Down()
    {
        return str.toLowerCase();
    }
    //Method to compile two strings
    public String String_Addon(String new_string)
    {
        return str+" "+new_string;
    }
    //
    public int String_size()
    {
        return str.length();
    }
}
