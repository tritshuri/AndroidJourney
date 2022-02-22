package com.example.numbershapes;

public class Triangular {
    int number;
    public Triangular(int inNumber){
        this.number= inNumber;
    }
    public boolean isTriangular(){
        int count=2;
        int triangularNum = 1;
        while(triangularNum<number){
            triangularNum+=count;
            count++;
        }
        return triangularNum==number;
    }
}
