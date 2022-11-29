package uo;

/* loaded from: classes4.dex */
public final class s {
    public static final void a(p<?> pVar, i1 i1Var) {
        pVar.M(new j1(i1Var));
    }

    public static final <T> q<T> b(ao.d<? super T> dVar) {
        if (!(dVar instanceof zo.k)) {
            return new q<>(dVar, 1);
        }
        q<T> j10 = ((zo.k) dVar).j();
        if (j10 == null || !j10.G()) {
            j10 = null;
        }
        return j10 == null ? new q<>(dVar, 2) : j10;
    }

    public static final void c(p<?> pVar, zo.u uVar) {
        pVar.M(new u2(uVar));
    }
}
