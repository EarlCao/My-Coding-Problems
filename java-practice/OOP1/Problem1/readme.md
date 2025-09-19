Sample Problem: === Product Inventory System ===
- You are building a program to manage a product inventory.
Each product has the following attributes:
productName(String)
productId(String)
price(double)
category(String)
inStock(boolean)
- You goal is to create a Product class with five constructors to handle different ways of adding a product to the system.
The constructors must be arranged in order of the number of parameters they accept, and they must use constructor chaining (this()) to avoid writing duplicate code.

Here are the constructors you need to create:
- Constructor_1: Takes only the productName.
  - productId should default to "UNASSIGNED".
  - price should default to 0.0.
  - category should default to "General".
  - inStock should default to true.
- Constructor_2: Takes productName and productId.
  - price should default to 0.0.
  - category should default to "General".
  - inStock should default to true.
- Constructor_3: Takes productName, productId, and price.
  - category should default to "General".
  - inStock should default to true.
- Constructor_4: Takes productName, productId, price, and category.
  - inStock should default to true.
Master Constructor: Takes all five parameters: productName, productId, price, category, and inStock. This will be your "master" constructor that all other constructor chain to.

Instructions:
> Create a Product class and declare the five global variables.
> Write the five constructors as described above, ensuring they chain together properly.
> Add a displayInfor() method to print all the product details.
> In a main method, create a new Product object for each of the five constructors and call displayInfo() for each on to check you work.
