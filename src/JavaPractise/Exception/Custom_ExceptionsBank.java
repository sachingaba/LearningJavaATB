package JavaPractise.Exception;

public class Custom_ExceptionsBank {
    public static void main(String[] args) throws Exception {
        bank b1 = new bank("INR",20000);
        bank b3 = new bank("INR",20000);
        bank b2 = new bank("USD",1500);
        Integer total1 = b1.add(b3);
        System.out.println(total1);
        Integer total = b1.add(b2);
        System.out.println(total);

    }
}
class bank{
    private String currency;
    private Integer amount;

    public bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(bank b) throws Exception{
        if(b.currency.equalsIgnoreCase("INR")){
            return b.amount+this.amount;
        }else{
           // try{
            throw new Custom_Exceptions("Currency");

          //  } catch (Custom_Exceptions e){
          //      throw new RuntimeException(e.getMessage());
          //  }
        }
    }
}
class Custom_Exceptions extends Exception{
    public Custom_Exceptions(String msg) {
        super(msg);
        System.out.println(msg);
    }
}