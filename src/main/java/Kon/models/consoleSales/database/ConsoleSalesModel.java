package Kon.models.consoleSales.database;

import javax.persistence.*;

@Entity
@Table(name = "console_sales")
public class ConsoleSalesModel {
    @Id // This is the primary key of the table, it is also autogenerated.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String consoleId;
    @Column
    private String consoleName;
    @Column
    private String manufacturer;
    @Column
    private int releaseYear;
    @Column
    private double sales;

    public ConsoleSalesModel() {

    }

    public int getId() {
        return id;
    }

    public String getConsoleId() {
        return consoleId;
    }

    public void setConsoleId(String consoleId) {
        this.consoleId = consoleId;
    }

    public String getConsoleName() {
        return consoleName;
    }

    public void setConsoleName(String consoleName) {
        this.consoleName = consoleName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
}