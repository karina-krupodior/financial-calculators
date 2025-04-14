# 💸 Financial Calculators (Java CLI Projects)

This repository contains two console-based Java calculators designed to help users with basic financial calculations:

1. **Mortgage Calculator**
2. **Future Value Calculator**

These tools run via the command line and aim to provide clear, formatted financial results for users based on their inputs.

---

## 🔧 Project Structure

- Each calculator is implemented in a separate Java class.
- Inputs are taken from the user via the command line using `Scanner`.
- Output is displayed in a clean and easy-to-read format using `DecimalFormat`.

---

## 🧠 How It Works

### 1. Mortgage Calculator

The monthly payment is calculated using the formula:
M = P × (i × (1 + i)^n) / ((1 + i)^n - 1)


Where:
- `M` is the monthly payment
- `P` is the loan principal
- `i` is the monthly interest rate
- `n` is the number of payments (months)

It also calculates the **total interest paid** over the life of the loan.

---

### 2. Future Value Calculator

The future value of a one-time deposit (like a CD) is calculated with daily compounding:

FV = P × (1 + (r / 365)) ^ (365 × t)

Where:
- `FV` is the future value
- `P` is the initial deposit
- `r` is the annual interest rate (decimal)
- `t` is the number of years

It also shows **total interest earned**: `FV - P`

---

## ✨ Interesting Piece of Code

```java
double monthlyPayment = principal * (
    (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) /
    (Math.pow(1 + monthlyInterestRate, totalPayments) - 1)
);