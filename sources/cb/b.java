package cb;

import h0.p0;
import io.p;
import jo.q;
import l0.i;
import wn.v;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f18997a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static p<i, Integer, v> f18998b = s0.c.c(-2054671085, false, a.f19000w);

    /* renamed from: c  reason: collision with root package name */
    public static p<i, Integer, v> f18999c = s0.c.c(1057584049, false, C0142b.f19001w);

    /* loaded from: classes2.dex */
    public static final class a extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f19000w = new a();

        public a() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* renamed from: cb.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0142b extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0142b f19001w = new C0142b();

        public C0142b() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                p0.b(j0.a.a(i0.a.f36312a), null, null, 0L, iVar, 48, 12);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final p<i, Integer, v> a() {
        return f18998b;
    }

    public final p<i, Integer, v> b() {
        return f18999c;
    }
}
