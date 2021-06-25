package com;

public class Arraysorting {
    public static void arraysort(int a[] )
    {
       int temp=0;
      for(int i=0;i<a.length-1;i++)
      {

          if(a[i]<=a[i+1])
          {

          }
          if(a[i]>a[i+1])
          {
              temp=a[i];
              a[i]=a[i+1];
              a[i+1]=temp;
          }


                            }
      for(int i=0;i<a.length;i++)
      {
          System.out.println(a[i]);
      }

    }

    public static void main(String rags[])
    {
      int a[] ={3,5,7,8,2,3,1};
      arraysort(a);
    }





}
