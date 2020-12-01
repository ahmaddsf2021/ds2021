/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.Arrays;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class ArrayList {
    private Object[] list;
    private  int Buffer_size=10;
    int effectiveSize = 0; 

    public ArrayList() {
           list = new Object [Buffer_size];// bde zeed l list 10 by 10
        effectiveSize = 0; 
    }
    public void add ( Object newElement){ 
        if (list.length == effectiveSize)
        { list = Arrays.copyOf(list, list.length+Buffer_size);
        list[effectiveSize] = newElement; // awal marra 3aytlo bdo y7tu bl zerp index ele hwe effective
     effectiveSize++; }}
    
  public int size()
  {return effectiveSize;}  //     hye 3shn tle3 km cell ntalo
   
  public Object remove(int index) 
  { if ( index< 0 || index>= effectiveSize)
     throw new RuntimeException("Invalid Index"); 
// by this program will exit the program throw new  ArrayIndexOutOfBoundsException("Invalid Index" + index);
  return list[index];}
  // eza el index 8lat expection y3ni akbar aw az8ar mn el size ta3 el list 
}
