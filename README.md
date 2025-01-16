# FitnessCalculatorPlus

//Boo!!

**Welcome to my "FitnessCalculatorPlus"-Project!**

In this repository, I decided to test my knowledge and skill in object-oriented programming in Java and created something that I feel like is pretty useful for people who care about their fitness.


Main features:
- It can calculate various fitness-related values and give an interpretation based on the result. 
- It stores data globally, so that you don't have to manually type in the same data every single time.

Secondary features:
- It has an integrated 'AdminMode' which can be accessed in the initial run by entering '0' in the selection menu. This mode allows you to access calculators that have not been fully implemented, finished or tested yet.
- You can always return back to the selection menu by entering '-1' in any input field.

I will update this repository if I get new ideas for new features. I will also make sure to update this once I learn how to handle exceptions. 
If you have any features you want me to implement in this, hit me up on Discord: 'digital_warpstar'.

The way this project works is as follows:
The Main.java class takes care of everything related to the management of the program, for example the mode selection, program exits and returns to the selection menu.
The Data.java class stores all of the user-made inputs statically for later use, but can also reset them if wanted. It also saves things like mode names and availability statuses.
The Calculator.java class is a fork-class that starts the correct calculator based on the user selection.
All three characters long classes (like BMI.java, BMR.java, BFP.java, etc.) are the calculators that get called in the Calculator.java class. Their only function is to gie an output based on the received data.

*The original version can still be found under the name 'FitnessCalculator' in my 'miniprojects' repository!*