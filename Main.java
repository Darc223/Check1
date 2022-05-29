import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accList = new ArrayList<>();
        accList.add(new Account(01, "MUVANDIMWE Egide","Deposing", "112000","1.18"));
        accList.add(new Account(02, "NININAHAZWE Josephine","Credit", "320000", "1.12"));
        accList.add(new Account(03, "IRUTINGABO Abboubakar","Checking","140000","1.11"));
        accList.add(new Account(04, "BYUKUSENGE Roger","Saving", "410000", "1.16"));
        accList.add(new Account(05, "NIZIGAMA Amandine","Checking", "550000","2.10"));
        accList.add(new Account(06, "BIGIGWANAYO Herve","Deposit","510000","0.18"));
        accList.add(new Account(07, "SIMUBI Emmanuella","Credit", "250000",  "1.16"));
        accList.add(new Account(8, "BIZIMUNGU Francois","Debit", "620000",   "0.65"));
        accList.add(new Account(9, "MUKAMISHA Lanina","Saving", "2990000", "0.71"));
        accList.add(new Account(10, "MUKUNZI Lionel","Checking","6440000","0.22"));



        for (Account acc:accList){
            System.out.println(acc);
        }
    }
}
