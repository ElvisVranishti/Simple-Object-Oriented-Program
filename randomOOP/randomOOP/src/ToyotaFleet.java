//Elvis Vranishti
public class ToyotaFleet extends TaxiFleet {
    private int m_numOfPassengers;
    private String m_color;
    private int m_startingMileage;
    private String m_model;


    public ToyotaFleet(int StartingMileage) {}
    public ToyotaFleet(String model, String color, int numOfPassengers, int startingMileage) {
        this.m_model = model;
        this.m_color = color;
        this.m_numOfPassengers = numOfPassengers;
        this.m_startingMileage = startingMileage;
    }

    //implement abstract methods
    @Override
    public boolean isSedan() {
        if(m_model == "Corolla") {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public boolean isSUV() {
        if(m_model == "RAV4") {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public boolean isTruck() {
        if(m_model == "Tundra") {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return null;
    }

    //Concrete Methods
    public boolean isNewCar() {
        if(m_startingMileage <= 50) {
            return true;
        }
        else {
            return false;
        }
    }
    public void setStartingMileage(int StartingMileage) {this.m_startingMileage = StartingMileage;}
    public int getStartingMileage() {return m_startingMileage;}

    public void setModel(String model) {this.m_model = model;}
    public String getModel() {return m_model;}

}
