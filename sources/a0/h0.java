package a0;

import java.util.Map;
import q1.q0;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final l f117a;

    /* renamed from: b  reason: collision with root package name */
    public final b0.i f118b;

    /* renamed from: c  reason: collision with root package name */
    public final int f119c;

    /* renamed from: d  reason: collision with root package name */
    public final m0 f120d;

    public h0(l lVar, b0.i iVar, int i10, m0 m0Var) {
        jo.p.h(lVar, "itemProvider");
        jo.p.h(iVar, "measureScope");
        jo.p.h(m0Var, "measuredItemFactory");
        this.f117a = lVar;
        this.f118b = iVar;
        this.f119c = i10;
        this.f120d = m0Var;
    }

    public static /* synthetic */ g0 b(h0 h0Var, int i10, int i11, long j10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = h0Var.f119c;
        }
        return h0Var.a(i10, i11, j10);
    }

    public final g0 a(int i10, int i11, long j10) {
        int o10;
        Object e10 = this.f117a.e(i10);
        q0[] J = this.f118b.J(i10, j10);
        if (m2.b.l(j10)) {
            o10 = m2.b.p(j10);
        } else if (m2.b.k(j10)) {
            o10 = m2.b.o(j10);
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return this.f120d.a(i10, e10, o10, i11, J);
    }

    public final Map<Object, Integer> c() {
        return this.f117a.c();
    }
}
