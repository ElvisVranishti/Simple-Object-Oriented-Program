//Elvis Vranishti
public abstract class TaxiFleet {
    private int m_year;
    private String m_city;
    private String m_state;
    //2 constructors
    public TaxiFleet(String city, String state, int year) {
        m_city = city;
        m_state = state;
        m_year = year;
    }
    public TaxiFleet() {
    }
    //getters & setters
    public void setYear(int year) {this.m_year = year;}
    public void setCity(String city) {this.m_city = city;}
    public void setState(String state) {this.m_state = state;}
    public String getCity() {return m_city;}
    public String getState() {return m_state;}
    public int getYear() {return this.m_year;}
    //3 abstract methods

    public abstract boolean isSedan();
    public abstract boolean isSUV();
    public abstract boolean isTruck();
    public abstract String toString();


}
