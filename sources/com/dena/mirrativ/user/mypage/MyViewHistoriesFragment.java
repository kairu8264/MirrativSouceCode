package com.dena.mirrativ.user.mypage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.x;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.user.mypage.MyViewHistoriesFragment;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.LiveArchiveStatus;
import com.dena.mirrorman.net.api.response.live.ViewHistoryParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.f0;
import jo.p;
import jo.q;
import jo.s;
import kq.a;
import pc.i2;
import rc.r0;
import rc.u1;
import rd.d1;
import ud.a5;
import ud.b5;
import ud.f2;
import ud.g2;
import ud.o2;
import uo.q0;
import wn.v;
import xn.a0;
import xn.r;
import xn.t;

/* loaded from: classes2.dex */
public final class MyViewHistoriesFragment extends Fragment implements q0 {
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public final AutoClearedValue E0;
    public final a5 F0;
    public final wn.f G0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f24460x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f24461y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f24462z0;
    public static final /* synthetic */ qo.h<Object>[] I0 = {f0.d(new s(MyViewHistoriesFragment.class, "binding", "getBinding()Lcom/dena/mirrativ/user/databinding/FragmentViewHistoriesBinding;", 0))};
    public static final a H0 = new a(null);
    public static final int J0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final MyViewHistoriesFragment a() {
            return new MyViewHistoriesFragment();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<u1> {

        /* loaded from: classes2.dex */
        public static final class a extends q implements io.a<kq.a> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Fragment f24464w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Fragment fragment) {
                super(0);
                this.f24464w = fragment;
            }

            @Override // io.a
            /* renamed from: a */
            public final kq.a invoke() {
                a.C0552a c0552a = kq.a.f38937c;
                Fragment fragment = this.f24464w;
                return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
            }
        }

