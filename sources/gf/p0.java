package gf;

import ae.w6;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.c3;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.AutoClearedValue;
import ha.a;
import java.io.Serializable;
import kq.a;
import nd.f1;
import org.greenrobot.eventbus.ThreadMode;
import tb.c;

/* loaded from: classes2.dex */
public final class p0 extends Fragment implements uo.q0 {
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public final AutoClearedValue D0;
    public final wn.f E0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f33448x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f33449y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f33450z0;
    public static final /* synthetic */ qo.h<Object>[] G0 = {jo.f0.d(new jo.s(p0.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/FragmentLiveGiftRankingUsersBinding;", 0))};
    public static final a F0 = new a(null);
    public static final int H0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p0 a(String str, String str2, jf.x xVar) {
            jo.p.h(str, "referer");
            jo.p.h(str2, "liveId");
            jo.p.h(xVar, "rankingType");
            p0 p0Var = new p0();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            bundle.putString("EXTRA_KEY_LIVE_ID", str2);
            bundle.putSerializable("EXTRA_KEY_RANKING_TYPE", xVar);
            p0Var.V2(bundle);
            return p0Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<uq.a> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(p0.this.v3());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = p0.this.M2().getString("EXTRA_KEY_LIVE_ID");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<Integer, wn.v> {
        public d() {
            super(1);
        }

        public final void a(int i10) {
            tb.a i11 = c.a.i(p0.this.t3(), p0.this.x3().h().get(i10).getUser().getUserId(), p0.this.w3(), false, false, 8, null);
            i11.a().z3(p0.this.p0(), i11.b());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num) {
            a(num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends RecyclerView.u {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            String f10;
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int j22 = linearLayoutManager.j2();
            ha.a f11 = p0.this.x3().k().f();
            if (f11 == null || (f10 = p0.this.x3().j().f()) == null || f11.a()) {
                return;
            }
            if ((f10.length() == 0) || linearLayoutManager.j0() > j22 + 5) {
                return;
            }
            p0.this.r3().d(p0.this.w3(), p0.this.u3(), f10);
        }
    }

    @co.f(c = "com.dena.mirrorman.fragment.LiveGiftRankingUsersFragment$onViewCreated$3", f = "LiveGiftRankingUsersFragment.kt", l = {153}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f33455w;

        /* renamed from: x  reason: collision with root package name */
        public Object f33456x;

        /* renamed from: y  reason: collision with root package name */
        public Object f33457y;

        /* renamed from: z  reason: collision with root package name */
        public int f33458z;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00bf, TryCatch #2 {all -> 0x00bf, blocks: (B:17:0x0054, B:19:0x005c, B:20:0x0083, B:22:0x0089, B:24:0x0091, B:25:0x0094, B:27:0x009c, B:28:0x00b0), top: B:43:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r14.f33458z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r14.f33457y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r14.f33456x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r14.f33455w
                gf.p0 r4 = (gf.p0) r4
                wn.m.b(r15)     // Catch: java.lang.Throwable -> Lc2
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r14
                goto L53
            L20:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L28:
                wn.m.b(r15)
                gf.p0 r15 = gf.p0.this
                nf.u r15 = gf.p0.q3(r15)
                wo.x r3 = r15.i()
                gf.p0 r15 = gf.p0.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lc2
                r4 = r15
                r15 = r14
            L3d:
                r15.f33455w = r4     // Catch: java.lang.Throwable -> Lc2
                r15.f33456x = r3     // Catch: java.lang.Throwable -> Lc2
                r15.f33457y = r1     // Catch: java.lang.Throwable -> Lc2
                r15.f33458z = r2     // Catch: java.lang.Throwable -> Lc2
                java.lang.Object r5 = r1.a(r15)     // Catch: java.lang.Throwable -> Lc2
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r13 = r0
                r0 = r15
                r15 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r13
            L53:
                r6 = 0
                java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.lang.Throwable -> Lbf
                boolean r15 = r15.booleanValue()     // Catch: java.lang.Throwable -> Lbf
                if (r15 == 0) goto Lb9
                java.lang.Object r15 = r3.next()     // Catch: java.lang.Throwable -> Lbf
                java.util.List r15 = (java.util.List) r15     // Catch: java.lang.Throwable -> Lbf
                ae.w6 r6 = gf.p0.l3(r5)     // Catch: java.lang.Throwable -> Lbf
                androidx.recyclerview.widget.RecyclerView r6 = r6.D     // Catch: java.lang.Throwable -> Lbf
                androidx.recyclerview.widget.RecyclerView$h r6 = r6.getAdapter()     // Catch: java.lang.Throwable -> Lbf
                java.lang.String r7 = "null cannot be cast to non-null type com.dena.mirrorman.adapter.LiveGiftRankingUserAdapter"
                jo.p.f(r6, r7)     // Catch: java.lang.Throwable -> Lbf
                rd.k0 r6 = (rd.k0) r6     // Catch: java.lang.Throwable -> Lbf
                java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbf
                r8 = 10
                int r8 = xn.t.u(r15, r8)     // Catch: java.lang.Throwable -> Lbf
                r7.<init>(r8)     // Catch: java.lang.Throwable -> Lbf
                r8 = 0
                java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> Lbf
            L83:
                boolean r9 = r15.hasNext()     // Catch: java.lang.Throwable -> Lbf
                if (r9 == 0) goto Lb0
                java.lang.Object r9 = r15.next()     // Catch: java.lang.Throwable -> Lbf
                int r10 = r8 + 1
                if (r8 >= 0) goto L94
                xn.s.t()     // Catch: java.lang.Throwable -> Lbf
            L94:
                com.dena.mirrorman.net.api.response.live.LiveGiftRankingUser r9 = (com.dena.mirrorman.net.api.response.live.LiveGiftRankingUser) r9     // Catch: java.lang.Throwable -> Lbf
                android.content.Context r8 = r5.q0()     // Catch: java.lang.Throwable -> Lbf
                if (r8 == 0) goto Lb3
                ud.y1$a r8 = ud.y1.f55735n     // Catch: java.lang.Throwable -> Lbf
                android.content.Context r11 = r5.N2()     // Catch: java.lang.Throwable -> Lbf
                java.lang.String r12 = "requireContext()"
                jo.p.g(r11, r12)     // Catch: java.lang.Throwable -> Lbf
                ud.y1 r8 = r8.a(r11, r10, r9)     // Catch: java.lang.Throwable -> Lbf
                r7.add(r8)     // Catch: java.lang.Throwable -> Lbf
                r8 = r10
                goto L83
            Lb0:
                r6.d(r7)     // Catch: java.lang.Throwable -> Lbf
            Lb3:
                r15 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            Lb9:
                wo.n.a(r4, r6)
                wn.v r15 = wn.v.f59242a
                return r15
            Lbf:
                r15 = move-exception
                r3 = r4
                goto Lc3
            Lc2:
                r15 = move-exception
            Lc3:
                throw r15     // Catch: java.lang.Throwable -> Lc4
            Lc4:
                r0 = move-exception
                wo.n.a(r3, r15)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: gf.p0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<wn.v> {
        public g() {
            super(0);
        }

        public final void a() {
            p0.this.r3().e(p0.this.w3(), p0.this.u3());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<jf.x> {
        public h() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final jf.x invoke() {
            Serializable serializable = p0.this.M2().getSerializable("EXTRA_KEY_RANKING_TYPE");
            jo.p.e(serializable);
            return (jf.x) serializable;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<String> {
        public i() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = p0.this.M2().getString("EXTRA_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<od.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33462w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33463x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33464y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33462w = componentCallbacks;
            this.f33463x = aVar;
            this.f33464y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.v] */
        @Override // io.a
        public final od.v invoke() {
            ComponentCallbacks componentCallbacks = this.f33462w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.v.class), this.f33463x, this.f33464y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f33465w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33466x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33467y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f33465w = componentCallbacks;
            this.f33466x = aVar;
            this.f33467y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f33465w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f33466x, this.f33467y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f33468w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f33468w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f33468w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33469w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(io.a aVar) {
            super(0);
            this.f33469w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f33469w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33470w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f33471x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f33472y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f33473z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f33470w = aVar;
            this.f33471x = aVar2;
            this.f33472y = aVar3;
            this.f33473z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f33470w;
            vq.a aVar2 = this.f33471x;
            io.a aVar3 = this.f33472y;
            xq.a aVar4 = this.f33473z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.u.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f33474w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar) {
            super(0);
            this.f33474w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f33474w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<uq.a> {
        public p() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(p0.this.v3());
        }
    }

    public p0() {
        b bVar = new b();
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f33449y0 = wn.g.b(iVar, new j(this, null, bVar));
        this.f33450z0 = wn.g.a(new i());
        this.A0 = wn.g.a(new c());
        this.B0 = wn.g.a(new h());
        p pVar = new p();
        l lVar = new l(this);
        xq.a a10 = gq.a.a(this);
        m mVar = new m(lVar);
        this.C0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.u.class), new o(mVar), new n(lVar, null, pVar, a10));
        this.D0 = nd.a.a(this);
        this.E0 = wn.g.b(iVar, new k(this, null, null));
    }

    public static final void y3(p0 p0Var, ha.a aVar) {
        jo.p.h(p0Var, "this$0");
        if (aVar instanceof a.d) {
            p0Var.s3().E.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            p0Var.s3().E.b(StatusView.b.C0181b.f20790w);
        } else if (aVar instanceof a.c) {
        } else {
            if (aVar instanceof a.e) {
                p0Var.s3().E.b(new StatusView.b.d(p0Var.U0(f1.f41984p2), 0.0f, 2, null));
            } else if ((aVar instanceof a.C0439a) && p0Var.x3().h().isEmpty()) {
                StatusView statusView = p0Var.s3().E;
                String message = ((a.C0439a) aVar).b().getMessage();
                if (message == null) {
                    message = p0Var.U0(f1.f41966c);
                    jo.p.g(message, "getString(R.string.error_access)");
                }
                statusView.b(new StatusView.b.a(message, new g()));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        w6 T = w6.T(layoutInflater, viewGroup, false);
        jo.p.g(T, "inflate(\n            inf…          false\n        )");
        z3(T);
        dq.c.c().p(this);
        View u10 = s3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        dq.c.c().r(this);
        super.H1();
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        s3().D.setLayoutManager(new LinearLayoutManager(N2()));
        s3().D.setAdapter(new rd.k0(new d()));
        s3().D.k(new e());
        uo.l.d(this, null, null, new f(null), 3, null);
        x3().k().i(a1(), new androidx.lifecycle.f0() { // from class: gf.o0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                p0.y3(p0.this, (ha.a) obj);
            }
        });
        r3().e(w3(), u3());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f33448x0.getCoroutineContext();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(c3 c3Var) {
        jo.p.h(c3Var, "event");
        s3().D.setNestedScrollingEnabled(v3() == c3Var.a());
    }

    public final od.v r3() {
        return (od.v) this.f33449y0.getValue();
    }

    public final w6 s3() {
        return (w6) this.D0.b(this, G0[0]);
    }

    public final tb.c t3() {
        return (tb.c) this.E0.getValue();
    }

    public final String u3() {
        return (String) this.A0.getValue();
    }

    public final jf.x v3() {
        return (jf.x) this.B0.getValue();
    }

    public final String w3() {
        return (String) this.f33450z0.getValue();
    }

    public final nf.u x3() {
        return (nf.u) this.C0.getValue();
    }

    public final void z3(w6 w6Var) {
        this.D0.a(this, G0[0], w6Var);
    }
}
