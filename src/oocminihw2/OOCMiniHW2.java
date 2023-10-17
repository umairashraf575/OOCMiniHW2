/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    public static void main(String[] args) {
        // Instantiate a Vehicle object

        Drivable car = new Drivable() {
            private float speed = 0;

            @Override
            public void accelerate(float speed) {
                this.speed += speed;
            }

            @Override
            public void brake() {
                this.speed = 0;
            }

            @Override
            public void turn(float angle) {
                // Implement the turn method
            }

            @Override
            public float getDirection() {
                // Implement the getDirection method
                return 0; // Return a default value
            }

            @Override
            public float getSpeed() {
                return speed;
            }

            @Override
            public String getMake() {
                // Implement the getMake method
                return null; // Return a default value
            }

            @Override
            public String getType() {
                // Implement the getType method
                return null; // Return a default value
            }
        };

        // Instantiate a Sailable object
        Sailable sailboat = new Sailable() {
            private boolean sailHoisted = false;

            @Override
            public void hoistSail() {
                sailHoisted = true;
            }

            @Override
            public void lowerSail() {
                sailHoisted = false;
            }

            @Override
            public boolean isSailHoisted() {
                return sailHoisted;
            }

            @Override
            public void landHo() {
                // Implement the landHo method
            }
        };

        // Instantiate a Flyable object
        Flyable airplane = new Flyable() {
            private float altitude = 0;

            @Override
            public void changeAltitude(float change) {
                altitude += change;
            }

            @Override
            public float getAltitude() {
                return altitude;
            }

            @Override
            public void accelerate(float speed) {
                // Implement the accelerate method
            }

            @Override
            public void brake() {
                // Implement the brake method
            }

            @Override
            public void turn(float angle) {
                // Implement the turn method
            }

            @Override
            public float getDirection() {
                // Implement the getDirection method
                return 0; // Return a default value
            }

            @Override
            public float getSpeed() {
                // Implement the getSpeed method
                return 0; // Return a default value
            }

            @Override
            public String getMake() {
                // Implement the getMake method
                return null; // Return a default value
            }

            @Override
            public String getType() {
                // Implement the getType method
                return null; // Return a default value
            }
        };

        MyVehicle myVehicle = new MyVehicle("MyCar", "Sedan", 4);
    }
}
