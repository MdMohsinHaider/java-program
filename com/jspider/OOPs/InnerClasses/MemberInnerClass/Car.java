package com.jspider.OOPs.InnerClasses.MemberInnerClass;

/**
 * The {@code Car} class represents a vehicle with a specific model and engine state.
 * It demonstrates the use of a member inner class {@code Engin} to encapsulate engine-related operations.
 * <p>
 * The engine can be started or stopped via the inner class methods.
 * </p>
 *
 * <p>
 * © 2025 Md Mohsin Haider. All rights reserved.<br>
 * This source code or any portion thereof may not be reproduced or used in any manner whatsoever
 * without the express written permission of the author.<br>
 * For licensing or usage inquiries, please contact the author.
 * </p>
 *
 * @author
 * Md Mohsin Haider
 *
 * @version
 * 1.0
 *
 * @since
 * 2025
 */
public class Car {

    /**
     * The model of the car.
     */
    private String model;

    /**
     * Represents whether the car's engine is on or off.
     */
    private boolean isEnginOn;

    /**
     * Constructs a Car object with the specified model.
     *
     * @param model The model name of the car.
     */
    public Car(String model) {
        this.model = model;
        this.isEnginOn = false;
    }

    /**
     * The {@code Engin} class is a member inner class of {@code Car} that provides
     * functionalities to start and stop the engine.
     */
    class Engin {

        /**
         * Starts the engine if it is not already started.
         * Prints the current state of the engine.
         */
        void start() {
            if (!isEnginOn) {
                isEnginOn = true;
                System.out.println(model + " engine started");
            } else {
                System.out.println(model + " engine already started");
            }
        }

        /**
         * Stops the engine if it is running.
         * Prints the current state of the engine.
         */
        void stop() {
            if (isEnginOn) {
                isEnginOn = false;
                System.out.println(model + " engine stopped");
            } else {
                System.out.println(model + " engine already stopped");
            }
        }

        @Override
        public String toString() {
            return "Engin{}";
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", isEnginOn=" + isEnginOn +
                '}';
    }
}
