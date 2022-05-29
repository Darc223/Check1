public class Account {
    private int AccNumb;
    private String Fname;
    private String Type;
    private String Balance;
    private String Interest;


    public Account(int AccNumb, String Fname, String Type, String Balance, String Interest) {
        this.AccNumb = AccNumb;
        this.Fname = Fname;
        this.Type = Type;
        this.Balance = Balance;
        this.Interest = Interest;
    }

    public int getAccNumb() {
        return AccNumb;
    }

    public String getFname() {
        return Fname;
    }

    public String getType() {
        return Type;
    }
    public String getBalance() {
        return Balance;
    }
    public String getInterest() {
        return Interest;
    }

    public String toString() {
        return AccNumb +"\t"+ Fname+"\t"+Type+"\t"+Balance+"\t"+Interest;
    }
}

