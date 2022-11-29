package ib;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.ProfileImageView;
import com.dena.mirrorman.net.api.Referer;
import com.google.firebase.analytics.FirebaseAnalytics;
import hb.c2;
import hb.x1;
import kq.a;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class m0 extends androidx.fragment.app.e implements q0 {
    public final /* synthetic */ da.j N0 = new da.j();
    public final AutoClearedValue O0 = nd.a.a(this);
    public final wn.f P0;
    public n0 Q0;
    public final wn.f R0;
    public final wn.f S0;
    public e0 T0;
    public static final /* synthetic */ qo.h<Object>[] V0 = {jo.f0.d(new jo.s(m0.class, "binding", "getBinding()Lcom/dena/mirrativ/player/databinding/DialogFragmentUrgeFollowStreamerBinding;", 0))};
    public static final a U0 = new a(null);
    public static final int W0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final m0 a() {
            return new m0();
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.UrgeFollowStreamerDialogFragment$observeStoreValues$2", f = "UrgeFollowStreamerDialogFragment.kt", l = {152}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f36656w;

        /* renamed from: x  reason: collision with root package name */
        public Object f36657x;

        /* renamed from: y  reason: collision with root package name */
        public Object f36658y;

        /* renamed from: z  reason: collision with root package name */
        public int f36659z;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:21:0x005f, B:23:0x0067, B:25:0x0076), top: B:37:0x005f }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:37:0x005f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f36659z
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 != r3) goto L24
                java.lang.Object r1 = r8.f36658y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r8.f36657x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r8.f36656w
                ib.m0 r5 = (ib.m0) r5
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L21
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r0
                r0 = r8
                goto L5f
            L21:
                r9 = move-exception
                goto L87
            L24:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2c:
                wn.m.b(r9)
                ib.m0 r9 = ib.m0.this
                ib.e0 r9 = ib.m0.F3(r9)
                if (r9 != 0) goto L3d
                java.lang.String r9 = "store"
                jo.p.v(r9)
                r9 = r2
            L3d:
                wo.x r4 = r9.F()
                ib.m0 r9 = ib.m0.this
                wo.k r1 = r4.iterator()     // Catch: java.lang.Throwable -> L21
                r5 = r9
                r9 = r8
            L49:
                r9.f36656w = r5     // Catch: java.lang.Throwable -> L21
                r9.f36657x = r4     // Catch: java.lang.Throwable -> L21
                r9.f36658y = r1     // Catch: java.lang.Throwable -> L21
                r9.f36659z = r3     // Catch: java.lang.Throwable -> L21
                java.lang.Object r6 = r1.a(r9)     // Catch: java.lang.Throwable -> L21
                if (r6 != r0) goto L58
                return r0
            L58:
                r7 = r0
                r0 = r9
                r9 = r6
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r7
            L5f:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L85
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L85
                if (r9 == 0) goto L7f
                java.lang.Object r9 = r4.next()     // Catch: java.lang.Throwable -> L85
                wn.v r9 = (wn.v) r9     // Catch: java.lang.Throwable -> L85
                r6.m3()     // Catch: java.lang.Throwable -> L85
                ib.n0 r9 = ib.m0.E3(r6)     // Catch: java.lang.Throwable -> L85
                if (r9 == 0) goto L79
                r9.n()     // Catch: java.lang.Throwable -> L85
            L79:
                r9 = r0
                r0 = r1
                r1 = r4
                r4 = r5
                r5 = r6
                goto L49
            L7f:
                wo.n.a(r5, r2)
                wn.v r9 = wn.v.f59242a
                return r9
            L85:
                r9 = move-exception
                r4 = r5
            L87:
                throw r9     // Catch: java.lang.Throwable -> L88
            L88:
                r0 = move-exception
                wo.n.a(r4, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ib.m0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.UrgeFollowStreamerDialogFragment$observeStoreValues$3", f = "UrgeFollowStreamerDialogFragment.kt", l = {152}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f36660w;

        /* renamed from: x  reason: collision with root package name */
        public Object f36661x;

        /* renamed from: y  reason: collision with root package name */
        public Object f36662y;

        /* renamed from: z  reason: collision with root package name */
        public int f36663z;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x0094, TryCatch #1 {all -> 0x0094, blocks: (B:21:0x005f, B:23:0x0067, B:25:0x0079, B:26:0x0084), top: B:38:0x005f }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:38:0x005f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r11.f36663z
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 != r3) goto L24
                java.lang.Object r1 = r11.f36662y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r11.f36661x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r11.f36660w
                ib.m0 r5 = (ib.m0) r5
                wn.m.b(r12)     // Catch: java.lang.Throwable -> L21
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r0
                r0 = r11
                goto L5f
            L21:
                r12 = move-exception
                goto L96
            L24:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L2c:
                wn.m.b(r12)
                ib.m0 r12 = ib.m0.this
                ib.e0 r12 = ib.m0.F3(r12)
                if (r12 != 0) goto L3d
                java.lang.String r12 = "store"
                jo.p.v(r12)
                r12 = r2
            L3d:
                wo.x r4 = r12.p()
                ib.m0 r12 = ib.m0.this
                wo.k r1 = r4.iterator()     // Catch: java.lang.Throwable -> L21
                r5 = r12
                r12 = r11
            L49:
                r12.f36660w = r5     // Catch: java.lang.Throwable -> L21
                r12.f36661x = r4     // Catch: java.lang.Throwable -> L21
                r12.f36662y = r1     // Catch: java.lang.Throwable -> L21
                r12.f36663z = r3     // Catch: java.lang.Throwable -> L21
                java.lang.Object r6 = r1.a(r12)     // Catch: java.lang.Throwable -> L21
                if (r6 != r0) goto L58
                return r0
            L58:
                r10 = r0
                r0 = r12
                r12 = r6
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r10
            L5f:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L94
                boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L94
                if (r12 == 0) goto L8e
                java.lang.Object r12 = r4.next()     // Catch: java.lang.Throwable -> L94
                com.dena.mirrativ.mirrativapi.core.MRError r12 = (com.dena.mirrativ.mirrativapi.core.MRError) r12     // Catch: java.lang.Throwable -> L94
                of.n r7 = of.n.f45411a     // Catch: java.lang.Throwable -> L94
                android.content.Context r8 = r6.q0()     // Catch: java.lang.Throwable -> L94
                java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> L94
                if (r12 != 0) goto L84
                int r12 = hb.b2.f34715b     // Catch: java.lang.Throwable -> L94
                java.lang.String r12 = r6.U0(r12)     // Catch: java.lang.Throwable -> L94
                java.lang.String r9 = "getString(R.string.error_access)"
                jo.p.g(r12, r9)     // Catch: java.lang.Throwable -> L94
            L84:
                r9 = 0
                r7.B(r8, r12, r9)     // Catch: java.lang.Throwable -> L94
                r12 = r0
                r0 = r1
                r1 = r4
                r4 = r5
                r5 = r6
                goto L49
            L8e:
                wo.n.a(r5, r2)
                wn.v r12 = wn.v.f59242a
                return r12
            L94:
                r12 = move-exception
                r4 = r5
            L96:
                throw r12     // Catch: java.lang.Throwable -> L97
            L97:
                r0 = move-exception
                wo.n.a(r4, r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ib.m0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f36664w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f36664w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f36664w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f36665w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f36665w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f36665w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f36666w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36667x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36668y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f36669z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f36666w = aVar;
            this.f36667x = aVar2;
            this.f36668y = aVar3;
            this.f36669z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f36666w;
            vq.a aVar2 = this.f36667x;
            io.a aVar3 = this.f36668y;
            xq.a aVar4 = this.f36669z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(e0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f36670w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar) {
            super(0);
            this.f36670w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f36670w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f36671w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36672x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36673y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f36671w = componentCallbacks;
            this.f36672x = aVar;
            this.f36673y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f36671w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f36672x, this.f36673y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f36674w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36675x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36676y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f36674w = componentCallbacks;
            this.f36675x = aVar;
            this.f36676y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f36674w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.v0.class), this.f36675x, this.f36676y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<ib.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f36677w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36678x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36679y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f36677w = componentCallbacks;
            this.f36678x = aVar;
            this.f36679y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ib.e, java.lang.Object] */
        @Override // io.a
        public final ib.e invoke() {
            ComponentCallbacks componentCallbacks = this.f36677w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ib.e.class), this.f36678x, this.f36679y);
        }
    }

    public m0() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P0 = wn.g.b(iVar, new h(this, null, null));
        this.R0 = wn.g.b(iVar, new i(this, null, null));
        this.S0 = wn.g.b(iVar, new j(this, null, null));
    }

    public static final void L3(m0 m0Var, Boolean bool) {
        jo.p.h(m0Var, "this$0");
        m0Var.H3().E.setEnabled(!bool.booleanValue());
    }

    public static final void O3(m0 m0Var, View view) {
        jo.p.h(m0Var, "this$0");
        hf.v0 J3 = m0Var.J3();
        FragmentManager p02 = m0Var.p0();
        jo.p.g(p02, "childFragmentManager");
        if (hf.v0.c(J3, p02, "live_view.finished_dialog_urge_follow.follow", false, 4, null)) {
            e0 e0Var = m0Var.T0;
            e0 e0Var2 = null;
            if (e0Var == null) {
                jo.p.v("store");
                e0Var = null;
            }
            if (jo.p.c(e0Var.H().f(), Boolean.TRUE)) {
                ib.e G3 = m0Var.G3();
                e0 e0Var3 = m0Var.T0;
                if (e0Var3 == null) {
                    jo.p.v("store");
                } else {
                    e0Var2 = e0Var3;
                }
                G3.o(Referer.LiveView.FINISHED_DIALOG_URGE_FOLLOW, e0Var2.G());
                return;
            }
            hf.b.f35490a.h();
            FirebaseAnalytics.getInstance(m0Var.N2()).a("jdwii7", null);
            ib.e G32 = m0Var.G3();
            e0 e0Var4 = m0Var.T0;
            if (e0Var4 == null) {
                jo.p.v("store");
            } else {
                e0Var2 = e0Var4;
            }
            G32.e(Referer.LiveView.FINISHED_DIALOG_URGE_FOLLOW, e0Var2.G());
        }
    }

    public static final void P3(m0 m0Var, View view) {
        jo.p.h(m0Var, "this$0");
        n0 n0Var = m0Var.Q0;
        if (n0Var != null) {
            n0Var.O();
        }
        m0Var.m3();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        Fragment P2 = P2();
        jo.p.g(P2, "requireParentFragment()");
        d dVar = new d(P2);
        xq.a a10 = gq.a.a(P2);
        e eVar = new e(dVar);
        this.T0 = (e0) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(P2, jo.f0.b(e0.class), new g(eVar), new f(dVar, null, null, a10)).getValue());
    }

    public final ib.e G3() {
        return (ib.e) this.S0.getValue();
    }

    public final kb.l H3() {
        return (kb.l) this.O0.b(this, V0[0]);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.Q0 = null;
        r0.d(this, null, 1, null);
        super.I1();
    }

    public final MRLogger I3() {
        return (MRLogger) this.P0.getValue();
    }

    public final hf.v0 J3() {
        return (hf.v0) this.R0.getValue();
    }

    public final void K3() {
        e0 e0Var = this.T0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        e0Var.K().i(this, new androidx.lifecycle.f0() { // from class: ib.l0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                m0.L3(m0.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new b(null), 3, null);
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    public final void M3(kb.l lVar) {
        this.O0.a(this, V0[0], lVar);
    }

    public final void N3() {
        H3().E.setOnClickListener(new View.OnClickListener() { // from class: ib.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m0.O3(m0.this, view);
            }
        });
        H3().D.setOnClickListener(new View.OnClickListener() { // from class: ib.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m0.P3(m0.this, view);
            }
        });
    }

    public final void Q3() {
        e0 e0Var = this.T0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        oe.b D = e0Var.D();
        if (D != null) {
            ProfileImageView profileImageView = H3().H;
            jo.p.g(profileImageView, "binding.profileImageView");
            ProfileImageView.b(profileImageView, D.h(), D.c(), Integer.valueOf(de.e.b(this, 3)), null, 8, null);
            H3().J.setText(D.g());
            H3().F.setVisibility(D.l() ? 0 : 8);
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        e0 e0Var = null;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), x1.dialog_fragment_urge_follow_streamer, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        M3((kb.l) e10);
        MRLogger I3 = I3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_FOLLOW_RECOMMEND_POPUP_IMP);
        wn.k[] kVarArr = new wn.k[2];
        e0 e0Var2 = this.T0;
        if (e0Var2 == null) {
            jo.p.v("store");
            e0Var2 = null;
        }
        kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, e0Var2.u());
        e0 e0Var3 = this.T0;
        if (e0Var3 == null) {
            jo.p.v("store");
        } else {
            e0Var = e0Var3;
        }
        kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, e0Var.G());
        builder.setPayload(xn.s.m(kVarArr));
        I3.sendLog(builder.build());
        Q3();
        N3();
        K3();
        Dialog dialog = new Dialog(N2(), c2.f34738a);
        w3(false);
        dialog.setContentView(H3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        Fragment H0 = H0();
        this.Q0 = H0 instanceof n0 ? (n0) H0 : null;
    }
}
