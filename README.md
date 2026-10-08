# 💱 Currency Converter – Java Swing Application

**COMPANY:** RD INFRO TECHNOLOGY
**NAME:** P YASWANTH
**INTERN ID:** RDJD305DD
**DOMAIN:** JAVA PROGRAMMING
**DURATION:** 8 WEEKS
**MENTOR:** p Dhanamurthy


## 📌 Project Overview

The **Currency Converter** is a Java-based desktop application developed using **Java Swing and AWT**. The project provides a simple and interactive graphical user interface that allows users to convert an amount from one currency to another.

The application supports multiple currencies, including **Indian Rupee (INR), US Dollar (USD), Euro (EUR), and British Pound (GBP)**. Users can enter an amount, select the source currency, select the target currency, and click the **Convert** button to instantly calculate the converted value.

This project demonstrates important Java programming concepts such as **GUI development, event handling, HashMap, exception handling, user input validation, and object-oriented programming**.

## 🚀 Features

* 💰 **Multiple Currency Support:** Convert between INR, USD, EUR, and GBP.
* 🖥️ **Graphical User Interface:** Simple and easy-to-use Java Swing interface.
* 🔄 **Currency Conversion:** Converts the entered amount using predefined exchange rates.
* ⚡ **Instant Results:** Displays the converted amount immediately after clicking Convert.
* ❌ **Input Validation:** Handles invalid and non-numeric inputs.
* 📊 **Formatted Output:** Displays conversion results with two decimal places.
* 🧩 **Event Handling:** Uses `ActionListener` to handle user interactions.
* 🗂️ **HashMap:** Stores and manages currency exchange rates efficiently.

## 🔧 Technologies Used

* **Java:** Core programming language.
* **Java Swing:** Used to build the graphical user interface.
* **AWT:** Used for layout and event handling.
* **HashMap:** Used to store currency exchange rates.
* **Exception Handling:** Used to handle invalid user input.
* **OOP Concepts:** Used for application structure and implementation.

## 📷 Output

The application displays a simple currency conversion window containing:

* Amount input field
* From Currency dropdown
* To Currency dropdown
* Convert button
* Result display

Example:

**Amount:** 100
**From:** USD
**To:** INR

**Result:** 100.00 USD = 9221.00 INR

> *Note: Exchange rates are predefined in the program and may not represent current market rates.*

## 📁 File Structure

```text
Currency-Converter/
│
├── Currency_Converter.java
└── README.md
```

## 📖 How It Works

1. The application starts by creating a Java Swing window.
2. Predefined exchange rates are stored using a `HashMap`.
3. The user enters an amount in the input field.
4. The user selects the source currency.
5. The user selects the target currency.
6. After clicking the **Convert** button, the program reads the input.
7. The amount is converted into INR as the intermediate currency.
8. The INR value is then converted into the selected target currency.
9. The final result is displayed on the screen.
10. If the user enters invalid data, an appropriate error message is displayed.

## ✅ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/currency-converter-java.git
```

### 2. Navigate to the Project Directory

```bash
cd currency-converter-java
```

### 3. Compile the Java Program

```bash
javac Currency_Converter.java
```

### 4. Run the Application

```bash
java Currency_Converter
```

Make sure **Java JDK** is installed and configured on your system.

## 🎯 Learning Outcomes

Through this project, I gained practical knowledge of:

* Java Swing GUI development
* AWT components and layouts
* Event-driven programming
* `ActionListener`
* HashMap and collections
* Exception handling
* User input validation
* Object-oriented programming
* Building a basic Java desktop application

## 🔮 Future Improvements

The project can be enhanced in the future by:

* 🌐 Integrating a **live currency exchange-rate API**.
* 📅 Adding automatic exchange-rate updates.
* 💱 Supporting more international currencies.
* 🌓 Adding dark and light themes.
* 📱 Improving the interface for different screen sizes.
* 📜 Adding conversion history.
* 🔄 Adding a currency swap button.
* 📊 Displaying historical exchange-rate information.

## 👤 Author

**P YASWANTH**
B.Tech Student
Interested in **Java Programming, Software Development, Full Stack Development, and Data Technologies**.

## 📬 Feedback and Contributions

Suggestions and feedback are welcome. You can **fork this repository**, create an issue, or submit a pull request to improve the project.

⭐ If you find this project useful, consider giving the repository a star!
