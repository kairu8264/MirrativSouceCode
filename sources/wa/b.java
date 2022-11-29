package wa;

import ab.s;
import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameApi;
import com.dena.mirrativ.mirrativapi.otherfeatures.OtherFeaturesApi;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.retrofit.MRRequest;
import io.l;
import io.p;
import jo.f0;
import jo.q;
import kf.t;
import kf.x;
import nd.i1;
import wn.v;
import wq.c;
import ya.a0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final tq.a f58501a = zq.b.b(false, a.f58502w, 1, null);

    /* loaded from: classes2.dex */
    public static final class a extends q implements l<tq.a, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f58502w = new a();

        /* renamed from: wa.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0965a extends q implements p<xq.a, uq.a, eb.e> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0965a f58503w = new C0965a();

            public C0965a() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final eb.e invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new eb.e((t) aVar.c(f0.b(t.class), null, null), (kf.v) aVar.c(f0.b(kf.v.class), null, null), (x) aVar.c(f0.b(x.class), null, null), (LiveGameApi) aVar.c(f0.b(LiveGameApi.class), null, null), (MRRequest) aVar.c(f0.b(MRRequest.class), null, null), (OtherFeaturesApi) aVar.c(f0.b(OtherFeaturesApi.class), null, null), (MRLogger) aVar.c(f0.b(MRLogger.class), null, null), (q8.a) aVar.c(f0.b(q8.a.class), null, null));
            }
        }

        /* renamed from: wa.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0966b extends q implements p<xq.a, uq.a, eb.k> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0966b f58504w = new C0966b();

            public C0966b() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final eb.k invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new eb.k((q8.a) aVar.c(f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends q implements p<xq.a, uq.a, ab.a> {

            /* renamed from: w  reason: collision with root package name */
            public static final c f58505w = new c();

            public c() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final ab.a invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "<name for destructuring parameter 0>");
                String string = ((Context) aVar2.b(0, f0.b(Context.class))).getString(j.billing_public_key);
                jo.p.g(string, "context.getString(R.string.billing_public_key)");
                return new ab.a(string, (String) aVar2.b(1, f0.b(String.class)), (BillingClient) aVar2.b(2, f0.b(BillingClient.class)), (Context) aVar.c(f0.b(Context.class), null, null), (q8.a) aVar.c(f0.b(q8.a.class), null, null), (MRLogger) aVar.c(f0.b(MRLogger.class), null, null), (OtherFeaturesApi) aVar.c(f0.b(OtherFeaturesApi.class), null, null));
            }
        }

        /* loaded from: classes2.dex */
        public static final class d extends q implements p<xq.a, uq.a, s> {

            /* renamed from: w  reason: collision with root package name */
            public static final d f58506w = new d();

            public d() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final s invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new s((q8.a) aVar.c(f0.b(q8.a.class), null, null));
            }
        }

        /* loaded from: classes2.dex */
        public static final class e extends q implements p<xq.a, uq.a, ya.a> {

            /* renamed from: w  reason: collision with root package name */
            public static final e f58507w = new e();

            public e() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final ya.a invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$factory");
                jo.p.h(aVar2, "it");
                return new ya.a((q8.a) aVar.c(f0.b(q8.a.class), null, null), (MRRequest) aVar.c(f0.b(MRRequest.class), null, null));
            }
        }

        /* loaded from: classes2.dex */
        public static final class f extends q implements p<xq.a, uq.a, a0> {

            /* renamed from: w  reason: collision with root package name */
            public static final f f58508w = new f();

            public f() {
                super(2);
            }

            @Override // io.p
            /* renamed from: a */
            public final a0 invoke(xq.a aVar, uq.a aVar2) {
                jo.p.h(aVar, "$this$viewModel");
                jo.p.h(aVar2, "it");
                return new a0((q8.a) aVar.c(f0.b(q8.a.class), null, null), (Context) aVar.c(f0.b(Context.class), null, null), (i1) aVar.c(f0.b(i1.class), null, null));
            }
        }

        public a() {
            super(1);
        }

        public final void a(tq.a aVar) {
            jo.p.h(aVar, "$this$module");
            C0965a c0965a = C0965a.f58503w;
            c.a aVar2 = wq.c.f59298e;
            vq.c a10 = aVar2.a();
            qq.d dVar = qq.d.Factory;
            qq.a aVar3 = new qq.a(a10, f0.b(eb.e.class), null, c0965a, dVar, xn.s.k());
            String a11 = qq.b.a(aVar3.b(), null, a10);
            rq.a aVar4 = new rq.a(aVar3);
            tq.a.f(aVar, a11, aVar4, false, 4, null);
            new wn.k(aVar, aVar4);
            C0966b c0966b = C0966b.f58504w;
            vq.c a12 = aVar2.a();
            qq.a aVar5 = new qq.a(a12, f0.b(eb.k.class), null, c0966b, dVar, xn.s.k());
            String a13 = qq.b.a(aVar5.b(), null, a12);
            rq.a aVar6 = new rq.a(aVar5);
            tq.a.f(aVar, a13, aVar6, false, 4, null);
            new wn.k(aVar, aVar6);
            c cVar = c.f58505w;
            vq.c a14 = aVar2.a();
            qq.a aVar7 = new qq.a(a14, f0.b(ab.a.class), null, cVar, dVar, xn.s.k());
            String a15 = qq.b.a(aVar7.b(), null, a14);
            rq.a aVar8 = new rq.a(aVar7);
            tq.a.f(aVar, a15, aVar8, false, 4, null);
            new wn.k(aVar, aVar8);
            d dVar2 = d.f58506w;
            vq.c a16 = aVar2.a();
            qq.a aVar9 = new qq.a(a16, f0.b(s.class), null, dVar2, dVar, xn.s.k());
            String a17 = qq.b.a(aVar9.b(), null, a16);
            rq.a aVar10 = new rq.a(aVar9);
            tq.a.f(aVar, a17, aVar10, false, 4, null);
            new wn.k(aVar, aVar10);
            e eVar = e.f58507w;
            vq.c a18 = aVar2.a();
            qq.a aVar11 = new qq.a(a18, f0.b(ya.a.class), null, eVar, dVar, xn.s.k());
            String a19 = qq.b.a(aVar11.b(), null, a18);
            rq.a aVar12 = new rq.a(aVar11);
            tq.a.f(aVar, a19, aVar12, false, 4, null);
            new wn.k(aVar, aVar12);
            f fVar = f.f58508w;
            vq.c a20 = aVar2.a();
            qq.a aVar13 = new qq.a(a20, f0.b(a0.class), null, fVar, dVar, xn.s.k());
            String a21 = qq.b.a(aVar13.b(), null, a20);
            rq.a aVar14 = new rq.a(aVar13);
            tq.a.f(aVar, a21, aVar14, false, 4, null);
            new wn.k(aVar, aVar14);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(tq.a aVar) {
            a(aVar);
            return v.f59242a;
        }
    }

    public static final tq.a a() {
        return f58501a;
    }
}
