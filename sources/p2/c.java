package p2;

import io.p;
import jo.q;
import wn.v;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f45723a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static p<l0.i, Integer, v> f45724b = s0.c.c(-1131826196, false, a.f45725w);

    /* loaded from: classes.dex */
    public static final class a extends q implements p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f45725w = new a();

        public a() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final p<l0.i, Integer, v> a() {
        return f45724b;
    }
}
