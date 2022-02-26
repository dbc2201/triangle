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
        return false;
    }

    private boolean areAllSidesGreaterThanZero() {
        return false;
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
