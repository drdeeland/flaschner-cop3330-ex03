/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String quote = myApp.ReadQuote();
        String author = myApp.ReadAuthor();
        String outputString = myApp.GenerateOutput(author, quote);
        myApp.PrintOutput(outputString);
    }

    public String ReadQuote() {
        System.out.print("What is the quote? ");
        return input.nextLine();
    }

    public String ReadAuthor() {
        System.out.print("Who said it? ");
        return input.nextLine();
    }

    public String GenerateOutput(String author, String quote) {
        return author + " says, \"" + quote + "\"";
    }

    public void PrintOutput(String outputString) {
        System.out.print(outputString);
    }
}