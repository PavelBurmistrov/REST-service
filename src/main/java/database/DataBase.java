package database;

import javax.persistence.*;

@Entity
@Table(schema = "public", name = "database")
public class DataBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Query", nullable = false)
    private double width;
    private double height;

    @Column(name = "Response", nullable = false)
    private double square_value;
    private double perimeter_value;

    public DataBase() {
    }

    public DataBase(Integer id, double width, double height, double square_value, double perimeter_value) {
        this.id = id;
        this.width = width;
        this.height = height;
        this.square_value = square_value;
        this.perimeter_value = perimeter_value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSquare_value() {
        return square_value;
    }

    public void setSquare_value(double square_value) {
        this.square_value = square_value;
    }

    public double getPerimeter_value() {
        return perimeter_value;
    }

    public void setPerimeter_value(double perimeter_value) {
        this.perimeter_value = perimeter_value;
    }
}

