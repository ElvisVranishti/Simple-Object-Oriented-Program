//Elvis Vranishti
public class ToyotaRoutes extends ToyotaFleet implements Sales{
    private int m_tripMileage;
    private String m_pickUpLocation;
    private String m_dropOffLocation;
    private double m_rate;
    private boolean m_roundTrip;
    private double m_totalMileage;
    private double m_price;
    public ToyotaRoutes(int StartingMileage) {
        super(StartingMileage);
    }
    public ToyotaRoutes(String pickUpLocation, String dropOffLocation, int StartingMileage, int tripMileage, double rate, boolean roundTrip) {
        super(StartingMileage);
        this.m_roundTrip = roundTrip;
        this.m_pickUpLocation = pickUpLocation;
        this.m_dropOffLocation = dropOffLocation;
        this.m_tripMileage = tripMileage;
        this.m_rate = rate;
    }

    @Override
    public double getTripCost() {
        return m_tripMileage * m_rate;
    }

    public boolean isRoundTrip() {
        if(m_roundTrip == true) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isMajorTrip() {
        if(m_tripMileage >= 50) {
            return true;
        }
        else {
            return false;
        }
    }

    public double totalMileage() {
        if(m_roundTrip == true) {
            m_totalMileage = m_tripMileage * 2;
        }
        else {
            return m_totalMileage = m_tripMileage * m_rate;
        }
        return m_totalMileage;
    }
    public double totalMileageCalc() {
        return getStartingMileage() + m_totalMileage;
    }
    public double priceCalc() {
        if(m_roundTrip == true) {
            m_price = m_tripMileage * m_rate * 2;
        }
        else {
            m_price = m_tripMileage * m_rate;
        }
        return m_price;
    }

    public void setM_roundTrip(boolean roundTrip) {
        this.m_roundTrip = roundTrip;
    }

    public double getM_totalMileage() {
        return m_totalMileage;
    }

    public void setM_totalMileage(double totalMileage) {
        this.m_totalMileage = totalMileage;
    }

    public double getM_price() {
        return m_price;
    }

    public void setM_price(double price) {
        this.m_price = price;
    }

    public String getM_dropOffLocation() {
        return m_dropOffLocation;
    }

    public void setM_dropOffLocation(String dropOffLocation) {
        this.m_dropOffLocation = dropOffLocation;
    }

    public String getM_pickUpLocation() {
        return m_pickUpLocation;
    }

    public void setM_pickUpLocation(String pickUpLocation) {
        this.m_pickUpLocation = pickUpLocation;
    }
}
