package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account implements IComplaint {

    /* Set the customer number */

    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    /* Get the customer number */

    public int getCustomerNumber() {
        return customerNumber;
    }

    /* Set the cargo number */

    public int setCargoNumber(int cargoNumber) {
        this.cargoNumber = cargoNumber;
        return cargoNumber;
    }

    /* Get the cargo number */

    public int getCargoNumber() {
        return cargoNumber;
    }

    @Override
    public void getReturnComplaint() {

        List<String> descriptionList = new ArrayList<>();

        System.out.println(TicketMessageConstants.RETURN_HEADER);
        System.out.println(TicketMessageConstants.NAME_SURNAME);
        Scanner userInput = new Scanner(System.in);
        descriptionName = userInput.nextLine();

        System.out.println(TicketMessageConstants.RETURN_DESCRIPTION);
        description = userInput.nextLine();
        //We able to set description list to database by saveAll,
        //if we need create a report return complaint messages!
        descriptionList.add(description);

        System.out.println(TicketMessageConstants.MESSAGE_BORDER);
        System.out.println(TicketMessageConstants.RETURN_MESSAGE);
        System.out.println(TicketMessageConstants.MESSAGE_BORDER);
        OptionMenu optionMenu = new OptionMenu();


        optionMenu.getComplaintType();

    }

    @Override
    public void getFaultyProduct() {

        List<String> descriptionList = new ArrayList<>();

        System.out.println(TicketMessageConstants.FAULTY_PRODUCT);
        System.out.println(TicketMessageConstants.NAME_SURNAME);
        Scanner userInput = new Scanner(System.in);
        descriptionName = userInput.nextLine();
        System.out.println(TicketMessageConstants.FAULTY_DESCRIPTION);
        description = userInput.nextLine();
        //We able to set description list to database by saveAll,
        //if we need create a report return complaint messages!
        descriptionList.add(description);

        System.out.println(TicketMessageConstants.MESSAGE_BORDER);
        System.out.println(TicketMessageConstants.FAULT_MESSAGE);
        System.out.println(TicketMessageConstants.MESSAGE_BORDER);
        OptionMenu optionMenu = new OptionMenu();
        optionMenu.getComplaintType();
    }

    @Override
    public void getLostCargo() {

        List<String> descriptionList = new ArrayList<>();

        System.out.println(TicketMessageConstants.LOST_PRODUCT);
        System.out.println(TicketMessageConstants.NAME_SURNAME);
        Scanner userInput = new Scanner(System.in);
        descriptionName = userInput.nextLine();
        System.out.println(TicketMessageConstants.LOST_DESCRIPTION);
        description = userInput.nextLine();
        //We able to set description list to database by saveAll,
        //if we need create a report return complaint messages!
        descriptionList.add(description);

        System.out.println(TicketMessageConstants.MESSAGE_BORDER);
        System.out.println(TicketMessageConstants.LOST_MESSAGE);
        System.out.println(TicketMessageConstants.MESSAGE_BORDER);
        OptionMenu optionMenu = new OptionMenu();
        optionMenu.getComplaintType();
    }

    private int customerNumber;
    private int cargoNumber;
    String description;
    String descriptionName;
}