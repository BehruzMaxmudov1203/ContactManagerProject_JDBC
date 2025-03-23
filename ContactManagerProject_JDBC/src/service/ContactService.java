package service;

import dto.Contact;
import repository.ContactRepository;

import java.util.List;

public class ContactService {
    private ContactRepository contactRepository = new ContactRepository();

    public void addContact(Contact contact) {


        Contact exits = contactRepository.getByPhone(contact.getPhone());
        if (exits != null) {
            System.out.println("Phone already exists");
            return;
        }
        boolean result = contactRepository.saveContact(contact);
        if (result) {
            System.out.println("dto.Contact add");
        } else {
            System.out.println("Something wend wreng");
        }
    }

    public void contactList() {

        List<Contact> contactList = contactRepository.getList();
        if (contactList.isEmpty()) {
            System.out.println("Empty");
        }
        for (Contact contact : contactList) {
            System.out.println(contact.getName() + " " + contact.getSurname() + " " + contact.getPhone());
        }
    }

    public void deleteContact(String phone) {

        int effect = contactRepository.delete(phone);
        if (effect == 1) {
            System.out.println("dto.Contact successfully delete");
        } else {
            System.out.println("dto.Contact not exits");
        }
    }

    public void search(String query) {
        List<Contact> contactList = contactRepository.search(query);
        for (Contact contact : contactList) {
            System.out.println(contact.getName() + " " + contact.getSurname() + " " + contact.getPhone());
        }
    }
}