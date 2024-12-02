package lesson8.hw7_8;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(boolean duplex, int tonerLevel) {
       if (tonerLevel > -1 && tonerLevel<= 100){
           this.duplex = duplex;
           this.tonerLevel = tonerLevel;

       }
       else {
           this.tonerLevel = -1;
           this.duplex = duplex;
           pagesPrinted = 0;
       }
    }
    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
           if((tonerLevel + tonerAmount) > 100){
               return -1;
           }
           else {
               this.tonerLevel += tonerAmount;
               return tonerLevel;
           }
        }
        return -1;
    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            System.out.println("Printing in duplex mode");
            pagesPrinted = pagesToPrint / 2;
            return pagesToPrint;
        }
        System.out.println("Printing in single mode");
        pagesPrinted = pagesToPrint;
        return pagesToPrint;
    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }


}
