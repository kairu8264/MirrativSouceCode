package com.dena.mirrativ.livegame;

import android.content.ComponentCallbacks;
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
import com.dena.mirrativ.livegame.LiveGameFragment;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import jo.f0;
import jo.p;
import jo.q;
import kq.a;
import nf.o;
import nf.y;
import od.z;
import wn.v;
import yd.g1;

/* loaded from: classes.dex */
public final class LiveGameFragment extends Fragment {
    public final wn.f A0;
    public final wn.f B0;
    public ka.g C0;

    /* renamed from: x0  reason: collision with root package name */
    public final wn.f f21440x0;

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f21441y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f21442z0;

    /* loaded from: classes.dex */
    public static final class a extends q implements io.a<NavController> {
        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final NavController invoke() {
            return androidx.navigation.fragment.a.a(LiveGameFragment.this);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.l<View, v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            if (LiveGameFragment.this.q0() == null) {
                return;
            }
            LiveGameFragment.this.q3().m(ja.l.D);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21445w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21446x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21447y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21445w = componentCallbacks;
            this.f21446x = aVar;
            this.f21447y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f21445w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f21446x, this.f21447y);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.a<o> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f21448w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21449x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21450y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f21448w = componentCallbacks;
            this.f21449x = aVar;
            this.f21450y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.o] */
        @Override // io.a
        public final o invoke() {
            ComponentCallbacks componentCallbacks = this.f21448w;
            return gq.a.a(componentCallbacks).c(f0.b(o.class), this.f21449x, this.f21450y);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f21451w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f21451w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f21451w.L2();
            p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f21451w.L2());
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21452w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar) {
            super(0);
            this.f21452w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f21452w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21453w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21454x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21455y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21456z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21453w = aVar;
            this.f21454x = aVar2;
            this.f21455y = aVar3;
            this.f21456z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21453w;
            vq.a aVar2 = this.f21454x;
            io.a aVar3 = this.f21455y;
            xq.a aVar4 = this.f21456z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(y.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21457w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar) {
            super(0);
            this.f21457w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f21457w.invoke()).U();
            p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f21458w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f21458w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f21458w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21459w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar) {
            super(0);
            this.f21459w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f21459w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21460w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f21461x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f21462y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f21463z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f21460w = aVar;
            this.f21461x = aVar2;
            this.f21462y = aVar3;
            this.f21463z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f21460w;
            vq.a aVar2 = this.f21461x;
            io.a aVar3 = this.f21462y;
            xq.a aVar4 = this.f21463z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(z.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f21464w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(io.a aVar) {
            super(0);
            this.f21464w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f21464w.invoke()).U();
            p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public LiveGameFragment() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f21440x0 = wn.g.b(iVar, new c(this, null, null));
        i iVar2 = new i(this);
        xq.a a10 = gq.a.a(this);
        j jVar = new j(iVar2);
        this.f21441y0 = e0.a(this, f0.b(z.class), new l(jVar), new k(iVar2, null, null, a10));
        this.f21442z0 = wn.g.b(iVar, new d(this, null, null));
        e eVar = new e(this);
        xq.a a11 = gq.a.a(this);
        f fVar = new f(eVar);
        this.A0 = e0.a(this, f0.b(y.class), new h(fVar), new g(eVar, null, null, a11));
        this.B0 = wn.g.a(new a());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:4:0x000b, B:12:0x0019, B:14:0x001d, B:15:0x0021, B:16:0x0031, B:18:0x0035, B:19:0x0039), top: B:27:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:4:0x000b, B:12:0x0019, B:14:0x001d, B:15:0x0021, B:16:0x0031, B:18:0x0035, B:19:0x0039), top: B:27:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void r3(com.dena.mirrativ.livegame.LiveGameFragment r6, java.lang.String r7) {
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
            ka.g r7 = r6.C0     // Catch: java.lang.Exception -> L14
            if (r7 != 0) goto L21
            jo.p.v(r2)     // Catch: java.lang.Exception -> L14
            r7 = r1
        L21:
            androidx.appcompat.widget.AppCompatImageView r7 = r7.E     // Catch: java.lang.Exception -> L14
            android.content.Context r0 = r6.N2()     // Catch: java.lang.Exception -> L14
            int r3 = ja.k.f37427r     // Catch: java.lang.Exception -> L14
            android.graphics.drawable.Drawable r0 = c3.a.f(r0, r3)     // Catch: java.lang.Exception -> L14
            r7.setImageDrawable(r0)     // Catch: java.lang.Exception -> L14
            goto L6f
        L31:
            ka.g r3 = r6.C0     // Catch: java.lang.Exception -> L14
            if (r3 != 0) goto L39
            jo.p.v(r2)     // Catch: java.lang.Exception -> L14
            r3 = r1
        L39:
            androidx.appcompat.widget.AppCompatImageView r3 = r3.E     // Catch: java.lang.Exception -> L14
            java.lang.String r4 = "binding.myPageButtonImageView"
            jo.p.g(r3, r4)     // Catch: java.lang.Exception -> L14
            r4 = 13
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L14
            int r5 = ja.j.f37423v     // Catch: java.lang.Exception -> L14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L14
            td.a.t(r3, r7, r4, r0, r5)     // Catch: java.lang.Exception -> L14
            goto L6f
        L54:
            g9.a.c(r7)
            ka.g r7 = r6.C0
            if (r7 != 0) goto L5f
            jo.p.v(r2)
            goto L60
        L5f:
            r1 = r7
        L60:
            androidx.appcompat.widget.AppCompatImageView r7 = r1.E
            android.content.Context r6 = r6.N2()
            int r0 = ja.k.f37427r
            android.graphics.drawable.Drawable r6 = c3.a.f(r6, r0)
            r7.setImageDrawable(r6)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.livegame.LiveGameFragment.r3(com.dena.mirrativ.livegame.LiveGameFragment, java.lang.String):void");
    }

    public static final void s3(LiveGameFragment liveGameFragment, Boolean bool) {
        p.h(liveGameFragment, "this$0");
        ka.g gVar = liveGameFragment.C0;
        if (gVar == null) {
            p.v("binding");
            gVar = null;
        }
        View view = gVar.C;
        p.g(bool, "shouldShow");
        view.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        MRLogger n32 = n3();
        MRLog.Companion companion = MRLog.Companion;
        n32.sendLog(new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_GAME_LISTING_IMP).build());
        ka.g T = ka.g.T(layoutInflater, viewGroup, false);
        p.g(T, "inflate(inflater, container, false)");
        this.C0 = T;
        ka.g gVar = null;
        if (T == null) {
            p.v("binding");
            T = null;
        }
        AppCompatImageView appCompatImageView = T.E;
        p.g(appCompatImageView, "binding.myPageButtonImageView");
        g1.a(appCompatImageView, new b());
        androidx.fragment.app.z k10 = p0().k();
        ka.g gVar2 = this.C0;
        if (gVar2 == null) {
            p.v("binding");
            gVar2 = null;
        }
        k10.r(gVar2.B.getId(), ja.c.I0.a(true)).i();
        ka.g gVar3 = this.C0;
        if (gVar3 == null) {
            p.v("binding");
        } else {
            gVar = gVar3;
        }
        View u10 = gVar.u();
        p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        p.h(view, "view");
        super.e2(view, bundle);
        p3().k().i(a1(), new androidx.lifecycle.f0() { // from class: ja.f
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LiveGameFragment.r3(LiveGameFragment.this, (String) obj);
            }
        });
        m3().y().i(a1(), new androidx.lifecycle.f0() { // from class: ja.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                LiveGameFragment.s3(LiveGameFragment.this, (Boolean) obj);
            }
        });
        o3().t();
    }

    public final o m3() {
        return (o) this.f21442z0.getValue();
    }

    public final MRLogger n3() {
        return (MRLogger) this.f21440x0.getValue();
    }

    public final z o3() {
        return (z) this.f21441y0.getValue();
    }

    public final y p3() {
        return (y) this.A0.getValue();
    }

    public final NavController q3() {
        return (NavController) this.B0.getValue();
    }
}
