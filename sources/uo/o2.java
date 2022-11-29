package uo;

/* loaded from: classes4.dex */
public abstract class o2 extends k0 {
    @Override // uo.k0
    public k0 d0(int i10) {
        zo.r.a(i10);
        return this;
    }

    public abstract o2 h0();

    public final String i0() {
        o2 o2Var;
        o2 c10 = g1.c();
        if (this == c10) {
            return "Dispatchers.Main";
        }
        try {
            o2Var = c10.h0();
        } catch (UnsupportedOperationException unused) {
            o2Var = null;
        }
        if (this == o2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // uo.k0
    public String toString() {
        String i02 = i0();
        if (i02 == null) {
            return v0.a(this) + '@' + v0.b(this);
        }
        return i02;
    }
}
