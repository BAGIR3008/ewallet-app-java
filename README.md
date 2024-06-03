<h1 align="center"><b>E-Wallet App</b></h1>

## Getting Started
### Overview:
Welcome to the My App eWallet project. This is my first project that I created in Java by applying the concept of Object-Oriented Programming (OOP).

Ewallet app is a simple CLI-based application with the following features:
- Adding account data
- Create an ewallet
- Make transactions, in the form of top ups and transfers

### Tasks:
- Create a simple CLI-based application to accommodate the features above.
- Applying the OOP principles that I have learned in Java class.

> Thank you to Mr [Fakhry Ikhsan Firdaus](https://github.com/iffakhry) for his knowledge. 😉

## Data Structure
1. Class `Customer`:
- Attributes: name, address, ewallet
- Methods: setter getter for name and ewallet.
2. Class `EWallet`:
- Attribute: balance, listTransaction
- Methods: constructor, set get balance, check balance, topup, transfer
3. Abstract Class `Transaction`:
- Attribute: nominal, date, customer.
- Methods: constructor, set get for nominal, date, customer. Abstract method prints transaction information.
4. Class `Topup` which inherits to `Transaction`:
- Attributes: reference number, payment method
- Methods: setter getter, constructor, override print transaction information
5. Class `Transfer` which inherits to `Transaction`:
- Attributes: sending customer, recipient
- Methods: constructor, setter, getter, override print transaction information

## Usage

1. Clone the repository:

    ```bash
    git clone https://github.com/BAGIR3008/ewallet-app-java.git
    ```

2. Navigate to the project directory:
    
    ```bash
    cd ewallet-app-java
    ```

3. Run the application:

    ```bash
    java src/AppMain.java
    ```
