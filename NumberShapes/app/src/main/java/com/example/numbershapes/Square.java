package com.example.numbershapes;

public class Square {
    int number;
    public Square(int inNumber){
        this.number = inNumber;
    }
    public boolean isSquare(){
        double squareRt= Math.sqrt(number);
        return Math.floor(squareRt)==squareRt;
    }
}
