package c1;

/* loaded from: classes.dex */
public final class m0 {
    public static final k0 a(int i10, int i11, int i12, boolean z10, d1.c cVar) {
        jo.p.h(cVar, "colorSpace");
        return f.a(i10, i11, i12, z10, cVar);
    }

    public static /* synthetic */ k0 b(int i10, int i11, int i12, boolean z10, d1.c cVar, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = l0.f18711b.b();
        }
        if ((i13 & 8) != 0) {
            z10 = true;
        }
        if ((i13 & 16) != 0) {
            cVar = d1.e.f28963a.r();
        }
        return a(i10, i11, i12, z10, cVar);
    }
}
