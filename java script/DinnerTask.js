1.

for (let i = 2; i <= 100; i += 2) {
    process.stdout.write(i + " ");
}

2.

for (let i = 51; i < 100; i += 2) {
    console.log(i);
}

3.

for (let i = 100; i >= 1; i--) {
    console.log(i);
}

4.

for (let i = 1; i <= 20; i++) {
    console.log(Square of ${i} is ${i * i});
}

5.

for (let i = 1; i <= 50; i++) {
    if (i % 3 === 0) {
        console.log(i);
    }
}

6.

for (let i = 1; i <= 100; i++) {
    if (i % 3 === 0 && i % 5 === 0) {
        console.log(i);
    }
}

7.

let count = 0;
for (let i = 1; i <= 100; i++) {
    if (i % 7 === 0) {
        count++;
    }
}
console.log("Count of numbers divisible by 7 between 1 and 100: " + count);

8.

let sum = 0;
for (let i = 1; i <= 50; i++) {
    sum += i;
}
console.log("Sum of the first 50 natural numbers: " + sum);

9.

let product = 1;
for (let i = 1; i <= 10; i++) {
    product *= i;
}
console.log("Product of the first 10 natural numbers: " + product);

10.

for (let i = 65; i <= 90; i++) {
    process.stdout.write(String.fromCharCode(i) + " ");
}
console.log();

11.

const number = 7;  // Change this number to print a different table
for (let i = 1; i <= 10; i++) {
    console.log(${number} x ${i} = ${number * i});
}

12.

const str = "Hello, World!";
for (let i = 0; i < str.length; i++) {
    console.log(str[i]);
}

13.

const input = "Here is an example sentence.";
let count = 0;

for (let char of input) {
    if (char === 'e') {
        count++;
    }
}

console.log("Number of 'e's:", count);

14.

const input = "Hello World!";
let result = "";

for (let char of input) {
    if (char >= 'a' && char <= 'z') {
      
        result += String.fromCharCode(char.charCodeAt(0) - 32);
    } else {
        result += char;
    }
}

console.log(result);

15.

let input = "HeLLo WoRLD!";
let result = "";

for (let i = 0; i < input.length; i++) {
    let c = input[i];
    if (c >= 'A' && c <= 'Z') {
        
        result += String.fromCharCode(c.charCodeAt(0) + 32);
    } else {
        result += c;
    }
}

console.log("Original:", input);
console.log("Lowercase:", result);

16.

let input = "Hello World!";
let vowels = "aeiouAEIOU";
let count = 0;

for (let i = 0; i < input.length; i++) {
    let c = input[i];
    if (vowels.includes(c)) {
        count++;
    }
}

console.log("Original:", input);
console.log("Number of vowels:", count);

17.

let number = 123456;
let count = 0;
let temp = Math.abs(number);  // Handle negative numbers

if (temp === 0) {
    count = 1;
} else {
    while (temp > 0) {
        temp = Math.floor(temp / 10);
        count++;
    }
}

console.log("Number:", number);
console.log("Digit count:", count);

18.

let number = 12345;
let sum = 0;

while (number > 0) {
    sum += number % 10;
    number = Math.floor(number / 10);
}

console.log("Sum of digits:", sum);

19.

let number = 739245;
let maxDigit = 0;

while (number > 0) {
    let digit = number % 10;
    if (digit > maxDigit) {
        maxDigit = digit;
    }
    number = Math.floor(number / 10);
}

console.log("Largest digit:", maxDigit);

20.

let number = 739245;
let minDigit = 9;

while (number > 0) {
    let digit = number % 10;
    if (digit < minDigit) {
        minDigit = digit;
    }
    number = Math.floor(number / 10);
}

console.log("Smallest digit:", minDigit);