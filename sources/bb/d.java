package bb;

import c1.c0;
import h0.p0;
import io.p;
import jo.q;
import l0.i;
import v1.e;
import wn.v;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f17246a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static p<i, Integer, v> f17247b = s0.c.c(-415667804, false, a.f17248w);

    /* loaded from: classes2.dex */
    public static final class a extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f17248w = new a();

        public a() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                p0.a(e.c(wa.d.f58525h, iVar, 0), null, null, c0.f18634b.e(), iVar, 3128, 4);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final p<i, Integer, v> a() {
        return f17247b;
    }
}
