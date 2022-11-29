package com.dena.mirrativ.catalog.follow;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.navigation.NavController;
import com.dena.mirrativ.catalog.follow.FollowCatalogFragment;
import com.dena.mirrativ.catalog.mission.MissionActivity;
import com.dena.mirrativ.catalog.search.SearchActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.MissionTopIconView;
import com.dena.mirrorman.customview.UrgeUsersView;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.Graph;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.List;
import java.util.UUID;
import jo.f0;
import jo.j0;
import kq.a;
import p.d;
import r8.e1;
import ud.h2;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.q0;
import uo.r0;
import wb.a;

/* loaded from: classes.dex */
public final class FollowCatalogFragment extends Fragment implements q0 {
    public final String A0;
    public final wn.f B0;
    public final wn.f C0;
    public final wn.f D0;
    public final wn.f E0;
    public final wn.f F0;
    public final wn.f G0;
    public final wn.f H0;
    public final wn.f I0;
    public final FragmentRunner J0;
    public final androidx.activity.result.c<Intent> K0;
    public final wn.f L0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ da.j f20409x0 = new da.j();

    /* renamed from: y0  reason: collision with root package name */
    public final ao.g f20410y0;

    /* renamed from: z0  reason: collision with root package name */
    public t8.m f20411z0;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<uq.a> {
        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(FollowCatalogFragment.this.A0);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<NavController> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final NavController invoke() {
            return androidx.navigation.fragment.a.a(FollowCatalogFragment.this);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            if (FollowCatalogFragment.this.q0() == null) {
                return;
            }
            FollowCatalogFragment.this.M3().m(e1.Q2);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            androidx.activity.result.c cVar = FollowCatalogFragment.this.K0;
            MissionActivity.a aVar = MissionActivity.V;
            Context N2 = FollowCatalogFragment.this.N2();
            jo.p.g(N2, "requireContext()");
            cVar.a(aVar.a(N2, Referer.HOME_FOLLOW));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            MRLogger J3 = FollowCatalogFragment.this.J3();
            MRLog.Companion companion = MRLog.Companion;
            FollowCatalogFragment followCatalogFragment = FollowCatalogFragment.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_OFFER_WALL_BUTTON_TAP);
            builder.setPageId(Referer.HOME_FOLLOW);
            builder.setPayload(xn.r.d(wn.q.a("url", followCatalogFragment.E3().m())));
            J3.sendLog(builder.build());
            new d.a().a().a(FollowCatalogFragment.this.N2(), Uri.parse(FollowCatalogFragment.this.E3().m()));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<List<? extends String>, wn.v> {
        public f() {
            super(1);
        }

        public final void a(List<String> list) {
            jo.p.h(list, "userIds");
            if (list.isEmpty()) {
                return;
            }
            FollowCatalogFragment.this.F3().d(list);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(List<? extends String> list) {
            a(list);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.follow.FollowCatalogFragment$onViewCreated$6", f = "FollowCatalogFragment.kt", l = {254}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f20418w;

        /* renamed from: x  reason: collision with root package name */
        public Object f20419x;

        /* renamed from: y  reason: collision with root package name */
        public Object f20420y;

        /* renamed from: z  reason: collision with root package name */
        public int f20421z;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ FollowCatalogFragment f20422w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ tb.b f20423x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FollowCatalogFragment followCatalogFragment, tb.b bVar) {
                super(0);
                this.f20422w = followCatalogFragment;
                this.f20423x = bVar;
            }

            public final void a() {
                androidx.fragment.app.z k10 = this.f20422w.p0().k();
                t8.m mVar = this.f20422w.f20411z0;
                if (mVar == null) {
                    jo.p.v("binding");
                    mVar = null;
                }
                k10.s(mVar.C.getId(), this.f20423x.a(), this.f20423x.b()).i();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:6:0x0019, B:15:0x0050, B:17:0x0059, B:12:0x0041, B:11:0x0037), top: B:27:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:15:0x0050). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r1 = r18
                java.lang.Object r0 = bo.c.c()
                int r2 = r1.f20421z
                r3 = 1
                if (r2 == 0) goto L28
                if (r2 != r3) goto L20
                java.lang.Object r2 = r1.f20420y
                wo.k r2 = (wo.k) r2
                java.lang.Object r4 = r1.f20419x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r1.f20418w
                com.dena.mirrativ.catalog.follow.FollowCatalogFragment r5 = (com.dena.mirrativ.catalog.follow.FollowCatalogFragment) r5
                wn.m.b(r19)     // Catch: java.lang.Throwable -> L92
                r7 = r19
                r6 = r1
                goto L50
            L20:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L28:
                wn.m.b(r19)
                com.dena.mirrativ.catalog.follow.FollowCatalogFragment r2 = com.dena.mirrativ.catalog.follow.FollowCatalogFragment.this
                u8.l r2 = com.dena.mirrativ.catalog.follow.FollowCatalogFragment.w3(r2)
                wo.x r4 = r2.h()
                com.dena.mirrativ.catalog.follow.FollowCatalogFragment r2 = com.dena.mirrativ.catalog.follow.FollowCatalogFragment.this
                wo.k r5 = r4.iterator()     // Catch: java.lang.Throwable -> L92
                r6 = r1
                r17 = r5
                r5 = r2
                r2 = r17
            L41:
                r6.f20418w = r5     // Catch: java.lang.Throwable -> L92
                r6.f20419x = r4     // Catch: java.lang.Throwable -> L92
                r6.f20420y = r2     // Catch: java.lang.Throwable -> L92
                r6.f20421z = r3     // Catch: java.lang.Throwable -> L92
                java.lang.Object r7 = r2.a(r6)     // Catch: java.lang.Throwable -> L92
                if (r7 != r0) goto L50
                return r0
            L50:
                r8 = 0
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L92
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L92
                if (r7 == 0) goto L8c
                java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L92
                wn.v r7 = (wn.v) r7     // Catch: java.lang.Throwable -> L92
                tb.c r7 = com.dena.mirrativ.catalog.follow.FollowCatalogFragment.z3(r5)     // Catch: java.lang.Throwable -> L92
                java.lang.String r8 = com.dena.mirrativ.catalog.follow.FollowCatalogFragment.A3(r5)     // Catch: java.lang.Throwable -> L92
                java.lang.String r9 = "home.follow"
                wb.a$c r15 = new wb.a$c     // Catch: java.lang.Throwable -> L92
                java.lang.String r11 = "home.follow"
                java.lang.String r12 = "1"
                r13 = 0
                r14 = 4
                r16 = 0
                r10 = r15
                r3 = r15
                r15 = r16
                r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L92
                tb.b r3 = r7.a(r8, r9, r3)     // Catch: java.lang.Throwable -> L92
                com.dena.mirrorman.util.FragmentRunner r7 = com.dena.mirrativ.catalog.follow.FollowCatalogFragment.x3(r5)     // Catch: java.lang.Throwable -> L92
                com.dena.mirrativ.catalog.follow.FollowCatalogFragment$g$a r8 = new com.dena.mirrativ.catalog.follow.FollowCatalogFragment$g$a     // Catch: java.lang.Throwable -> L92
                r8.<init>(r5, r3)     // Catch: java.lang.Throwable -> L92
                r7.c(r8)     // Catch: java.lang.Throwable -> L92
                r3 = 1
                goto L41
            L8c:
                wo.n.a(r4, r8)
                wn.v r0 = wn.v.f59242a
                return r0
            L92:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch: java.lang.Throwable -> L95
            L95:
                r0 = move-exception
                r3 = r0
                wo.n.a(r4, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.catalog.follow.FollowCatalogFragment.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.follow.FollowCatalogFragment$onViewCreated$7", f = "FollowCatalogFragment.kt", l = {254}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f20424w;

        /* renamed from: x  reason: collision with root package name */
        public Object f20425x;

        /* renamed from: y  reason: collision with root package name */
        public Object f20426y;

        /* renamed from: z  reason: collision with root package name */
        public int f20427z;

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f20427z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f20426y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f20425x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f20424w
                com.dena.mirrativ.catalog.follow.FollowCatalogFragment r4 = (com.dena.mirrativ.catalog.follow.FollowCatalogFragment) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L78
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
                com.dena.mirrativ.catalog.follow.FollowCatalogFragment r9 = com.dena.mirrativ.catalog.follow.FollowCatalogFragment.this
                u8.l r9 = com.dena.mirrativ.catalog.follow.FollowCatalogFragment.w3(r9)
                wo.x r3 = r9.j()
                com.dena.mirrativ.catalog.follow.FollowCatalogFragment r9 = com.dena.mirrativ.catalog.follow.FollowCatalogFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L78
                r4 = r9
                r9 = r8
            L3d:
                r9.f20424w = r4     // Catch: java.lang.Throwable -> L78
                r9.f20425x = r3     // Catch: java.lang.Throwable -> L78
                r9.f20426y = r1     // Catch: java.lang.Throwable -> L78
                r9.f20427z = r2     // Catch: java.lang.Throwable -> L78
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L78
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
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L75
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L75
                if (r9 == 0) goto L6f
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L75
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L75
                u8.a r9 = com.dena.mirrativ.catalog.follow.FollowCatalogFragment.v3(r5)     // Catch: java.lang.Throwable -> L75
                r9.g()     // Catch: java.lang.Throwable -> L75
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6f:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L75:
                r9 = move-exception
                r3 = r4
                goto L79
            L78:
                r9 = move-exception
            L79:
                throw r9     // Catch: java.lang.Throwable -> L7a
            L7a:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.catalog.follow.FollowCatalogFragment.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.follow.FollowCatalogFragment$onViewCreated$8", f = "FollowCatalogFragment.kt", l = {254}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f20428w;

        /* renamed from: x  reason: collision with root package name */
        public Object f20429x;

        /* renamed from: y  reason: collision with root package name */
        public Object f20430y;

        /* renamed from: z  reason: collision with root package name */
        public int f20431z;

        public i(ao.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
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
                int r1 = r8.f20431z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f20430y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f20429x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f20428w
                com.dena.mirrativ.catalog.follow.FollowCatalogFragment r4 = (com.dena.mirrativ.catalog.follow.FollowCatalogFragment) r4
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
                com.dena.mirrativ.catalog.follow.FollowCatalogFragment r9 = com.dena.mirrativ.catalog.follow.FollowCatalogFragment.this
                nf.o r9 = com.dena.mirrativ.catalog.follow.FollowCatalogFragment.y3(r9)
                wo.x r3 = r9.v()
                com.dena.mirrativ.catalog.follow.FollowCatalogFragment r9 = com.dena.mirrativ.catalog.follow.FollowCatalogFragment.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L83
                r4 = r9
                r9 = r8
            L3d:
                r9.f20428w = r4     // Catch: java.lang.Throwable -> L83
                r9.f20429x = r3     // Catch: java.lang.Throwable -> L83
                r9.f20430y = r1     // Catch: java.lang.Throwable -> L83
                r9.f20431z = r2     // Catch: java.lang.Throwable -> L83
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
                t8.m r9 = com.dena.mirrativ.catalog.follow.FollowCatalogFragment.t3(r5)     // Catch: java.lang.Throwable -> L80
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
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.catalog.follow.FollowCatalogFragment.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends jo.q implements io.a<u8.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20432w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20433x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20434y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20432w = componentCallbacks;
            this.f20433x = aVar;
            this.f20434y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [u8.a, java.lang.Object] */
        @Override // io.a
        public final u8.a invoke() {
            ComponentCallbacks componentCallbacks = this.f20432w;
            return gq.a.a(componentCallbacks).c(f0.b(u8.a.class), this.f20433x, this.f20434y);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20435w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20436x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20437y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20435w = componentCallbacks;
            this.f20436x = aVar;
            this.f20437y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f20435w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f20436x, this.f20437y);
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20438w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20439x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20440y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20438w = componentCallbacks;
            this.f20439x = aVar;
            this.f20440y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            ComponentCallbacks componentCallbacks = this.f20438w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.k.class), this.f20439x, this.f20440y);
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.a<nf.o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20441w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20442x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20443y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20441w = componentCallbacks;
            this.f20442x = aVar;
            this.f20443y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final nf.o invoke() {
            ComponentCallbacks componentCallbacks = this.f20441w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.o.class), this.f20442x, this.f20443y);
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20444w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20445x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20446y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20444w = componentCallbacks;
            this.f20445x = aVar;
            this.f20446y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f20444w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f20445x, this.f20446y);
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f20447w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Fragment fragment) {
            super(0);
            this.f20447w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f20447w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f20447w.L2());
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20448w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(io.a aVar) {
            super(0);
            this.f20448w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f20448w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20449w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20450x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20451y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f20452z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f20449w = aVar;
            this.f20450x = aVar2;
            this.f20451y = aVar3;
            this.f20452z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f20449w;
            vq.a aVar2 = this.f20450x;
            io.a aVar3 = this.f20451y;
            xq.a aVar4 = this.f20452z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(nf.y.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20453w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(io.a aVar) {
            super(0);
            this.f20453w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f20453w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f20454w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Fragment fragment) {
            super(0);
            this.f20454w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f20454w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20455w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(io.a aVar) {
            super(0);
            this.f20455w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f20455w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20456w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20457x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20458y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f20459z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f20456w = aVar;
            this.f20457x = aVar2;
            this.f20458y = aVar3;
            this.f20459z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f20456w;
            vq.a aVar2 = this.f20457x;
            io.a aVar3 = this.f20458y;
            xq.a aVar4 = this.f20459z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(od.z.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20460w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(io.a aVar) {
            super(0);
            this.f20460w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f20460w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f20461w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Fragment fragment) {
            super(0);
            this.f20461w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f20461w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20462w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(io.a aVar) {
            super(0);
            this.f20462w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f20462w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20463w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20464x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20465y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f20466z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f20463w = aVar;
            this.f20464x = aVar2;
            this.f20465y = aVar3;
            this.f20466z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f20463w;
            vq.a aVar2 = this.f20464x;
            io.a aVar3 = this.f20465y;
            xq.a aVar4 = this.f20466z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(u8.l.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20467w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(io.a aVar) {
            super(0);
            this.f20467w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f20467w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public FollowCatalogFragment() {
        b0 b10;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.f20410y0 = c10.plus(b10);
        String uuid = UUID.randomUUID().toString();
        jo.p.g(uuid, "randomUUID().toString()");
        this.A0 = uuid;
        s sVar = new s(this);
        xq.a a10 = gq.a.a(this);
        t tVar = new t(sVar);
        this.B0 = e0.a(this, f0.b(od.z.class), new v(tVar), new u(sVar, null, null, a10));
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.C0 = wn.g.b(iVar, new j(this, null, null));
        this.D0 = wn.g.b(iVar, new k(this, null, null));
        o oVar = new o(this);
        xq.a a11 = gq.a.a(this);
        p pVar = new p(oVar);
        this.E0 = e0.a(this, f0.b(nf.y.class), new r(pVar), new q(oVar, null, null, a11));
        a aVar = new a();
        w wVar = new w(this);
        xq.a a12 = gq.a.a(this);
        x xVar = new x(wVar);
        this.F0 = e0.a(this, f0.b(u8.l.class), new z(xVar), new y(wVar, null, aVar, a12));
        this.G0 = wn.g.b(iVar, new l(this, null, null));
        this.H0 = wn.g.b(iVar, new m(this, null, null));
        this.I0 = wn.g.b(iVar, new n(this, null, null));
        this.J0 = new FragmentRunner(this);
        androidx.activity.result.c<Intent> I2 = I2(new c.c(), new androidx.activity.result.b() { // from class: u8.c
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                FollowCatalogFragment.N3(FollowCatalogFragment.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(I2, "registerForActivityResul…loadMissionStatus()\n    }");
        this.K0 = I2;
        this.L0 = wn.g.a(new b());
    }

    public static final void N3(FollowCatalogFragment followCatalogFragment, androidx.activity.result.a aVar) {
        jo.p.h(followCatalogFragment, "this$0");
        followCatalogFragment.F3().e();
    }

    public static final void O3(FollowCatalogFragment followCatalogFragment, View view) {
        jo.p.h(followCatalogFragment, "this$0");
        if (followCatalogFragment.q0() == null) {
            return;
        }
        MRLogger J3 = followCatalogFragment.J3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_TOOLBAR_SEARCH);
        builder.setPageId(Referer.HOME_FOLLOW);
        J3.sendLog(builder.build());
        SearchActivity.a aVar = SearchActivity.Q;
        Context N2 = followCatalogFragment.N2();
        jo.p.g(N2, "requireContext()");
        followCatalogFragment.f3(aVar.a(N2, null, null, null));
    }

    public static final void P3(FollowCatalogFragment followCatalogFragment, String str) {
        jo.p.h(followCatalogFragment, "this$0");
        t8.m mVar = followCatalogFragment.f20411z0;
        if (mVar == null) {
            jo.p.v("binding");
            mVar = null;
        }
        AppCompatImageView appCompatImageView = mVar.H;
        jo.p.g(appCompatImageView, "binding.offerWallImageView");
        jo.p.g(str, "offerWallUrl");
        boolean z10 = true;
        if (!(str.length() > 0)) {
            Boolean f10 = followCatalogFragment.E3().f().f();
            jo.p.e(f10);
            if (!f10.booleanValue()) {
                z10 = false;
            }
        }
        appCompatImageView.setVisibility(z10 ? 0 : 8);
    }

    public static final void Q3(FollowCatalogFragment followCatalogFragment, Boolean bool) {
        jo.p.h(followCatalogFragment, "this$0");
        t8.m mVar = followCatalogFragment.f20411z0;
        if (mVar == null) {
            jo.p.v("binding");
            mVar = null;
        }
        UrgeUsersView urgeUsersView = mVar.L;
        jo.p.g(urgeUsersView, "binding.urgeUsersView");
        td.c.e(urgeUsersView, bool);
        jo.p.g(bool, "it");
        if (bool.booleanValue()) {
            followCatalogFragment.F3().f();
        }
    }

    public static final void R3(FollowCatalogFragment followCatalogFragment, Graph.UrgeUserList urgeUserList) {
        jo.p.h(followCatalogFragment, "this$0");
        t8.m mVar = null;
        List<UrgeUser> users = urgeUserList != null ? urgeUserList.getUsers() : null;
        if (users == null || users.isEmpty()) {
            return;
        }
        t8.m mVar2 = followCatalogFragment.f20411z0;
        if (mVar2 == null) {
            jo.p.v("binding");
        } else {
            mVar = mVar2;
        }
        UrgeUsersView urgeUsersView = mVar.L;
        String title = urgeUserList.getTitle();
        String description = urgeUserList.getDescription();
        List<UrgeUser> users2 = urgeUserList.getUsers();
        jo.p.f(users2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.dena.mirrorman.net.api.response.user.UrgeUser>");
        urgeUsersView.b(title, description, j0.c(users2), new f());
    }

    public static final void S3(FollowCatalogFragment followCatalogFragment, Boolean bool) {
        jo.p.h(followCatalogFragment, "this$0");
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        pe.b.f47398a1.a(Referer.HOME_FOLLOW, false, true).z3(followCatalogFragment.O2(), "RegistrationDialog");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:4:0x000b, B:12:0x0019, B:14:0x001d, B:15:0x0021, B:16:0x0031, B:18:0x0035, B:19:0x0039), top: B:27:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:4:0x000b, B:12:0x0019, B:14:0x001d, B:15:0x0021, B:16:0x0031, B:18:0x0035, B:19:0x0039), top: B:27:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void T3(com.dena.mirrativ.catalog.follow.FollowCatalogFragment r6, java.lang.String r7) {
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
            t8.m r7 = r6.f20411z0     // Catch: java.lang.Exception -> L14
            if (r7 != 0) goto L21
            jo.p.v(r2)     // Catch: java.lang.Exception -> L14
            r7 = r1
        L21:
            androidx.appcompat.widget.AppCompatImageView r7 = r7.G     // Catch: java.lang.Exception -> L14
            android.content.Context r0 = r6.N2()     // Catch: java.lang.Exception -> L14
            int r3 = r8.d1.f49852o     // Catch: java.lang.Exception -> L14
            android.graphics.drawable.Drawable r0 = c3.a.f(r0, r3)     // Catch: java.lang.Exception -> L14
            r7.setImageDrawable(r0)     // Catch: java.lang.Exception -> L14
            goto L6f
        L31:
            t8.m r3 = r6.f20411z0     // Catch: java.lang.Exception -> L14
            if (r3 != 0) goto L39
            jo.p.v(r2)     // Catch: java.lang.Exception -> L14
            r3 = r1
        L39:
            androidx.appcompat.widget.AppCompatImageView r3 = r3.G     // Catch: java.lang.Exception -> L14
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
            t8.m r7 = r6.f20411z0
            if (r7 != 0) goto L5f
            jo.p.v(r2)
            goto L60
        L5f:
            r1 = r7
        L60:
            androidx.appcompat.widget.AppCompatImageView r7 = r1.G
            android.content.Context r6 = r6.N2()
            int r0 = r8.d1.f49852o
            android.graphics.drawable.Drawable r6 = c3.a.f(r6, r0)
            r7.setImageDrawable(r6)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.catalog.follow.FollowCatalogFragment.T3(com.dena.mirrativ.catalog.follow.FollowCatalogFragment, java.lang.String):void");
    }

    public static final void U3(FollowCatalogFragment followCatalogFragment, Boolean bool) {
        jo.p.h(followCatalogFragment, "this$0");
        t8.m mVar = followCatalogFragment.f20411z0;
        if (mVar == null) {
            jo.p.v("binding");
            mVar = null;
        }
        View view = mVar.E;
        jo.p.g(bool, "shouldShow");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public static final void V3(FollowCatalogFragment followCatalogFragment, h2 h2Var) {
        jo.p.h(followCatalogFragment, "this$0");
        if (h2Var == null) {
            return;
        }
        t8.m mVar = followCatalogFragment.f20411z0;
        if (mVar == null) {
            jo.p.v("binding");
            mVar = null;
        }
        mVar.D.a(h2Var);
    }

    public static final void W3(FollowCatalogFragment followCatalogFragment, Boolean bool) {
        jo.p.h(followCatalogFragment, "this$0");
        t8.m mVar = followCatalogFragment.f20411z0;
        if (mVar == null) {
            jo.p.v("binding");
            mVar = null;
        }
        MissionTopIconView missionTopIconView = mVar.D;
        jo.p.g(missionTopIconView, "binding.missionTopIconView");
        jo.p.g(bool, "it");
        missionTopIconView.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        t8.m T = t8.m.T(LayoutInflater.from(N2()), viewGroup, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        this.f20411z0 = T;
        tb.b a10 = I3().a(this.A0, Referer.HOME_FOLLOW, new a.c(Referer.HOME_FOLLOW, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, null, 4, null));
        androidx.fragment.app.z k10 = p0().k();
        t8.m mVar = this.f20411z0;
        t8.m mVar2 = null;
        if (mVar == null) {
            jo.p.v("binding");
            mVar = null;
        }
        k10.s(mVar.C.getId(), a10.a(), a10.b()).i();
        t8.m mVar3 = this.f20411z0;
        if (mVar3 == null) {
            jo.p.v("binding");
            mVar3 = null;
        }
        mVar3.I.setOnClickListener(new View.OnClickListener() { // from class: u8.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FollowCatalogFragment.O3(FollowCatalogFragment.this, view);
            }
        });
        t8.m mVar4 = this.f20411z0;
        if (mVar4 == null) {
            jo.p.v("binding");
            mVar4 = null;
        }
        AppCompatImageView appCompatImageView = mVar4.G;
        jo.p.g(appCompatImageView, "binding.myPageButtonImageView");
        yd.g1.a(appCompatImageView, new c());
        t8.m mVar5 = this.f20411z0;
        if (mVar5 == null) {
            jo.p.v("binding");
        } else {
            mVar2 = mVar5;
        }
        View u10 = mVar2.u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    public final nf.k E3() {
        return (nf.k) this.G0.getValue();
    }

    public final u8.a F3() {
        return (u8.a) this.C0.getValue();
    }

    public final u8.l G3() {
        return (u8.l) this.F0.getValue();
    }

    public final nf.o H3() {
        return (nf.o) this.H0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        F3().g();
        r0.d(this, null, 1, null);
        super.I1();
    }

    public final tb.c I3() {
        return (tb.c) this.I0.getValue();
    }

    public final MRLogger J3() {
        return (MRLogger) this.D0.getValue();
    }

    public final od.z K3() {
        return (od.z) this.B0.getValue();
    }

    public final nf.y L3() {
        return (nf.y) this.E0.getValue();
    }

    public final NavController M3() {
        return (NavController) this.L0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        G3().n().i(a1(), new androidx.lifecycle.f0() { // from class: u8.i
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                FollowCatalogFragment.Q3(FollowCatalogFragment.this, (Boolean) obj);
            }
        });
        G3().k().i(a1(), new androidx.lifecycle.f0() { // from class: u8.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                FollowCatalogFragment.R3(FollowCatalogFragment.this, (Graph.UrgeUserList) obj);
            }
        });
        G3().l().i(a1(), new androidx.lifecycle.f0() { // from class: u8.h
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                FollowCatalogFragment.S3(FollowCatalogFragment.this, (Boolean) obj);
            }
        });
        L3().k().i(a1(), new androidx.lifecycle.f0() { // from class: u8.k
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                FollowCatalogFragment.T3(FollowCatalogFragment.this, (String) obj);
            }
        });
        H3().y().i(a1(), new androidx.lifecycle.f0() { // from class: u8.g
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                FollowCatalogFragment.U3(FollowCatalogFragment.this, (Boolean) obj);
            }
        });
        t8.m mVar = null;
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(this, null, null, new h(null), 3, null);
        uo.l.d(this, null, null, new i(null), 3, null);
        G3().i().i(a1(), new androidx.lifecycle.f0() { // from class: u8.d
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                FollowCatalogFragment.V3(FollowCatalogFragment.this, (h2) obj);
            }
        });
        G3().m().i(a1(), new androidx.lifecycle.f0() { // from class: u8.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                FollowCatalogFragment.W3(FollowCatalogFragment.this, (Boolean) obj);
            }
        });
        t8.m mVar2 = this.f20411z0;
        if (mVar2 == null) {
            jo.p.v("binding");
            mVar2 = null;
        }
        MissionTopIconView missionTopIconView = mVar2.D;
        jo.p.g(missionTopIconView, "binding.missionTopIconView");
        yd.g1.a(missionTopIconView, new d());
        E3().n().i(a1(), new androidx.lifecycle.f0() { // from class: u8.j
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                FollowCatalogFragment.P3(FollowCatalogFragment.this, (String) obj);
            }
        });
        t8.m mVar3 = this.f20411z0;
        if (mVar3 == null) {
            jo.p.v("binding");
        } else {
            mVar = mVar3;
        }
        AppCompatImageView appCompatImageView = mVar.H;
        jo.p.g(appCompatImageView, "binding.offerWallImageView");
        yd.g1.a(appCompatImageView, new e());
        F3().e();
        K3().t();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f20410y0;
    }
}
