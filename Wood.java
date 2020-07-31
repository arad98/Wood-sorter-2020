/**
 * class holds data for a wood object to be sorted
 * all length measures will be imperial units
 * all weights will be in imperial units
 */
public class Wood implements Comparable{
    private double length;
    private double width;
    private double height;
    private int weight;

    public Wood() {
        setLength(0);
        setHeight(0);
        setWidth(0);
        setWeight(0);
    }

    public Wood(double l,double w,double h,int weight) {
        setLength(l);
        setHeight(w);
        setWidth(h);
        setWeight(weight);
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String toString() {
        return getHeight() + " in," + getWidth() + " in," + getLength() + " ft," + getWeight() + " lb's ";
    }

    @Override
    public int compareTo(Object o) {
        int compareWeight = ((Wood)o).getWeight();
        return this.getWeight()-compareWeight;
    }


}
