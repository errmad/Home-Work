package errmad.homework;

public class Vector<myVector, yourVector> {
    private double x;
    private double y;
    private double z;


    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    public double getVectorLength() {
        return Math.sqrt((x*x + y*y + z*z));
    }

    public double getScalarProduct(Vector vector) {
        return x  *  vector.x + y * vector.y + z * vector.z;

    }

    public Vector getCrossProduct(Vector vector){
        return new Vector (y * vector.z - vector.y * z, z * vector.x - vector.z * x, x * vector.y - vector.x * y);
    };

    double getCos(Vector vector) {
        return (getScalarProduct(vector) / (vector.getVectorLength() * this.getVectorLength()));
    }

    Vector getSum(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    Vector getDifference(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    @Override public int hashCode() {
        return (int) getVectorLength();
    }
    @Override public boolean equals(Object vector) {
        if (getClass() != vector.getClass()) {
            return false;
        }
        Vector aVector = (Vector) vector;
        if (hashCode() != aVector.hashCode()) {
            return false;
        }
        return x == aVector.x && y == aVector.y && z == aVector.z;
    }
    @Override public String toString() {
        return x + " " + y + " " + z;
    }
}
