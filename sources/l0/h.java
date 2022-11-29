package l0;

/* loaded from: classes.dex */
public final class h {
    public static final int a(i iVar, int i10) {
        return iVar.L();
    }

    public static final e1 b(i iVar, int i10) {
        e1 v10 = iVar.v();
        if (v10 != null) {
            iVar.F(v10);
            return v10;
        }
        throw new IllegalStateException("no recompose scope found".toString());
    }

    public static final void c() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    public static final m d(i iVar, int i10) {
        iVar.x(-1165786124);
        m M = iVar.M();
        iVar.O();
        return M;
    }
}
