package com.sda.lesson.fifth.example;

public class ReviewJavaBasicMain {
    public static void main(String[] args) {
        ReviewJavaBasic  reviewJavaBasic = new ReviewJavaBasic();
        reviewJavaBasic.pupulateArray();
        reviewJavaBasic.findMax(reviewJavaBasic.numberList);
        reviewJavaBasic.findAverage(reviewJavaBasic.numberList);
        reviewJavaBasic.findMin(reviewJavaBasic.numberList);
        reviewJavaBasic.isPresent(20, reviewJavaBasic.numberList);
        reviewJavaBasic.findSum(reviewJavaBasic.numberList);
        reviewJavaBasic.printOddNumbers(reviewJavaBasic.numberList);
        reviewJavaBasic.printEvenNumbers(reviewJavaBasic.numberList);
    }
}
