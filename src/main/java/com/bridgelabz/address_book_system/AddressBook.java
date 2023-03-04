package com.bridgelabz.address_book_system;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    Scanner scan = new Scanner(System.in);

    public Contact addContact() {
        Contact contact = new Contact();
        System.out.println("enter first name");
        String firstName = scan.next();
        contact.setFirstName(firstName);
        System.out.println("enter last name");
        String lastName = scan.next();
        contact.setLastName(lastName);
        System.out.println("enter address");
        String address = scan.next();
        contact.setAddress(address);
        System.out.println("enter city");
        String city = scan.next();
        contact.setCity(city);
        System.out.println("enter state");
        String state = scan.next();
        contact.setState(state);
        System.out.println("enter zip code");
        int zip = scan.nextInt();
        contact.setZipCode(zip);
        System.out.println("enter phone number");
        long phoneNumber = scan.nextLong();
        contact.setPhoneNumber(phoneNumber);
        System.out.println("enter email id");
        String email = scan.next();
        contact.setEmail(email);
        contacts.add(contact);
        System.out.println(contact);
        return contact;
    }

    public void editContact() {
        System.out.println("Enter the first name which you want to change");
        String name = scan.next();
        for (int i = 0; i < contacts.size(); i++) {
            if (name.equalsIgnoreCase(contacts.get(i).firstName)) {
                System.out.println("Choose what you want to change :");
                System.out.println(" 1.first name \n 2.last name \n 3.address \n 4.city \n 5.state \n 6.zip code " +
                        "\n 7.phone number \n 8.email");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Please Enter the name to be updated");
                        contacts.get(i).firstName = scan.next();
                        break;
                    case 2:
                        System.out.println("Please Enter the lastname to be updated");
                        contacts.get(i).lastName = scan.next();
                        break;
                    case 3:
                        System.out.println("Please Enter the address to be updated");
                        contacts.get(i).address = scan.next();
                        break;
                    case 4:
                        System.out.println("Please Enter the city to be updated");
                        contacts.get(i).city = scan.next();
                        break;
                    case 5:
                        System.out.println("Please enter the state to be updated");
                        contacts.get(i).state = scan.next();
                        break;
                    case 6:
                        System.out.println("Please Enter the zip code to be updated");
                        contacts.get(i).zipCode = scan.nextInt();
                        break;
                    case 7:
                        System.out.println("Please Enter the phone number to be updated");
                        contacts.get(i).phoneNumber = scan.nextLong();
                        break;
                    case 8:
                        System.out.println("Please Enter the email to be updated");
                        contacts.get(i).email = scan.next();
                        break;
                    default:
                        System.out.println("Invalid input");

                }

            }
        }
        System.out.println("Address book after editing contact ");
        contacts.forEach(person -> System.out.println(person));
    }
}
