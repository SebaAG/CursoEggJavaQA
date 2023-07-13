package entidad;

import java.util.Arrays;

public class Array {
    private double[] vector1;
    private double[] vector2;

    public Array() {
        vector1 = new double[50];
        vector2 = new double[20];
    }

    public double[] getVector1() {
        return vector1;
    }

    public void setVector1(double[] vector1) {
        this.vector1 = vector1;
    }

    public double[] getVector2() {
        return vector2;
    }

    public void setVector2(double[] vector2) {
        this.vector2 = vector2;
    }

    @Override
    public String toString() {
        return  "El Vector uno es: " + Arrays.toString(vector1) + "\n" +
                "El Vector dos es: " + Arrays.toString(vector2);
    }
}