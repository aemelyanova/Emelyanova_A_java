package main.java;

public class Console {
    public void consoleInput() {
        ConsoleNumber consoleNumber = new ConsoleNumber();
        ConsoleName consoleName = new ConsoleName();
        ConsoleArray consoleArray = new ConsoleArray();
        consoleNumber.consoleNumberInput();
        consoleName.consoleNameInput();
        consoleArray.consoleArrayInput();
    }
}
