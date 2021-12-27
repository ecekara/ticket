package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    /* Validate Login information customer number and cargo number */

    public void getLogin() throws IOException {
        int x = 1;

        do {
            try {
                /*
                 * Accounts in a HashMap, key = customer number, value = cargo number
                 * number
                 */
                data.put(123456789, 1234);
                data.put(123456780, 1230);
                System.out.println(TicketMessageConstants.MESSAGE_BORDER);
                System.out.println(TicketMessageConstants.WELCOME);

                System.out.print(TicketMessageConstants.ENTER_CUSTOMER_NUMBER);
                setCustomerNumber(menuInput.nextInt());

                System.out.print(TicketMessageConstants.ENTER_CARGO_NUMBER);
                setCargoNumber(menuInput.nextInt());

            } catch (Exception e) {
                System.out.println("\n" + TicketMessageConstants.INVALID_CHAR + "\n");
                x = 2;
            }
            for (Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getCargoNumber()) {
                    getComplaintType();
                }
            }
            System.out.println("\n" + TicketMessageConstants.WRONG_NUMBER + "\n");
        } while (x == 1);
    }

    /* Display Account Type Menu with selection */

    public void getComplaintType() {
        System.out.println(TicketMessageConstants.MESSAGE_BORDER);
        System.out.println(TicketMessageConstants.SELECT);
        System.out.println(TicketMessageConstants.TYPE_1);
        System.out.println(TicketMessageConstants.TYPE_2);
        System.out.println(TicketMessageConstants.TYPE_3);
        System.out.println(TicketMessageConstants.TYPE_4);
        System.out.print(TicketMessageConstants.COICE);

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getReturnComplaint();
                break;

            case 2:
                getFaultyProduct();
                break;

            case 3:
                getLostCargo();
                break;

            case 4:
                System.out.println(TicketMessageConstants.THANKS);
                break;

            default:
                System.out.println("\n" + TicketMessageConstants.INVALID_COICE + "\n");
                getComplaintType();
        }
    }

    int selection;
}
