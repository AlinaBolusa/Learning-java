package lv.acodemy.classroom;

public class Car {
    // Class fields
    private String carModel;
    private String model;
    private int productionYear;
    private double mileage;
    private String color;
    private boolean isRunning = false;

    public Car(String carModel, String model, int productionYear, double mileage, String color) {
        this.carModel = carModel;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.color = color;
    }

    public Car() {
    }

    private Car(CarBuilder builder) {
        this.carModel = builder.carModel;
        this.model = builder.model;
        this.productionYear = builder.productionYear;
        this.mileage = builder.mileage;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", isRunning=" + isRunning +
                '}';
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("The car has started.");
        } else {
            System.out.println("The car is already running.");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("The car has stopped.");
        } else {
            System.out.println("The car is already stopped.");
        }
    }

    public void drive(double kilometers) {
        if (isRunning) {
            this.mileage = this.mileage + kilometers;
            System.out.printf("The car has driven %.2f kilometers. Total mileage is: %.2f %n", kilometers, this.mileage);
        }
    }

    // Getters

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    // Setters

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Inner Builder class
    public static class CarBuilder {
        private String carModel;
        private String model;
        private int productionYear;
        private double mileage;
        private String color;

        public CarBuilder() {
        }

        public CarBuilder setCarModel(String carModel) {
            this.carModel = carModel;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setProductionYear(int productionYear) {
            this.productionYear = productionYear;
            return this;
        }

        public CarBuilder setMileage(double mileage) {
            this.mileage = mileage;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
