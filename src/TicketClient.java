public class TicketClient {
    public static void main(String[] args){
        // 3 Cases for Ticket
        Ticket one = new Ticket(1);
        System.out.println(one);

        Ticket oneTwo = new Ticket(2);
        System.out.println(oneTwo);

        Ticket oneThree = new Ticket(3);
        System.out.println(oneThree);

        // 3 Cases for WalkupTicket
        Ticket two = new WalkupTicket(4);
        System.out.println(two);

        Ticket twoTwo = new WalkupTicket(5);
        System.out.println(twoTwo);

        Ticket twoThree = new WalkupTicket(6);
        System.out.println(twoThree);

        // 3 Cases for AdvanceTicket
        Ticket three = new AdvanceTicket(7, 50, 24);
        System.out.println(three);

        Ticket threeTwo = new AdvanceTicket(8, 50, 20);
        System.out.println(threeTwo);

        Ticket threeThree = new AdvanceTicket(9, 50, 7);
        System.out.println(threeThree);

        // 3 Cases for StudentAdvanceTicket
        Ticket four = new StudentAdvanceTicket(10, 50, 24);
        System.out.println(four);

        Ticket fourTwo = new StudentAdvanceTicket(11, 50, 20);
        System.out.println(fourTwo);

        Ticket fourThree = new StudentAdvanceTicket(12, 50, 7);
        System.out.println(fourThree);
    }
}