package hc;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.streaming.groupshot.GroupShotBackgroundSettingView;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.clientlog.logs.detail.GroupShotParticipantTargetDetail;
import com.dena.mirrorman.customview.GroupShotMemberSettingView;
import com.dena.mirrorman.net.api.response.live.LiveGiftRankingUser;
import hc.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kq.a;

/* loaded from: classes2.dex */
public final class r0 extends androidx.fragment.app.e implements uo.q0 {
    public final /* synthetic */ uo.q0 N0 = uo.r0.b();
    public final wn.f O0 = wn.g.a(new j());
    public s0 P0;
    public final wn.f Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final AutoClearedValue V0;
    public nf.h0 W0;
    public final androidx.activity.result.c<Intent> X0;
    public static final /* synthetic */ qo.h<Object>[] Z0 = {jo.f0.d(new jo.s(r0.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/DialogFragmentGroupShotSettingsBinding;", 0))};
    public static final a Y0 = new a(null);

    /* renamed from: a1  reason: collision with root package name */
    public static final int f35214a1 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final r0 a(String str) {
            jo.p.h(str, "referer");
            r0 r0Var = new r0();
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_KEY_REFERER", str);
            r0Var.V2(bundle);
            return r0Var;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotSettingsDialogFragment$observeStoreValues$1", f = "GroupShotSettingsDialogFragment.kt", l = {343}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f35215w;

        /* renamed from: x  reason: collision with root package name */
        public Object f35216x;

        /* renamed from: y  reason: collision with root package name */
        public Object f35217y;

        /* renamed from: z  reason: collision with root package name */
        public int f35218z;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #1 {all -> 0x0082, blocks: (B:21:0x005f, B:23:0x0067), top: B:35:0x005f }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:35:0x005f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f35218z
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 != r3) goto L24
                java.lang.Object r1 = r9.f35217y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r9.f35216x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r9.f35215w
                hc.r0 r5 = (hc.r0) r5
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L21
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r0
                r0 = r9
                goto L5f
            L21:
                r10 = move-exception
                goto L84
            L24:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2c:
                wn.m.b(r10)
                hc.r0 r10 = hc.r0.this
                nf.h0 r10 = hc.r0.O3(r10)
                if (r10 != 0) goto L3d
                java.lang.String r10 = "store"
                jo.p.v(r10)
                r10 = r2
            L3d:
                wo.x r4 = r10.x()
                hc.r0 r10 = hc.r0.this
                wo.k r1 = r4.iterator()     // Catch: java.lang.Throwable -> L21
                r5 = r10
                r10 = r9
            L49:
                r10.f35215w = r5     // Catch: java.lang.Throwable -> L21
                r10.f35216x = r4     // Catch: java.lang.Throwable -> L21
                r10.f35217y = r1     // Catch: java.lang.Throwable -> L21
                r10.f35218z = r3     // Catch: java.lang.Throwable -> L21
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
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L82
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L82
                if (r10 == 0) goto L7c
                java.lang.Object r10 = r4.next()     // Catch: java.lang.Throwable -> L82
                java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L82
                ac.y0 r7 = hc.r0.J3(r6)     // Catch: java.lang.Throwable -> L82
                com.dena.mirrativ.streaming.groupshot.GroupShotBackgroundSettingView r7 = r7.B     // Catch: java.lang.Throwable -> L82
                r7.setBindModels(r10)     // Catch: java.lang.Throwable -> L82
                r10 = r0
                r0 = r1
                r1 = r4
                r4 = r5
                r5 = r6
                goto L49
            L7c:
                wo.n.a(r5, r2)
                wn.v r10 = wn.v.f59242a
                return r10
            L82:
                r10 = move-exception
                r4 = r5
            L84:
                throw r10     // Catch: java.lang.Throwable -> L85
            L85:
                r0 = move-exception
                wo.n.a(r4, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hc.r0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotSettingsDialogFragment$observeStoreValues$2", f = "GroupShotSettingsDialogFragment.kt", l = {343}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f35219w;

        /* renamed from: x  reason: collision with root package name */
        public Object f35220x;

        /* renamed from: y  reason: collision with root package name */
        public Object f35221y;

        /* renamed from: z  reason: collision with root package name */
        public int f35222z;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:21:0x005f, B:23:0x0067, B:25:0x0073, B:26:0x0082), top: B:36:0x005f }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:36:0x005f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f35222z
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 != r3) goto L24
                java.lang.Object r1 = r10.f35221y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r10.f35220x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r10.f35219w
                hc.r0 r5 = (hc.r0) r5
                wn.m.b(r11)     // Catch: java.lang.Throwable -> L21
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r0
                r0 = r10
                goto L5f
            L21:
                r11 = move-exception
                goto L93
            L24:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L2c:
                wn.m.b(r11)
                hc.r0 r11 = hc.r0.this
                nf.h0 r11 = hc.r0.O3(r11)
                if (r11 != 0) goto L3d
                java.lang.String r11 = "store"
                jo.p.v(r11)
                r11 = r2
            L3d:
                wo.x r4 = r11.H()
                hc.r0 r11 = hc.r0.this
                wo.k r1 = r4.iterator()     // Catch: java.lang.Throwable -> L21
                r5 = r11
                r11 = r10
            L49:
                r11.f35219w = r5     // Catch: java.lang.Throwable -> L21
                r11.f35220x = r4     // Catch: java.lang.Throwable -> L21
                r11.f35221y = r1     // Catch: java.lang.Throwable -> L21
                r11.f35222z = r3     // Catch: java.lang.Throwable -> L21
                java.lang.Object r6 = r1.a(r11)     // Catch: java.lang.Throwable -> L21
                if (r6 != r0) goto L58
                return r0
            L58:
                r9 = r0
                r0 = r11
                r11 = r6
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r9
            L5f:
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L91
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L91
                if (r11 == 0) goto L8b
                java.lang.Object r11 = r4.next()     // Catch: java.lang.Throwable -> L91
                wn.k r11 = (wn.k) r11     // Catch: java.lang.Throwable -> L91
                hc.s0 r7 = hc.r0.K3(r6)     // Catch: java.lang.Throwable -> L91
                if (r7 == 0) goto L82
                java.lang.Object r8 = r11.c()     // Catch: java.lang.Throwable -> L91
                java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L91
                java.lang.Object r11 = r11.d()     // Catch: java.lang.Throwable -> L91
                java.io.File r11 = (java.io.File) r11     // Catch: java.lang.Throwable -> L91
                r7.R(r8, r11)     // Catch: java.lang.Throwable -> L91
            L82:
                r6.m3()     // Catch: java.lang.Throwable -> L91
                r11 = r0
                r0 = r1
                r1 = r4
                r4 = r5
                r5 = r6
                goto L49
            L8b:
                wo.n.a(r5, r2)
                wn.v r11 = wn.v.f59242a
                return r11
            L91:
                r11 = move-exception
                r4 = r5
            L93:
                throw r11     // Catch: java.lang.Throwable -> L94
            L94:
                r0 = move-exception
                wo.n.a(r4, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hc.r0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotSettingsDialogFragment$observeStoreValues$3", f = "GroupShotSettingsDialogFragment.kt", l = {343}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f35223w;

        /* renamed from: x  reason: collision with root package name */
        public Object f35224x;

        /* renamed from: y  reason: collision with root package name */
        public Object f35225y;

        /* renamed from: z  reason: collision with root package name */
        public int f35226z;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
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
                int r1 = r11.f35226z
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 != r3) goto L24
                java.lang.Object r1 = r11.f35225y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r11.f35224x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r11.f35223w
                hc.r0 r5 = (hc.r0) r5
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
                hc.r0 r12 = hc.r0.this
                nf.h0 r12 = hc.r0.O3(r12)
                if (r12 != 0) goto L3d
                java.lang.String r12 = "store"
                jo.p.v(r12)
                r12 = r2
            L3d:
                wo.x r4 = r12.E()
                hc.r0 r12 = hc.r0.this
                wo.k r1 = r4.iterator()     // Catch: java.lang.Throwable -> L21
                r5 = r12
                r12 = r11
            L49:
                r12.f35223w = r5     // Catch: java.lang.Throwable -> L21
                r12.f35224x = r4     // Catch: java.lang.Throwable -> L21
                r12.f35225y = r1     // Catch: java.lang.Throwable -> L21
                r12.f35226z = r3     // Catch: java.lang.Throwable -> L21
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
                android.content.Context r8 = r6.N2()     // Catch: java.lang.Throwable -> L94
                java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> L94
                if (r12 != 0) goto L84
                int r12 = xb.r.f60070c     // Catch: java.lang.Throwable -> L94
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
            throw new UnsupportedOperationException("Method not decompiled: hc.r0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f35227w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f35227w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f35227w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f35227w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35228w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar) {
            super(0);
            this.f35228w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f35228w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35229w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35230x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35231y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f35232z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f35229w = aVar;
            this.f35230x = aVar2;
            this.f35231y = aVar3;
            this.f35232z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f35229w;
            vq.a aVar2 = this.f35230x;
            io.a aVar3 = this.f35231y;
            xq.a aVar4 = this.f35232z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.h0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35233w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar) {
            super(0);
            this.f35233w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f35233w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends Dialog {
        public i(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (r0.this.W3().B.getVisibility() == 0) {
                r0.this.e4();
                return;
            }
            od.n0 b42 = r0.this.b4();
            nf.h0 h0Var = r0.this.W0;
            if (h0Var == null) {
                jo.p.v("store");
                h0Var = null;
            }
            b42.i(h0Var.G());
            dismiss();
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<String> {
        public j() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = r0.this.M2().getString("BUNDLE_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k implements GroupShotMemberSettingView.a {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f35237a;

            static {
                int[] iArr = new int[GroupShotMemberSettingView.b.values().length];
                iArr[GroupShotMemberSettingView.b.Random.ordinal()] = 1;
                iArr[GroupShotMemberSettingView.b.Ranking.ordinal()] = 2;
                iArr[GroupShotMemberSettingView.b.UserIds.ordinal()] = 3;
                f35237a = iArr;
            }
        }

        public k() {
        }

        @Override // com.dena.mirrorman.customview.GroupShotMemberSettingView.a
        public void a() {
            r0.this.d4();
            MRLogger Z3 = r0.this.Z3();
            MRLog.Companion companion = MRLog.Companion;
            r0 r0Var = r0.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_GROUPSHOT_PARTICIPANT_SELECT);
            builder.setTargetType(MRLog.TARGET_TYPE_LIVE);
            builder.setTargetId(r0Var.Y3().b());
            wn.k[] kVarArr = new wn.k[3];
            nf.h0 h0Var = r0Var.W0;
            nf.h0 h0Var2 = null;
            if (h0Var == null) {
                jo.p.v("store");
                h0Var = null;
            }
            GroupShotMemberSettingView.b f10 = h0Var.B().f();
            int i10 = f10 == null ? -1 : a.f35237a[f10.ordinal()];
            String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : "self" : "ranking" : "random";
            nf.h0 h0Var3 = r0Var.W0;
            if (h0Var3 == null) {
                jo.p.v("store");
            } else {
                h0Var2 = h0Var3;
            }
            Integer f11 = h0Var2.D().f();
            if (f11 == null) {
                f11 = 0;
            }
            jo.p.g(f11, "store.groupShotNumberOfMembers.value ?: 0");
            kVarArr[0] = wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new GroupShotParticipantTargetDetail(str, f11.intValue()).toJson());
            kVarArr[1] = wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, r0Var.Y3().b());
            kVarArr[2] = wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, r0Var.c4().T4());
            builder.setPayload(xn.s.m(kVarArr));
            Z3.sendLog(builder.build());
        }

        @Override // com.dena.mirrorman.customview.GroupShotMemberSettingView.a
        public void b(GroupShotMemberSettingView.b bVar) {
            jo.p.h(bVar, "selectedMemberType");
            r0.this.b4().u(bVar);
            if (bVar == GroupShotMemberSettingView.b.UserIds) {
                f0.U0.a(r0.this.Y3().b()).z3(r0.this.O2(), "GroupShotMemberSettingDialogFragment");
                return;
            }
            q.a aVar = hc.q.P0;
            nf.h0 h0Var = r0.this.W0;
            nf.h0 h0Var2 = null;
            if (h0Var == null) {
                jo.p.v("store");
                h0Var = null;
            }
            Integer f10 = h0Var.D().f();
            if (f10 == null) {
                f10 = 0;
            }
            int intValue = f10.intValue();
            nf.h0 h0Var3 = r0.this.W0;
            if (h0Var3 == null) {
                jo.p.v("store");
            } else {
                h0Var2 = h0Var3;
            }
            Integer f11 = h0Var2.A().f();
            if (f11 == null) {
                f11 = 0;
            }
            aVar.a(intValue, f11.intValue()).z3(r0.this.O2(), "GroupShotCountSettingDialogFragment");
        }
    }

