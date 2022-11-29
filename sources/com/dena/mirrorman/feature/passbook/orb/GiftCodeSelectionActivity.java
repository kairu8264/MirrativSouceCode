package com.dena.mirrorman.feature.passbook.orb;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import co.l;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity;
import com.dena.mirrorman.net.api.response.GiftCodeSelectionResponse;
import com.dena.mirrorman.util.FragmentRunner;
import java.text.NumberFormat;
import java.util.HashMap;
import jo.f0;
import jo.p;
import jo.q;
import kq.a;
import nd.b1;
import nd.f1;
import nf.m;
import se.g;
import se.k;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.q0;
import uo.r0;
import wn.v;
import xn.r;

/* loaded from: classes2.dex */
public final class GiftCodeSelectionActivity extends e.b implements q0, k.b, g.b {
    public static final a V = new a(null);
    public static final int W = 8;
    public final ao.g O;
    public ae.i P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public int T;
    public final FragmentRunner U;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, int i10) {
            p.h(context, "context");
            Intent intent = new Intent(context, GiftCodeSelectionActivity.class);
            intent.putExtra("gift_code_present_id", i10);
            return intent;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity$onCreate$3", f = "GiftCodeSelectionActivity.kt", l = {160}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f25920w;

        /* renamed from: x  reason: collision with root package name */
        public Object f25921x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25922y;

        /* renamed from: z  reason: collision with root package name */
        public int f25923z;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x00dd, TryCatch #2 {all -> 0x00dd, blocks: (B:16:0x0057, B:18:0x0060, B:23:0x0074, B:24:0x007a, B:35:0x0090, B:38:0x0098, B:39:0x009c, B:41:0x00a8, B:42:0x00ac, B:46:0x00bb, B:48:0x00c4, B:50:0x00c9, B:45:0x00b5, B:33:0x008c, B:30:0x0086, B:27:0x0080, B:21:0x006c), top: B:65:0x0057 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:65:0x0057). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 231
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity$onCreate$4", f = "GiftCodeSelectionActivity.kt", l = {160}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f25924w;

        /* renamed from: x  reason: collision with root package name */
        public Object f25925x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25926y;

        /* renamed from: z  reason: collision with root package name */
        public int f25927z;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:17:0x0058, B:19:0x0060, B:24:0x0074, B:25:0x007a, B:33:0x008a, B:34:0x0095, B:36:0x0099, B:31:0x0086, B:28:0x0080, B:22:0x006c), top: B:47:0x0058 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:16:0x0057). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f25927z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f25926y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f25925x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f25924w
                com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity r4 = (com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> Lab
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L57
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity r10 = com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity.this
                nf.m r10 = com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity.E3(r10)
                wo.q r10 = r10.h()
                wo.x r3 = r10.g()
                com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity r10 = com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lab
                r4 = r10
                r10 = r9
            L41:
                r10.f25924w = r4     // Catch: java.lang.Throwable -> Lab
                r10.f25925x = r3     // Catch: java.lang.Throwable -> Lab
                r10.f25926y = r1     // Catch: java.lang.Throwable -> Lab
                r10.f25927z = r2     // Catch: java.lang.Throwable -> Lab
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> Lab
                if (r5 != r0) goto L50
                return r0
            L50:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L57:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> La8
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> La8
                if (r10 == 0) goto La2
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> La8
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> La8
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> La8
                if (r6 == 0) goto L6c
                r6 = r2
                goto L72
            L6c:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> La8
                boolean r6 = jo.p.c(r10, r6)     // Catch: java.lang.Throwable -> La8
            L72:
                if (r6 == 0) goto L7a
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> La8
                r6.l(r5, r10)     // Catch: java.lang.Throwable -> La8
                goto L9c
            L7a:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> La8
                if (r6 == 0) goto L80
                r6 = r2
                goto L82
            L80:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Blocked     // Catch: java.lang.Throwable -> La8
            L82:
                if (r6 == 0) goto L86
                r6 = r2
                goto L88
            L86:
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Banned     // Catch: java.lang.Throwable -> La8
            L88:
                if (r6 == 0) goto L95
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> La8
                java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> La8
                r7 = 0
                r6.B(r5, r10, r7)     // Catch: java.lang.Throwable -> La8
                goto L9c
            L95:
                boolean r10 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> La8
                if (r10 == 0) goto L9c
                of.n.z(r5)     // Catch: java.lang.Throwable -> La8
            L9c:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L41
            La2:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            La8:
                r10 = move-exception
                r3 = r4
                goto Lac
            Lab:
                r10 = move-exception
            Lac:
                throw r10     // Catch: java.lang.Throwable -> Lad
            Lad:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity$onCreate$8", f = "GiftCodeSelectionActivity.kt", l = {160}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f25928w;

        /* renamed from: x  reason: collision with root package name */
        public Object f25929x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25930y;

        /* renamed from: z  reason: collision with root package name */
        public int f25931z;

        /* loaded from: classes2.dex */
        public static final class a extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ se.l f25932w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ GiftCodeSelectionActivity f25933x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(se.l lVar, GiftCodeSelectionActivity giftCodeSelectionActivity) {
                super(0);
                this.f25932w = lVar;
                this.f25933x = giftCodeSelectionActivity;
            }

            public final void a() {
                se.g.P0.a(this.f25932w).z3(this.f25933x.a3(), "GiftCodeSelectionApprovedDialogFragment");
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #2 {all -> 0x007e, blocks: (B:17:0x0058, B:19:0x0060), top: B:34:0x0058 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:16:0x0057). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f25931z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f25930y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f25929x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f25928w
                com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity r4 = (com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L81
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L57
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity r10 = com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity.this
                nf.m r10 = com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity.E3(r10)
                wo.q r10 = r10.i()
                wo.x r3 = r10.g()
                com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity r10 = com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L81
                r4 = r10
                r10 = r9
            L41:
                r10.f25928w = r4     // Catch: java.lang.Throwable -> L81
                r10.f25929x = r3     // Catch: java.lang.Throwable -> L81
                r10.f25930y = r1     // Catch: java.lang.Throwable -> L81
                r10.f25931z = r2     // Catch: java.lang.Throwable -> L81
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L81
                if (r5 != r0) goto L50
                return r0
            L50:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L57:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L7e
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L7e
                if (r10 == 0) goto L78
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L7e
                se.l r10 = (se.l) r10     // Catch: java.lang.Throwable -> L7e
                com.dena.mirrorman.util.FragmentRunner r6 = com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity.D3(r5)     // Catch: java.lang.Throwable -> L7e
                com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity$d$a r7 = new com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity$d$a     // Catch: java.lang.Throwable -> L7e
                r7.<init>(r10, r5)     // Catch: java.lang.Throwable -> L7e
                r6.c(r7)     // Catch: java.lang.Throwable -> L7e
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L41
            L78:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L7e:
                r10 = move-exception
                r3 = r4
                goto L82
            L81:
                r10 = move-exception
            L82:
                throw r10     // Catch: java.lang.Throwable -> L83
            L83:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.feature.passbook.orb.GiftCodeSelectionActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25934w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25935x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25936y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25934w = componentCallbacks;
            this.f25935x = aVar;
            this.f25936y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f25934w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f25935x, this.f25936y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<od.l> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25937w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25938x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25939y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25937w = componentCallbacks;
            this.f25938x = aVar;
            this.f25939y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.l, java.lang.Object] */
        @Override // io.a
        public final od.l invoke() {
            ComponentCallbacks componentCallbacks = this.f25937w;
            return gq.a.a(componentCallbacks).c(f0.b(od.l.class), this.f25938x, this.f25939y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25940w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f25940w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f25940w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f25941w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25942x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25943y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f25944z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f25941w = aVar;
            this.f25942x = aVar2;
            this.f25943y = aVar3;
            this.f25944z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f25941w;
            vq.a aVar2 = this.f25942x;
            io.a aVar3 = this.f25943y;
            xq.a aVar4 = this.f25944z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(m.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25945w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f25945w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f25945w.U();
            p.g(U, "viewModelStore");
            return U;
        }
    }

    public GiftCodeSelectionActivity() {
        b0 b10;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.O = c10.plus(b10);
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.Q = wn.g.b(iVar, new e(this, null, null));
        this.R = wn.g.b(iVar, new f(this, null, null));
        this.S = new s0(f0.b(m.class), new i(this), new h(new g(this), null, null, gq.a.a(this)));
        this.U = new FragmentRunner(this);
    }

    public static final void I3(GiftCodeSelectionActivity giftCodeSelectionActivity, View view) {
        p.h(giftCodeSelectionActivity, "this$0");
        giftCodeSelectionActivity.finish();
    }

    public static final void J3(GiftCodeSelectionActivity giftCodeSelectionActivity, Boolean bool) {
        p.h(giftCodeSelectionActivity, "this$0");
        ae.i iVar = giftCodeSelectionActivity.P;
        if (iVar == null) {
            p.v("binding");
            iVar = null;
        }
        StatusView statusView = iVar.P;
        p.g(bool, "isLoading");
        statusView.b(bool.booleanValue() ? StatusView.b.C0181b.f20790w : StatusView.b.c.f20791w);
    }

    public static final void K3(GiftCodeSelectionActivity giftCodeSelectionActivity, GiftCodeSelectionResponse giftCodeSelectionResponse) {
        p.h(giftCodeSelectionActivity, "this$0");
        if (giftCodeSelectionResponse == null) {
            return;
        }
        ae.i iVar = giftCodeSelectionActivity.P;
        ae.i iVar2 = null;
        if (iVar == null) {
            p.v("binding");
            iVar = null;
        }
        iVar.C.setText(NumberFormat.getNumberInstance().format(Integer.valueOf(giftCodeSelectionResponse.getAmount())));
        ae.i iVar3 = giftCodeSelectionActivity.P;
        if (iVar3 == null) {
            p.v("binding");
            iVar3 = null;
        }
        iVar3.B.setText(giftCodeSelectionActivity.getString(f1.text_giftcode_received, new Object[]{giftCodeSelectionResponse.getReasonText()}));
        ae.i iVar4 = giftCodeSelectionActivity.P;
        if (iVar4 == null) {
            p.v("binding");
        } else {
            iVar2 = iVar4;
        }
        iVar2.E.setVisibility(8);
    }

    public static final void L3(GiftCodeSelectionActivity giftCodeSelectionActivity, View view) {
        p.h(giftCodeSelectionActivity, "this$0");
        giftCodeSelectionActivity.N3(se.l.ITUNES);
    }

    public static final void M3(GiftCodeSelectionActivity giftCodeSelectionActivity, View view) {
        p.h(giftCodeSelectionActivity, "this$0");
        giftCodeSelectionActivity.N3(se.l.PLAY_STORE);
    }

    @Override // se.g.b
    public void B2() {
        finish();
    }

    public final od.l F3() {
        return (od.l) this.R.getValue();
    }

    public final MRLogger G3() {
        return (MRLogger) this.Q.getValue();
    }

    public final m H3() {
        return (m) this.S.getValue();
    }

    public final void N3(se.l lVar) {
        if (a3().e0("GiftCodeSelectionDialogFragment") != null) {
            return;
        }
        O3(lVar);
        k.a aVar = k.S0;
        GiftCodeSelectionResponse f10 = H3().g().f();
        p.e(f10);
        aVar.a(lVar, f10.getAmount(), this.T).z3(a3(), "GiftCodeSelectionDialogFragment");
    }

    public final void O3(se.l lVar) {
        GiftCodeSelectionResponse f10 = H3().g().f();
        if (f10 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("user_gift_code_present_id", String.valueOf(this.T));
        hashMap.put("price", String.valueOf(f10.getAmount()));
        hashMap.put("type", lVar == se.l.ITUNES ? "itunes" : "play_store");
        MRLogger G3 = G3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_INCENTIVE_GIFT_CODE_SELECT);
        builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new xm.e().s(hashMap))));
        G3.sendLog(builder.build());
    }

    @Override // se.k.b
    public void Y0(se.l lVar) {
        p.h(lVar, "giftCodeType");
        F3().c(this.T, lVar);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O;
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, b1.activity_gift_code_selection);
        p.g(g10, "setContentView(this, R.l…vity_gift_code_selection)");
        ae.i iVar = (ae.i) g10;
        this.P = iVar;
        if (iVar == null) {
            p.v("binding");
            iVar = null;
        }
        iVar.R.setNavigationOnClickListener(new View.OnClickListener() { // from class: se.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftCodeSelectionActivity.I3(GiftCodeSelectionActivity.this, view);
            }
        });
        ae.i iVar2 = this.P;
        if (iVar2 == null) {
            p.v("binding");
            iVar2 = null;
        }
        iVar2.P.b(StatusView.b.C0181b.f20790w);
        H3().j().i(this, new androidx.lifecycle.f0() { // from class: se.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                GiftCodeSelectionActivity.J3(GiftCodeSelectionActivity.this, (Boolean) obj);
            }
        });
        this.T = getIntent().getIntExtra("gift_code_present_id", 0);
        uo.l.d(this, null, null, new b(null), 3, null);
        uo.l.d(this, null, null, new c(null), 3, null);
        H3().g().i(this, new androidx.lifecycle.f0() { // from class: se.d
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                GiftCodeSelectionActivity.K3(GiftCodeSelectionActivity.this, (GiftCodeSelectionResponse) obj);
            }
        });
        ae.i iVar3 = this.P;
        if (iVar3 == null) {
            p.v("binding");
            iVar3 = null;
        }
        iVar3.O.setOnClickListener(new View.OnClickListener() { // from class: se.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftCodeSelectionActivity.L3(GiftCodeSelectionActivity.this, view);
            }
        });
        ae.i iVar4 = this.P;
        if (iVar4 == null) {
            p.v("binding");
            iVar4 = null;
        }
        iVar4.N.setOnClickListener(new View.OnClickListener() { // from class: se.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftCodeSelectionActivity.M3(GiftCodeSelectionActivity.this, view);
            }
        });
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        F3().d(this.T);
    }
}
