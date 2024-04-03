package cse2010.hw2;

/**
 * Represent an array implementation of a sparse matrix.
 * In the context of this assignment, a sparse matrix is represented as an array of Entry objects.
 */
public class ArraySparseMatrix implements SparseMatrix {

    /**
     * The array of Entry objects.
     */
    private Entry[] elements = new Entry[0];

    /**
     * Constructs an ArraySparseMatrix object with the given capacity.
     *
     * @param capacity The capacity of the array.
     */
    public ArraySparseMatrix(int capacity) {
        elements = new Entry[capacity];

        /*
         * your code goes here if necessary
         */
    }

    /**
     * Create a SparseMatrix object from a two-dimensional array.
     * This routine simulates reading from files using two-dimensional matrix.
     *
     * @param aMatrix The two-dimensional array to be converted to a SparseMatrix object.
     * @return a SparseMatrix object created from the given two-dimensional array.
     */
    public static SparseMatrix from(double[][] aMatrix) {

        /*
         * your code goes here
         */

        return null;
    }

    /**
     * Transpose the matrix.
     *
     * @ return a new SparseMatrix object that is the transpose of this matrix
     */
    @Override
    public SparseMatrix transpose() {

        /*
         *   Your code goes here
         */

        return null;
    }

    /**
     * Add aMatrix to this matrix.
     *
     * @param other SparseMatrix to be added
     * @return a new SparseMatrix object that is the sum of this matrix and other matrix
     * @throws IllegalArgumentException if the size of the matrix doesn't match
     */
    @Override
    public SparseMatrix add(SparseMatrix other) {
        if (this.getRowCount() != other.getRowCount() || this.getColumnCount() != other.getColumnCount())
            throw new IllegalArgumentException("Matrix size doesn't match");

        /*
         *  Your code goes here
         */

        return null;
    }

    /**
     * Multiply this matrix with other matrix.
     * YOU DON'T HAVE TO IMPLEMENT THIS METHOD.
     *
     * @param other a SparseMatrix to be multiplied
     * @return a new SparseMatrix object that is the product of this matrix and other matrix
     * @throws IllegalStateException if dimensions of the matrices are not compatible for multiplication
     */
    @Override
    public SparseMatrix multiply(SparseMatrix other) {
        throw new IllegalStateException("Not implemented");
    }

    /**
     * Get the array of Entry objects.
     *
     * @return the array of Entry objects
     */
    public Entry[] getElements() {
        return elements;
    }

    /**
     * Get the number of rows of the matrix.
     *
     * @return the number of rows of the matrix
     */
    @Override
    public int getRowCount() {
        /*
         *  Your code goes here
         */
        return 0;
    }

    /**
     * Get the number of columns of the matrix.
     *
     * @return the number of columns of the matrix
     */
    @Override
    public int getColumnCount() {
        /*
         *  Your code goes here
         */
        return 0;
    }

    /**
     * Get the number of non-zero elements in the matrix.
     *
     * @return the number of non-zero elements in the matrix
     */
    @Override
    public int getElemCount() {
        /*
         *  Your code goes here
         */
        return 0;
    }

    /**
     * Compares this ArraySparseMatrix object with the specified object for equality.
     *
     * @param obj The object to compare.
     * @return true if the specified object is equal to this ArraySparseMatrix object; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ArraySparseMatrix other)) return false;

        if (getRowCount() != other.getRowCount()
                || getColumnCount() != other.getColumnCount()
                || getElemCount() != other.getElemCount())
            return false;

        for (int i = 0; i < elements.length; i++) {
            if (!elements[i].equals(other.elements[i])) return false;
        }
        return true;
    }

    /**
     * DO NOT MODIFY THIS METHOD!!!
     * Returns a string representation of the ArraySparseMatrix object.
     *
     * @return a string representation of the ArraySparseMatrix object
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        // print meta
        builder.append(elements[0].getRow() + "\t" + elements[0].getCol() + "\t" + (int) elements[0].getValue() + "\n");

        // print elements
        for (int i = 1; i <= getElemCount(); i++)
            builder.append(elements[i] + "\n");

        return builder.toString();
    }
}
