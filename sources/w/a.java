package w;

import java.util.List;

/* loaded from: classes.dex */
public final class a implements v {

    /* renamed from: a  reason: collision with root package name */
    public static final a f57542a = new a();

    @Override // w.v
    public long a(m2.d dVar, n1.m mVar, long j10) {
        jo.p.h(dVar, "$this$calculateMouseWheelScroll");
        jo.p.h(mVar, "event");
        List<n1.w> c10 = mVar.c();
        b1.f d10 = b1.f.d(b1.f.f16721b.c());
        int size = c10.size();
        for (int i10 = 0; i10 < size; i10++) {
            d10 = b1.f.d(b1.f.r(d10.u(), c10.get(i10).j()));
        }
        return b1.f.s(d10.u(), -dVar.I0(m2.g.l(64)));
    }
}
