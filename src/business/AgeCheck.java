/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Luccas Torres
 */
public class AgeCheck {
    public static int calculaIdade(java.util.Date dataNasc) {
        Calendar dateOfBirth = new GregorianCalendar();
        dateOfBirth.setTime(dataNasc);
        
        Calendar today = Calendar.getInstance();
        
        int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        
        dateOfBirth.add(Calendar.YEAR, age);
        
        if (today.before(dateOfBirth)) {
            age--;
        }

        return age;
    }
    
}
