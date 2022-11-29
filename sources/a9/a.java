package a9;

import h0.p0;
import io.p;
import jo.q;
import l0.i;
import r8.d1;
import wn.v;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f648a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static p<i, Integer, v> f649b = s0.c.c(1196920698, false, C0008a.f650w);

    /* renamed from: a9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0008a extends q implements p<i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0008a f650w = new C0008a();

        public C0008a() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                p0.a(v1.e.c(d1.f49849j, iVar, 0), null, null, o9.b.f44283a.a().B(), iVar, 56, 4);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final p<i, Integer, v> a() {
        return f649b;
    }
}
