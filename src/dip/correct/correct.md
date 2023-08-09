Solution to PointOfSale problem:
1. We can create a BankCard interface which has an abstract method doPayment()
2. Both DebitCard and CreditCard class will implement the BankCard interface.
3. Now in PointOfSale class we can keep the field of BankCard using composition.
4. So We can use both the Credit card and Debit card as mode of payment as both are subclasses
   of BankCard class.