package ai;

/* loaded from: classes3.dex */
public final class v53 {

    /* renamed from: a  reason: collision with root package name */
    public final hd3 f10982a;

    public v53(hd3 hd3Var) {
        this.f10982a = hd3Var;
    }

    public static v53 c(String str, byte[] bArr, int i10) {
        gd3 D = hd3.D();
        D.r(str);
        D.s(oh3.N(bArr));
        int i11 = i10 - 1;
        D.t(i11 != 0 ? i11 != 1 ? 5 : 4 : 3);
        return new v53(D.n());
    }

    public final String a() {
        return this.f10982a.B();
    }

    public final byte[] b() {
        return this.f10982a.C().U();
    }

    public final int d() {
        int I = this.f10982a.I() - 2;
        int i10 = 1;
        if (I != 1) {
            i10 = 2;
            if (I != 2) {
                i10 = 3;
                if (I != 3) {
                    if (I == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i10;
    }
}
