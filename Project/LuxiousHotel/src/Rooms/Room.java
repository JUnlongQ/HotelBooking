package Rooms;

public abstract class Room {
  private int roomNumber; // a 3-digit number
  private RoomType roomType;
  private final double price;
  private boolean VIP;
  private int nightsOfStaying;

  protected Room(int roomNumber, RoomType roomType, double price, int nightsOfStaying, boolean VIP) {
    this.roomNumber = roomNumber;
    this.roomType = roomType;
    this.VIP = VIP;
    this.price = VIP ? price * 0.95 : price;
    this.nightsOfStaying = nightsOfStaying;
  }

  /**
   * going to be used with a combo box
   * @param nightsOfStaying nights staying
   */
  public void setNightsOfStaying(int nightsOfStaying){
    if(this.nightsOfStaying <= nightsOfStaying) throw new IllegalArgumentException("Can't change to this number");
    this.nightsOfStaying = nightsOfStaying;
  }


}
