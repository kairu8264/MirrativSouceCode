package mb;

import hb.v1;
import io.p;
import jo.q;
import l0.i;
import v.w;
import wn.v;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40705a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static p<i, Integer, v> f40706b = s0.c.c(-305361602, false, C0597a.f40707w);

    /* renamed from: mb.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0597a extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0597a f40707w = new C0597a();

        public C0597a() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                w.a(v1.e.c(v1.L, iVar, 0), null, null, null, null, 0.0f, null, iVar, 56, 124);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final p<i, Integer, v> a() {
        return f40706b;
    }
}
