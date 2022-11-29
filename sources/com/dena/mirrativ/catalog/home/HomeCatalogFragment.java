package com.dena.mirrativ.catalog.home;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.o;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.navigation.NavController;
import be.t1;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.catalog.home.HomeCatalogFragment;
import com.dena.mirrativ.catalog.mission.MissionActivity;
import com.dena.mirrativ.catalog.search.SearchActivity;
import com.dena.mirrativ.mirrativapi.user.SeasonRatingStatusResponse;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.clientlog.logs.AdImp;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.Quiz;
import com.dena.mirrorman.customview.MissionTopIconView;
import com.dena.mirrorman.database.MirrorDatabase;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.Ad;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.dena.mirrorman.util.FragmentRunner;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jf.b0;
import kotlin.KotlinNothingValueException;
import kq.a;
import nd.i1;
import r8.e1;
import r8.h1;
import tb.c;
import ud.h2;
import uo.q0;
import uo.r0;
import wb.a;
import yd.g1;

/* loaded from: classes.dex */
public final class HomeCatalogFragment extends Fragment implements t1.b, vb.r, vb.t, vb.s, q0 {
    public static final a U0 = new a(null);
    public static final int V0 = 8;
    public final wn.f A0;
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public final wn.f E0;
    public final wn.f F0;
    public final wn.f G0;
    public final wn.f H0;
    public final wn.f I0;
    public final wn.f J0;
    public final wn.f K0;
    public final wn.f L0;
    public final wn.f M0;
    public final wn.f N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final FragmentRunner R0;
    public final androidx.activity.result.c<Intent> S0;
    public final wn.f T0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f20567x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final String f20568y0;

