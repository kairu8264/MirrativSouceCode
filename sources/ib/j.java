package ib;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import hb.b2;
import hb.c2;
import hb.x1;
import ib.h0;
import java.util.List;
import kq.a;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class j extends androidx.fragment.app.e implements n0, i0, q0 {
    public static final a W0 = new a(null);
    public static final int X0 = 8;
    public final /* synthetic */ da.j N0 = new da.j();
    public final wn.f O0 = wn.g.a(new b());
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public e0 S0;
    public kb.h T0;
    public ib.k U0;
    public final FragmentRunner V0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a(oe.a aVar) {
            jo.p.h(aVar, "liveRequest");
            j jVar = new j();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_LIVE_REQUEST", aVar);
            jVar.V2(bundle);
            return jVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<oe.a> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final oe.a invoke() {
            Parcelable parcelable = j.this.M2().getParcelable("EXTRA_LIVE_REQUEST");
            jo.p.e(parcelable);
            return (oe.a) parcelable;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestDialog$observeStoreValues$1", f = "LiveRequestDialog.kt", l = {295}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f36624w;

        /* renamed from: x  reason: collision with root package name */
        public Object f36625x;

        /* renamed from: y  reason: collision with root package name */
        public Object f36626y;

        /* renamed from: z  reason: collision with root package name */
        public int f36627z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ j f36628w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j jVar) {
                super(0);
                this.f36628w = jVar;
            }

            public final void a() {
                this.f36628w.p0().k().r(this.f36628w.N3().D.getId(), r.E0.a(this.f36628w.P3())).i();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ j f36629w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(j jVar) {
                super(0);
                this.f36629w = jVar;
            }

            public final void a() {
                this.f36629w.p0().k().r(this.f36629w.N3().D.getId(), d0.F0.a(this.f36629w.P3())).i();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

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

        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x001c, B:20:0x005d, B:22:0x0065, B:24:0x0080, B:25:0x0084, B:29:0x0090, B:31:0x0099, B:32:0x009d, B:34:0x00a3, B:36:0x00b6, B:38:0x00bc, B:40:0x00d5, B:42:0x00ed, B:43:0x00f1, B:45:0x0103, B:46:0x0107, B:50:0x0126, B:17:0x004e, B:39:0x00c9, B:35:0x00ad, B:16:0x0044), top: B:58:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0146  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005a -> B:20:0x005d). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 339
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ib.j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.LiveRequestDialog$observeStoreValues$2", f = "LiveRequestDialog.kt", l = {295}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f36630w;

        /* renamed from: x  reason: collision with root package name */
        public Object f36631x;

        /* renamed from: y  reason: collision with root package name */
        public Object f36632y;

        /* renamed from: z  reason: collision with root package name */
        public int f36633z;

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

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x00b8, TryCatch #1 {all -> 0x00b8, blocks: (B:21:0x005f, B:23:0x0067, B:28:0x007b, B:33:0x00a0, B:35:0x00a6, B:36:0x00a9, B:29:0x0085, B:31:0x0091, B:32:0x009c, B:26:0x0073), top: B:48:0x005f }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:48:0x005f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r11.f36633z
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 != r3) goto L24
                java.lang.Object r1 = r11.f36632y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r11.f36631x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r11.f36630w
                ib.j r5 = (ib.j) r5
                wn.m.b(r12)     // Catch: java.lang.Throwable -> L21
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r0
                r0 = r11
                goto L5f
            L21:
                r12 = move-exception
                goto Lba
            L24:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L2c:
                wn.m.b(r12)
                ib.j r12 = ib.j.this
                ib.e0 r12 = ib.j.L3(r12)
                if (r12 != 0) goto L3d
                java.lang.String r12 = "store"
                jo.p.v(r12)
                r12 = r2
            L3d:
                wo.x r4 = r12.p()
                ib.j r12 = ib.j.this
                wo.k r1 = r4.iterator()     // Catch: java.lang.Throwable -> L21
                r5 = r12
                r12 = r11
            L49:
                r12.f36630w = r5     // Catch: java.lang.Throwable -> L21
                r12.f36631x = r4     // Catch: java.lang.Throwable -> L21
                r12.f36632y = r1     // Catch: java.lang.Throwable -> L21
                r12.f36633z = r3     // Catch: java.lang.Throwable -> L21
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
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> Lb8
                boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> Lb8
                if (r12 == 0) goto Lb2
                java.lang.Object r12 = r4.next()     // Catch: java.lang.Throwable -> Lb8
                com.dena.mirrativ.mirrativapi.core.MRError r12 = (com.dena.mirrativ.mirrativapi.core.MRError) r12     // Catch: java.lang.Throwable -> Lb8
                boolean r7 = r12 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> Lb8
                if (r7 == 0) goto L73
                r7 = r3
                goto L79
            L73:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r7 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> Lb8
                boolean r7 = jo.p.c(r12, r7)     // Catch: java.lang.Throwable -> Lb8
            L79:
                if (r7 == 0) goto L85
                of.n r7 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb8
                android.content.Context r8 = r6.q0()     // Catch: java.lang.Throwable -> Lb8
                r7.l(r8, r12)     // Catch: java.lang.Throwable -> Lb8
                goto La0
            L85:
                of.n r7 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb8
                android.content.Context r8 = r6.q0()     // Catch: java.lang.Throwable -> Lb8
                java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> Lb8
                if (r12 != 0) goto L9c
                int r12 = hb.b2.f34715b     // Catch: java.lang.Throwable -> Lb8
                java.lang.String r12 = r6.U0(r12)     // Catch: java.lang.Throwable -> Lb8
                java.lang.String r9 = "getString(R.string.error_access)"
                jo.p.g(r12, r9)     // Catch: java.lang.Throwable -> Lb8
            L9c:
                r9 = 0
                r7.B(r8, r12, r9)     // Catch: java.lang.Throwable -> Lb8
            La0:
                ib.k r12 = ib.j.I3(r6)     // Catch: java.lang.Throwable -> Lb8
                if (r12 == 0) goto La9
                r12.Z1()     // Catch: java.lang.Throwable -> Lb8
            La9:
                r6.n3()     // Catch: java.lang.Throwable -> Lb8
                r12 = r0
                r0 = r1
                r1 = r4
                r4 = r5
                r5 = r6
                goto L49
            Lb2:
                wo.n.a(r5, r2)
                wn.v r12 = wn.v.f59242a
                return r12
            Lb8:
                r12 = move-exception
                r4 = r5
            Lba:
                throw r12     // Catch: java.lang.Throwable -> Lbb
            Lbb:
                r0 = move-exception
                wo.n.a(r4, r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ib.j.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f36634w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f36634w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f36634w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f36635w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar) {
            super(0);
            this.f36635w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f36635w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f36636w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36637x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36638y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f36639z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f36636w = aVar;
            this.f36637x = aVar2;
            this.f36638y = aVar3;
            this.f36639z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f36636w;
            vq.a aVar2 = this.f36637x;
            io.a aVar3 = this.f36638y;
            xq.a aVar4 = this.f36639z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(e0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f36640w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar) {
            super(0);
            this.f36640w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f36640w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<uq.a> {
        public i() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(j.this.P3());
        }
    }

    /* renamed from: ib.j$j  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0476j extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f36642w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36643x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36644y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0476j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f36642w = componentCallbacks;
            this.f36643x = aVar;
            this.f36644y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f36642w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tb.c.class), this.f36643x, this.f36644y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f36645w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36646x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36647y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f36645w = componentCallbacks;
            this.f36646x = aVar;
            this.f36647y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f36645w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f36646x, this.f36647y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<ib.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f36648w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36649x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36650y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f36648w = componentCallbacks;
            this.f36649x = aVar;
            this.f36650y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ib.e, java.lang.Object] */
        @Override // io.a
        public final ib.e invoke() {
            ComponentCallbacks componentCallbacks = this.f36648w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ib.e.class), this.f36649x, this.f36650y);
        }
    }

    public j() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P0 = wn.g.b(iVar, new C0476j(this, null, null));
        this.Q0 = wn.g.b(iVar, new k(this, null, null));
        this.R0 = wn.g.b(iVar, new l(this, null, null));
        this.V0 = new FragmentRunner(this);
    }

    public static final void S3(j jVar, Integer num) {
        jo.p.h(jVar, "this$0");
        if (num != null) {
            num.intValue();
            jVar.N3().B.setVisibility(0);
            MRLogger Q3 = jVar.Q3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_REWARD_CM_BUTTON_TMP);
            wn.k[] kVarArr = new wn.k[3];
            e0 e0Var = jVar.S0;
            e0 e0Var2 = null;
            if (e0Var == null) {
                jo.p.v("store");
                e0Var = null;
            }
            kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, e0Var.u());
            e0 e0Var3 = jVar.S0;
            if (e0Var3 == null) {
                jo.p.v("store");
            } else {
                e0Var2 = e0Var3;
            }
            kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, e0Var2.G());
            kVarArr[2] = wn.q.a(MRLog.PAYLOAD_KEY_WHERE, "live_view_end");
            builder.setPayload(xn.s.m(kVarArr));
            Q3.sendLog(builder.build());
        }
    }

    public static final boolean T3(j jVar, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        jo.p.h(jVar, "this$0");
        if (keyEvent.getAction() == 1 && i10 == 4) {
            e0 e0Var = jVar.S0;
            e0 e0Var2 = null;
            if (e0Var == null) {
                jo.p.v("store");
                e0Var = null;
            }
            if (jo.p.c(e0Var.H().f(), Boolean.FALSE)) {
                e0 e0Var3 = jVar.S0;
                if (e0Var3 == null) {
                    jo.p.v("store");
                    e0Var3 = null;
                }
                if (e0Var3.I()) {
                    e0 e0Var4 = jVar.S0;
                    if (e0Var4 == null) {
                        jo.p.v("store");
                    } else {
                        e0Var2 = e0Var4;
                    }
                    if (e0Var2.D() != null) {
                        m0.U0.a().z3(jVar.p0(), "UrgeFollowStreamerDialogFragment");
                        return true;
                    }
                    return true;
                }
            }
            e0 e0Var5 = jVar.S0;
            if (e0Var5 == null) {
                jo.p.v("store");
            } else {
                e0Var2 = e0Var5;
            }
            if (e0Var2.C()) {
                jVar.X3();
            } else {
                ib.k kVar = jVar.U0;
                if (kVar != null) {
                    kVar.Z1();
                }
                jVar.m3();
            }
            return true;
        }
        return false;
    }

    public static final void V3(j jVar, View view) {
        jo.p.h(jVar, "this$0");
        e0 e0Var = jVar.S0;
        e0 e0Var2 = null;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        if (jo.p.c(e0Var.H().f(), Boolean.FALSE)) {
            e0 e0Var3 = jVar.S0;
            if (e0Var3 == null) {
                jo.p.v("store");
                e0Var3 = null;
            }
            if (e0Var3.I()) {
                e0 e0Var4 = jVar.S0;
                if (e0Var4 == null) {
                    jo.p.v("store");
                } else {
                    e0Var2 = e0Var4;
                }
                if (e0Var2.D() != null) {
                    m0.U0.a().z3(jVar.p0(), "UrgeFollowStreamerDialogFragment");
                    return;
                }
                return;
            }
        }
        e0 e0Var5 = jVar.S0;
        if (e0Var5 == null) {
            jo.p.v("store");
        } else {
            e0Var2 = e0Var5;
        }
        if (e0Var2.C()) {
            jVar.X3();
            return;
        }
        ib.k kVar = jVar.U0;
        if (kVar != null) {
            kVar.Z1();
        }
        jVar.m3();
    }

    public static final void W3(j jVar, View view) {
        jo.p.h(jVar, "this$0");
        e0 e0Var = jVar.S0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        Integer f10 = e0Var.n().f();
        if (f10 != null) {
            tb.c O3 = jVar.O3();
            Context N2 = jVar.N2();
            jo.p.g(N2, "requireContext()");
            jVar.f3(O3.X(N2, Referer.LiveView.FINISHED_DIALOG, f10.intValue()));
        }
        jVar.N3().B.setVisibility(4);
        jVar.N3().B.setOnClickListener(null);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        i iVar = new i();
        e eVar = new e(this);
        xq.a a10 = gq.a.a(this);
        f fVar = new f(eVar);
        this.S0 = (e0) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(e0.class), new h(fVar), new g(eVar, null, iVar, a10)).getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        FirebaseCrashlytics.getInstance().log("LiveRequestDialog onCreateView after cancel");
        this.T0 = (kb.h) androidx.databinding.f.e(layoutInflater, x1.dialog_fragment_live_request, null, false);
        View u10 = N3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void H1() {
        FirebaseCrashlytics.getInstance().log("LiveRequestDialog onDestroyView before cancel");
        r0.d(this, null, 1, null);
        FirebaseCrashlytics.getInstance().log("LiveRequestDialog onDestroyView after cancel");
        this.T0 = null;
        super.H1();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.U0 = null;
        super.I1();
    }

    public final ib.e M3() {
        return (ib.e) this.R0.getValue();
    }

    public final kb.h N3() {
        kb.h hVar = this.T0;
        jo.p.e(hVar);
        return hVar;
    }

    @Override // ib.n0
    public void O() {
        e0 e0Var = this.S0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        if (e0Var.C()) {
            X3();
            return;
        }
        ib.k kVar = this.U0;
        if (kVar != null) {
            kVar.Z1();
        }
        m3();
    }

    public final tb.c O3() {
        return (tb.c) this.P0.getValue();
    }

    public final oe.a P3() {
        return (oe.a) this.O0.getValue();
    }

    @Override // ib.i0
    public void Q() {
        ib.k kVar = this.U0;
        if (kVar != null) {
            kVar.Z1();
        }
    }

    public final MRLogger Q3() {
        return (MRLogger) this.Q0.getValue();
    }

    public final void R3() {
        e0 e0Var = null;
        uo.l.d(this, null, null, new c(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
        e0 e0Var2 = this.S0;
        if (e0Var2 == null) {
            jo.p.v("store");
        } else {
            e0Var = e0Var2;
        }
        e0Var.n().i(this, new androidx.lifecycle.f0() { // from class: ib.i
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                j.S3(j.this, (Integer) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void S1() {
        super.S1();
        ib.e M3 = M3();
        e0 e0Var = this.S0;
        e0 e0Var2 = null;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        String G = e0Var.G();
        e0 e0Var3 = this.S0;
        if (e0Var3 == null) {
            jo.p.v("store");
            e0Var3 = null;
        }
        long x10 = e0Var3.x();
        e0 e0Var4 = this.S0;
        if (e0Var4 == null) {
            jo.p.v("store");
        } else {
            e0Var2 = e0Var4;
        }
        Long f10 = e0Var2.v().f();
        if (f10 == null) {
            f10 = 0L;
        }
        M3.n(Referer.LiveView.FINISHED_DIALOG, G, x10, f10.longValue());
    }

    public final void U3() {
        N3().C.setOnClickListener(new View.OnClickListener() { // from class: ib.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.V3(j.this, view);
            }
        });
        N3().B.setOnClickListener(new View.OnClickListener() { // from class: ib.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.W3(j.this, view);
            }
        });
    }

    public final void X3() {
        N3().u().setVisibility(8);
        e0 e0Var = this.S0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        List<LiveBasicParams> y10 = e0Var.y();
        boolean z10 = true;
        if (y10 == null || !y10.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        h0.a aVar = h0.T0;
        aVar.a().z3(p0(), aVar.b());
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        FirebaseCrashlytics.getInstance().log("LiveRequestDialog onViewCreated after cancel");
        U3();
        R3();
        e0 e0Var = this.S0;
        e0 e0Var2 = null;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        oe.b D = e0Var.D();
        if (D == null) {
            ib.e M3 = M3();
            e0 e0Var3 = this.S0;
            if (e0Var3 == null) {
                jo.p.v("store");
                e0Var3 = null;
            }
            M3.j(e0Var3.G(), Referer.LiveView.FINISHED_DIALOG);
        } else {
            M3().k(D);
        }
        e0 e0Var4 = this.S0;
        if (e0Var4 == null) {
            jo.p.v("store");
            e0Var4 = null;
        }
        if (e0Var4.C()) {
            ib.e M32 = M3();
            e0 e0Var5 = this.S0;
            if (e0Var5 == null) {
                jo.p.v("store");
                e0Var5 = null;
            }
            String u10 = e0Var5.u();
            e0 e0Var6 = this.S0;
            if (e0Var6 == null) {
                jo.p.v("store");
            } else {
                e0Var2 = e0Var6;
            }
            M32.i(Referer.LiveView.FINISHED_DIALOG, u10, e0Var2.A());
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // ib.n0
    public void n() {
        of.n.A(N2(), b2.text_live_request_followed, false);
        e0 e0Var = this.S0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        if (e0Var.C()) {
            X3();
            return;
        }
        ib.k kVar = this.U0;
        if (kVar != null) {
            kVar.Z1();
        }
        m3();
    }

    @Override // ib.i0
    public void r(LiveBasicParams liveBasicParams) {
        jo.p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
        ib.k kVar = this.U0;
        if (kVar != null) {
            kVar.s(liveBasicParams);
        }
        m3();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), c2.f34738a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void t1(Bundle bundle) {
        Window window;
        super.t1(bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        Dialog p33 = p3();
        if (p33 != null) {
            p33.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: ib.f
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                    boolean T3;
                    T3 = j.T3(j.this, dialogInterface, i10, keyEvent);
                    return T3;
                }
            });
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.U0 = context instanceof ib.k ? (ib.k) context : null;
    }
}
