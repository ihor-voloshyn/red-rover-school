package lesson13.tasks_13_03;

//https://www.codewars.com/kata/building-blocks/train/java
public class Block {
    private int width;
    private int length;
    private int height;

    public Block(int[] side) {
        this.width = side[0];
        this.length = side[1];
        this.height = side[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return 2 * (width * length + length * height + height * width);
    }
}
