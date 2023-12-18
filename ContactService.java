package app;

import java.util.Map;


import java.util.HashMap;
import java.util.Map;



public class ContactService {
	//creating of a data structure to hold contacts objects in a map
    private Map<String, Contact> contacts;

    //Creation of a hashmap to hold contacts
    public ContactService() {
        this.contacts = new HashMap<>();
    }

    // Method to add a new Contact. 
    public void addContact(Contact contact) {
        if (contact != null && !contacts.containsKey(contact.getID())) {
            contacts.put(contact.getID(), contact);
            System.out.println("Contact added: " + contact.getID());
        } else {
            System.out.println("Invalid contact");
        }
    }

    //Method to delete a contact that holds a specific ID
    public void deleteContact(String contactId) {
        if (contacts.containsKey(contactId)) {
            contacts.remove(contactId);
            System.out.println("Contact deleted: " + contactId);
        } else {
            System.out.println("Contact not found: " + contactId);
        }
    }

    //Method to update the contacts ID, first name, last name, phone, or address
    public void updateContact(String contactID, String field, String val) {
        if (contacts.containsKey(contactID)) {
            Contact contact = contacts.get(contactID);
            switch (field.toLowerCase()) {
                case "firstname":
                    contact.setFirstName(val);
                    break;
                case "lastname":
                    contact.setLastName(val);
                    break;
                case "number":
                    contact.setPhone(val);
                    break;
                case "address":
                    contact.setAddress(val);
                    break;
                default:
                    System.out.println("Invalid field for update: " + field);
                    return;
            }
            System.out.println("Contact updated: " + contactID);
        } else {
            System.out.println("Contact not found: " + contactID);
        }
    }

    // Method to return all of the contacts in the map
    public Map<String, Contact> getContacts() {
        return contacts;
    }
    
	

   
}
