package gd;

import io.p;
import jo.q;
import v.w;
import wn.v;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f33244a = new i();

    /* renamed from: b  reason: collision with root package name */
    public static p<l0.i, Integer, v> f33245b = s0.c.c(424623617, false, a.f33246w);

    /* loaded from: classes2.dex */
    public static final class a extends q implements p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f33246w = new a();

        public a() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                w.a(v1.e.c(nc.d.btn_coin_get, iVar, 0), "Coin Get", null, null, null, 0.0f, null, iVar, 56, 124);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final p<l0.i, Integer, v> a() {
        return f33245b;
    }
}
