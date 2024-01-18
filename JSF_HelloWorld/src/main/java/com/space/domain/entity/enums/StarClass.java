package com.space.domain.entity.enums;

public enum StarClass {
    O(30000,Integer.MAX_VALUE, 30000,  Double.MAX_VALUE, 16, Double.MAX_VALUE, 6.6, Double.MAX_VALUE),
    B(10000, 30000, 25, 30000, 2.1, 16,  1.8, 6.6),
    A(7500, 10000, 5, 25, 1.4 , 2.1, 1.4, 1.8),
    F(6000, 7500, 1.5, 5, 1.04, 1.4, 1.15, 1.4),
    G(5200, 6000, 0.6, 1.5, 0.8, 1.04, 0.96, 1.15),
    K(3700, 5200, 0.08, 0.6, 0.45, 0.8, 0.7, 0.96),
    M(2400, 3700, Double.MIN_VALUE, 0.08, 0.08, 0.45, Double.MIN_VALUE, 0.7);

    private final int minTemperature;
    private final int maxTemperature;
    private final double minLuminosity;
    private final double maxLuminosity;
    private final double minMass;
    private final double maxMass;
    private final double minSize;
    private final double maxSize;

    StarClass(int minTemperature, int maxTemperature, double minLuminosity, double maxLuminosity,
              double minMass, double maxMass, double minSize, double maxSize) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.minLuminosity = minLuminosity;
        this.maxLuminosity = maxLuminosity;
        this.minMass = minMass;
        this.maxMass = maxMass;
        this.minSize = minSize;
        this.maxSize = maxSize;
    }


    public boolean isInRange(int temperature, double luminosity, double mass, double size) {
        return temperature >= minTemperature && temperature <= maxTemperature &&
                luminosity >= minLuminosity && luminosity <= maxLuminosity &&
                mass >= minMass && mass <= maxMass &&
                size >= minSize && size <= maxSize;
    }
}
