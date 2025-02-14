package Model;

public class Ticket {


    /**
     * This is a class that models a Ticket
     */

    public int ticket_id;
    /**
     * The date on which this ticket was drawn.
     */
    public String powerball_numbers;


    /**
     * A default, no-args constructor, as well as correctly formatted getters and setters, are needed for
     * Jackson Objectmapper to work.
     */
    public Ticket() {
    }

    /**
     * When posting a new message, the id can be generated by the database. In that case, a constructor without
     * message_id is needed.
     *
     * @param powerball_numbers
     *
     */
    public Ticket(String powerball_numbers) {
        this.powerball_numbers = " ";

    }

    /**
     * Whem retrieving a message from the database, all fields will be needed. In that case, a constructor with all
     * fields is needed.
     *
     * @param ticket_id
     * @param powerball_numbers
     */
    public Ticket(int ticket_id, String powerball_numbers) {
        this.ticket_id = ticket_id;
        this.powerball_numbers = " ";


    }

    /**
     * Properly named getters and setters are necessary for Jackson ObjectMapper to work. You may use them as well.
     *
     * @return ticket_id
     */
    public int getTicket_id() {
        return ticket_id;
    }

    /**
     * Properly named getters and setters are necessary for Jackson ObjectMapper to work. You may use them as well.
     *
     * @param ticket_id
     */
    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    /**
     * Properly named getters and setters are necessary for Jackson ObjectMapper to work. You may use them as well.
     *
     * @return powerball_numbers
     */
    public String getPowerball_numbers() {
        return this.powerball_numbers;
    }

    /**
     * Properly named getters and setters are necessary for Jackson ObjectMapper to work. You may use them as well.
     *
     * @param powerball_numbers
     */
    public void setPowerball_numbers(String powerball_numbers) {
        this.powerball_numbers = powerball_numbers;
    }




    /**
     * Overriding the default equals() method adds functionality to tell when two objects are identical, allowing
     * Assert.assertEquals and List.contains to function.
     *
     * @param o the other object.
     * @return true if o is equal to this object.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return ticket_id == ticket.ticket_id && powerball_numbers.equals(ticket.powerball_numbers);
    }

    /**
     * Overriding the default toString() method allows for easy debugging.
     *
     * @return a String representation of this class.
     */
    @Override
    public String toString() {
        return "Message{" +
                "ticket_id=" + ticket_id +
                ", powerball_numbers =" + powerball_numbers + "}";
    }

}