    /* renamed from: z0  reason: collision with root package name */
    public t8.q f20569z0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20570w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20571x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20572y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20570w = componentCallbacks;
            this.f20571x = aVar;
            this.f20572y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f20570w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f20571x, this.f20572y);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<uq.a> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(HomeCatalogFragment.this.f20568y0);
        }
    }

    /* loaded from: classes.dex */
    public static final class b0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f20574w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(Fragment fragment) {
            super(0);
            this.f20574w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f20574w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f20574w.L2());
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<NavController> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final NavController invoke() {
            return androidx.navigation.fragment.a.a(HomeCatalogFragment.this);
        }
    }

    /* loaded from: classes.dex */
    public static final class c0 extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20576w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(io.a aVar) {
            super(0);
            this.f20576w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f20576w.invoke()).b();
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.home.HomeCatalogFragment$observeStoreValues$11", f = "HomeCatalogFragment.kt", l = {465}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f20577w;

        /* renamed from: x  reason: collision with root package name */
        public Object f20578x;

        /* renamed from: y  reason: collision with root package name */
        public Object f20579y;

        /* renamed from: z  reason: collision with root package name */
        public int f20580z;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:16:0x0053, B:18:0x005c, B:20:0x0072, B:22:0x0078, B:24:0x007f), top: B:35:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:35:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f20580z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f20579y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f20578x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f20577w
                com.dena.mirrativ.catalog.home.HomeCatalogFragment r4 = (com.dena.mirrativ.catalog.home.HomeCatalogFragment) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> La6
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrativ.catalog.home.HomeCatalogFragment r10 = com.dena.mirrativ.catalog.home.HomeCatalogFragment.this
                x8.p r10 = com.dena.mirrativ.catalog.home.HomeCatalogFragment.C3(r10)
                wo.x r3 = r10.j()
                com.dena.mirrativ.catalog.home.HomeCatalogFragment r10 = com.dena.mirrativ.catalog.home.HomeCatalogFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> La6
                r4 = r10
                r10 = r9
            L3d:
                r10.f20577w = r4     // Catch: java.lang.Throwable -> La6
                r10.f20578x = r3     // Catch: java.lang.Throwable -> La6
                r10.f20579y = r1     // Catch: java.lang.Throwable -> La6
                r10.f20580z = r2     // Catch: java.lang.Throwable -> La6
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> La6
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La3
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La3
                r6 = 0
                if (r10 == 0) goto L9d
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> La3
                wn.v r10 = (wn.v) r10     // Catch: java.lang.Throwable -> La3
                x8.p r10 = com.dena.mirrativ.catalog.home.HomeCatalogFragment.C3(r5)     // Catch: java.lang.Throwable -> La3
                androidx.lifecycle.LiveData r10 = r10.h()     // Catch: java.lang.Throwable -> La3
                java.lang.Object r10 = r10.f()     // Catch: java.lang.Throwable -> La3
                java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> La3
                if (r10 == 0) goto L97
                t8.q r7 = com.dena.mirrativ.catalog.home.HomeCatalogFragment.x3(r5)     // Catch: java.lang.Throwable -> La3
                if (r7 != 0) goto L7e
                java.lang.String r7 = "binding"
                jo.p.v(r7)     // Catch: java.lang.Throwable -> La3
                goto L7f
            L7e:
                r6 = r7
            L7f:
                com.dena.mirrativ.catalog.home.app.AppsView r6 = r6.D     // Catch: java.lang.Throwable -> La3
                java.lang.String r7 = "it"
                jo.p.g(r10, r7)     // Catch: java.lang.Throwable -> La3
                x8.p r7 = com.dena.mirrativ.catalog.home.HomeCatalogFragment.C3(r5)     // Catch: java.lang.Throwable -> La3
                androidx.lifecycle.LiveData r7 = r7.k()     // Catch: java.lang.Throwable -> La3
                java.lang.Object r7 = r7.f()     // Catch: java.lang.Throwable -> La3
                com.dena.mirrorman.net.api.response.App$AppParams r7 = (com.dena.mirrorman.net.api.response.App.AppParams) r7     // Catch: java.lang.Throwable -> La3
                r6.C(r10, r7)     // Catch: java.lang.Throwable -> La3
            L97:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L9d:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            La3:
                r10 = move-exception
                r3 = r4
                goto La7
            La6:
                r10 = move-exception
            La7:
                throw r10     // Catch: java.lang.Throwable -> La8
            La8:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.catalog.home.HomeCatalogFragment.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class d0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20581w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20582x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20583y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f20584z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f20581w = aVar;
            this.f20582x = aVar2;
            this.f20583y = aVar3;
            this.f20584z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f20581w;
            vq.a aVar2 = this.f20582x;
            io.a aVar3 = this.f20583y;
            xq.a aVar4 = this.f20584z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.y.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.home.HomeCatalogFragment$observeStoreValues$12", f = "HomeCatalogFragment.kt", l = {465}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f20585w;

        /* renamed from: x  reason: collision with root package name */
        public Object f20586x;

        /* renamed from: y  reason: collision with root package name */
        public Object f20587y;

        /* renamed from: z  reason: collision with root package name */
        public int f20588z;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:16:0x0053, B:18:0x005c, B:20:0x0068, B:22:0x006f), top: B:33:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:33:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f20588z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f20587y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f20586x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f20585w
                com.dena.mirrativ.catalog.home.HomeCatalogFragment r4 = (com.dena.mirrativ.catalog.home.HomeCatalogFragment) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L83
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                com.dena.mirrativ.catalog.home.HomeCatalogFragment r9 = com.dena.mirrativ.catalog.home.HomeCatalogFragment.this
                nf.o r9 = com.dena.mirrativ.catalog.home.HomeCatalogFragment.A3(r9)
                wo.x r3 = r9.v()
                com.dena.mirrativ.catalog.home.HomeCatalogFragment r9 = com.dena.mirrativ.catalog.home.HomeCatalogFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L83
                r4 = r9
                r9 = r8
            L3d:
                r9.f20585w = r4     // Catch: java.lang.Throwable -> L83
                r9.f20586x = r3     // Catch: java.lang.Throwable -> L83
                r9.f20587y = r1     // Catch: java.lang.Throwable -> L83
                r9.f20588z = r2     // Catch: java.lang.Throwable -> L83
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L83
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L80
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L80
                r6 = 0
                if (r9 == 0) goto L7a
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L80
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L80
                t8.q r9 = com.dena.mirrativ.catalog.home.HomeCatalogFragment.x3(r5)     // Catch: java.lang.Throwable -> L80
                if (r9 != 0) goto L6e
                java.lang.String r9 = "binding"
                jo.p.v(r9)     // Catch: java.lang.Throwable -> L80
                goto L6f
            L6e:
                r6 = r9
            L6f:
                com.google.android.material.appbar.AppBarLayout r9 = r6.B     // Catch: java.lang.Throwable -> L80
                r9.r(r2, r2)     // Catch: java.lang.Throwable -> L80
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L7a:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L80:
                r9 = move-exception
                r3 = r4
                goto L84
            L83:
                r9 = move-exception
            L84:
                throw r9     // Catch: java.lang.Throwable -> L85
            L85:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.catalog.home.HomeCatalogFragment.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class e0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20589w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(io.a aVar) {
            super(0);
            this.f20589w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f20589w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.home.HomeCatalogFragment$observeStoreValues$14", f = "HomeCatalogFragment.kt", l = {373}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20590w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<ub.b> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ HomeCatalogFragment f20592w;

            /* renamed from: com.dena.mirrativ.catalog.home.HomeCatalogFragment$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0179a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ HomeCatalogFragment f20593w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ ub.b f20594x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0179a(HomeCatalogFragment homeCatalogFragment, ub.b bVar) {
                    super(0);
                    this.f20593w = homeCatalogFragment;
                    this.f20594x = bVar;
                }

                public final void a() {
                    tb.c P3 = this.f20593w.P3();
                    Context N2 = this.f20593w.N2();
                    jo.p.g(N2, "requireContext()");
                    tb.a A0 = P3.A0(N2, this.f20594x);
                    if (this.f20593w.p0().e0(A0.b()) != null) {
                        return;
                    }
                    A0.a().z3(this.f20593w.p0(), A0.b());
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            public a(HomeCatalogFragment homeCatalogFragment) {
                this.f20592w = homeCatalogFragment;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(ub.b bVar, ao.d<? super wn.v> dVar) {
                this.f20592w.R0.c(new C0179a(this.f20592w, bVar));
                return wn.v.f59242a;
            }
        }

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f20590w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<ub.b> f10 = HomeCatalogFragment.this.R3().f();
                a aVar = new a(HomeCatalogFragment.this);
                this.f20590w = 1;
                if (f10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class f0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f20595w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(Fragment fragment) {
            super(0);
            this.f20595w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f20595w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.home.HomeCatalogFragment$observeStoreValues$15", f = "HomeCatalogFragment.kt", l = {382}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20596w;

        @co.f(c = "com.dena.mirrativ.catalog.home.HomeCatalogFragment$observeStoreValues$15$1", f = "HomeCatalogFragment.kt", l = {383}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f20598w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ HomeCatalogFragment f20599x;

            /* renamed from: com.dena.mirrativ.catalog.home.HomeCatalogFragment$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0180a implements xo.d<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ HomeCatalogFragment f20600w;

                public C0180a(HomeCatalogFragment homeCatalogFragment) {
                    this.f20600w = homeCatalogFragment;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                    tb.c P3 = this.f20600w.P3();
                    Context N2 = this.f20600w.N2();
                    jo.p.g(N2, "requireContext()");
                    SeasonRatingStatusResponse f10 = this.f20600w.R3().h().f();
                    if (f10 == null) {
                        return wn.v.f59242a;
                    }
                    tb.a p02 = P3.p0(N2, f10);
                    if (this.f20600w.p0().e0("DIALOG_TAG_RANKING_PRIZE") == null && this.f20600w.p0().e0("DIALOG_TAG_SEASON_RATING_RESULT") == null) {
                        p02.a().z3(this.f20600w.p0(), "DIALOG_TAG_SEASON_RATING_RESULT");
                        return wn.v.f59242a;
                    }
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HomeCatalogFragment homeCatalogFragment, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f20599x = homeCatalogFragment;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f20599x, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f20598w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    xo.w<wn.v> i11 = this.f20599x.R3().i();
                    C0180a c0180a = new C0180a(this.f20599x);
                    this.f20598w = 1;
                    if (i11.a(c0180a, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f20596w;
            if (i10 == 0) {
                wn.m.b(obj);
                androidx.lifecycle.o g10 = HomeCatalogFragment.this.a1().g();
                jo.p.g(g10, "viewLifecycleOwner.lifecycle");
                o.c cVar = o.c.RESUMED;
                a aVar = new a(HomeCatalogFragment.this, null);
                this.f20596w = 1;
                if (RepeatOnLifecycleKt.a(g10, cVar, aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g0 extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20601w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(io.a aVar) {
            super(0);
            this.f20601w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f20601w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l<App.AppParams, wn.v> {
        public h() {
            super(1);
        }

        public final void a(App.AppParams appParams) {
            App.AdFooterBannerParams footerBanner;
            jo.p.h(appParams, "app");
            t8.q qVar = HomeCatalogFragment.this.f20569z0;
            t8.q qVar2 = null;
            if (qVar == null) {
                jo.p.v("binding");
                qVar = null;
            }
            qVar.I.setVisibility(8);
            App.AppParams f10 = HomeCatalogFragment.this.O3().k().f();
            boolean c10 = jo.p.c(f10 != null ? f10.getAppId() : null, appParams.getAppId());
            if (c10) {
                HomeCatalogFragment.this.N3().g(null);
                tb.b a10 = HomeCatalogFragment.this.P3().a(HomeCatalogFragment.this.f20568y0, Referer.HOME_SELECT, new a.c(Referer.HOME_SELECT, "2", null));
                androidx.fragment.app.z k10 = HomeCatalogFragment.this.p0().k();
                t8.q qVar3 = HomeCatalogFragment.this.f20569z0;
                if (qVar3 == null) {
                    jo.p.v("binding");
                } else {
                    qVar2 = qVar3;
                }
                k10.s(qVar2.J.getId(), a10.a(), a10.b()).i();
            } else {
                App.AdParams ad2 = appParams.getAd();
                if (ad2 != null && (footerBanner = ad2.getFooterBanner()) != null) {
                    HomeCatalogFragment homeCatalogFragment = HomeCatalogFragment.this;
                    App.AdBackground background = footerBanner.getBackground();
                    List<Integer> gradient = background != null ? background.getGradient() : null;
                    if (!(gradient == null || gradient.isEmpty())) {
                        of.n nVar = of.n.f45411a;
                        App.AdBackground background2 = footerBanner.getBackground();
                        jo.p.e(background2);
                        List<Integer> gradient2 = background2.getGradient();
                        jo.p.e(gradient2);
                        int[] s10 = nVar.s(gradient2);
                        t8.q qVar4 = homeCatalogFragment.f20569z0;
                        if (qVar4 == null) {
                            jo.p.v("binding");
                            qVar4 = null;
                        }
                        qVar4.I.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, s10));
                    }
                    t8.q qVar5 = homeCatalogFragment.f20569z0;
                    if (qVar5 == null) {
                        jo.p.v("binding");
                        qVar5 = null;
                    }
                    GlideRequest<Drawable> load = GlideApp.with(qVar5.u()).load(footerBanner.getIconUrl());
                    t8.q qVar6 = homeCatalogFragment.f20569z0;
                    if (qVar6 == null) {
                        jo.p.v("binding");
                        qVar6 = null;
                    }
                    load.into(qVar6.G);
                    t8.q qVar7 = homeCatalogFragment.f20569z0;
                    if (qVar7 == null) {
                        jo.p.v("binding");
                        qVar7 = null;
                    }
                    qVar7.H.setText(footerBanner.getTitle());
                    t8.q qVar8 = homeCatalogFragment.f20569z0;
                    if (qVar8 == null) {
                        jo.p.v("binding");
                        qVar8 = null;
                    }
                    qVar8.F.setText(footerBanner.getDescription());
                    t8.q qVar9 = homeCatalogFragment.f20569z0;
                    if (qVar9 == null) {
                        jo.p.v("binding");
                        qVar9 = null;
                    }
                    qVar9.I.setVisibility(0);
                    Puree.d(new AdImp(footerBanner.getId(), Referer.HOME_SELECT));
                }
                HomeCatalogFragment.this.N3().g(appParams);
                tb.b a11 = HomeCatalogFragment.this.P3().a(HomeCatalogFragment.this.f20568y0, Referer.HOME_SELECT, new a.c(Referer.HOME_SELECT, "2", appParams.getAppId()));
                androidx.fragment.app.z k11 = HomeCatalogFragment.this.p0().k();
                t8.q qVar10 = HomeCatalogFragment.this.f20569z0;
                if (qVar10 == null) {
                    jo.p.v("binding");
                } else {
                    qVar2 = qVar10;
                }
                k11.s(qVar2.J.getId(), a11.a(), a11.b()).i();
            }
            MRLogger S3 = HomeCatalogFragment.this.S3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_HOME_CLICK_APP);
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_APP_ID, c10 ? "" : appParams.getAppId())));
            S3.sendLog(builder.build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(App.AppParams appParams) {
            a(appParams);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20603w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20604x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20605y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f20606z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f20603w = aVar;
            this.f20604x = aVar2;
            this.f20605y = aVar3;
            this.f20606z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f20603w;
            vq.a aVar2 = this.f20604x;
            io.a aVar3 = this.f20605y;
            xq.a aVar4 = this.f20606z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(od.z.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.a<wn.v> {
        public i() {
            super(0);
        }

        public final void a() {
            App.AppParams f10 = HomeCatalogFragment.this.O3().k().f();
            if (f10 != null) {
                HomeCatalogFragment homeCatalogFragment = HomeCatalogFragment.this;
                App.AdParams ad2 = f10.getAd();
                homeCatalogFragment.m4(ad2 != null ? ad2.getHeaderBanner() : null);
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20608w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(io.a aVar) {
            super(0);
            this.f20608w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f20608w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.a<wn.v> {
        public j() {
            super(0);
        }

        public final void a() {
            App.AppParams f10 = HomeCatalogFragment.this.O3().k().f();
            if (f10 != null) {
                HomeCatalogFragment.this.N3().e(f10);
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f20610w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(Fragment fragment) {
            super(0);
            this.f20610w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f20610w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.l<View, wn.v> {
        public k() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (HomeCatalogFragment.this.q0() == null) {
                return;
            }
            HomeCatalogFragment.this.W3().m(e1.Q2);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k0 extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20612w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(io.a aVar) {
            super(0);
            this.f20612w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f20612w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.l<View, wn.v> {
        public l() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            androidx.activity.result.c cVar = HomeCatalogFragment.this.S0;
            MissionActivity.a aVar = MissionActivity.V;
            Context N2 = HomeCatalogFragment.this.N2();
            jo.p.g(N2, "requireContext()");
            cVar.a(aVar.a(N2, Referer.HOME_SELECT));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20614w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20615x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20616y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f20617z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f20614w = aVar;
            this.f20615x = aVar2;
            this.f20616y = aVar3;
            this.f20617z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f20614w;
            vq.a aVar2 = this.f20615x;
            io.a aVar3 = this.f20616y;
            xq.a aVar4 = this.f20617z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(x8.p.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.l<View, wn.v> {
        public m() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            MRLogger S3 = HomeCatalogFragment.this.S3();
            MRLog.Companion companion = MRLog.Companion;
            HomeCatalogFragment homeCatalogFragment = HomeCatalogFragment.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_OFFER_WALL_BUTTON_TAP);
            builder.setPageId(Referer.HOME_SELECT);
            builder.setPayload(xn.r.d(wn.q.a("url", homeCatalogFragment.L3().m())));
            S3.sendLog(builder.build());
            ga.a X3 = HomeCatalogFragment.this.X3();
            Context N2 = HomeCatalogFragment.this.N2();
            jo.p.g(N2, "requireContext()");
            Uri parse = Uri.parse(HomeCatalogFragment.this.L3().m());
            jo.p.g(parse, "parse(featureStore.offerWallUrl)");
            X3.a(N2, parse);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20619w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(io.a aVar) {
            super(0);
            this.f20619w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f20619w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.a<nf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20620w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20621x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20622y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20620w = componentCallbacks;
            this.f20621x = aVar;
            this.f20622y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.r] */
        @Override // io.a
        public final nf.r invoke() {
            ComponentCallbacks componentCallbacks = this.f20620w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.r.class), this.f20621x, this.f20622y);
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20623w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20624x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20625y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20623w = componentCallbacks;
            this.f20624x = aVar;
            this.f20625y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f20623w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(i1.class), this.f20624x, this.f20625y);
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.a<hf.d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20626w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20627x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20628y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20626w = componentCallbacks;
            this.f20627x = aVar;
            this.f20628y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final hf.d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f20626w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.d0.class), this.f20627x, this.f20628y);
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends jo.q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20629w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20630x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20631y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20629w = componentCallbacks;
            this.f20630x = aVar;
            this.f20631y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f20629w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.v0.class), this.f20630x, this.f20631y);
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends jo.q implements io.a<ga.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20632w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20633x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20634y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20632w = componentCallbacks;
            this.f20633x = aVar;
            this.f20634y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ga.a] */
        @Override // io.a
        public final ga.a invoke() {
            ComponentCallbacks componentCallbacks = this.f20632w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ga.a.class), this.f20633x, this.f20634y);
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends jo.q implements io.a<x8.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20635w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20636x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20637y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20635w = componentCallbacks;
            this.f20636x = aVar;
            this.f20637y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [x8.a, java.lang.Object] */
        @Override // io.a
        public final x8.a invoke() {
            ComponentCallbacks componentCallbacks = this.f20635w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(x8.a.class), this.f20636x, this.f20637y);
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends jo.q implements io.a<od.s> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20638w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20639x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20640y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20638w = componentCallbacks;
            this.f20639x = aVar;
            this.f20640y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.s, java.lang.Object] */
        @Override // io.a
        public final od.s invoke() {
            ComponentCallbacks componentCallbacks = this.f20638w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.s.class), this.f20639x, this.f20640y);
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends jo.q implements io.a<MirrorDatabase> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20641w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20642x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20643y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20641w = componentCallbacks;
            this.f20642x = aVar;
            this.f20643y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.dena.mirrorman.database.MirrorDatabase] */
        @Override // io.a
        public final MirrorDatabase invoke() {
            ComponentCallbacks componentCallbacks = this.f20641w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MirrorDatabase.class), this.f20642x, this.f20643y);
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20644w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20645x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20646y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20644w = componentCallbacks;
            this.f20645x = aVar;
            this.f20646y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f20644w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f20645x, this.f20646y);
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20647w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20648x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20649y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20647w = componentCallbacks;
            this.f20648x = aVar;
            this.f20649y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f20647w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.k.class), this.f20648x, this.f20649y);
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20650w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20651x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20652y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20650w = componentCallbacks;
            this.f20651x = aVar;
            this.f20652y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            ComponentCallbacks componentCallbacks = this.f20650w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.k.class), this.f20651x, this.f20652y);
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20653w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20654x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20655y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20653w = componentCallbacks;
            this.f20654x = aVar;
            this.f20655y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f20653w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.o.class), this.f20654x, this.f20655y);
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends jo.q implements io.a<ef.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20656w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20657x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20658y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20656w = componentCallbacks;
            this.f20657x = aVar;
            this.f20658y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ef.a] */
        @Override // io.a
        public final ef.a invoke() {
            ComponentCallbacks componentCallbacks = this.f20656w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ef.a.class), this.f20657x, this.f20658y);
        }
    }

    public HomeCatalogFragment() {
        String uuid = UUID.randomUUID().toString();
        jo.p.g(uuid, "randomUUID().toString()");
        this.f20568y0 = uuid;
        f0 f0Var = new f0(this);
        xq.a a10 = gq.a.a(this);
        g0 g0Var = new g0(f0Var);
        this.A0 = androidx.fragment.app.e0.a(this, jo.f0.b(od.z.class), new i0(g0Var), new h0(f0Var, null, null, a10));
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.B0 = wn.g.b(iVar, new s(this, null, null));
        this.C0 = wn.g.b(iVar, new t(this, null, null));
        this.D0 = wn.g.b(iVar, new u(this, null, null));
        this.E0 = wn.g.b(iVar, new v(this, null, null));
        b bVar = new b();
        j0 j0Var = new j0(this);
        xq.a a11 = gq.a.a(this);
        k0 k0Var = new k0(j0Var);
        this.F0 = androidx.fragment.app.e0.a(this, jo.f0.b(x8.p.class), new m0(k0Var), new l0(j0Var, null, bVar, a11));
        b0 b0Var = new b0(this);
        xq.a a12 = gq.a.a(this);
        c0 c0Var = new c0(b0Var);
        this.G0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.y.class), new e0(c0Var), new d0(b0Var, null, null, a12));
        this.H0 = wn.g.b(iVar, new w(this, null, null));
        this.I0 = wn.g.b(iVar, new x(this, null, null));
        this.J0 = wn.g.b(iVar, new y(this, null, null));
        this.K0 = wn.g.b(iVar, new z(this, null, null));
        this.L0 = wn.g.b(iVar, new a0(this, null, null));
        this.M0 = wn.g.b(iVar, new n(this, null, null));
        this.N0 = wn.g.b(iVar, new o(this, null, null));
        this.O0 = wn.g.b(iVar, new p(this, null, null));
        this.P0 = wn.g.b(iVar, new q(this, null, null));
        this.Q0 = wn.g.b(iVar, new r(this, null, null));
        this.R0 = new FragmentRunner(this);
        androidx.activity.result.c<Intent> I2 = I2(new c.c(), new androidx.activity.result.b() { // from class: x8.h
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                HomeCatalogFragment.Z3(HomeCatalogFragment.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(I2, "registerForActivityResul…loadMissionStatus()\n    }");
        this.S0 = I2;
        this.T0 = wn.g.a(new c());
    }

    public static final void Z3(HomeCatalogFragment homeCatalogFragment, androidx.activity.result.a aVar) {
        jo.p.h(homeCatalogFragment, "this$0");
        homeCatalogFragment.N3().f();
    }

    public static final void b4(HomeCatalogFragment homeCatalogFragment, List list) {
        Object obj;
        boolean z10;
        jo.p.h(homeCatalogFragment, "this$0");
        if (list != null && homeCatalogFragment.a1().g().b() == o.c.RESUMED) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (homeCatalogFragment.V3().C().c((String) obj) == null) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                sd.g.U0.a(str, Boolean.FALSE).z3(homeCatalogFragment.p0(), "WebViewDialogFragment");
                homeCatalogFragment.V3().C().b(new zd.a(str, null, 2, null));
            }
        }
    }

    public static final void c4(HomeCatalogFragment homeCatalogFragment, h2 h2Var) {
        jo.p.h(homeCatalogFragment, "this$0");
        if (h2Var == null) {
            return;
        }
        t8.q qVar = homeCatalogFragment.f20569z0;
        if (qVar == null) {
            jo.p.v("binding");
            qVar = null;
        }
        qVar.K.a(h2Var);
    }

    public static final void d4(HomeCatalogFragment homeCatalogFragment, Boolean bool) {
        jo.p.h(homeCatalogFragment, "this$0");
        t8.q qVar = homeCatalogFragment.f20569z0;
        if (qVar == null) {
            jo.p.v("binding");
            qVar = null;
        }
        MissionTopIconView missionTopIconView = qVar.K;
        jo.p.g(missionTopIconView, "binding.missionTopIconView");
        jo.p.g(bool, "it");
        missionTopIconView.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:4:0x000b, B:12:0x0019, B:14:0x001d, B:15:0x0021, B:16:0x0031, B:18:0x0035, B:19:0x0039), top: B:27:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:4:0x000b, B:12:0x0019, B:14:0x001d, B:15:0x0021, B:16:0x0031, B:18:0x0035, B:19:0x0039), top: B:27:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e4(com.dena.mirrativ.catalog.home.HomeCatalogFragment r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "this$0"
            jo.p.h(r6, r0)
            r0 = 1
            r1 = 0
            java.lang.String r2 = "binding"
            if (r7 == 0) goto L16
            int r3 = r7.length()     // Catch: java.lang.Exception -> L14
            if (r3 != 0) goto L12
            goto L16
        L12:
            r3 = 0
            goto L17
        L14:
            r7 = move-exception
            goto L54
        L16:
            r3 = r0
        L17:
            if (r3 == 0) goto L31
            t8.q r7 = r6.f20569z0     // Catch: java.lang.Exception -> L14
            if (r7 != 0) goto L21
            jo.p.v(r2)     // Catch: java.lang.Exception -> L14
            r7 = r1
        L21:
            androidx.appcompat.widget.AppCompatImageView r7 = r7.N     // Catch: java.lang.Exception -> L14
            android.content.Context r0 = r6.N2()     // Catch: java.lang.Exception -> L14
            int r3 = r8.d1.f49852o     // Catch: java.lang.Exception -> L14
            android.graphics.drawable.Drawable r0 = c3.a.f(r0, r3)     // Catch: java.lang.Exception -> L14
            r7.setImageDrawable(r0)     // Catch: java.lang.Exception -> L14
            goto L6f
        L31:
            t8.q r3 = r6.f20569z0     // Catch: java.lang.Exception -> L14
            if (r3 != 0) goto L39
            jo.p.v(r2)     // Catch: java.lang.Exception -> L14
            r3 = r1
        L39:
            androidx.appcompat.widget.AppCompatImageView r3 = r3.N     // Catch: java.lang.Exception -> L14
            java.lang.String r4 = "binding.myPageButtonImageView"
            jo.p.g(r3, r4)     // Catch: java.lang.Exception -> L14
            r4 = 13
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L14
            int r5 = r8.b1.f49836f     // Catch: java.lang.Exception -> L14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L14
            td.a.t(r3, r7, r4, r0, r5)     // Catch: java.lang.Exception -> L14
            goto L6f
        L54:
            g9.a.c(r7)
            t8.q r7 = r6.f20569z0
            if (r7 != 0) goto L5f
            jo.p.v(r2)
            goto L60
        L5f:
            r1 = r7
        L60:
            androidx.appcompat.widget.AppCompatImageView r7 = r1.N
            android.content.Context r6 = r6.N2()
            int r0 = r8.d1.f49852o
            android.graphics.drawable.Drawable r6 = c3.a.f(r6, r0)
            r7.setImageDrawable(r6)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.catalog.home.HomeCatalogFragment.e4(com.dena.mirrativ.catalog.home.HomeCatalogFragment, java.lang.String):void");
    }

    public static final void f4(HomeCatalogFragment homeCatalogFragment, String str) {
        jo.p.h(homeCatalogFragment, "this$0");
        t8.q qVar = homeCatalogFragment.f20569z0;
        if (qVar == null) {
            jo.p.v("binding");
            qVar = null;
        }
        AppCompatImageView appCompatImageView = qVar.O;
        jo.p.g(appCompatImageView, "binding.offerWallImageView");
        jo.p.g(str, "offerWallUrl");
        boolean z10 = true;
        if (!(str.length() > 0)) {
            Boolean f10 = homeCatalogFragment.L3().f().f();
            jo.p.e(f10);
            if (!f10.booleanValue()) {
                z10 = false;
            }
        }
        appCompatImageView.setVisibility(z10 ? 0 : 8);
    }

    public static final void g4(HomeCatalogFragment homeCatalogFragment, Boolean bool) {
        jo.p.h(homeCatalogFragment, "this$0");
        t8.q qVar = homeCatalogFragment.f20569z0;
        if (qVar == null) {
            jo.p.v("binding");
            qVar = null;
        }
        View view = qVar.L;
        jo.p.g(bool, "shouldShow");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void h4(HomeCatalogFragment homeCatalogFragment, ub.c cVar) {
        jo.p.h(homeCatalogFragment, "this$0");
        if (homeCatalogFragment.p0().e0("DIALOG_TAG_RANKING_PRIZE") == null && homeCatalogFragment.p0().e0("DIALOG_TAG_SEASON_RATING_RESULT") == null) {
            tb.c P3 = homeCatalogFragment.P3();
            if (cVar == null) {
                return;
            }
            P3.n(cVar).a().z3(homeCatalogFragment.p0(), "DIALOG_TAG_RANKING_PRIZE");
        }
    }

    public static final void i4(HomeCatalogFragment homeCatalogFragment, Boolean bool) {
        jo.p.h(homeCatalogFragment, "this$0");
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        pe.b.f47398a1.a(Referer.HOME_SELECT, false, true).z3(homeCatalogFragment.O2(), "RegistrationDialog");
    }

    public static final void j4(HomeCatalogFragment homeCatalogFragment, Boolean bool) {
        jo.p.h(homeCatalogFragment, "this$0");
        t8.q qVar = homeCatalogFragment.f20569z0;
        if (qVar == null) {
            jo.p.v("binding");
            qVar = null;
        }
        View u10 = qVar.C.u();
        jo.p.g(u10, "binding.emptyView.root");
        td.c.e(u10, bool);
    }

    public static final void k4(HomeCatalogFragment homeCatalogFragment, List list) {
        jo.p.h(homeCatalogFragment, "this$0");
        if (list == null) {
            return;
        }
        t8.q qVar = homeCatalogFragment.f20569z0;
        if (qVar == null) {
            jo.p.v("binding");
            qVar = null;
        }
        qVar.D.C(list, homeCatalogFragment.O3().k().f());
    }

    public static final void l4(HomeCatalogFragment homeCatalogFragment, App.AppParams appParams) {
        jo.p.h(homeCatalogFragment, "this$0");
        t8.q qVar = homeCatalogFragment.f20569z0;
        t8.q qVar2 = null;
        if (qVar == null) {
            jo.p.v("binding");
            qVar = null;
        }
        qVar.D.setSelectedApp(appParams);
        List<App.AppParams> f10 = homeCatalogFragment.O3().h().f();
        if (f10 != null) {
            t8.q qVar3 = homeCatalogFragment.f20569z0;
            if (qVar3 == null) {
                jo.p.v("binding");
            } else {
                qVar2 = qVar3;
            }
            qVar2.D.C(f10, appParams);
        }
    }

    public static final void o4(HomeCatalogFragment homeCatalogFragment, View view) {
        jo.p.h(homeCatalogFragment, "this$0");
        App.AppParams f10 = homeCatalogFragment.O3().k().f();
        if (f10 != null) {
            App.AdParams ad2 = f10.getAd();
            homeCatalogFragment.m4(ad2 != null ? ad2.getFooterBanner() : null);
        }
    }

    public static final void p4(HomeCatalogFragment homeCatalogFragment, View view) {
        jo.p.h(homeCatalogFragment, "this$0");
        if (homeCatalogFragment.q0() == null) {
            return;
        }
        MRLogger S3 = homeCatalogFragment.S3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_TOOLBAR_SEARCH);
        builder.setPageId(Referer.HOME_SELECT);
        S3.sendLog(builder.build());
        SearchActivity.a aVar = SearchActivity.Q;
        Context N2 = homeCatalogFragment.N2();
        jo.p.g(N2, "requireContext()");
        homeCatalogFragment.f3(aVar.a(N2, null, null, null));
    }

    @Override // be.t1.b
    public void C(String str) {
        jo.p.h(str, "shareText");
        Log.d("HomeCatalogFragment", str);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        f3(intent);
        Puree.d(new Quiz.Click("banner_invite", true));
        hf.b.f35490a.d().a();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        t8.q T = t8.q.T(LayoutInflater.from(N2()), viewGroup, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        this.f20569z0 = T;
        if (T == null) {
            jo.p.v("binding");
            T = null;
        }
        View u10 = T.u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        r0.d(this, null, 1, null);
        super.I1();
    }

    public final nf.k L3() {
        return (nf.k) this.I0.getValue();
    }

    public final nf.o M3() {
        return (nf.o) this.J0.getValue();
    }

    @Override // vb.r
    public void N(boolean z10) {
        N3().i(z10);
    }

    public final x8.a N3() {
        return (x8.a) this.B0.getValue();
    }

    public final x8.p O3() {
        return (x8.p) this.F0.getValue();
    }

    public final tb.c P3() {
        return (tb.c) this.L0.getValue();
    }

    public final od.s Q3() {
        return (od.s) this.C0.getValue();
    }

    @Override // vb.s
    public void R(int i10) {
        Q3().d(i10);
    }

    public final nf.r R3() {
        return (nf.r) this.M0.getValue();
    }

    public final MRLogger S3() {
        return (MRLogger) this.E0.getValue();
    }

    public final od.z T3() {
        return (od.z) this.A0.getValue();
    }

    public final nf.y U3() {
        return (nf.y) this.G0.getValue();
    }

    public final MirrorDatabase V3() {
        return (MirrorDatabase) this.D0.getValue();
    }

    public final NavController W3() {
        return (NavController) this.T0.getValue();
    }

    public final ga.a X3() {
        return (ga.a) this.Q0.getValue();
    }

    public final of.k Y3() {
        return (of.k) this.H0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        T3().u();
        Q3().e(Referer.HOME_SELECT);
        Q3().f();
        N3().f();
    }

    public final void a4() {
        O3().l().i(a1(), new androidx.lifecycle.f0() { // from class: x8.o
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeCatalogFragment.i4(HomeCatalogFragment.this, (Boolean) obj);
            }
        });
        O3().m().i(a1(), new androidx.lifecycle.f0() { // from class: x8.m
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeCatalogFragment.j4(HomeCatalogFragment.this, (Boolean) obj);
            }
        });
        O3().h().i(a1(), new androidx.lifecycle.f0() { // from class: x8.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeCatalogFragment.k4(HomeCatalogFragment.this, (List) obj);
            }
        });
        O3().k().i(a1(), new androidx.lifecycle.f0() { // from class: x8.k
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeCatalogFragment.l4(HomeCatalogFragment.this, (App.AppParams) obj);
            }
        });
        O3().g().i(a1(), new androidx.lifecycle.f0() { // from class: x8.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeCatalogFragment.b4(HomeCatalogFragment.this, (List) obj);
            }
        });
        O3().i().i(a1(), new androidx.lifecycle.f0() { // from class: x8.j
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeCatalogFragment.c4(HomeCatalogFragment.this, (h2) obj);
            }
        });
        O3().n().i(a1(), new androidx.lifecycle.f0() { // from class: x8.n
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeCatalogFragment.d4(HomeCatalogFragment.this, (Boolean) obj);
            }
        });
        U3().k().i(a1(), new androidx.lifecycle.f0() { // from class: x8.d
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeCatalogFragment.e4(HomeCatalogFragment.this, (String) obj);
            }
        });
        L3().n().i(a1(), new androidx.lifecycle.f0() { // from class: x8.c
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeCatalogFragment.f4(HomeCatalogFragment.this, (String) obj);
            }
        });
        M3().y().i(a1(), new androidx.lifecycle.f0() { // from class: x8.l
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeCatalogFragment.g4(HomeCatalogFragment.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        R3().g().i(a1(), new androidx.lifecycle.f0() { // from class: x8.i
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                HomeCatalogFragment.h4(HomeCatalogFragment.this, (ub.c) obj);
            }
        });
        uo.l.d(this, null, null, new f(null), 3, null);
        androidx.lifecycle.u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        uo.l.d(androidx.lifecycle.v.a(a12), null, null, new g(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        n4();
        a4();
        tb.b a10 = P3().a(this.f20568y0, Referer.HOME_SELECT, new a.c(Referer.HOME, "2", null, 4, null));
        androidx.fragment.app.z k10 = p0().k();
        t8.q qVar = this.f20569z0;
        if (qVar == null) {
            jo.p.v("binding");
            qVar = null;
        }
        k10.s(qVar.J.getId(), a10.a(), a10.b()).i();
        N3().h();
        T3().t();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f20567x0.getCoroutineContext();
    }

    @Override // vb.s
    public void i(String str, String str2) {
        jo.p.h(str, "title");
        jo.p.h(str2, "url");
        tb.c P3 = P3();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        f3(P3.k0(N2, str, str2));
    }

    @Override // vb.t
    public void j() {
        tb.c P3 = P3();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        f3(c.a.b(P3, N2, null, 2, null));
    }

    public final void m4(Ad.Actions actions) {
        List<String> actions2;
        List<String> actions3 = actions != null ? actions.getActions() : null;
        if ((actions3 == null || actions3.isEmpty()) || actions == null || (actions2 = actions.getActions()) == null) {
            return;
        }
        for (String str : actions2) {
            jf.b0 a10 = Y3().a(str);
            if (!(a10 instanceof b0.l0)) {
                HandleUrlSchemeActivity.a aVar = HandleUrlSchemeActivity.f25127b0;
                Context N2 = N2();
                jo.p.g(N2, "requireContext()");
                f3(aVar.a(N2, Referer.HOME_SELECT, a10));
                MRLogger S3 = S3();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CLICK);
                wn.k[] kVarArr = new wn.k[3];
                String id2 = actions.getId();
                if (id2 == null) {
                    id2 = "";
                }
                kVarArr[0] = wn.q.a("ad_id", id2);
                kVarArr[1] = wn.q.a(MRLog.PAYLOAD_ACTION_URL, str);
                kVarArr[2] = wn.q.a("page_id", Referer.HOME_SELECT);
                builder.setPayload(xn.s.m(kVarArr));
                S3.sendLog(builder.build());
            } else {
                g9.a aVar2 = g9.a.f32826a;
                aVar2.b("custom scheme DEFAULT unexpected url " + str, new Object[0]);
                of.n.r(N2(), str);
            }
        }
    }

    public final void n4() {
        t8.q qVar = this.f20569z0;
        t8.q qVar2 = null;
        if (qVar == null) {
            jo.p.v("binding");
            qVar = null;
        }
        qVar.E.setOnClickListener(new View.OnClickListener() { // from class: x8.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeCatalogFragment.o4(HomeCatalogFragment.this, view);
            }
        });
        t8.q qVar3 = this.f20569z0;
        if (qVar3 == null) {
            jo.p.v("binding");
            qVar3 = null;
        }
        qVar3.D.setOnAppClickListener(new h());
        t8.q qVar4 = this.f20569z0;
        if (qVar4 == null) {
            jo.p.v("binding");
            qVar4 = null;
        }
        qVar4.D.getMyAppButton().setOnClickPRListener(new i());
        t8.q qVar5 = this.f20569z0;
        if (qVar5 == null) {
            jo.p.v("binding");
            qVar5 = null;
        }
        qVar5.D.getMyAppButton().setOnClickMyAppListener(new j());
        t8.q qVar6 = this.f20569z0;
        if (qVar6 == null) {
            jo.p.v("binding");
            qVar6 = null;
        }
        qVar6.P.setOnClickListener(new View.OnClickListener() { // from class: x8.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeCatalogFragment.p4(HomeCatalogFragment.this, view);
            }
        });
        t8.q qVar7 = this.f20569z0;
        if (qVar7 == null) {
            jo.p.v("binding");
            qVar7 = null;
        }
        AppCompatImageView appCompatImageView = qVar7.N;
        jo.p.g(appCompatImageView, "binding.myPageButtonImageView");
        g1.a(appCompatImageView, new k());
        t8.q qVar8 = this.f20569z0;
        if (qVar8 == null) {
            jo.p.v("binding");
            qVar8 = null;
        }
        MissionTopIconView missionTopIconView = qVar8.K;
        jo.p.g(missionTopIconView, "binding.missionTopIconView");
        g1.a(missionTopIconView, new l());
        t8.q qVar9 = this.f20569z0;
        if (qVar9 == null) {
            jo.p.v("binding");
            qVar9 = null;
        }
        qVar9.C.C.setText(h1.text_no_broadcast_myapp);
        t8.q qVar10 = this.f20569z0;
        if (qVar10 == null) {
            jo.p.v("binding");
        } else {
            qVar2 = qVar10;
        }
        AppCompatImageView appCompatImageView2 = qVar2.O;
        jo.p.g(appCompatImageView2, "binding.offerWallImageView");
        g1.a(appCompatImageView2, new m());
    }

    @Override // be.t1.b
    public void y() {
        Puree.d(new Quiz.Click("banner_invite", false));
    }
}