    /* loaded from: classes2.dex */
    public static final class l implements GroupShotBackgroundSettingView.b {

        /* loaded from: classes2.dex */
        public static final class a extends f8.c<Bitmap> {
            public final /* synthetic */ GroupShotMemberSettingView.b A;
            public final /* synthetic */ int B;
            public final /* synthetic */ String C;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ r0 f35239z;

            public a(r0 r0Var, GroupShotMemberSettingView.b bVar, int i10, String str) {
                this.f35239z = r0Var;
                this.A = bVar;
                this.B = i10;
                this.C = str;
            }

            @Override // f8.j
            /* renamed from: a */
            public void e(Bitmap bitmap, g8.b<? super Bitmap> bVar) {
                jo.p.h(bitmap, "resource");
                this.f35239z.b4().g(this.A.c(), this.B, bitmap, this.C);
            }

            @Override // f8.j
            public void g(Drawable drawable) {
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends jo.q implements io.l<LiveGiftRankingUser, CharSequence> {

            /* renamed from: w  reason: collision with root package name */
            public static final b f35240w = new b();

            public b() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final CharSequence invoke(LiveGiftRankingUser liveGiftRankingUser) {
                jo.p.h(liveGiftRankingUser, "it");
                return liveGiftRankingUser.getUser().getUserId();
            }
        }

        public l() {
        }

        @Override // hc.f.a
        public void a() {
            r0.this.o4();
        }

        @Override // hc.f.a
        public void b(String str) {
            jo.p.h(str, "backgroundImageUrl");
            r0.this.b4().n(str);
        }

        @Override // com.dena.mirrativ.streaming.groupshot.GroupShotBackgroundSettingView.b
        public void c() {
            r0.this.e4();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
        @Override // com.dena.mirrativ.streaming.groupshot.GroupShotBackgroundSettingView.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d() {
            /*
                Method dump skipped, instructions count: 405
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: hc.r0.l.d():void");
        }

        @Override // hc.f.a
        public void e() {
            r0.this.o4();
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<od.n0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35241w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35242x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35243y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35241w = componentCallbacks;
            this.f35242x = aVar;
            this.f35243y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.n0, java.lang.Object] */
        @Override // io.a
        public final od.n0 invoke() {
            ComponentCallbacks componentCallbacks = this.f35241w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.n0.class), this.f35242x, this.f35243y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35244w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35245x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35246y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35244w = componentCallbacks;
            this.f35245x = aVar;
            this.f35246y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            ComponentCallbacks componentCallbacks = this.f35244w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.b.class), this.f35245x, this.f35246y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35247w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35248x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35249y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35247w = componentCallbacks;
            this.f35248x = aVar;
            this.f35249y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f35247w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f35248x, this.f35249y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35250w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35251x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35252y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35250w = componentCallbacks;
            this.f35251x = aVar;
            this.f35252y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f35250w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f35251x, this.f35252y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35253w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35254x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35255y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35253w = componentCallbacks;
            this.f35254x = aVar;
            this.f35255y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f35253w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f35254x, this.f35255y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<uq.a> {
        public r() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(r0.this.a4());
        }
    }

