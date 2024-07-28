//For IdsAndPasswords.java
import java.util.*;
public class IDsAndPasswords
{
    HashMap<String,String> loginDeets= new HashMap<String,String>();

    IDsAndPasswords()
    {
        loginDeets.put("Dude","Wassup!");
        loginDeets.put("Sanjay","andCraaaaig!");
        loginDeets.put("Remmington","T4ffl1p5");
        //Simply adding data of three distinct users into our code.
    }

     protected HashMap getLoginInfo()
    {
        return loginDeets;
    }
}
