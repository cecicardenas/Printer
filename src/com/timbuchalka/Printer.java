package com.timbuchalka;

public class Printer {
    private int levelToner;
    private int pagesPrinter;
    private boolean duplexPrinter;

    public Printer(int levelToner, int pagesPrinter, boolean duplexPrinter) {
        this.levelToner = levelToner;
        this.pagesPrinter = pagesPrinter;
        this.duplexPrinter = duplexPrinter;
    }

    public int getLevelToner() {
        return this.levelToner;
    }

    public int getPagesPrinter() {
        return this.pagesPrinter;
    }

    public boolean isDuplexPrinter() {
        return this.duplexPrinter;
    }

    public void FillUpToner() {
        if (this.levelToner > 0 && this.levelToner <= 100) {
            System.out.println("The level toner is: " + this.levelToner);
        } else {
            this.levelToner = -1;
        }
    }

    public void PrintingPage() {
        if (this.pagesPrinter >=1) {
            System.out.println("Printing pages are: " + this.pagesPrinter);
        } else {
            System.out.println("Don´t printing pages");
        }
    }

    public void DuplexPrinter() {
        if (this.duplexPrinter) {
            System.out.println("Is a duplex printer");
            if (this.pagesPrinter > 1) {
                System.out.println("Printing pages are: " + this.pagesPrinter);
            } else {
                System.out.println("Don't Printing pages duplex: ");
            }
        }  else {
            System.out.println("Isn't duplex printer");
        }

    }
}
