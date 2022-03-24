package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(80, 6, true);
        printer.printingOfPage(2);
        printer.printingOfPage(5);
        System.out.println(printer.getNumberOfPagesPrinted());
        System.out.println(printer.getTonerLevel());
        printer.fillUpToner(90);
        System.out.println(printer.getTonerLevel());
    }
}