    public r0() {
        r rVar = new r();
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.Q0 = wn.g.b(iVar, new m(this, null, rVar));
        this.R0 = wn.g.b(iVar, new n(this, null, null));
        this.S0 = wn.g.b(iVar, new o(this, null, null));
        this.T0 = wn.g.b(iVar, new p(this, null, null));
        this.U0 = wn.g.b(iVar, new q(this, null, null));
        this.V0 = nd.a.a(this);
        androidx.activity.result.c<Intent> I2 = I2(new c.c(), new androidx.activity.result.b() { // from class: hc.l0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                r0.U3(r0.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(I2, "registerForActivityResul…eFromGallery(image)\n    }");
        this.X0 = I2;
    }

    public static final void U3(r0 r0Var, androidx.activity.result.a aVar) {
        Uri data;
        Bitmap decodeBitmap;
        jo.p.h(r0Var, "this$0");
        if (aVar.b() != -1) {
            return;
        }
        r0Var.X3().J();
        Intent a10 = aVar.a();
        if (a10 == null || (data = a10.getData()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            decodeBitmap = MediaStore.Images.Media.getBitmap(r0Var.N2().getContentResolver(), data);
        } else {
            decodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(r0Var.N2().getContentResolver(), data), j0.f35196a);
        }
        od.n0 b42 = r0Var.b4();
        jo.p.g(decodeBitmap, "image");
        b42.o(decodeBitmap);
    }

    public static final void V3(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        jo.p.h(imageDecoder, "decoder");
        jo.p.h(imageInfo, "info");
        jo.p.h(source, "src");
        imageDecoder.setTargetSampleSize(2);
        imageDecoder.setAllocator(1);
        imageDecoder.setMemorySizePolicy(0);
    }

    public static final void g4(r0 r0Var, GroupShotMemberSettingView.b bVar) {
        jo.p.h(r0Var, "this$0");
        ArrayList arrayList = null;
        if (bVar == GroupShotMemberSettingView.b.UserIds) {
            GroupShotMemberSettingView groupShotMemberSettingView = r0Var.W3().E;
            jo.p.g(bVar, "it");
            nf.h0 h0Var = r0Var.W0;
            if (h0Var == null) {
                jo.p.v("store");
                h0Var = null;
            }
            List<LiveGiftRankingUser> f10 = h0Var.C().f();
            int size = f10 != null ? f10.size() : 0;
            nf.h0 h0Var2 = r0Var.W0;
            if (h0Var2 == null) {
                jo.p.v("store");
                h0Var2 = null;
            }
            List<LiveGiftRankingUser> f11 = h0Var2.C().f();
            if (f11 != null) {
                arrayList = new ArrayList(xn.t.u(f11, 10));
                for (LiveGiftRankingUser liveGiftRankingUser : f11) {
                    arrayList.add(liveGiftRankingUser.getUser().getProfileImageUrl());
                }
            }
            groupShotMemberSettingView.i(bVar, size, arrayList);
            return;
        }
        GroupShotMemberSettingView groupShotMemberSettingView2 = r0Var.W3().E;
        jo.p.g(bVar, "it");
        nf.h0 h0Var3 = r0Var.W0;
        if (h0Var3 == null) {
            jo.p.v("store");
            h0Var3 = null;
        }
        Integer f12 = h0Var3.D().f();
        if (f12 == null) {
            f12 = 0;
        }
        int intValue = f12.intValue();
        nf.h0 h0Var4 = r0Var.W0;
        if (h0Var4 == null) {
            jo.p.v("store");
            h0Var4 = null;
        }
        List<LiveGiftRankingUser> f13 = h0Var4.C().f();
        if (f13 != null) {
            arrayList = new ArrayList(xn.t.u(f13, 10));
            for (LiveGiftRankingUser liveGiftRankingUser2 : f13) {
                arrayList.add(liveGiftRankingUser2.getUser().getProfileImageUrl());
            }
        }
        groupShotMemberSettingView2.i(bVar, intValue, arrayList);
    }

    public static final void h4(r0 r0Var, ha.a aVar) {
        jo.p.h(r0Var, "this$0");
        r0Var.W3().G.b(aVar.a() ? StatusView.b.C0181b.f20790w : StatusView.b.c.f20791w);
    }

    public static final void i4(r0 r0Var, Boolean bool) {
        jo.p.h(r0Var, "this$0");
        GroupShotBackgroundSettingView groupShotBackgroundSettingView = r0Var.W3().B;
        jo.p.g(bool, "it");
        groupShotBackgroundSettingView.setEnabledSnapButton(bool.booleanValue());
    }

    public static final void j4(r0 r0Var, Integer num) {
        jo.p.h(r0Var, "this$0");
        GroupShotMemberSettingView groupShotMemberSettingView = r0Var.W3().E;
        nf.h0 h0Var = r0Var.W0;
        ArrayList arrayList = null;
        if (h0Var == null) {
            jo.p.v("store");
            h0Var = null;
        }
        GroupShotMemberSettingView.b f10 = h0Var.B().f();
        if (f10 == null) {
            f10 = GroupShotMemberSettingView.b.UnSelected;
        }
        jo.p.g(f10, "store.groupShotMemberTyp…iew.MemberType.UnSelected");
        jo.p.g(num, "it");
        int intValue = num.intValue();
        nf.h0 h0Var2 = r0Var.W0;
        if (h0Var2 == null) {
            jo.p.v("store");
            h0Var2 = null;
        }
        List<LiveGiftRankingUser> f11 = h0Var2.C().f();
        if (f11 != null) {
            arrayList = new ArrayList(xn.t.u(f11, 10));
            for (LiveGiftRankingUser liveGiftRankingUser : f11) {
                arrayList.add(liveGiftRankingUser.getUser().getProfileImageUrl());
            }
        }
        groupShotMemberSettingView.i(f10, intValue, arrayList);
    }

    public static final void k4(r0 r0Var, List list) {
        jo.p.h(r0Var, "this$0");
        GroupShotMemberSettingView groupShotMemberSettingView = r0Var.W3().E;
        nf.h0 h0Var = r0Var.W0;
        if (h0Var == null) {
            jo.p.v("store");
            h0Var = null;
        }
        GroupShotMemberSettingView.b f10 = h0Var.B().f();
        if (f10 == null) {
            f10 = GroupShotMemberSettingView.b.UnSelected;
        }
        jo.p.g(f10, "store.groupShotMemberTyp…iew.MemberType.UnSelected");
        int size = list.size();
        jo.p.g(list, "it");
        ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LiveGiftRankingUser) it.next()).getUser().getProfileImageUrl());
        }
        groupShotMemberSettingView.i(f10, size, arrayList);
    }

