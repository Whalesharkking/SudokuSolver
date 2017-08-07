package sudoku;

public class SolverNurMitAusprobieren {
    public Feld[][] solve(final Feld[][] startArrayMitDreiVorgaben) {
        final Feld[][] testerArray = startArrayMitDreiVorgaben;
        for (int s = 0; s <= testerArray.length - 1; s++) {
            for (int d = 0; d <= testerArray.length - 1; d++) {
                if (testerArray[s][d].getVorgabewert() != 0) {
                    testerArray[s][d].setLoesungswert(testerArray[s][d].getVorgabewert());
                }
            }
        }
        if (solverMitAusprobieren(0, 0, testerArray)) {
            return testerArray;
        } else {
            System.out.println("fail");
        }
        return null;
    }

    private boolean solverMitAusprobieren(int y, int x, final Feld[][] testerArray) {
        if (y == testerArray.length) {
            y = 0;
            if (++x == testerArray.length) {
                return true;
            }
        }
        if (testerArray[y][x].getVorgabewert() != 0 || testerArray[y][x].getLoesungswert() != 0) {
            return solverMitAusprobieren(y + 1, x, testerArray);
        }
        for (int auszuprobierendeZahl = 1; auszuprobierendeZahl <= testerArray.length; ++auszuprobierendeZahl) {
            if (istKorrekt(y, x, auszuprobierendeZahl, testerArray)) {
                testerArray[y][x].setLoesungswert(auszuprobierendeZahl);
                if (solverMitAusprobieren(y + 1, x, testerArray)) {
                    return true;
                }
            }
        }
        testerArray[y][x].setLoesungswert(0);
        return false;
    }

    private boolean istKorrekt(final int y, final int x, final int auszuprobierendeZahl, final Feld[][] testerArray) {
        if (testerArray.length >= 9) {
            if (!waagerechtePruefen(testerArray, y, auszuprobierendeZahl) || !senkrechtePruefen(testerArray, x, auszuprobierendeZahl) || !blockpruefen(testerArray, y, x, auszuprobierendeZahl)) {
                return false;
            }
        } else {
            if (!waagerechtePruefen(testerArray, y, auszuprobierendeZahl) || !senkrechtePruefen(testerArray, x, auszuprobierendeZahl)) {
                return false;
            }
        }
        return true;
    }

    private boolean blockpruefen(final Feld[][] testerArray, final int y, final int x, final int i) {
        for (int yInner = 0; yInner < testerArray.length - 1; yInner++) {
            for (int xInner = 0; xInner < testerArray.length - 1; xInner++) {
                if (testerArray[yInner][xInner].getGruppe() == testerArray[y][x].getGruppe()) {
                    if (testerArray[yInner][xInner].getVorgabewert() == i || testerArray[yInner][xInner].getLoesungswert() == i) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean waagerechtePruefen(final Feld[][] testerArray, final int y, final int i) {
        for (int yWert = 0; yWert <= testerArray.length - 1; yWert++) {
            if (testerArray[y][yWert].getVorgabewert() == i || testerArray[y][yWert].getLoesungswert() == i) {
                return false;
            }
        }
        return true;
    }

    private boolean senkrechtePruefen(final Feld[][] testerArray, final int x, final int i) {
        for (int xWert = 0; xWert <= testerArray.length - 1; xWert++) {
            if (testerArray[xWert][x].getVorgabewert() == i || testerArray[xWert][x].getLoesungswert() == i) {
                return false;
            }
        }
        return true;
    }
}
