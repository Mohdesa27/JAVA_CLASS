public class Bill {
    void printTotal(Locale l) {
        // NumberFormat nf=new NumberFormat();//it follow the singlton
        // NumberFormat nf=NumberFormat.getCurrencyInstance();
        // System.out.println(nf.format(4352323));
    }

    static void printDate(Locale l) {
        Date date = new Date();
        DateFormat d = DateFormat.getDateInstance(DateFormat.FULL, l);
        System.out.println(d.format(date));
    }

    public static void main(String[] args) {
        Locale l = new Locale("en", "US");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the customer name:");
        String name = sc.nextLine();
        System.out.print("Enter the ITEM:");
        String item = sc.nextLine();
        System.out.print("Customer Name:");
        System.out.print(name);
        System.out.print("                 ");
        System.out.print("Date:");
        printDate(l);
        System.out.println("\n");
        System.out.println("ITEM : " + item);
        System.out.print("___________________________________");
        System.out.println("enter the item purchase");
        String item = sc.nextLine();
        System.out.println("enter the amout of the " + item);
        double price = s c.nextDouble();
        System.out.println("enter the amount you pay");
        double amount = sc.nextDouble();
        System.out.println("enter the tax percentage on" + item);
        int tax = sc.nextInt();
        double taxamount = (tax * amount / 100);
        NumberFormat nf = NumberFormat.getCurrencyInstance(l);
        System.out.print(name + "     ");
        System.out.print(item + "     ");
        System.out.print(nf.format(price) + "     ");
        System.out.print(tax + "%     ");
        System.out.print(nf.format(taxamount) + "     ");
        System.out.print(nf.format(amount) + "     ");
        System.out.print(nf.format(amount - taxamount) + "     ");

    }

}
