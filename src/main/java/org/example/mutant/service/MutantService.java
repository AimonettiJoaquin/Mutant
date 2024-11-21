package org.example.mutant.service;

import org.springframework.stereotype.Service;

@Service
public class MutantService {

    public boolean isMutant(String[] dna) {
        int n = dna.length;
        int sequences = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (checkHorizontal(dna, i, j, n) ||
                        checkVertical(dna, i, j, n) ||
                        checkDiagonalRight(dna, i, j, n) ||
                        checkDiagonalLeft(dna, i, j, n)) {
                    sequences++;
                    if (sequences > 1) {
                        return true; // Es mutante
                    }
                }
            }
        }

        return false; // No es mutante
    }

    private boolean checkHorizontal(String[] dna, int row, int col, int n) {
        if (col + 3 < n) {
            char base = dna[row].charAt(col);
            return base == dna[row].charAt(col + 1) &&
                    base == dna[row].charAt(col + 2) &&
                    base == dna[row].charAt(col + 3);
        }
        return false;
    }

    private boolean checkVertical(String[] dna, int row, int col, int n) {
        if (row + 3 < n) {
            char base = dna[row].charAt(col);
            return base == dna[row + 1].charAt(col) &&
                    base == dna[row + 2].charAt(col) &&
                    base == dna[row + 3].charAt(col);
        }
        return false;
    }

    private boolean checkDiagonalRight(String[] dna, int row, int col, int n) {
        if (row + 3 < n && col + 3 < n) {
            char base = dna[row].charAt(col);
            return base == dna[row + 1].charAt(col + 1) &&
                    base == dna[row + 2].charAt(col + 2) &&
                    base == dna[row + 3].charAt(col + 3);
        }
        return false;
    }

    private boolean checkDiagonalLeft(String[] dna, int row, int col, int n) {
        if (row + 3 < n && col - 3 >= 0) {
            char base = dna[row].charAt(col);
            return base == dna[row + 1].charAt(col - 1) &&
                    base == dna[row + 2].charAt(col - 2) &&
                    base == dna[row + 3].charAt(col - 3);
        }
        return false;
    }
}