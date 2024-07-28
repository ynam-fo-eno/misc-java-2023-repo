//For Main.java
import java.util.*;
import java.lang.*;

public class Main
{
    public static void main(String[] args)
    {
        IDsAndPasswords idp1= new IDsAndPasswords();

        LoginPage pageOfEntry= new LoginPage(idp1.getLoginInfo());

    }
}