package cse2010.hw2;

/*
 * DO NOT MODIFY THIS INTERFACE!!!
 */

/**
 * Represents a sparse matrix.
 * A sparse matrix is a matrix in which most of the elements are zero.
 * In the context of this assignment, a sparse matrix is represented as a list of Entry objects.
 * An Entry object represents a non-zero element in the matrix
 */
public interface SparseMatrix {

    /**
     * Transpose the matrix.
     *
     * @return a new SparseMatrix object that is the transpose of this matrix
     */
    SparseMatrix transpose();

    /**
     * Add aMatrix to this matrix.
     *
     * @param aMatrix SparseMatrix to be added
     * @return a new SparseMatrix object that is the sum of this matrix and aMatrix
     */
    SparseMatrix add(SparseMatrix aMatrix);

    /**
     * Multiply aMatrix to this matrix.
     *
     * @param aMatrix a SparseMatrix to be multiplied
     * @return a new SparseMatrix object that is the product of this matrix and aMatrix
     */
    // You don't have to implement multiply.
    SparseMatrix multiply(SparseMatrix aMatrix);

    /**
     * Get the number of rows of the matrix.
     *
     * @return the number of rows of the matrix
     */
    int getRowCount();

    /**
     * Get the number of columns of the matrix.
     *
     * @return the number of columns of the matrix
     */
    int getColumnCount();

    /**
     * Get the number of non-zero elements in the matrix.
     *
     * @return the number of non-zero elements in the matrix
     */
    int getElemCount();
}
