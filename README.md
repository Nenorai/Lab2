# Lab2
If "Test" Class is not open, code is here!!!!!!!!!!!!:

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringChagerTest
{
//Test for 1-st method
    @Test
    void string_Upp()
    {
        StringChager test1=new StringChager();
        test1.String_changer("one");
        assertEquals("ONE", test1.String_Upp());
    }
//Test for 2-nd method
    @Test
    void string_Down()
    {
        StringChager test2=new StringChager();
        test2.String_changer("ONE");
        assertEquals("one", test2.String_Down());
    }
//Test for 3-nrd method
    @Test
    void string_Addon()
    {
        StringChager test3=new StringChager();
        test3.String_changer(("Antony"));
        assertEquals("Antony Nuprey", test3.String_Addon("Nuprey"));
    }
//Test for 4-th method
    @Test
    void string_size()
    {
        StringChager test4=new StringChager();
        test4.String_changer(("Bench"));
        assertEquals(5,test4.str.length());
    }
}