    public static final void n4(r0 r0Var, View view) {
        jo.p.h(r0Var, "this$0");
        od.n0 b42 = r0Var.b4();
        nf.h0 h0Var = r0Var.W0;
        if (h0Var == null) {
            jo.p.v("store");
            h0Var = null;
        }
        b42.i(h0Var.G());
        r0Var.m3();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        e eVar = new e(this);
        xq.a a10 = gq.a.a(this);
        f fVar = new f(eVar);
        this.W0 = (nf.h0) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(this, jo.f0.b(nf.h0.class), new h(fVar), new g(eVar, null, null, a10)).getValue());
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        this.P0 = null;
        super.I1();
    }

    public final ac.y0 W3() {
        return (ac.y0) this.V0.b(this, Z0[0]);
    }

    public final od.b X3() {
        return (od.b) this.R0.getValue();
    }

    public final kf.m Y3() {
        return (kf.m) this.T0.getValue();
    }

    public final MRLogger Z3() {
        return (MRLogger) this.S0.getValue();
    }

    public final String a4() {
        return (String) this.O0.getValue();
    }

    public final od.n0 b4() {
        return (od.n0) this.Q0.getValue();
    }

    public final kf.x c4() {
        return (kf.x) this.U0.getValue();
    }

    public final void d4() {
        W3().E.setVisibility(8);
        W3().B.setVisibility(0);
    }

    public final void e4() {
        W3().B.setVisibility(8);
        W3().E.setVisibility(0);
    }

    public final void f4() {
        nf.h0 h0Var = null;
        uo.l.d(this, null, null, new b(null), 3, null);
        uo.l.d(this, null, null, new c(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
        nf.h0 h0Var2 = this.W0;
        if (h0Var2 == null) {
            jo.p.v("store");
            h0Var2 = null;
        }
        h0Var2.N().i(this, new androidx.lifecycle.f0() { // from class: hc.o0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                r0.i4(r0.this, (Boolean) obj);
            }
        });
        nf.h0 h0Var3 = this.W0;
        if (h0Var3 == null) {
            jo.p.v("store");
            h0Var3 = null;
        }
        h0Var3.D().i(this, new androidx.lifecycle.f0() { // from class: hc.p0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                r0.j4(r0.this, (Integer) obj);
            }
        });
        nf.h0 h0Var4 = this.W0;
        if (h0Var4 == null) {
            jo.p.v("store");
            h0Var4 = null;
        }
        h0Var4.C().i(this, new androidx.lifecycle.f0() { // from class: hc.q0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                r0.k4(r0.this, (List) obj);
            }
        });
        nf.h0 h0Var5 = this.W0;
        if (h0Var5 == null) {
            jo.p.v("store");
            h0Var5 = null;
        }
        h0Var5.B().i(this, new androidx.lifecycle.f0() { // from class: hc.n0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                r0.g4(r0.this, (GroupShotMemberSettingView.b) obj);
            }
        });
        nf.h0 h0Var6 = this.W0;
        if (h0Var6 == null) {
            jo.p.v("store");
        } else {
            h0Var = h0Var6;
        }
        h0Var.F().i(this, new androidx.lifecycle.f0() { // from class: hc.m0
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                r0.h4(r0.this, (ha.a) obj);
            }
        });
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    public final void l4(ac.y0 y0Var) {
        this.V0.a(this, Z0[0], y0Var);
    }

    public final void m4() {
        W3().C.setOnClickListener(new View.OnClickListener() { // from class: hc.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r0.n4(r0.this, view);
            }
        });
        W3().E.setListener(new k());
        W3().B.setListener(new l());
    }

    public final void o4() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        if (intent.resolveActivity(N2().getPackageManager()) != null) {
            this.X0.a(intent);
        }
        X3().V();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        nf.h0 h0Var = null;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), xb.p.dialog_fragment_group_shot_settings, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        l4((ac.y0) e10);
        m4();
        f4();
        od.n0 b42 = b4();
        nf.h0 h0Var2 = this.W0;
        if (h0Var2 == null) {
            jo.p.v("store");
            h0Var2 = null;
        }
        b42.m(h0Var2.w());
        nf.h0 h0Var3 = this.W0;
        if (h0Var3 == null) {
            jo.p.v("store");
        } else {
            h0Var = h0Var3;
        }
        if (h0Var.G() != null) {
            d4();
        }
        i iVar = new i(N2(), xb.s.f60094a);
        iVar.setContentView(W3().u());
        Window window = iVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(xb.l.f59949v);
        }
        Window window2 = iVar.getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -2);
        }
        return iVar;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.P0 = context instanceof s0 ? (s0) context : null;
    }
}