        /* renamed from: com.dena.mirrativ.user.mypage.MyViewHistoriesFragment$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0214b extends q implements io.a<v0> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a f24465w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0214b(io.a aVar) {
                super(0);
                this.f24465w = aVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final v0 invoke() {
                return ((kq.a) this.f24465w.invoke()).b();
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends q implements io.a<t0.b> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a f24466w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ vq.a f24467x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.a f24468y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ xq.a f24469z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
                super(0);
                this.f24466w = aVar;
                this.f24467x = aVar2;
                this.f24468y = aVar3;
                this.f24469z = aVar4;
            }

            @Override // io.a
            /* renamed from: a */
            public final t0.b invoke() {
                io.a aVar = this.f24466w;
                vq.a aVar2 = this.f24467x;
                io.a aVar3 = this.f24468y;
                xq.a aVar4 = this.f24469z;
                kq.a aVar5 = (kq.a) aVar.invoke();
                return kq.c.a(aVar4, new kq.b(f0.b(u1.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
            }
        }

        /* loaded from: classes2.dex */
        public static final class d extends q implements io.a<u0> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ io.a f24470w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(io.a aVar) {
                super(0);
                this.f24470w = aVar;
            }

            @Override // io.a
            /* renamed from: a */
            public final u0 invoke() {
                u0 U = ((v0) this.f24470w.invoke()).U();
                jo.p.g(U, "ownerProducer().viewModelStore");
                return U;
            }
        }

        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final u1 invoke() {
            Fragment P2 = MyViewHistoriesFragment.this.P2();
            jo.p.g(P2, "requireParentFragment()");
            a aVar = new a(P2);
            xq.a a10 = gq.a.a(P2);
            C0214b c0214b = new C0214b(aVar);
            return (u1) ((androidx.lifecycle.q0) e0.a(P2, f0.b(u1.class), new d(c0214b), new c(aVar, null, null, a10)).getValue());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return MyViewHistoriesFragment.this.F3().T4();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.MyViewHistoriesFragment$observeStoreValues$4", f = "MyViewHistoriesFragment.kt", l = {242, 191}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f24472w;

        /* renamed from: x  reason: collision with root package name */
        public Object f24473x;

        /* renamed from: y  reason: collision with root package name */
        public Object f24474y;

        /* renamed from: z  reason: collision with root package name */
        public int f24475z;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.k<? extends MRError, ? extends String>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MyViewHistoriesFragment f24476w;

            public a(MyViewHistoriesFragment myViewHistoriesFragment) {
                this.f24476w = myViewHistoriesFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.k<? extends MRError, String> kVar, ao.d<? super v> dVar) {
                MRError a10 = kVar.a();
                this.f24476w.P3();
                if (a10 instanceof MRError.ForceUpdate ? true : jo.p.c(a10, MRError.Maintenance.INSTANCE)) {
                    of.n.f45411a.l(this.f24476w.N2(), a10);
                } else {
                    of.n.z(this.f24476w.N2());
                }
                return v.f59242a;
            }
        }

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:18:0x005b, B:20:0x0063), top: B:34:0x005b }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0054 -> B:34:0x005b). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f24475z
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                wn.m.b(r10)
                goto L9d
            L13:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1b:
                java.lang.Object r1 = r9.f24474y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r9.f24473x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r9.f24472w
                com.dena.mirrativ.user.mypage.MyViewHistoriesFragment r5 = (com.dena.mirrativ.user.mypage.MyViewHistoriesFragment) r5
                wn.m.b(r10)     // Catch: java.lang.Throwable -> La3
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r0
                r0 = r9
                goto L5b
            L30:
                wn.m.b(r10)
                com.dena.mirrativ.user.mypage.MyViewHistoriesFragment r10 = com.dena.mirrativ.user.mypage.MyViewHistoriesFragment.this
                nf.o r10 = com.dena.mirrativ.user.mypage.MyViewHistoriesFragment.o3(r10)
                wo.x r4 = r10.v()
                com.dena.mirrativ.user.mypage.MyViewHistoriesFragment r10 = com.dena.mirrativ.user.mypage.MyViewHistoriesFragment.this
                wo.k r1 = r4.iterator()     // Catch: java.lang.Throwable -> La3
                r5 = r10
                r10 = r9
            L45:
                r10.f24472w = r5     // Catch: java.lang.Throwable -> La3
                r10.f24473x = r4     // Catch: java.lang.Throwable -> La3
                r10.f24474y = r1     // Catch: java.lang.Throwable -> La3
                r10.f24475z = r3     // Catch: java.lang.Throwable -> La3
                java.lang.Object r6 = r1.a(r10)     // Catch: java.lang.Throwable -> La3
                if (r6 != r0) goto L54
                return r0
            L54:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r8
            L5b:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La0
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La0
                if (r10 == 0) goto L79
                java.lang.Object r10 = r4.next()     // Catch: java.lang.Throwable -> La0
                wn.v r10 = (wn.v) r10     // Catch: java.lang.Throwable -> La0
                pc.i2 r10 = com.dena.mirrativ.user.mypage.MyViewHistoriesFragment.n3(r6)     // Catch: java.lang.Throwable -> La0
                androidx.recyclerview.widget.RecyclerView r10 = r10.B     // Catch: java.lang.Throwable -> La0
                r7 = 0
                r10.x1(r7)     // Catch: java.lang.Throwable -> La0
                r10 = r0
                r0 = r1
                r1 = r4
                r4 = r5
                r5 = r6
                goto L45
            L79:
                r10 = 0
                wo.n.a(r5, r10)
                com.dena.mirrativ.user.mypage.MyViewHistoriesFragment r3 = com.dena.mirrativ.user.mypage.MyViewHistoriesFragment.this
                rc.u1 r3 = com.dena.mirrativ.user.mypage.MyViewHistoriesFragment.r3(r3)
                xo.c r3 = r3.w()
                com.dena.mirrativ.user.mypage.MyViewHistoriesFragment$d$a r4 = new com.dena.mirrativ.user.mypage.MyViewHistoriesFragment$d$a
                com.dena.mirrativ.user.mypage.MyViewHistoriesFragment r5 = com.dena.mirrativ.user.mypage.MyViewHistoriesFragment.this
                r4.<init>(r5)
                r0.f24472w = r10
                r0.f24473x = r10
                r0.f24474y = r10
                r0.f24475z = r2
                java.lang.Object r10 = r3.a(r4, r0)
                if (r10 != r1) goto L9d
                return r1
            L9d:
                wn.v r10 = wn.v.f59242a
                return r10
            La0:
                r10 = move-exception
                r4 = r5
                goto La4
            La3:
                r10 = move-exception
            La4:
                throw r10     // Catch: java.lang.Throwable -> La5
            La5:
                r0 = move-exception
                wo.n.a(r4, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.MyViewHistoriesFragment.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.l<String, v> {

        /* loaded from: classes2.dex */
        public static final class a extends q implements io.l<Intent, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ MyViewHistoriesFragment f24478w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MyViewHistoriesFragment myViewHistoriesFragment) {
                super(1);
                this.f24478w = myViewHistoriesFragment;
            }

            public final void a(Intent intent) {
                jo.p.h(intent, "intent");
                androidx.fragment.app.h j02 = this.f24478w.j0();
                if (j02 != null) {
                    j02.startActivityForResult(intent, 77);
                }
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(Intent intent) {
                a(intent);
                return v.f59242a;
            }
        }

        public e() {
            super(1);
        }

        public final void a(String str) {
            Object obj;
            jo.p.h(str, "liveId");
            List<ViewHistoryParams> f10 = MyViewHistoriesFragment.this.C3().K().f();
            if (f10 != null) {
                Iterator<T> it = f10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jo.p.c(((ViewHistoryParams) obj).getLiveId(), str)) {
                        break;
                    }
                }
                ViewHistoryParams viewHistoryParams = (ViewHistoryParams) obj;
                if (viewHistoryParams != null) {
                    MyViewHistoriesFragment myViewHistoriesFragment = MyViewHistoriesFragment.this;
                    if (!viewHistoryParams.isLive() && viewHistoryParams.getArchiveStatus() == LiveArchiveStatus.PREPARING) {
                        of.n.A(myViewHistoriesFragment.q0(), nc.i.text_archive_now_preparing, false);
                        return;
                    }
                    Context N2 = myViewHistoriesFragment.N2();
                    jo.p.g(N2, "requireContext()");
                    new x(N2, new a(myViewHistoriesFragment)).a(viewHistoryParams, Referer.VIEW_HISTORY);
                }
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.l<String, v> {
        public f() {
            super(1);
        }

        public final void a(String str) {
            jo.p.h(str, "userId");
            MyViewHistoriesFragment myViewHistoriesFragment = MyViewHistoriesFragment.this;
            tb.c A3 = myViewHistoriesFragment.A3();
            Context N2 = MyViewHistoriesFragment.this.N2();
            jo.p.g(N2, "requireContext()");
            myViewHistoriesFragment.f3(A3.s(N2, str, Referer.MY_PAGE));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(String str) {
            a(str);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.p<String, Boolean, v> {
        public g() {
            super(2);
        }

        public final void a(String str, boolean z10) {
            jo.p.h(str, "userId");
            if (!MyViewHistoriesFragment.this.E3().l()) {
                pe.b.f47398a1.a(Referer.MY_PAGE, false, true).z3(MyViewHistoriesFragment.this.p0(), "RegistrationDialog");
            } else if (z10) {
                MyViewHistoriesFragment.this.B3().s(str, Referer.VIEW_HISTORY);
            } else {
                MyViewHistoriesFragment.this.B3().K(str, Referer.VIEW_HISTORY);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(String str, Boolean bool) {
            a(str, bool.booleanValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends RecyclerView.u {
        public h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            jo.p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            MyViewHistoriesFragment.this.G3(((LinearLayoutManager) layoutManager).l2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24482w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24483x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24484y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24482w = componentCallbacks;
            this.f24483x = aVar;
            this.f24484y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f24482w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.x.class), this.f24483x, this.f24484y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24485w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24486x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24487y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24485w = componentCallbacks;
            this.f24486x = aVar;
            this.f24487y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f24485w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.o.class), this.f24486x, this.f24487y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24488w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24489x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24490y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24488w = componentCallbacks;
            this.f24489x = aVar;
            this.f24490y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24488w;
            return gq.a.a(componentCallbacks).c(f0.b(hf.v0.class), this.f24489x, this.f24490y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24491w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24492x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24493y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24491w = componentCallbacks;
            this.f24492x = aVar;
            this.f24493y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f24491w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f24492x, this.f24493y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f24494w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Fragment fragment) {
            super(0);
            this.f24494w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f24494w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f24494w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24495w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(io.a aVar) {
            super(0);
            this.f24495w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f24495w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24496w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24497x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24498y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f24499z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f24496w = aVar;
            this.f24497x = aVar2;
            this.f24498y = aVar3;
            this.f24499z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f24496w;
            vq.a aVar2 = this.f24497x;
            io.a aVar3 = this.f24498y;
            xq.a aVar4 = this.f24499z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(r0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24500w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(io.a aVar) {
            super(0);
            this.f24500w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f24500w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public MyViewHistoriesFragment() {
        super(nc.f.fragment_view_histories);
        this.f24460x0 = new da.j();
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f24461y0 = wn.g.b(iVar, new i(this, null, null));
        m mVar = new m(this);
        xq.a a10 = gq.a.a(this);
        n nVar = new n(mVar);
        this.f24462z0 = e0.a(this, f0.b(r0.class), new p(nVar), new o(mVar, null, null, a10));
        this.A0 = wn.g.a(new b());
        this.B0 = wn.g.b(iVar, new j(this, null, null));
        this.C0 = wn.g.b(iVar, new k(this, null, null));
        this.D0 = wn.g.b(iVar, new l(this, null, null));
        this.E0 = nd.a.a(this);
        this.F0 = new a5(null, 1, null);
        this.G0 = wn.g.a(new c());
    }

    public static final void I3(MyViewHistoriesFragment myViewHistoriesFragment, Boolean bool) {
        jo.p.h(myViewHistoriesFragment, "this$0");
        jo.p.g(bool, "it");
        if (bool.booleanValue()) {
            List<ViewHistoryParams> f10 = myViewHistoriesFragment.C3().K().f();
            if ((f10 != null ? f10.size() : 0) > 0) {
                androidx.lifecycle.e0<List<ud.a>> a10 = myViewHistoriesFragment.F0.a();
                List<ud.a> f11 = myViewHistoriesFragment.F0.a().f();
                if (f11 == null) {
                    f11 = xn.s.k();
                }
                a10.p(a0.o0(f11, r.d(new f2(null, 1, null))));
                return;
            }
            myViewHistoriesFragment.F0.a().p(r.d(new f2(null, 1, null)));
        }
    }

    public static final void J3(MyViewHistoriesFragment myViewHistoriesFragment, List list) {
        jo.p.h(myViewHistoriesFragment, "this$0");
        myViewHistoriesFragment.P3();
    }

    public static final void K3(MyViewHistoriesFragment myViewHistoriesFragment, MRError mRError) {
        jo.p.h(myViewHistoriesFragment, "this$0");
        if (mRError == null) {
            return;
        }
        if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
            of.n.f45411a.l(myViewHistoriesFragment.N2(), mRError);
            return;
        }
        if (mRError instanceof MRError.Failure ? true : mRError instanceof MRError.Blocked ? true : mRError instanceof MRError.Banned ? true : mRError instanceof MRError.Network) {
            androidx.lifecycle.e0<List<ud.a>> a10 = myViewHistoriesFragment.F0.a();
            String message = mRError.getMessage();
            if (message == null) {
                message = myViewHistoriesFragment.U0(nc.i.f41875e);
                jo.p.g(message, "getString(R.string.error_access)");
            }
            a10.p(r.d(new g2(message, null, 2, null)));
        }
    }

    public static final void x3(MyViewHistoriesFragment myViewHistoriesFragment, List list) {
        jo.p.h(myViewHistoriesFragment, "this$0");
        RecyclerView.h adapter = myViewHistoriesFragment.y3().B.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.ViewHistoryAdapter");
        ((d1) adapter).d(list);
    }

    public final tb.c A3() {
        return (tb.c) this.D0.getValue();
    }

    public final r0 B3() {
        return (r0) this.f24462z0.getValue();
    }

    public final u1 C3() {
        return (u1) this.A0.getValue();
    }

    public final String D3() {
        return (String) this.G0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        i2 T = i2.T(layoutInflater, viewGroup, false);
        jo.p.g(T, "inflate(inflater, container, false)");
        L3(T);
        View u10 = y3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    public final hf.v0 E3() {
        return (hf.v0) this.C0.getValue();
    }

    public final kf.x F3() {
        return (kf.x) this.f24461y0.getValue();
    }

    public final void G3(int i10) {
        String f10;
        List<ud.a> f11 = this.F0.a().f();
        if (f11 == null || (f10 = C3().C().f()) == null || jo.p.c(C3().O().f(), Boolean.TRUE)) {
            return;
        }
        if ((f10.length() == 0) || f11.size() > i10 + 5) {
            return;
        }
        B3().z(D3(), f10);
    }

    public final void H3() {
        C3().O().i(a1(), new androidx.lifecycle.f0() { // from class: rc.w1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyViewHistoriesFragment.I3(MyViewHistoriesFragment.this, (Boolean) obj);
            }
        });
        C3().K().i(a1(), new androidx.lifecycle.f0() { // from class: rc.x1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyViewHistoriesFragment.J3(MyViewHistoriesFragment.this, (List) obj);
            }
        });
        C3().q().i(a1(), new androidx.lifecycle.f0() { // from class: rc.v1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyViewHistoriesFragment.K3(MyViewHistoriesFragment.this, (MRError) obj);
            }
        });
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    public final void L3(i2 i2Var) {
        this.E0.a(this, I0[0], i2Var);
    }

    public final void M3() {
        a1().g().a(new androidx.lifecycle.h() { // from class: com.dena.mirrativ.user.mypage.MyViewHistoriesFragment$setupCoroutineLifecycle$1
            @Override // androidx.lifecycle.h, androidx.lifecycle.m
            public void g(u uVar) {
                p.h(uVar, "owner");
                uo.r0.d(MyViewHistoriesFragment.this, null, 1, null);
            }
        });
    }

    public final void N3() {
        y3().B.setAdapter(new d1());
        y3().B.setLayoutManager(new LinearLayoutManager(q0()));
        y3().B.setItemAnimator(null);
        y3().B.g(new p001if.c(de.e.b(this, 1), 0, 0, 0, O0().getDimensionPixelSize(nc.c.f41807e) / 2, 0, 46, null));
    }

    public final void O3() {
        RecyclerView.h adapter = y3().B.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.ViewHistoryAdapter");
        d1 d1Var = (d1) adapter;
        d1Var.j(new e());
        d1Var.l(new f());
        d1Var.k(new g());
        y3().B.k(new h());
    }

    public final void P3() {
        if (jo.p.c(C3().O().f(), Boolean.TRUE)) {
            return;
        }
        List<ViewHistoryParams> f10 = C3().K().f();
        if (f10 == null) {
            f10 = xn.s.k();
        }
        if (f10.isEmpty()) {
            androidx.lifecycle.e0<List<ud.a>> a10 = this.F0.a();
            o2.a aVar = o2.E;
            String U0 = U0(nc.i.empty_view_history);
            jo.p.g(U0, "getString(R.string.empty_view_history)");
            a10.p(r.d(o2.a.b(aVar, U0, null, de.e.b(this, 48), de.e.b(this, 48), 0, 0, 50, null)));
            return;
        }
        androidx.lifecycle.e0<List<ud.a>> a11 = this.F0.a();
        ArrayList arrayList = new ArrayList(t.u(f10, 10));
        for (ViewHistoryParams viewHistoryParams : f10) {
            b5.a aVar2 = b5.f54796c0;
            Context N2 = N2();
            jo.p.g(N2, "requireContext()");
            arrayList.add(aVar2.a(N2, viewHistoryParams));
        }
        a11.p(arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        if (jo.p.c(C3().O().f(), Boolean.TRUE)) {
            return;
        }
        B3().I(D3());
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        M3();
        N3();
        O3();
        w3();
        H3();
        B3().t();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f24460x0.getCoroutineContext();
    }

    public final void w3() {
        this.F0.a().i(a1(), new androidx.lifecycle.f0() { // from class: rc.y1
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                MyViewHistoriesFragment.x3(MyViewHistoriesFragment.this, (List) obj);
            }
        });
    }

    public final i2 y3() {
        return (i2) this.E0.b(this, I0[0]);
    }

    public final nf.o z3() {
        return (nf.o) this.B0.getValue();
    }
}
