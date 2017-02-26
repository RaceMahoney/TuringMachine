# What is this? #
This Java program is a Turing Machine that runs three languages with a GUI interface
that was built for my final project in CS 230 Theory of Computation

# Running the program #
## Pull ##
By clicking the clone or download button and pasting the given link in your terminal window you have now cloned the repository and have access to the program.

## Compile and Run ##
Once you have access to the java file, compile the java file with "javac TuringMachine" in the terminal window, followed by "java TuringMachine". After the java file has been run you'll be greeted by a GUI window with three options for languages.

# What are my options? #
Once the GUI window is up and running you will have three buttons to choose from.

The first button accepts strings of any length that contain 0 and 1 in that order.

The second button accepts strings made up of 0 and 1 only. Next the program duplicates the string into three strings separated by a # delimiter. Any string longer than two characters and no containing 0 and 1 will be rejected.

The last button only accepts strings made up of 0 and that have an even length.

# Output #
Once a language button is selected you will be shown another GUI window with a bar to enter your input. The terminal window will then display the output of the turing machine going through each character in the string one at a time. At the end of the process the terminal will tell you if your string was accepted or not.

If you wish to give another language a try, simply close the current window and click on another button from the original start window.    
