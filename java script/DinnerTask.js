1.

for (let number = 2; number <= 100; number += 2) {
    console.log( number + " ");
}

2.

for (let number = 51; number < 100; number += 2) {
    console.log(number);
}

3.

for (let number = 100; number >= 1; number--) {
    console.log(i);
}

4.

for (let number = 1; number <= 20; number++) {
    console.log(Square of ${i} is ${number * number});
}

5.

for (let number = 1; number <= 50; number++) {
    if (number % 3 === 0) {
        console.log(number);
    }
}

6.

for (let number = 1; number <= 100; number++) {
    if (number % 3 === 0 && number % 5 === 0) {
        console.log(number);
    }
}

7.

let count = 0;
for (let count = 1; count <= 100; count++) {
    if (count % 7 === 0) {
        count++;
    }
}
console.log("Count of numbers divisible by 7 between 1 and 100: " + count);

8.

let sum = 0;
for (let number = 1; number <= 50; number++) {
    sum += number;
}
console.log("Sum of the first 50 natural numbers: " + sum);

9.

let product = 1;
for (let number = 1; number <= 10; number++) {
    product *= number;
}
console.log("Product of the first 10 natural numbers: " + product);

10.

for (let number = 65; number <= 90; number++) {
    process.stdout.write(String.fromCharCode(number) + " ");
}
console.log();

11.

const number = 7; 
for (let number = 1; number <= 10; number++) {
    console.log(${numbers} x ${number} = ${numbers * number});
}

12.

const str = "Good, Morning!";
for (let a = 0; a < str.length; a++) {
    console.log(str[a]);
}

13.

const input = "The wait is over.";
let count = 0;

for (let char of input) {
    if (char === 'e') {
        count++;
    }
}

console.log("Number of 'e's:", count);

14.

const input = "Glory Hallelujah!";
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

let input = "GoOD morNING!";
let result = "";

for (let a = 0; a < input.length; a++) {
    let c = input[a];
    if (c >= 'A' && c <= 'Z') {
        
        result += String.fromCharCode(c.charCodeAt(0) + 32);
    } else {
        result += c;
    }
}

console.log("Original:", input);
console.log("Lowercase:", result);

16.

let input = "Beautiful Day!";
let vowels = "aeiouAEIOU";
let count = 0;

for (let a = 0; a < input.length; a++) {
    let c = input[a];
    if (vowels.includes(c)) {
        count++;
    }
}

console.log("Original:", input);
console.log("Number of vowels:", count);

17.

let number = 345678;
let count = 0;
let temp = Math.abs(number); 

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

let number = 34567;
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