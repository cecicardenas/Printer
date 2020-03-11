package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(-90,4,false);
        //printer.getLevelToner();
        printer.PrintingPage();
        printer.DuplexPrinter();
        printer.FillUpToner();


    }
}
