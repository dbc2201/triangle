class Triangle {

    private final double side1;
    private final double side2;
    private final double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (!isTriangle()) {
            throw new TriangleException();
        }
    }

    /**
     * Returns true if the triangle is a triangle, false otherwise
     *
     * @return false
     */
    private boolean isTriangle() {
        return areAllSidesGreaterThanZero() && doesTriangleFollowsSumOfSidesProperty();
    }

    /**
     * Returns true if all sides of the triangle are greater than zero.
     *
     * @return false
     */
    private boolean areAllSidesGreaterThanZero() {
        return Double.compare(side1, 0.0) > 0.0 &&
                Double.compare(side2, 0.0) > 0.0 &&
                Double.compare(side3, 0.0) > 0.0;
    }

    /**
     * It checks if the triangle follows the sum of sides property.
     *
     * @return Nothing is being returned.
     */
    private boolean doesTriangleFollowsSumOfSidesProperty() {
        return Double.compare(side1 + side2, side3) > 0.0 &&
                Double.compare(side2 + side3, side1) > 0.0 &&
                Double.compare(side3 + side1, side2) > 0.0;
    }

    boolean isEquilateral() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    boolean isIsosceles() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    boolean isScalene() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
