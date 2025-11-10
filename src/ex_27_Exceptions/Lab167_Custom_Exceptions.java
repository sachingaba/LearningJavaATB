package ex_27_Exceptions;

public class Lab167_Custom_Exceptions {

    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR", 1000);
        Bank icici = new Bank("INR", 2000);

        Integer total_bal = sbi.add(icici);
        System.out.println(total_bal);

        Bank jpchase = new Bank("USD", 25);
        Integer total_bal1 = sbi.add(jpchase);
        System.out.println(total_bal1);

    }
}

    class Bank {
        public Bank(String currency, Integer amount) {
            this.currency = currency;
            this.amount = amount;
        }

        private String currency;
        private Integer amount;

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


        public Integer add(Bank bank) throws Exception {
            if (bank.currency.equalsIgnoreCase("INR")) {
                return bank.amount + this.amount;
            }
            else {
try {
    throw new CustomException("Currency Mismatch");
}catch (CustomException e){
    throw new RuntimeException(e);
}

            }

        }
    }

    class CustomException extends Exception {

        public CustomException(String message) {
            super(message);
        }
    }


