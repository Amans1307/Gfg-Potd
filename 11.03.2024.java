//Count pairs Sum in matrices 
//Daily potd problem


import java.util.*;
class Solution {
    public static int countPairs(int mat1[][], int mat2[][], int n, int x) {
        int r1=0,c1=0;
        int r2=n-1,c2=n-1;
        int count=0;
        while(r1<=n-1 && r2>=0){
            int sum=mat1[r1][c1]+mat2[r2][c2];
            
            if(sum==x){
                count++;
                c1++;
                c2--;
            }else if(sum<x){
                c1++;
            }else{
                c2--;
            }
            if(c1==n){
                c1=0;r1++;
            }
            if(c2==-1){
                c2=n-1;r2--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [][]mat1 = {{1, 5, 6},
                        {8, 10, 11},
                        {15, 16, 18}};

        int [][]mat2 = {{2, 4, 7},
                        {9, 10, 12},
                        {13, 16, 20}};
        int n=3;    //size of matrix
        int x=21;   //target sum            
        System.out.println(countPairs(mat1,mat2,n,x));
    }
}

/*
mat1 = {{1, 5, 6},
        {8, 10, 11},
        {15, 16, 18}}
mat2 = {{2, 4, 7},
        {9, 10, 12},
        {13, 16, 20}}
*/
