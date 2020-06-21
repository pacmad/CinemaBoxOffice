/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.controller.CreateFile;
import ec.edu.espe.cinemaboxoffice.utils.Keyboard;
import java.util.ArrayList;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Billboard {

    private Room room;
    private Admin admin;

    ArrayList<Movie> movies = new ArrayList();
    ArrayList<Promotion> promotions = new ArrayList();
    ArrayList<Seat> seats = new ArrayList();

    CreateFile onScreen = new CreateFile();
    Keyboard in = new Keyboard();

    public void billboardMenu() {
        Ticket ticket;
        boolean repeat = false;
        do {
            System.out.println(" 1: List movies \n 2: Promotions \n 3: Exit");
            int option = in.getInt("Please, enter an option: ", 1);
            switch (option) {
                case 1:
                    showMoviesList();
                    String selection = in.getString("choose the title movie: ");
                    ticket = new Ticket(chooseMovieAndSeat(selection), selection, "", 0);
                    System.out.println(ticket.toString());
                    break;
                case 2:
                    showPromotions();
                    break;
                case 3:
                    repeat = true;
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        } while (repeat == false);
    }

    public void showMoviesList() {
        onScreen.printInConsole(movies);
    }

    public void showPromotions() {
        onScreen.printInConsole2(promotions);
    }

    public String chooseMovieAndSeat(String selection) {
        boolean repeat = false;
        String chosenSeat;
        onScreen.writeControlSeats(selection, seats);
        onScreen.printControlSeats(selection, seats);
        do {
            chosenSeat = in.getString("choose the number of seat: ");
            int aux = Integer.parseInt(chosenSeat);
            if (aux > 0 & aux < 51) {
                chosenSeat = chosenSeat + "VPI";
                seats.add(new Seat(selection, chosenSeat, true));
                repeat = true;
            }
            if (aux > 50 & aux < 101) {
                chosenSeat = chosenSeat + "STD";
                seats.add(new Seat(selection, chosenSeat, true));
                repeat = true;
            }
            if (aux>100 | aux<1){
                System.out.println("incorrect number seat, please log in again");
            }
        } while (repeat = false);
        onScreen.writeControlSeats(selection, seats);
        return chosenSeat;
    }

    public void showPriceRoomAndSeat() {

    }

    public void choosePromotion() {

    }

    public void chooseSeat() {

    }

    public void generateTicket() {

    }
}
