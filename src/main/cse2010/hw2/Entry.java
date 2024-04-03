package cse2010.hw2;

/*
 * DO NOT MODIFY THIS CLASS!
 */

/**
 * Represents an entry in a sparse matrix.
 * An entry consists of a row index, a column index, and a value.
 */
public class Entry {
    /**
     * The row index of this entry.
     */
    private int row;
    /**
     * The column index of this entry.
     */
    private int col;

    /**
     * The value of this entry.
     */
    private double value;

    /**
     * Constructs an Entry object with the given row, column, and value.
     *
     * @param row   The row index of this entry.
     * @param col   The column index of this entry.
     * @param value The value of this entry.
     */
    public Entry(int row, int col, double value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }

    /**
     * Constructs an Entry object with the same row, column, and value as the given Entry object.
     *
     * @param other The Entry object to copy.
     */
    public Entry(Entry other) {
        this.row = other.row;
        this.col = other.col;
        this.value = other.value;
    }

    /**
     * Compares this Entry object with the specified object for equality.
     *
     * @param o The object to compare.
     * @return true if the specified object is equal to this Entry object; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entry entry)) return false;
        return row == entry.row &&
                col == entry.col &&
                Double.compare(entry.value, value) == 0;
    }

    /**
     * Returns a row index of this entry.
     *
     * @return The row index of this entry.
     */
    public int getRow() {
        return row;
    }

    /**
     * Set the row index of this entry.
     *
     * @param row The row index to set.
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * Returns a column index of this entry.
     *
     * @return The column index of this entry.
     */
    public int getCol() {
        return col;
    }

    /**
     * Set the column index of this entry.
     *
     * @param col The column index to set.
     */
    public void setCol(int col) {
        this.col = col;
    }

    /**
     * Returns a value of this entry.
     *
     * @return The value of this entry.
     */
    public double getValue() {
        return value;
    }

    /**
     * Set the value of this entry.
     *
     * @param value The value to set.
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Returns a string representation of this entry.
     *
     * @return A string representation of this entry.
     */
    @Override
    public String toString() {
        return "(" + row + ", " + col + ", " + value + ")";
    }
}
