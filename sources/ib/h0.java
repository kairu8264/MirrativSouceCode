package ib;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.NextLiveView;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import hb.c2;
import hb.t1;
import hb.x1;
import java.util.List;
import kq.a;
import org.json.JSONObject;
import uo.q0;
import uo.r0;
import yd.g1;

/* loaded from: classes2.dex */
public final class h0 extends androidx.fragment.app.e implements q0 {
    public final /* synthetic */ da.j N0 = new da.j();
    public final AutoClearedValue O0 = nd.a.a(this);
    public i0 P0;
    public final wn.f Q0;
    public final wn.f R0;
    public e0 S0;
    public static final /* synthetic */ qo.h<Object>[] U0 = {jo.f0.d(new jo.s(h0.class, "binding", "getBinding()Lcom/dena/mirrativ/player/databinding/DialogFragmentRecommendNextLiveBinding;", 0))};
    public static final a T0 = new a(null);
    public static final int V0 = 8;
    public static final String W0 = h0.class.getSimpleName();

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h0 a() {
            return new h0();
        }

        public final String b() {
            return h0.W0;
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.RecommendNextLiveDialogFragment$observeCommonStoreValues$1", f = "RecommendNextLiveDialogFragment.kt", l = {217}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f36589w;

        /* renamed from: x  reason: collision with root package name */
        public Object f36590x;

        /* renamed from: y  reason: collision with root package name */
        public Object f36591y;

        /* renamed from: z  reason: collision with root package name */
        public int f36592z;

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
        /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:21:0x005f, B:23:0x0067, B:25:0x0073, B:26:0x0076), top: B:38:0x005f }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:38:0x005f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f36592z
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 != r3) goto L24
                java.lang.Object r1 = r9.f36591y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r9.f36590x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r9.f36589w
                ib.h0 r5 = (ib.h0) r5
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L21
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r0
                r0 = r9
                goto L5f
            L21:
                r10 = move-exception
                goto L87
            L24:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2c:
                wn.m.b(r10)
                ib.h0 r10 = ib.h0.this
                ib.e0 r10 = ib.h0.E3(r10)
                if (r10 != 0) goto L3d
                java.lang.String r10 = "store"
                jo.p.v(r10)
                r10 = r2
            L3d:
                wo.x r4 = r10.B()
                ib.h0 r10 = ib.h0.this
                wo.k r1 = r4.iterator()     // Catch: java.lang.Throwable -> L21
                r5 = r10
                r10 = r9
            L49:
                r10.f36589w = r5     // Catch: java.lang.Throwable -> L21
                r10.f36590x = r4     // Catch: java.lang.Throwable -> L21
                r10.f36591y = r1     // Catch: java.lang.Throwable -> L21
                r10.f36592z = r3     // Catch: java.lang.Throwable -> L21
                java.lang.Object r6 = r1.a(r10)     // Catch: java.lang.Throwable -> L21
                if (r6 != r0) goto L58
                return r0
            L58:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r8
            L5f:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L85
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L85
                if (r10 == 0) goto L7f
                java.lang.Object r10 = r4.next()     // Catch: java.lang.Throwable -> L85
                com.dena.mirrorman.net.api.response.live.LiveBasicParams r10 = (com.dena.mirrorman.net.api.response.live.LiveBasicParams) r10     // Catch: java.lang.Throwable -> L85
                ib.i0 r7 = ib.h0.D3(r6)     // Catch: java.lang.Throwable -> L85
                if (r7 == 0) goto L76
                r7.r(r10)     // Catch: java.lang.Throwable -> L85
            L76:
                r6.m3()     // Catch: java.lang.Throwable -> L85
                r10 = r0
                r0 = r1
                r1 = r4
                r4 = r5
                r5 = r6
                goto L49
            L7f:
                wo.n.a(r5, r2)
                wn.v r10 = wn.v.f59242a
                return r10
            L85:
                r10 = move-exception
                r4 = r5
            L87:
                throw r10     // Catch: java.lang.Throwable -> L88
            L88:
                r0 = move-exception
                wo.n.a(r4, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ib.h0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.RecommendNextLiveDialogFragment$observeStoreValuesOnlyWhenRecommendLivesNotLoaded$2", f = "RecommendNextLiveDialogFragment.kt", l = {217}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f36593w;

        /* renamed from: x  reason: collision with root package name */
        public Object f36594x;

        /* renamed from: y  reason: collision with root package name */
        public Object f36595y;

        /* renamed from: z  reason: collision with root package name */
        public int f36596z;

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
        /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x008f, TryCatch #2 {all -> 0x008f, blocks: (B:21:0x005f, B:23:0x0067, B:25:0x0073, B:27:0x0079, B:28:0x007c, B:29:0x0080), top: B:43:0x005f }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:43:0x005f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f36596z
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 != r3) goto L24
                java.lang.Object r1 = r9.f36595y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r9.f36594x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r9.f36593w
                ib.h0 r5 = (ib.h0) r5
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L21
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r0
                r0 = r9
                goto L5f
            L21:
                r10 = move-exception
                goto L91
            L24:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2c:
                wn.m.b(r10)
                ib.h0 r10 = ib.h0.this
                ib.e0 r10 = ib.h0.E3(r10)
                if (r10 != 0) goto L3d
                java.lang.String r10 = "store"
                jo.p.v(r10)
                r10 = r2
            L3d:
                wo.x r4 = r10.z()
                ib.h0 r10 = ib.h0.this
                wo.k r1 = r4.iterator()     // Catch: java.lang.Throwable -> L21
                r5 = r10
                r10 = r9
            L49:
                r10.f36593w = r5     // Catch: java.lang.Throwable -> L21
                r10.f36594x = r4     // Catch: java.lang.Throwable -> L21
                r10.f36595y = r1     // Catch: java.lang.Throwable -> L21
                r10.f36596z = r3     // Catch: java.lang.Throwable -> L21
                java.lang.Object r6 = r1.a(r10)     // Catch: java.lang.Throwable -> L21
                if (r6 != r0) goto L58
                return r0
            L58:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r8
            L5f:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L8f
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L8f
                if (r10 == 0) goto L89
                java.lang.Object r10 = r4.next()     // Catch: java.lang.Throwable -> L8f
                java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L8f
                boolean r7 = r10.isEmpty()     // Catch: java.lang.Throwable -> L8f
                if (r7 == 0) goto L80
                ib.i0 r10 = ib.h0.D3(r6)     // Catch: java.lang.Throwable -> L8f
                if (r10 == 0) goto L7c
                r10.Q()     // Catch: java.lang.Throwable -> L8f
            L7c:
                r6.m3()     // Catch: java.lang.Throwable -> L8f
                goto L83
            L80:
                ib.h0.H3(r6, r10)     // Catch: java.lang.Throwable -> L8f
            L83:
                r10 = r0
                r0 = r1
                r1 = r4
                r4 = r5
                r5 = r6
                goto L49
            L89:
                wo.n.a(r5, r2)
                wn.v r10 = wn.v.f59242a
                return r10
            L8f:
                r10 = move-exception
                r4 = r5
            L91:
                throw r10     // Catch: java.lang.Throwable -> L92
            L92:
                r0 = move-exception
                wo.n.a(r4, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ib.h0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.player.afterplay.RecommendNextLiveDialogFragment$observeStoreValuesOnlyWhenRecommendLivesNotLoaded$3", f = "RecommendNextLiveDialogFragment.kt", l = {217}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f36597w;

        /* renamed from: x  reason: collision with root package name */
        public Object f36598x;

        /* renamed from: y  reason: collision with root package name */
        public Object f36599y;

        /* renamed from: z  reason: collision with root package name */
        public int f36600z;

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
        /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:21:0x005f, B:23:0x0067, B:25:0x0073, B:26:0x0076), top: B:38:0x005f }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:38:0x005f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f36600z
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 != r3) goto L24
                java.lang.Object r1 = r8.f36599y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r8.f36598x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r8.f36597w
                ib.h0 r5 = (ib.h0) r5
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
                ib.h0 r9 = ib.h0.this
                ib.e0 r9 = ib.h0.E3(r9)
                if (r9 != 0) goto L3d
                java.lang.String r9 = "store"
                jo.p.v(r9)
                r9 = r2
            L3d:
                wo.x r4 = r9.o()
                ib.h0 r9 = ib.h0.this
                wo.k r1 = r4.iterator()     // Catch: java.lang.Throwable -> L21
                r5 = r9
                r9 = r8
            L49:
                r9.f36597w = r5     // Catch: java.lang.Throwable -> L21
                r9.f36598x = r4     // Catch: java.lang.Throwable -> L21
                r9.f36599y = r1     // Catch: java.lang.Throwable -> L21
                r9.f36600z = r3     // Catch: java.lang.Throwable -> L21
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
                com.dena.mirrativ.mirrativapi.core.MRError r9 = (com.dena.mirrativ.mirrativapi.core.MRError) r9     // Catch: java.lang.Throwable -> L85
                ib.i0 r9 = ib.h0.D3(r6)     // Catch: java.lang.Throwable -> L85
                if (r9 == 0) goto L76
                r9.Q()     // Catch: java.lang.Throwable -> L85
            L76:
                r6.m3()     // Catch: java.lang.Throwable -> L85
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
            throw new UnsupportedOperationException("Method not decompiled: ib.h0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f36601w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f36601w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f36601w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f36602w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar) {
            super(0);
            this.f36602w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f36602w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f36603w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36604x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36605y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f36606z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f36603w = aVar;
            this.f36604x = aVar2;
            this.f36605y = aVar3;
            this.f36606z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f36603w;
            vq.a aVar2 = this.f36604x;
            io.a aVar3 = this.f36605y;
            xq.a aVar4 = this.f36606z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(e0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f36607w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar) {
            super(0);
            this.f36607w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f36607w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.l<View, wn.v> {
        public i() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            i0 i0Var = h0.this.P0;
            if (i0Var != null) {
                i0Var.Q();
            }
            h0.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.l<View, wn.v> {
        public j() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            i0 i0Var = h0.this.P0;
            if (i0Var != null) {
                i0Var.Q();
            }
            h0.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<LiveBasicParams> f36611x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ LiveBasicParams f36612y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(List<? extends LiveBasicParams> list, LiveBasicParams liveBasicParams) {
            super(1);
            this.f36611x = list;
            this.f36612y = liveBasicParams;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            h0.this.P3(this.f36611x, this.f36612y);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<LiveBasicParams> f36614x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ LiveBasicParams f36615y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(List<? extends LiveBasicParams> list, LiveBasicParams liveBasicParams) {
            super(1);
            this.f36614x = list;
            this.f36615y = liveBasicParams;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            h0.this.P3(this.f36614x, this.f36615y);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f36616w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36617x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36618y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f36616w = componentCallbacks;
            this.f36617x = aVar;
            this.f36618y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f36616w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f36617x, this.f36618y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<ib.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f36619w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f36620x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f36621y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f36619w = componentCallbacks;
            this.f36620x = aVar;
            this.f36621y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ib.e, java.lang.Object] */
        @Override // io.a
        public final ib.e invoke() {
            ComponentCallbacks componentCallbacks = this.f36619w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ib.e.class), this.f36620x, this.f36621y);
        }
    }

    public h0() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.Q0 = wn.g.b(iVar, new m(this, null, null));
        this.R0 = wn.g.b(iVar, new n(this, null, null));
    }

    public static final void N3(h0 h0Var, Boolean bool) {
        jo.p.h(h0Var, "this$0");
        StatusView statusView = h0Var.J3().F;
        jo.p.g(bool, "it");
        statusView.b(bool.booleanValue() ? StatusView.b.C0181b.f20790w : StatusView.b.c.f20791w);
    }

    public static final boolean O3(h0 h0Var, Dialog dialog, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        jo.p.h(h0Var, "this$0");
        jo.p.h(dialog, "$this_apply");
        if (keyEvent.getAction() == 1 && i10 == 4) {
            i0 i0Var = h0Var.P0;
            if (i0Var != null) {
                i0Var.Q();
            }
            dialog.dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        Fragment P2 = P2();
        jo.p.g(P2, "requireParentFragment()");
        e eVar = new e(P2);
        xq.a a10 = gq.a.a(P2);
        f fVar = new f(eVar);
        this.S0 = (e0) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(P2, jo.f0.b(e0.class), new h(fVar), new g(eVar, null, null, a10)).getValue());
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.P0 = null;
        r0.d(this, null, 1, null);
        super.I1();
    }

    public final ib.e I3() {
        return (ib.e) this.R0.getValue();
    }

    public final kb.j J3() {
        return (kb.j) this.O0.b(this, U0[0]);
    }

    public final MRLogger K3() {
        return (MRLogger) this.Q0.getValue();
    }

    public final void L3() {
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    public final void M3() {
        e0 e0Var = this.S0;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        e0Var.L().i(this, new androidx.lifecycle.f0() { // from class: ib.g0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                h0.N3(h0.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new c(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    public final void P3(List<? extends LiveBasicParams> list, LiveBasicParams liveBasicParams) {
        String liveId;
        String liveId2;
        ib.e I3 = I3();
        e0 e0Var = this.S0;
        e0 e0Var2 = null;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        I3.m(Referer.LiveView.FINISHED_DIALOG, e0Var.u(), liveBasicParams);
        MRLogger K3 = K3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_CLICK_RECOMMEND_LIVE);
        wn.k[] kVarArr = new wn.k[3];
        e0 e0Var3 = this.S0;
        if (e0Var3 == null) {
            jo.p.v("store");
            e0Var3 = null;
        }
        kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, e0Var3.u());
        e0 e0Var4 = this.S0;
        if (e0Var4 == null) {
            jo.p.v("store");
            e0Var4 = null;
        }
        kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, e0Var4.G());
        JSONObject jSONObject = new JSONObject();
        LiveBasicParams liveBasicParams2 = (LiveBasicParams) xn.a0.a0(list, 0);
        if (liveBasicParams2 != null && (liveId2 = liveBasicParams2.getLiveId()) != null) {
            jSONObject.put("recommend_live1", liveId2);
        }
        LiveBasicParams liveBasicParams3 = (LiveBasicParams) xn.a0.a0(list, 1);
        if (liveBasicParams3 != null && (liveId = liveBasicParams3.getLiveId()) != null) {
            jSONObject.put("recommend_live2", liveId);
        }
        e0 e0Var5 = this.S0;
        if (e0Var5 == null) {
            jo.p.v("store");
        } else {
            e0Var2 = e0Var5;
        }
        String t10 = e0Var2.t();
        if (t10 != null) {
            jSONObject.put("linked_live_id", t10);
        }
        jSONObject.put("selected_live", liveBasicParams.getLiveId());
        wn.v vVar = wn.v.f59242a;
        kVarArr[2] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString());
        builder.setPayload(xn.s.m(kVarArr));
        K3.sendLog(builder.build());
    }

    public final void Q3(kb.j jVar) {
        this.O0.a(this, U0[0], jVar);
    }

    public final void R3() {
        AppCompatImageView appCompatImageView = J3().B;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        g1.a(appCompatImageView, new i());
        View u10 = J3().u();
        jo.p.g(u10, "binding.root");
        g1.a(u10, new j());
    }

    public final void S3(List<? extends LiveBasicParams> list) {
        String liveId;
        String liveId2;
        MRLogger K3 = K3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_SHOW_RECOMMEND_LIVE);
        wn.k[] kVarArr = new wn.k[3];
        e0 e0Var = this.S0;
        e0 e0Var2 = null;
        if (e0Var == null) {
            jo.p.v("store");
            e0Var = null;
        }
        kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, e0Var.u());
        e0 e0Var3 = this.S0;
        if (e0Var3 == null) {
            jo.p.v("store");
            e0Var3 = null;
        }
        kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, e0Var3.G());
        JSONObject jSONObject = new JSONObject();
        LiveBasicParams liveBasicParams = (LiveBasicParams) xn.a0.a0(list, 0);
        if (liveBasicParams != null && (liveId2 = liveBasicParams.getLiveId()) != null) {
            jSONObject.put("recommend_live1", liveId2);
        }
        LiveBasicParams liveBasicParams2 = (LiveBasicParams) xn.a0.a0(list, 1);
        if (liveBasicParams2 != null && (liveId = liveBasicParams2.getLiveId()) != null) {
            jSONObject.put("recommend_live2", liveId);
        }
        e0 e0Var4 = this.S0;
        if (e0Var4 == null) {
            jo.p.v("store");
        } else {
            e0Var2 = e0Var4;
        }
        String t10 = e0Var2.t();
        if (t10 != null) {
            jSONObject.put("linked_live_id", t10);
        }
        wn.v vVar = wn.v.f59242a;
        kVarArr[2] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, jSONObject.toString());
        builder.setPayload(xn.s.m(kVarArr));
        K3.sendLog(builder.build());
        if (!list.isEmpty()) {
            LiveBasicParams liveBasicParams3 = list.get(0);
            J3().D.setVisibility(0);
            J3().D.a(liveBasicParams3);
            NextLiveView nextLiveView = J3().D;
            jo.p.g(nextLiveView, "binding.nextLiveView1");
            g1.a(nextLiveView, new k(list, liveBasicParams3));
        }
        if (list.size() > 1) {
            LiveBasicParams liveBasicParams4 = list.get(1);
            J3().E.setVisibility(0);
            J3().E.a(liveBasicParams4);
            NextLiveView nextLiveView2 = J3().E;
            jo.p.g(nextLiveView2, "binding.nextLiveView2");
            g1.a(nextLiveView2, new l(list, liveBasicParams4));
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        e0 e0Var = null;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), x1.dialog_fragment_recommend_next_live, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        Q3((kb.j) e10);
        R3();
        L3();
        e0 e0Var2 = this.S0;
        if (e0Var2 == null) {
            jo.p.v("store");
            e0Var2 = null;
        }
        List<LiveBasicParams> y10 = e0Var2.y();
        if (y10 == null) {
            M3();
            ib.e I3 = I3();
            e0 e0Var3 = this.S0;
            if (e0Var3 == null) {
                jo.p.v("store");
            } else {
                e0Var = e0Var3;
            }
            I3.h(Referer.LiveView.FINISHED_DIALOG, e0Var.u());
        } else if (y10.isEmpty()) {
            i0 i0Var = this.P0;
            if (i0Var != null) {
                i0Var.Q();
            }
            m3();
        } else {
            S3(y10);
        }
        final Dialog dialog = new Dialog(N2(), c2.f34738a);
        dialog.setContentView(J3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(t1.f34975p);
        }
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: ib.f0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                boolean O3;
                O3 = h0.O3(h0.this, dialog, dialogInterface, i10, keyEvent);
                return O3;
            }
        });
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        Fragment H0 = H0();
        this.P0 = H0 instanceof i0 ? (i0) H0 : null;
    }
}
