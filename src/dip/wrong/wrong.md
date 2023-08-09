Problem statement:
1. We have class PointOfSale which we use for purchasing something but in order to purchase something we
   are accepting only DebitCard as mode of payment, we need to change our code if a user comes up with a
   Credit card.
2. So in PointOfSale we are tightly coupled with the DebitCard as mode of payment, so high level module PointOfSale
   is dependent on low level module DebitCard. So this is violating the Dependency inversion principle.