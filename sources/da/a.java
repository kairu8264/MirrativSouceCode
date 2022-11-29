package da;

import android.content.Context;
import android.view.WindowManager;
import io.l;
import io.p;
import jo.f0;
import jo.q;
import wn.k;
import wn.v;
import wq.c;
import xn.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final tq.a f29327a = zq.b.b(false, C0276a.f29328w, 1, null);

    /* renamed from: da.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0276a extends q implements l<tq.a, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0276a f29328w = new C0276a();

        /* renamed from: da.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0277a extends q implements p<xq.a, uq.a, fa.c> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0277a f29329w = new C0277a();

            public C0277a() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final fa.c invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                Object systemService = ((Context) aVar.c(f0.b(Context.class), null, null)).getSystemService("window");
                jo.p.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                return new fa.c((WindowManager) systemService, null, 2, null);
            }
        }

        /* renamed from: da.a$a$b */
        /* loaded from: classes.dex */
        public static final class b extends q implements p<xq.a, uq.a, ga.a> {

            /* renamed from: w  reason: collision with root package name */
            public static final b f29330w = new b();

            public b() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final ga.a invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new ga.b((fa.c) aVar.c(f0.b(fa.c.class), null, null));
            }
        }

        public C0276a() {
            super(1);
        }

        public final void a(tq.a aVar) {
            jo.p.h(aVar, "$this$module");
            C0277a c0277a = C0277a.f29329w;
            qq.d dVar = qq.d.Singleton;
            c.a aVar2 = wq.c.f59298e;
            qq.a aVar3 = new qq.a(aVar2.a(), f0.b(fa.c.class), null, c0277a, dVar, s.k());
            String a10 = qq.b.a(aVar3.b(), null, aVar2.a());
            rq.d<?> dVar2 = new rq.d<>(aVar3);
            tq.a.f(aVar, a10, dVar2, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar2);
            }
            new k(aVar, dVar2);
            b bVar = b.f29330w;
            qq.a aVar4 = new qq.a(aVar2.a(), f0.b(ga.a.class), null, bVar, dVar, s.k());
            String a11 = qq.b.a(aVar4.b(), null, aVar2.a());
            rq.d<?> dVar3 = new rq.d<>(aVar4);
            tq.a.f(aVar, a11, dVar3, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar3);
            }
            new k(aVar, dVar3);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(tq.a aVar) {
            a(aVar);
            return v.f59242a;
        }
    }

    public static final tq.a a() {
        return f29327a;
    }
}
