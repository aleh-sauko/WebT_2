package by.epam.lw02.view;

import by.epam.lw02.controller.NoBuilderException;
import by.epam.lw02.controller.SubscriptionController;
import by.epam.lw02.dto.constant.UserCommand;
import by.epam.lw02.dto.subscription.edition.JournalDTO;
import by.epam.lw02.dto.subscription.edition.PrintedEditionDTO;
import by.epam.lw02.dto.subscription.edition.ScientificLiteratureDTO;
import by.epam.lw02.dto.subscription.type.InternetSubscriptionDTO;
import by.epam.lw02.dto.subscription.type.MailSubscriptionDTO;
import by.epam.lw02.dto.subscription.type.SubscriptionTypeDTO;

/**
 * Created by aleh on 08.03.14.
 */
public class SubscriptionView {

    private SubscriptionController subscriptionController = SubscriptionController.getInstance();

    public void invokeUserCommand(UserCommand command) {
        switch (command) {
            case CREATE_LIVE_HACK_BUILDER:
                createLiveHackBuilder();
                break;
            case CREATE_HACKER_BUILDER:
                createHackerBuilder();
                break;
            case DISPLAY_SUBSCRIPTION:
                displaySubscription();
                break;
        }
    }

    private void createLiveHackBuilder() {
        JournalDTO journalDTO = new JournalDTO();
        journalDTO.name = "Live Hack";
        journalDTO.forWhom = "Youth, Modern people";
        journalDTO.periodicity = "Weekly";
        journalDTO.author = "Live Hack company";
        journalDTO.countPages = 137;
        journalDTO.language = "English";
        journalDTO.pictured = true;
        journalDTO.material = "Paper";
        journalDTO.yearOfPublication = 2014;

        MailSubscriptionDTO mailDTO = new MailSubscriptionDTO();
        mailDTO.publisher = "Hacker company";
        mailDTO.subscriber = "Savko Oleg";
        mailDTO.price = 25;
        mailDTO.country = "Belarus";
        mailDTO.city = "Minsk";
        mailDTO.address = "Dzerjinskogo 95";
        subscriptionController.createLiveHackBuilder();

        try {
            createNewSubscription(journalDTO, mailDTO);
        } catch (ClassCastException ex) {
            System.out.println("FATAL ERROR : " + ex.getMessage());
        }
    }

    private void createHackerBuilder() {
        ScientificLiteratureDTO scientificLiteratureDTO = new ScientificLiteratureDTO();
        scientificLiteratureDTO.name = "Live Hack";
        scientificLiteratureDTO.author = "Live Hack company";
        scientificLiteratureDTO.countPages = 137;
        scientificLiteratureDTO.language = "English";
        scientificLiteratureDTO.pictured = true;
        scientificLiteratureDTO.material = "Paper";
        scientificLiteratureDTO.yearOfPublication = 2014;
        scientificLiteratureDTO.levelKnowledge = "Intermediate";
        scientificLiteratureDTO.department = "Computer Science";

        InternetSubscriptionDTO internetDTO = new InternetSubscriptionDTO();
        internetDTO.publisher = "Hacker company";
        internetDTO.subscriber = "Savko Oleg";
        internetDTO.price = 25;
        internetDTO.mail = "aleh.sauko@gmail.com";
        internetDTO.webPay = "Easy Pay";
        internetDTO.source = "www.test.com";
        subscriptionController.createHackerBuilder();

        try {
            createNewSubscription(scientificLiteratureDTO, internetDTO);
        } catch (ClassCastException ex) {
            System.out.println("FATAL ERROR : " + ex.getMessage());
        }
    }

    private void createNewSubscription(PrintedEditionDTO editionDTO, SubscriptionTypeDTO typeDTO) {
        try {
            subscriptionController.createNewSubscription(editionDTO, typeDTO);
        } catch (NoBuilderException e) {
            System.out.println(e);
        }
    }

    private void displaySubscription() {
        try {
            System.out.println(subscriptionController.getSubscription());
        } catch (NoBuilderException e) {
            System.out.println(e);
        }
    }
}
