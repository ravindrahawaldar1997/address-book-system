package com.bridgelabz.address_book_system;


import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book program");
        AddressBook addressBook = new AddressBook();

        boolean result = true;
        while (result) {
            final int addContact = 1, editContact = 2, deleteContact = 3, printContact = 4, exit = 5;
            Scanner sc = new Scanner(System.in);
            System.out.println(" press 1. to add contact\n press 2. to edit contact\n " +
                    "press 3. to delete\n press 4 to print \n press 5 to exit");
            int choice = sc.nextInt();
            switch (choice) {
                case addContact:
                    addressBook.addContact();
                    break;
                case editContact:
                    addressBook.editContact();
                    break;
                case deleteContact:
                    addressBook.deleteContact();
                    break;
                case printContact:
                    addressBook.printContact();
                    break;
                case exit:
                    break;
                default:
                    result = false;
                    break;
            }
        }

    }
}
