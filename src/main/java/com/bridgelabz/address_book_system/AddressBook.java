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
}
