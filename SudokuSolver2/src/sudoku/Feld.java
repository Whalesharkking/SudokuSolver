package sudoku;

public class Feld {
    private final int gruppe;
    private final int vorgabewert;
    private int loesungswert;

    Feld(final int gruppe, final int vorgabewert) {
        this.gruppe = gruppe;
        this.vorgabewert = vorgabewert;
    }

    public int getGruppe() {
        return gruppe;
    }

    public int getVorgabewert() {
        return vorgabewert;
    }

    public int getLoesungswert() {
        return loesungswert;
    }

    public void setLoesungswert(final int loesungswert) {
        this.loesungswert = loesungswert;
    }
}
