package sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolverTest {
    @Test
    public void solverMitAusprobieren_3x3MitDreiVorgabenEindeutig_geloest() {
        // arrange
        final Feld[][] startArrayMitDreiVorgaben = { //
            { new Feld(1, 3), new Feld(1, 1), new Feld(1, 0) }, //
            { new Feld(1, 0), new Feld(1, 2), new Feld(1, 0) }, //
            { new Feld(1, 0), new Feld(1, 0), new Feld(1, 0) }//
        };
        final SolverNurMitAusprobieren testee = new SolverNurMitAusprobieren();
        // act
        final Feld[][] resultArray = testee.solve(startArrayMitDreiVorgaben);
        // assert
        final Feld[][] erwartetesArray = { //
            { new Feld(1, 3), new Feld(1, 1), new Feld(1, 2) }, //
            { new Feld(1, 1), new Feld(1, 2), new Feld(1, 3) }, //
            { new Feld(1, 2), new Feld(1, 3), new Feld(1, 1) }//
        };
        assertTrue(sindGleich(erwartetesArray, resultArray));
    }

    @Test
    public void solverMitAusprobieren_4x4MitDreiVorgabenEindeutig_geloest() {
        // arrange
        final Feld[][] startArrayMitDreiVorgaben = { //
            { new Feld(1, 3), new Feld(1, 1), new Feld(1, 4), new Feld(1, 0) }, //
            { new Feld(1, 1), new Feld(1, 0), new Feld(1, 3), new Feld(1, 4) }, //
            { new Feld(1, 0), new Feld(1, 4), new Feld(1, 1), new Feld(1, 3) }, //
            { new Feld(1, 4), new Feld(1, 3), new Feld(1, 0), new Feld(1, 1) }//
        };
        final SolverNurMitAusprobieren testee = new SolverNurMitAusprobieren();
        // act
        final Feld[][] resultArray = testee.solve(startArrayMitDreiVorgaben);
        // assert
        final Feld[][] erwartetesArray = { //
            { new Feld(1, 3), new Feld(1, 1), new Feld(1, 4), new Feld(1, 2) }, //
            { new Feld(1, 1), new Feld(1, 2), new Feld(1, 3), new Feld(1, 4) }, //
            { new Feld(1, 2), new Feld(1, 4), new Feld(1, 1), new Feld(1, 3) }, //
            { new Feld(1, 4), new Feld(1, 3), new Feld(1, 2), new Feld(1, 1) }//
        };
        assertTrue(sindGleich(erwartetesArray, resultArray));
    }

    @Test
    public void solverMitAusprobieren_9x9MitpaarVorgabenEindeutig_geloest() {
        // arrange
        final Feld[][] startArrayMitDreiVorgaben = { //
            { new Feld(1, 3), new Feld(1, 9), new Feld(1, 0), new Feld(4, 0), new Feld(4, 0), new Feld(4, 1), new Feld(9, 0), new Feld(9, 0), new Feld(9, 6) }, //
            { new Feld(1, 0), new Feld(1, 0), new Feld(1, 0), new Feld(4, 8), new Feld(4, 0), new Feld(4, 0), new Feld(9, 0), new Feld(9, 1), new Feld(9, 2) }, //
            { new Feld(1, 0), new Feld(1, 1), new Feld(1, 5), new Feld(4, 0), new Feld(4, 6), new Feld(4, 4), new Feld(9, 0), new Feld(9, 9), new Feld(9, 0) }, //
            { new Feld(2, 0), new Feld(2, 0), new Feld(2, 1), new Feld(5, 0), new Feld(5, 0), new Feld(5, 2), new Feld(8, 0), new Feld(8, 0), new Feld(8, 9) }, //
            { new Feld(2, 7), new Feld(2, 6), new Feld(2, 0), new Feld(5, 9), new Feld(5, 5), new Feld(5, 0), new Feld(8, 4), new Feld(8, 3), new Feld(8, 1) }, //
            { new Feld(2, 8), new Feld(2, 0), new Feld(2, 0), new Feld(5, 4), new Feld(5, 0), new Feld(5, 0), new Feld(8, 0), new Feld(8, 0), new Feld(8, 0) }, //
            { new Feld(3, 9), new Feld(3, 8), new Feld(3, 0), new Feld(6, 2), new Feld(6, 3), new Feld(6, 0), new Feld(7, 1), new Feld(7, 6), new Feld(7, 0) }, //
            { new Feld(3, 4), new Feld(3, 0), new Feld(3, 0), new Feld(6, 0), new Feld(6, 0), new Feld(6, 7), new Feld(7, 0), new Feld(7, 0), new Feld(7, 3) }, //
            { new Feld(3, 0), new Feld(3, 2), new Feld(3, 0), new Feld(6, 0), new Feld(6, 0), new Feld(6, 9), new Feld(7, 0), new Feld(7, 5), new Feld(7, 0) } //
        };
        final SolverNurMitAusprobieren testee = new SolverNurMitAusprobieren();
        // act
        final Feld[][] resultArray = testee.solve(startArrayMitDreiVorgaben);
        // assert
        final Feld[][] erwartetesArray = { //
            { new Feld(1, 3), new Feld(1, 9), new Feld(1, 8), new Feld(6, 5), new Feld(6, 2), new Feld(6, 1), new Feld(9, 7), new Feld(9, 4), new Feld(9, 6) }, //
            { new Feld(1, 6), new Feld(1, 7), new Feld(1, 4), new Feld(6, 8), new Feld(6, 9), new Feld(6, 3), new Feld(9, 5), new Feld(9, 1), new Feld(9, 2) }, //
            { new Feld(1, 2), new Feld(1, 1), new Feld(1, 5), new Feld(6, 7), new Feld(6, 6), new Feld(6, 4), new Feld(9, 3), new Feld(9, 9), new Feld(9, 8) }, //
            { new Feld(2, 5), new Feld(2, 4), new Feld(2, 1), new Feld(5, 3), new Feld(5, 7), new Feld(5, 2), new Feld(8, 6), new Feld(8, 8), new Feld(8, 9) }, //
            { new Feld(2, 7), new Feld(2, 6), new Feld(2, 2), new Feld(5, 9), new Feld(5, 5), new Feld(5, 8), new Feld(8, 4), new Feld(8, 3), new Feld(8, 1) }, //
            { new Feld(2, 8), new Feld(2, 3), new Feld(2, 9), new Feld(5, 4), new Feld(5, 1), new Feld(5, 6), new Feld(8, 2), new Feld(8, 7), new Feld(8, 5) }, //
            { new Feld(3, 9), new Feld(3, 8), new Feld(3, 7), new Feld(4, 2), new Feld(4, 3), new Feld(4, 5), new Feld(7, 1), new Feld(7, 6), new Feld(7, 4) }, //
            { new Feld(3, 4), new Feld(3, 5), new Feld(3, 6), new Feld(4, 1), new Feld(4, 8), new Feld(4, 7), new Feld(7, 9), new Feld(7, 2), new Feld(7, 3) }, //
            { new Feld(3, 1), new Feld(3, 2), new Feld(3, 3), new Feld(4, 6), new Feld(4, 4), new Feld(4, 9), new Feld(7, 8), new Feld(7, 5), new Feld(7, 7) } //
        };
        assertTrue(sindGleich(erwartetesArray, resultArray));
    }

    @Test
    public void solverMitAusprobieren_9x9zweiterTest_geloest() {
        // arrange
        final Feld[][] startArrayMitDreiVorgaben = { //
            { new Feld(1, 0), new Feld(1, 3), new Feld(1, 6), new Feld(4, 0), new Feld(4, 9), new Feld(4, 0), new Feld(9, 0), new Feld(9, 2), new Feld(9, 7) }, //
            { new Feld(1, 7), new Feld(1, 0), new Feld(1, 0), new Feld(4, 6), new Feld(4, 0), new Feld(4, 0), new Feld(9, 0), new Feld(9, 0), new Feld(9, 9) }, //
            { new Feld(1, 0), new Feld(1, 5), new Feld(1, 1), new Feld(4, 0), new Feld(4, 7), new Feld(4, 2), new Feld(9, 4), new Feld(9, 0), new Feld(9, 0) }, //
            { new Feld(2, 0), new Feld(2, 2), new Feld(2, 0), new Feld(5, 4), new Feld(5, 0), new Feld(5, 9), new Feld(8, 0), new Feld(8, 0), new Feld(8, 3) }, //
            { new Feld(2, 0), new Feld(2, 7), new Feld(2, 0), new Feld(5, 0), new Feld(5, 1), new Feld(5, 0), new Feld(8, 2), new Feld(8, 4), new Feld(8, 0) }, //
            { new Feld(2, 6), new Feld(2, 0), new Feld(2, 3), new Feld(5, 2), new Feld(5, 0), new Feld(5, 7), new Feld(8, 9), new Feld(8, 0), new Feld(8, 0) }, //
            { new Feld(3, 0), new Feld(3, 0), new Feld(3, 8), new Feld(6, 0), new Feld(6, 4), new Feld(6, 0), new Feld(7, 5), new Feld(7, 7), new Feld(7, 2) }, //
            { new Feld(3, 2), new Feld(3, 1), new Feld(3, 7), new Feld(6, 0), new Feld(6, 6), new Feld(6, 8), new Feld(7, 0), new Feld(7, 0), new Feld(7, 0) }, //
            { new Feld(3, 0), new Feld(3, 0), new Feld(3, 0), new Feld(6, 0), new Feld(6, 2), new Feld(6, 0), new Feld(7, 0), new Feld(7, 1), new Feld(7, 0) } //
        };
        final SolverNurMitAusprobieren testee = new SolverNurMitAusprobieren();
        // act
        final Feld[][] resultArray = testee.solve(startArrayMitDreiVorgaben);
        // assert
        final Feld[][] erwartetesArray = { //
            { new Feld(1, 4), new Feld(1, 3), new Feld(1, 6), new Feld(4, 1), new Feld(4, 9), new Feld(4, 5), new Feld(9, 8), new Feld(9, 2), new Feld(9, 7) }, //
            { new Feld(1, 7), new Feld(1, 8), new Feld(1, 2), new Feld(4, 6), new Feld(4, 3), new Feld(4, 4), new Feld(9, 1), new Feld(9, 5), new Feld(9, 9) }, //
            { new Feld(1, 9), new Feld(1, 5), new Feld(1, 1), new Feld(4, 8), new Feld(4, 7), new Feld(4, 2), new Feld(9, 4), new Feld(9, 3), new Feld(9, 6) }, //
            { new Feld(2, 1), new Feld(2, 2), new Feld(2, 5), new Feld(5, 4), new Feld(5, 8), new Feld(5, 9), new Feld(8, 7), new Feld(8, 6), new Feld(8, 3) }, //
            { new Feld(2, 8), new Feld(2, 7), new Feld(2, 9), new Feld(5, 3), new Feld(5, 1), new Feld(5, 6), new Feld(8, 2), new Feld(8, 4), new Feld(8, 5) }, //
            { new Feld(2, 6), new Feld(2, 4), new Feld(2, 3), new Feld(5, 2), new Feld(5, 5), new Feld(5, 7), new Feld(8, 9), new Feld(8, 8), new Feld(8, 1) }, //
            { new Feld(3, 3), new Feld(3, 6), new Feld(3, 8), new Feld(6, 9), new Feld(6, 4), new Feld(6, 1), new Feld(7, 5), new Feld(7, 7), new Feld(7, 2) }, //
            { new Feld(3, 2), new Feld(3, 1), new Feld(3, 7), new Feld(6, 5), new Feld(6, 6), new Feld(6, 8), new Feld(7, 3), new Feld(7, 9), new Feld(7, 4) }, //
            { new Feld(3, 5), new Feld(3, 9), new Feld(3, 4), new Feld(6, 7), new Feld(6, 2), new Feld(6, 3), new Feld(7, 6), new Feld(7, 1), new Feld(7, 8) } //
        };
        assertTrue(sindGleich(erwartetesArray, resultArray));
    }

    @Test
    public void solverMitAusprobieren_9x9sehrSchwer_geloest() {
        // arrange
        final Feld[][] startArrayMitDreiVorgaben = { //
            { new Feld(1, 0), new Feld(1, 0), new Feld(1, 0), new Feld(4, 0), new Feld(4, 0), new Feld(4, 0), new Feld(9, 0), new Feld(9, 5), new Feld(9, 0) }, //
            { new Feld(1, 8), new Feld(1, 0), new Feld(1, 0), new Feld(4, 0), new Feld(4, 0), new Feld(4, 3), new Feld(9, 0), new Feld(9, 0), new Feld(9, 0) }, //
            { new Feld(1, 0), new Feld(1, 0), new Feld(1, 0), new Feld(4, 0), new Feld(4, 0), new Feld(4, 0), new Feld(9, 7), new Feld(9, 0), new Feld(9, 6) }, //
            { new Feld(2, 0), new Feld(2, 0), new Feld(2, 5), new Feld(5, 0), new Feld(5, 0), new Feld(5, 0), new Feld(8, 9), new Feld(8, 0), new Feld(8, 8) }, //
            { new Feld(2, 0), new Feld(2, 7), new Feld(2, 0), new Feld(5, 0), new Feld(5, 4), new Feld(5, 0), new Feld(8, 6), new Feld(8, 3), new Feld(8, 0) }, //
            { new Feld(2, 0), new Feld(2, 0), new Feld(2, 0), new Feld(5, 0), new Feld(5, 0), new Feld(5, 0), new Feld(8, 0), new Feld(8, 0), new Feld(8, 2) }, //
            { new Feld(3, 0), new Feld(3, 0), new Feld(3, 3), new Feld(6, 0), new Feld(6, 0), new Feld(6, 2), new Feld(7, 0), new Feld(7, 0), new Feld(7, 9) }, //
            { new Feld(3, 0), new Feld(3, 6), new Feld(3, 0), new Feld(6, 9), new Feld(6, 0), new Feld(6, 0), new Feld(7, 5), new Feld(7, 0), new Feld(7, 0) }, //
            { new Feld(3, 0), new Feld(3, 5), new Feld(3, 8), new Feld(6, 6), new Feld(6, 7), new Feld(6, 0), new Feld(7, 0), new Feld(7, 0), new Feld(7, 0) } //
        };
        final SolverNurMitAusprobieren testee = new SolverNurMitAusprobieren();
        // act
        final Feld[][] resultArray = testee.solve(startArrayMitDreiVorgaben);
        // assert
        final Feld[][] erwartetesArray = { //
            { new Feld(1, 6), new Feld(1, 9), new Feld(1, 1), new Feld(4, 4), new Feld(4, 8), new Feld(4, 7), new Feld(9, 2), new Feld(9, 5), new Feld(9, 3) }, //
            { new Feld(1, 8), new Feld(1, 2), new Feld(1, 7), new Feld(4, 5), new Feld(4, 6), new Feld(4, 3), new Feld(9, 1), new Feld(9, 9), new Feld(9, 4) }, //
            { new Feld(1, 5), new Feld(1, 3), new Feld(1, 4), new Feld(4, 2), new Feld(4, 1), new Feld(4, 9), new Feld(9, 7), new Feld(9, 8), new Feld(9, 6) }, //
            { new Feld(2, 4), new Feld(2, 1), new Feld(2, 5), new Feld(5, 3), new Feld(5, 2), new Feld(5, 6), new Feld(8, 9), new Feld(8, 7), new Feld(8, 8) }, //
            { new Feld(2, 2), new Feld(2, 7), new Feld(2, 9), new Feld(5, 8), new Feld(5, 4), new Feld(5, 1), new Feld(8, 6), new Feld(8, 3), new Feld(8, 5) }, //
            { new Feld(2, 3), new Feld(2, 8), new Feld(2, 6), new Feld(5, 7), new Feld(5, 9), new Feld(5, 5), new Feld(8, 4), new Feld(8, 1), new Feld(8, 2) }, //
            { new Feld(3, 7), new Feld(3, 4), new Feld(3, 3), new Feld(6, 1), new Feld(6, 5), new Feld(6, 2), new Feld(7, 8), new Feld(7, 6), new Feld(7, 9) }, //
            { new Feld(3, 1), new Feld(3, 6), new Feld(3, 2), new Feld(6, 9), new Feld(6, 3), new Feld(6, 8), new Feld(7, 5), new Feld(7, 4), new Feld(7, 7) }, //
            { new Feld(3, 9), new Feld(3, 5), new Feld(3, 8), new Feld(6, 6), new Feld(6, 7), new Feld(6, 4), new Feld(7, 3), new Feld(7, 2), new Feld(7, 1) } //
        };
        assertTrue(sindGleich(erwartetesArray, resultArray));
    }

    @Test
    public void solverMitAusprobieren_16x16sehrSchwer_geloest() {
        // arrange
        final Feld[][] startArrayMitDreiVorgaben = { //
            { new Feld(1, 0), new Feld(1, 8), new Feld(1, 0), new Feld(1, 0), new Feld(5, 9), new Feld(5, 0), new Feld(5, 0), new Feld(5, 3), new Feld(9, 10), new Feld(9, 0), new Feld(9, 0),
                new Feld(9, 14), new Feld(13, 0), new Feld(13, 0), new Feld(13, 6), new Feld(13, 0) }, //
            { new Feld(1, 5), new Feld(1, 0), new Feld(1, 15), new Feld(1, 0), new Feld(5, 0), new Feld(5, 0), new Feld(5, 14), new Feld(5, 0), new Feld(9, 0), new Feld(9, 1), new Feld(9, 0),
                new Feld(9, 0), new Feld(13, 0), new Feld(13, 12), new Feld(13, 0), new Feld(13, 4) }, //
            { new Feld(1, 0), new Feld(1, 12), new Feld(1, 0), new Feld(1, 0), new Feld(5, 0), new Feld(5, 0), new Feld(5, 0), new Feld(5, 0), new Feld(9, 0), new Feld(9, 0), new Feld(9, 0),
                new Feld(9, 0), new Feld(13, 0), new Feld(13, 0), new Feld(13, 5), new Feld(13, 0) }, //
            { new Feld(1, 0), new Feld(1, 0), new Feld(1, 0), new Feld(1, 6), new Feld(5, 0), new Feld(5, 13), new Feld(5, 15), new Feld(5, 5), new Feld(9, 16), new Feld(9, 2), new Feld(9, 4),
                new Feld(9, 0), new Feld(13, 7), new Feld(13, 0), new Feld(13, 0), new Feld(13, 0) }, //
            { new Feld(2, 6), new Feld(2, 0), new Feld(2, 0), new Feld(2, 0), new Feld(6, 0), new Feld(6, 12), new Feld(6, 0), new Feld(6, 15), new Feld(10, 14), new Feld(10, 0), new Feld(10, 3),
                new Feld(10, 0), new Feld(14, 0), new Feld(14, 0), new Feld(14, 0), new Feld(14, 5) }, //
            { new Feld(2, 0), new Feld(2, 0), new Feld(2, 0), new Feld(2, 11), new Feld(6, 1), new Feld(6, 7), new Feld(6, 6), new Feld(6, 9), new Feld(10, 4), new Feld(10, 12), new Feld(10, 8),
                new Feld(10, 5), new Feld(14, 3), new Feld(14, 0), new Feld(14, 0), new Feld(14, 0) }, //
            { new Feld(2, 0), new Feld(2, 1), new Feld(2, 0), new Feld(2, 7), new Feld(6, 0), new Feld(6, 5), new Feld(6, 0), new Feld(6, 0), new Feld(10, 0), new Feld(10, 0), new Feld(10, 10),
                new Feld(10, 0), new Feld(14, 16), new Feld(14, 0), new Feld(14, 14), new Feld(14, 0) }, //
            { new Feld(2, 10), new Feld(2, 0), new Feld(2, 0), new Feld(2, 13), new Feld(6, 16), new Feld(6, 2), new Feld(6, 0), new Feld(6, 0), new Feld(10, 0), new Feld(10, 0), new Feld(10, 11),
                new Feld(10, 6), new Feld(14, 15), new Feld(14, 0), new Feld(14, 0), new Feld(14, 12) }, //
            { new Feld(3, 13), new Feld(3, 0), new Feld(3, 0), new Feld(3, 4), new Feld(7, 3), new Feld(7, 16), new Feld(7, 0), new Feld(7, 0), new Feld(11, 0), new Feld(11, 0), new Feld(11, 1),
                new Feld(11, 8), new Feld(15, 9), new Feld(15, 0), new Feld(15, 0), new Feld(15, 10) }, //
            { new Feld(3, 0), new Feld(3, 16), new Feld(3, 0), new Feld(3, 2), new Feld(7, 0), new Feld(7, 4), new Feld(7, 0), new Feld(7, 0), new Feld(11, 0), new Feld(11, 0), new Feld(11, 14),
                new Feld(11, 0), new Feld(15, 12), new Feld(15, 0), new Feld(15, 1), new Feld(15, 0) }, //
            { new Feld(3, 0), new Feld(3, 0), new Feld(3, 0), new Feld(3, 1), new Feld(7, 15), new Feld(7, 9), new Feld(7, 5), new Feld(7, 7), new Feld(11, 2), new Feld(11, 13), new Feld(11, 12),
                new Feld(11, 16), new Feld(15, 6), new Feld(15, 0), new Feld(15, 0), new Feld(15, 0) }, //
            { new Feld(3, 11), new Feld(3, 0), new Feld(3, 0), new Feld(3, 0), new Feld(7, 0), new Feld(7, 8), new Feld(7, 0), new Feld(7, 12), new Feld(11, 7), new Feld(11, 0), new Feld(11, 15),
                new Feld(11, 0), new Feld(15, 0), new Feld(15, 0), new Feld(15, 0), new Feld(15, 16) }, //
            { new Feld(4, 0), new Feld(4, 0), new Feld(4, 0), new Feld(4, 5), new Feld(8, 0), new Feld(8, 11), new Feld(8, 2), new Feld(8, 4), new Feld(12, 13), new Feld(12, 10), new Feld(12, 6),
                new Feld(12, 0), new Feld(16, 8), new Feld(16, 0), new Feld(16, 0), new Feld(16, 0) }, //
            { new Feld(4, 0), new Feld(4, 11), new Feld(4, 0), new Feld(4, 0), new Feld(8, 0), new Feld(8, 0), new Feld(8, 0), new Feld(8, 0), new Feld(12, 0), new Feld(12, 0), new Feld(12, 0),
                new Feld(12, 0), new Feld(16, 0), new Feld(16, 0), new Feld(16, 16), new Feld(16, 0) }, //
            { new Feld(4, 9), new Feld(4, 0), new Feld(4, 3), new Feld(4, 0), new Feld(8, 0), new Feld(8, 0), new Feld(8, 8), new Feld(8, 0), new Feld(12, 0), new Feld(12, 15), new Feld(12, 0),
                new Feld(12, 0), new Feld(16, 0), new Feld(16, 7), new Feld(16, 0), new Feld(16, 2) }, //
            { new Feld(4, 0), new Feld(4, 2), new Feld(4, 0), new Feld(4, 0), new Feld(8, 10), new Feld(8, 0), new Feld(8, 0), new Feld(8, 1), new Feld(12, 5), new Feld(12, 0), new Feld(12, 0),
                new Feld(12, 9), new Feld(16, 0), new Feld(16, 0), new Feld(16, 12), new Feld(16, 0) } //
        };
        final SolverNurMitAusprobieren testee = new SolverNurMitAusprobieren();
        // act
        final Feld[][] resultArray = testee.solve(startArrayMitDreiVorgaben);
        // assert
        final Feld[][] erwartetesArray = { //
            { new Feld(1, 7), new Feld(1, 8), new Feld(1, 4), new Feld(1, 16), new Feld(5, 9), new Feld(5, 1), new Feld(5, 12), new Feld(5, 3), new Feld(9, 10), new Feld(9, 11), new Feld(9, 5),
                new Feld(9, 14), new Feld(13, 13), new Feld(13, 2), new Feld(13, 6), new Feld(13, 15) }, //
            { new Feld(1, 5), new Feld(1, 13), new Feld(1, 15), new Feld(1, 3), new Feld(5, 2), new Feld(5, 6), new Feld(5, 14), new Feld(5, 16), new Feld(9, 8), new Feld(9, 1), new Feld(9, 9),
                new Feld(9, 7), new Feld(13, 10), new Feld(13, 12), new Feld(13, 11), new Feld(13, 4) }, //
            { new Feld(1, 2), new Feld(1, 12), new Feld(1, 11), new Feld(1, 14), new Feld(5, 4), new Feld(5, 10), new Feld(5, 7), new Feld(5, 8), new Feld(9, 3), new Feld(9, 6), new Feld(9, 13),
                new Feld(9, 15), new Feld(13, 1), new Feld(13, 16), new Feld(13, 5), new Feld(13, 9) }, //
            { new Feld(1, 1), new Feld(1, 9), new Feld(1, 10), new Feld(1, 6), new Feld(5, 11), new Feld(5, 13), new Feld(5, 15), new Feld(5, 5), new Feld(9, 16), new Feld(9, 2), new Feld(9, 4),
                new Feld(9, 12), new Feld(13, 7), new Feld(13, 8), new Feld(13, 3), new Feld(13, 14) }, //
            { new Feld(2, 6), new Feld(2, 4), new Feld(2, 9), new Feld(2, 8), new Feld(6, 13), new Feld(6, 12), new Feld(6, 10), new Feld(6, 15), new Feld(10, 14), new Feld(10, 16), new Feld(10, 3),
                new Feld(10, 2), new Feld(14, 11), new Feld(14, 1), new Feld(14, 7), new Feld(14, 5) }, //
            { new Feld(2, 14), new Feld(2, 15), new Feld(2, 16), new Feld(2, 11), new Feld(6, 1), new Feld(6, 7), new Feld(6, 6), new Feld(6, 9), new Feld(10, 4), new Feld(10, 12), new Feld(10, 8),
                new Feld(10, 5), new Feld(14, 3), new Feld(14, 10), new Feld(14, 2), new Feld(14, 13) }, //
            { new Feld(2, 12), new Feld(2, 1), new Feld(2, 2), new Feld(2, 7), new Feld(6, 8), new Feld(6, 5), new Feld(6, 3), new Feld(6, 11), new Feld(10, 15), new Feld(10, 9), new Feld(10, 10),
                new Feld(10, 13), new Feld(14, 16), new Feld(14, 4), new Feld(14, 14), new Feld(14, 6) }, //
            { new Feld(2, 10), new Feld(2, 3), new Feld(2, 5), new Feld(2, 13), new Feld(6, 16), new Feld(6, 2), new Feld(6, 4), new Feld(6, 14), new Feld(10, 1), new Feld(10, 7), new Feld(10, 11),
                new Feld(10, 6), new Feld(14, 15), new Feld(14, 9), new Feld(14, 8), new Feld(14, 12) }, //
            { new Feld(3, 13), new Feld(3, 7), new Feld(3, 12), new Feld(3, 4), new Feld(7, 3), new Feld(7, 16), new Feld(7, 11), new Feld(7, 2), new Feld(11, 6), new Feld(11, 5), new Feld(11, 1),
                new Feld(11, 8), new Feld(15, 9), new Feld(15, 14), new Feld(15, 15), new Feld(15, 10) }, //
            { new Feld(3, 15), new Feld(3, 16), new Feld(3, 8), new Feld(3, 2), new Feld(7, 6), new Feld(7, 4), new Feld(7, 13), new Feld(7, 10), new Feld(11, 9), new Feld(11, 3), new Feld(11, 14),
                new Feld(11, 11), new Feld(15, 12), new Feld(15, 5), new Feld(15, 1), new Feld(15, 7) }, //
            { new Feld(3, 3), new Feld(3, 10), new Feld(3, 14), new Feld(3, 1), new Feld(7, 15), new Feld(7, 9), new Feld(7, 5), new Feld(7, 7), new Feld(11, 2), new Feld(11, 13), new Feld(11, 12),
                new Feld(11, 16), new Feld(15, 6), new Feld(15, 11), new Feld(15, 4), new Feld(15, 8) }, //
            { new Feld(3, 11), new Feld(3, 5), new Feld(3, 6), new Feld(3, 9), new Feld(7, 14), new Feld(7, 8), new Feld(7, 1), new Feld(7, 12), new Feld(11, 7), new Feld(11, 4), new Feld(11, 15),
                new Feld(11, 10), new Feld(15, 2), new Feld(15, 3), new Feld(15, 13), new Feld(15, 16) }, //
            { new Feld(4, 16), new Feld(4, 14), new Feld(4, 7), new Feld(4, 5), new Feld(8, 12), new Feld(8, 11), new Feld(8, 2), new Feld(8, 4), new Feld(12, 13), new Feld(12, 10), new Feld(12, 6),
                new Feld(12, 3), new Feld(16, 8), new Feld(16, 15), new Feld(16, 9), new Feld(16, 1) }, //
            { new Feld(4, 8), new Feld(4, 11), new Feld(4, 1), new Feld(4, 10), new Feld(8, 7), new Feld(8, 15), new Feld(8, 9), new Feld(8, 6), new Feld(12, 12), new Feld(12, 14), new Feld(12, 2),
                new Feld(12, 4), new Feld(16, 5), new Feld(16, 13), new Feld(16, 16), new Feld(16, 3) }, //
            { new Feld(4, 9), new Feld(4, 6), new Feld(4, 3), new Feld(4, 12), new Feld(8, 5), new Feld(8, 14), new Feld(8, 8), new Feld(8, 13), new Feld(12, 11), new Feld(12, 15), new Feld(12, 16),
                new Feld(12, 1), new Feld(16, 4), new Feld(16, 7), new Feld(16, 10), new Feld(16, 2) }, //
            { new Feld(4, 4), new Feld(4, 2), new Feld(4, 13), new Feld(4, 15), new Feld(8, 10), new Feld(8, 3), new Feld(8, 16), new Feld(8, 1), new Feld(12, 5), new Feld(12, 8), new Feld(12, 7),
                new Feld(12, 9), new Feld(16, 14), new Feld(16, 6), new Feld(16, 12), new Feld(16, 11) } //
        };
        assertTrue(sindGleich(erwartetesArray, resultArray));
    }

    @Test
    public void solverMitAusprobieren_6x6MitDiesenKrueppelBoxen_geloest() {
        // arrange
        final Feld[][] startArrayMitDreiVorgaben = { //
            { new Feld(1, 4), new Feld(1, 0), new Feld(3, 0), new Feld(3, 1), new Feld(3, 0), new Feld(3, 5) }, //
            { new Feld(1, 0), new Feld(1, 0), new Feld(4, 5), new Feld(4, 0), new Feld(3, 0), new Feld(3, 0) }, //
            { new Feld(1, 0), new Feld(4, 4), new Feld(4, 0), new Feld(4, 0), new Feld(5, 0), new Feld(6, 6) }, //
            { new Feld(1, 6), new Feld(4, 0), new Feld(5, 0), new Feld(5, 5), new Feld(5, 3), new Feld(6, 0) }, //
            { new Feld(2, 3), new Feld(2, 0), new Feld(5, 0), new Feld(5, 2), new Feld(6, 0), new Feld(6, 0) }, //
            { new Feld(2, 0), new Feld(2, 6), new Feld(2, 1), new Feld(2, 0), new Feld(6, 0), new Feld(6, 3) } //
        };
        final SolverNurMitAusprobieren testee = new SolverNurMitAusprobieren();
        // act
        final Feld[][] resultArray = testee.solve(startArrayMitDreiVorgaben);
        // assert
        final Feld[][] erwartetesArray = { //
            { new Feld(1, 4), new Feld(1, 2), new Feld(3, 3), new Feld(3, 1), new Feld(3, 6), new Feld(3, 5) }, //
            { new Feld(1, 1), new Feld(1, 3), new Feld(4, 5), new Feld(4, 6), new Feld(3, 2), new Feld(3, 4) }, //
            { new Feld(1, 5), new Feld(4, 4), new Feld(4, 2), new Feld(4, 3), new Feld(5, 1), new Feld(6, 6) }, //
            { new Feld(1, 6), new Feld(4, 1), new Feld(5, 4), new Feld(5, 5), new Feld(5, 3), new Feld(6, 2) }, //
            { new Feld(2, 3), new Feld(2, 5), new Feld(5, 6), new Feld(5, 2), new Feld(6, 4), new Feld(6, 1) }, //
            { new Feld(2, 2), new Feld(2, 6), new Feld(2, 1), new Feld(2, 4), new Feld(6, 5), new Feld(6, 3) } //
        };
        assertTrue(sindGleich(erwartetesArray, resultArray));
    }

    private boolean sindGleich(final Feld[][] erwartetesArray, final Feld[][] resultArray) {
        for (int i = 0; i <= erwartetesArray.length - 1; i++) {
            for (int j = 0; j <= resultArray.length - 1; j++) {
                if (erwartetesArray[i][j].getVorgabewert() != resultArray[i][j].getLoesungswert()) {
                    return false;
                }
            }
        }
        return true;
    }
}
