package lv.rvt;

public class PaymentCard {
private double balance;

public PaymentCard(double openingBalance) {
balance = openingBalance; 
}

public String toString() {

return "The card has a balance of " + balance + " euros";

}
    
public void eatAffordably() {

if (balance >= 2.60) {
    balance -= 2.60;
}
else System.out.println();

}


public void eatHeartily() {
    if (balance >= 4.60) {
        balance -= 4.60;
    } else System.out.println();
}

public void addMoney(double amount) {

if (amount < 0) {
    amount = 0;
} else {
    balance += amount;
}


if (balance > 150){
    balance = 150;
    } 
}
}