/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Purnima
 */
public class Validation {
    
    private static Pattern emailNamePtrn = Pattern.compile(
    "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    
    
    public static boolean validateEmailAddress(String email){
         
        Matcher mtch = emailNamePtrn.matcher(email);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
}
