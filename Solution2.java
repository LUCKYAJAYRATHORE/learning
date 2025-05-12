//{ Driver Code Starts

  import java.io.*;
  import java.util.*;


  class Solution2 {
    static int sum = 0, countA = 0, countB = 0;
    static int a[] = {1 , 7,  1,  5};
    static int b[] = {3, 2,  5,  8};

    public static void main(String[] args) {
        Pair[] arr = new Pair[4];
        for(int i=0; i<4; i++){
            int diff = Math.abs(a[i]-b[i]);
            Pair p = new Pair(diff, i);
            arr[i] = p;
            System.out.println(p);
        }
        Arrays.sort(arr);
        System.out.println("arrr " + arr.toString().toString());
          for(int i = 0; i<4; i++)
          {
            int index = arr[i].index;
            int x = 0;
            int y = 0;
            if(x>0 && y>0) {
              if(a[index]>=b[index])
              {
                System.out.println("i1 " + a[index]);
                System.out.println("i1 " + b[index]);
                  sum += a[index];
                  System.out.println(sum);
                  x--;
              }
              else
              {
                System.out.println("i2 " + a[index]);
                System.out.println("i2 " + b[index]);
                 sum += b[index];
                 System.out.println(sum);
                 y--;
              }
            }
            else if(x==0) {
                System.out.println("i1 " + a[index]);
                System.out.println("i1 " + b[index]);
                  sum += a[index];
                  System.out.println(sum);
                  x--;
            }
                else {
                    System.out.println("i2 " + a[index]);
                    System.out.println("i2 " + b[index]);
                     sum += b[index];
                     System.out.println(sum);
                     y--;
                }

          }
          // code here
      }

      static class Pair implements Comparable<Pair>{
        int diff;
        int index;

        public Pair(int diff, int index){
            this.diff = diff;
            this.index = index;
        }

        public int compareTo(Pair p){
            return p.diff-this.diff;
        }

        public String toString(){
            return diff+" : "+index;
        }
    }
  }
