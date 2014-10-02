/**
 * Created by Snazzy on 10/2/14.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.Arrays;
import java.util.regex.*;

public class Solution {
   static void displayPathtoPrincess(int n, String [] grid){
       Integer[] princessPosition = null;
       Integer[] playerPosition = null;
       Integer verticalDifference = null;
       Integer horizontalDifference = null;

       //Find princess and player
       for(int i = 0; i < grid.length ; i++){
            String row = grid[i];
            if(row.contains("p")){
                princessPosition = new Integer[]{i,row.indexOf("p")};
            }
            else if(row.contains("m")){
                playerPosition   = new Integer[]{i,row.indexOf("m")};
           }
       }

       //Figure out difference between the two
       if(playerPosition != null && princessPosition != null) {
           verticalDifference = playerPosition[0] - princessPosition[0];
           horizontalDifference = princessPosition[1] - playerPosition[1];
       }

       /*
       System.out.println("Princess position is " + Arrays.toString(princessPosition));
       System.out.println("Player position is " + Arrays.toString(playerPosition));
       System.out.println("Vertical Difference between player and princess is " + verticalDifference);
       System.out.println("Horizontal Difference between player and princess is " + horizontalDifference);
       */

       if(verticalDifference != null) {
           if (verticalDifference < 0) {
               for (int i = verticalDifference; i < 0; i++) {
                   System.out.println("DOWN");
               }
           } else {
               for (int i = verticalDifference; i > 0; i--) {
                   System.out.println("UP");
               }
           }
       }

       if(horizontalDifference != null) {
           if (horizontalDifference < 0){
               for (int i = horizontalDifference; i < 0; i++) {
                   System.out.println("LEFT");
               }
           }else{
               for (int i = horizontalDifference; i > 0; i--) {
                   System.out.println("RIGHT");
               }
           }
       }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

        displayPathtoPrincess(m,grid);
    }
}
