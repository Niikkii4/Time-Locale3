/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject3;

import java.text.*;
import java.util.*;

public class NewClass {
    public static void main(String[] args) {
        
    //Обьявляем время    
                
    Calendar calendar = Calendar.getInstance();
    
    //Устанавливаем форму времени
    
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("kkMM");  
    
    //Заносим значение времени в переменную
    
    String a = simpleDateFormat.format(calendar.getTime()); 
    
    //Присваиваем и конвертируем строку а в числовое значение и присваиваем его
    //переменной б
    
    int b = Integer.parseInt(a);
    
    //Подключаем работу с часами
    
    Locale defaultLocale = Locale.getDefault();
    
    //Если язык системы руский, то....
         
   if (Locale.getDefault().getDisplayLanguage().equals("русский")) {     
         
        if(b>=600&&b<900)System.out.println("Доброе утро, мир!");
    
        else if(b>=900&&b<1900)System.out.println("Добрый день, мир!");
    
        else if(b>=1900&&b<2300)System.out.println("Добрый вечер, мир!");
    
        else System.out.println("Доброй ночи, мир!");
   }
   
   //иначе ...
   
   else {     
         
         if(b>=600&&b<900)System.out.println("Good morning, World");
    
        else if(b>=900&&b<1900)System.out.println("Good day, World!");
    
        else if(b>=1900&&b<2300)System.out.println("Good evening, World!");
    
        else System.out.println("Good night, World!");
   }
    
    }
    // Так и не придумал что тестировать, по этому создал это :)
  public double add(int z, int x){
    return z+x;
    }
}
