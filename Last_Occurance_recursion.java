/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//.........Write a function to find last occurance of an element in an array..............
package Oops_concept;

public class Last_Occurance_recursion {
    public static int Lnum(int arr[],int key,int i)
    {
        
        if(i==arr.length)
        {
            return -1;
        
        }
        int isFound=Lnum(arr,key,i+1);
        if(isFound==-1 && arr[i]==key)
        {
            return i;
        }
        return isFound;
        
    }
    
    public static void main(String[]args)
    {
        int arr[]={2,3,4,5,6,4,7,8};
        int i=0;
        int key=4;
        System.out.println(Lnum(arr,key,i));
    }
    
}
