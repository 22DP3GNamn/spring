package rvt;
    
    public class Money {

        private final int euros;
        private final int cents;

        public Money(int euros, int cents) {
            this.euros = euros;
            this.cents = cents;
        }

        public int euros() {
            return euros;
        }

        public int cents() {
            return cents;
        }

        public String toString() {
            String zero = "";
            if (cents < 10) {
                zero = "0";
            }

            return euros + "." + zero + cents + "e";
        }
        public Money plus(Money addition) {
            int newEuros = this.euros + addition.euros; 
            int newCents = this.cents + addition.cents;
            if(newCents >= 100){
                newEuros += 1;
                newCents -=100;
            }
            Money newMoney = new Money(newEuros, newCents);
            return newMoney;
        }
        public boolean less(Money less) {
            int newEuro = this.euros - less.euros;
            int newCents = this.cents - less.cents;
            if (newEuro< 0 && newCents< 0 || newEuro==0 && newCents< 0){
                return false;
            }
            else{
                return true;
            }
            
        }
        public Money minus(Money minus) {
            int newEuro = this.euros - minus.euros;
            int newCents = this.cents - minus.cents;
            if(newCents < 0){
                newEuro -= 1;
                newCents += 100;
            }
            if (newEuro < 0){
                newEuro = 0;
                newCents = 0;
            }
            Money newMoney = new Money(newEuro, newCents);
            return newMoney;
        }
    }