/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject3;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Никита
 */
public class NewClassTest {
        
   @Test
   public void testAdd(){
   NewClass a = new NewClass();
   double res = a.add(10, 16);
   Assert.assertFalse(res != 26);
         
   }
   
}
