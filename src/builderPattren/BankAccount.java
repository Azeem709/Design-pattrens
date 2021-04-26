package builderPattren;

public class BankAccount {
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private int accountNumber;
    private String name;
    private String branch;
    private String city;

    private BankAccount(Builder builder){
        this.accountNumber = builder.accountNumber;
        this.name = builder.name;
        this.branch = builder.branch;
        this.city = builder.city;
    }

    public static class Builder{

        private int accountNumber;
        private String name;
        private String branch;
        private String city;

        public Builder accoutNumber(int accountNumber){
            this.accountNumber = accountNumber;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder branch(String branch){
            this.branch = branch;
            return this;
        }
        public Builder city(String city){
            this.city = city;
            return this;
        }

        /**
         *
         * @return
         */
        public BankAccount build(){
//            since Builder class is inside bank account we can call private constructor
           return new BankAccount(this);
        }




    }


}
