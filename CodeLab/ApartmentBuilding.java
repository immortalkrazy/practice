/*Assume the existence of a Building class .
Define a subclass, ApartmentBuilding that contains the following instance variables :
an integer , numFloors, an integer , unitsPerFloor, a boolean , hasElevator,
a boolean , hasCentralAir, and a string ,managingCompany
containing the name of the real estate company managing the building.
There is a constructor containing parameters for the initialization of the above
variables (in the same order as they appear above).
There are also two methods : the first, getTotalUnits, accepts no parameters and
returns the total number of units in the building; the second, isLuxuryBuilding
accepts no parameters and returns true if the building has central air,
an elevator and 2 or less units per floor.*/
class Building{}
public class ApartmentBuilding extends Building{
  private int numFloors;
  private int unitsPerFloor;
  private boolean hasElevator;
  private boolean hasCentralAir;
  private String realEstateCompany;

  public ApartmentBuilding(int numFloors, int unitsPerFloor, boolean hasElevator,
                           boolean hasCentralAir, String realEstateCompany){
    this.numFloors = numFloors;
    this.unitsPerFloor = unitsPerFloor;
    this.hasElevator = hasElevator;
    this.hasCentralAir = hasCentralAir;
    this.realEstateCompany = realEstateCompany;
  }
  public int getTotalUnits(){
    return numFloors * unitsPerFloor;
  }
  public boolean isLuxuryBuilding(){
    if (hasElevator && hasCentralAir && unitsPerFloor <= 2){
      return true;
    }
    else{
      return false;
    }
  }
}
