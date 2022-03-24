package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;//Capable of printing on both sides of the paper.

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean duplexPrinter) {
        if (tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        if (numberOfPagesPrinted >= 0) {
            this.numberOfPagesPrinted = numberOfPagesPrinted;
        }
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner(int tonerLevel) {
        if (tonerLevel > 100) {
            System.out.println("Max amount is 100!");
        } else {
            this.tonerLevel = tonerLevel;
        }
    }

    public void printingOfPage(int pages) {
        if (duplexPrinter) {
            numberOfPagesPrinted = ((pages) * 2) + numberOfPagesPrinted;
        } else {
            numberOfPagesPrinted++;
        }
        System.out.println("Printing pages...\nTotal pages = " + (numberOfPagesPrinted + pages));
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
