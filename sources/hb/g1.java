package hb;

import com.dena.mirrativ.mirrativapi.emomo.EmomoApi;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameApi;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.database.MirrorDatabase;
import com.dena.mirrorman.net.retrofit.MRRequest;
import wq.c;

/* loaded from: classes2.dex */
public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final tq.a f34794a = zq.b.b(false, a.f34795w, 1, null);

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<tq.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f34795w = new a();

        /* renamed from: hb.g1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0441a extends jo.q implements io.p<xq.a, uq.a, i> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0441a f34796w = new C0441a();

            public C0441a() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final i invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$single");
                jo.p.h(aVar2, "it");
                return new i((MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (EmomoApi) aVar.c(jo.f0.b(EmomoApi.class), null, null), (LiveGameApi) aVar.c(jo.f0.b(LiveGameApi.class), null, null), (hf.c) aVar.c(jo.f0.b(hf.c.class), null, null), (kf.x) aVar.c(jo.f0.b(kf.x.class), null, null), (MRLogger) aVar.c(jo.f0.b(MRLogger.class), null, null), (hf.v0) aVar.c(jo.f0.b(hf.v0.class), null, null), (hf.d0) aVar.c(jo.f0.b(hf.d0.class), null, null), (q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (nd.i1) aVar.c(jo.f0.b(nd.i1.class), null, null), (MirrorDatabase) aVar.c(jo.f0.b(MirrorDatabase.class), null, null));
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends jo.q implements io.p<xq.a, uq.a, hb.b> {

            /* renamed from: w  reason: collision with root package name */
            public static final b f34797w = new b();

            public b() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hb.b invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new hb.b((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends jo.q implements io.p<xq.a, uq.a, jb.a> {

            /* renamed from: w  reason: collision with root package name */
            public static final c f34798w = new c();

            public c() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final jb.a invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new jb.a((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null), (MRRequest) aVar.c(jo.f0.b(MRRequest.class), null, null), (hf.v0) aVar.c(jo.f0.b(hf.v0.class), null, null), (ef.a) aVar.c(jo.f0.b(ef.a.class), null, null));
            }
        }

        /* loaded from: classes2.dex */
        public static final class d extends jo.q implements io.p<xq.a, uq.a, jb.q> {

            /* renamed from: w  reason: collision with root package name */
            public static final d f34799w = new d();

            public d() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final jb.q invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new jb.q((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes2.dex */
        public static final class e extends jo.q implements io.p<xq.a, uq.a, hb.d> {

            /* renamed from: w  reason: collision with root package name */
            public static final e f34800w = new e();

            public e() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final hb.d invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new hb.d((q8.a) aVar.c(jo.f0.b(q8.a.class), null, null));
            }
        }

        public a() {
            super(1);
        }

        public final void a(tq.a aVar) {
            jo.p.h(aVar, "$this$module");
            C0441a c0441a = C0441a.f34796w;
            qq.d dVar = qq.d.Singleton;
            c.a aVar2 = wq.c.f59298e;
            qq.a aVar3 = new qq.a(aVar2.a(), jo.f0.b(i.class), null, c0441a, dVar, xn.s.k());
            String a10 = qq.b.a(aVar3.b(), null, aVar2.a());
            rq.d<?> dVar2 = new rq.d<>(aVar3);
            tq.a.f(aVar, a10, dVar2, false, 4, null);
            if (aVar.a()) {
                aVar.b().add(dVar2);
            }
            new wn.k(aVar, dVar2);
            b bVar = b.f34797w;
            vq.c a11 = aVar2.a();
            qq.d dVar3 = qq.d.Factory;
            qq.a aVar4 = new qq.a(a11, jo.f0.b(hb.b.class), null, bVar, dVar3, xn.s.k());
            String a12 = qq.b.a(aVar4.b(), null, a11);
            rq.a aVar5 = new rq.a(aVar4);
            tq.a.f(aVar, a12, aVar5, false, 4, null);
            new wn.k(aVar, aVar5);
            c cVar = c.f34798w;
            vq.c a13 = aVar2.a();
            qq.a aVar6 = new qq.a(a13, jo.f0.b(jb.a.class), null, cVar, dVar3, xn.s.k());
            String a14 = qq.b.a(aVar6.b(), null, a13);
            rq.a aVar7 = new rq.a(aVar6);
            tq.a.f(aVar, a14, aVar7, false, 4, null);
            new wn.k(aVar, aVar7);
            d dVar4 = d.f34799w;
            vq.c a15 = aVar2.a();
            qq.a aVar8 = new qq.a(a15, jo.f0.b(jb.q.class), null, dVar4, dVar3, xn.s.k());
            String a16 = qq.b.a(aVar8.b(), null, a15);
            rq.a aVar9 = new rq.a(aVar8);
            tq.a.f(aVar, a16, aVar9, false, 4, null);
            new wn.k(aVar, aVar9);
            e eVar = e.f34800w;
            vq.c a17 = aVar2.a();
            qq.a aVar10 = new qq.a(a17, jo.f0.b(hb.d.class), null, eVar, dVar3, xn.s.k());
            String a18 = qq.b.a(aVar10.b(), null, a17);
            rq.a aVar11 = new rq.a(aVar10);
            tq.a.f(aVar, a18, aVar11, false, 4, null);
            new wn.k(aVar, aVar11);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(tq.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    public static final tq.a a() {
        return f34794a;
    }
}
