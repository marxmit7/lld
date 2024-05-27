package parking_lot.src.com.parking_lot;

public class ParkingTicket{

    private String ticketId;
    private String issuedAt;
    private String paidAt;
    private double totalAmount;
    private ConcreteRateCalculator rateCalculator;
    private ParkingSpotType parkingSpotType;
    private TicketState ticketState;


    public ParkingTicket(ParkingSpotType parkingSpotType, String ticketId){
        this.ticketId = ticketId;
        this.issuedAt = "now";
        this.rateCalculator = new ConcreteRateCalculator();
        this.ticketState = TicketState.UNPAID;
    }

    public double calculateTotal(){
        totalAmount = rateCalculator.calculateRate(parkingSpotType, calculateDuration());
        return totalAmount;
    }

    public double calculateDuration(){
        return 5.0;
    }

}