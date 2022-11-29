package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.r;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.activity.HandleUrlSchemeActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.AppCampaign;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import ha.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jf.b0;
import kq.a;
import org.greenrobot.eventbus.ThreadMode;
import p.d;
import ud.f;

/* loaded from: classes2.dex */
public final class u2 extends androidx.fragment.app.e implements uo.q0 {
    public static final a Z0 = new a(null);

    /* renamed from: a1  reason: collision with root package name */
    public static final int f18125a1 = 8;
    public final /* synthetic */ da.j N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public final wn.f W0;
    public final ud.h X0;
    public v2 Y0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u2 a(String str, List<AppCampaign> list) {
            jo.p.h(list, "appCampaigns");
            u2 u2Var = new u2();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_APP_OD", str);
            bundle.putParcelableArrayList("EXTRA_APP_CAMPAIGNS", new ArrayList<>(list));
            u2Var.V2(bundle);
            return u2Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f18126w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(Fragment fragment) {
            super(0);
            this.f18126w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f18126w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<ArrayList<AppCampaign>> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final ArrayList<AppCampaign> invoke() {
            ArrayList<AppCampaign> parcelableArrayList = u2.this.M2().getParcelableArrayList("EXTRA_APP_CAMPAIGNS");
            jo.p.e(parcelableArrayList);
            return parcelableArrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18128w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(io.a aVar) {
            super(0);
            this.f18128w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f18128w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ae.p3 f18130x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ae.p3 p3Var) {
            super(0);
            this.f18130x = p3Var;
        }

        public final void a() {
            u2.this.T3().l(this.f18130x.N.getText().toString(), u2.this.a4().v().f());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18131w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18132x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18133y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f18134z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f18131w = aVar;
            this.f18132x = aVar2;
            this.f18133y = aVar3;
            this.f18134z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f18131w;
            vq.a aVar2 = this.f18132x;
            io.a aVar3 = this.f18133y;
            xq.a aVar4 = this.f18134z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(od.t.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.LiveAppSettingDialog$observeStoreValues$10", f = "LiveAppSettingDialog.kt", l = {556}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f18135w;

        /* renamed from: x  reason: collision with root package name */
        public Object f18136x;

        /* renamed from: y  reason: collision with root package name */
        public Object f18137y;

        /* renamed from: z  reason: collision with root package name */
        public int f18138z;

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

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:25:0x007a, B:33:0x008a, B:34:0x0099, B:36:0x009d, B:31:0x0086, B:28:0x0080, B:22:0x0068), top: B:47:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f18138z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f18137y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f18136x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f18135w
                be.u2 r4 = (be.u2) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lb3
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L53
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                wn.m.b(r11)
                be.u2 r11 = be.u2.this
                nf.s r11 = be.u2.Q3(r11)
                wo.x r3 = r11.r()
                be.u2 r11 = be.u2.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lb3
                r4 = r11
                r11 = r10
            L3d:
                r11.f18135w = r4     // Catch: java.lang.Throwable -> Lb3
                r11.f18136x = r3     // Catch: java.lang.Throwable -> Lb3
                r11.f18137y = r1     // Catch: java.lang.Throwable -> Lb3
                r11.f18138z = r2     // Catch: java.lang.Throwable -> Lb3
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> Lb3
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r9
            L53:
                r6 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Lb0
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Lb0
                if (r11 == 0) goto Laa
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> Lb0
                com.dena.mirrativ.mirrativapi.core.MRError r11 = (com.dena.mirrativ.mirrativapi.core.MRError) r11     // Catch: java.lang.Throwable -> Lb0
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> Lb0
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> Lb0
                boolean r6 = jo.p.c(r11, r6)     // Catch: java.lang.Throwable -> Lb0
            L6e:
                if (r6 == 0) goto L7a
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb0
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> Lb0
                r6.l(r7, r11)     // Catch: java.lang.Throwable -> Lb0
                goto La4
            L7a:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> Lb0
                if (r6 == 0) goto L80
                r6 = r2
                goto L82
            L80:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Blocked     // Catch: java.lang.Throwable -> Lb0
            L82:
                if (r6 == 0) goto L86
                r6 = r2
                goto L88
            L86:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Banned     // Catch: java.lang.Throwable -> Lb0
            L88:
                if (r6 == 0) goto L99
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb0
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> Lb0
                java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> Lb0
                r8 = 0
                r6.B(r7, r11, r8)     // Catch: java.lang.Throwable -> Lb0
                goto La4
            L99:
                boolean r11 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> Lb0
                if (r11 == 0) goto La4
                android.content.Context r11 = r5.N2()     // Catch: java.lang.Throwable -> Lb0
                of.n.z(r11)     // Catch: java.lang.Throwable -> Lb0
            La4:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            Laa:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            Lb0:
                r11 = move-exception
                r3 = r4
                goto Lb4
            Lb3:
                r11 = move-exception
            Lb4:
                throw r11     // Catch: java.lang.Throwable -> Lb5
            Lb5:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: be.u2.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18139w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(io.a aVar) {
            super(0);
            this.f18139w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f18139w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.LiveAppSettingDialog$observeStoreValues$11", f = "LiveAppSettingDialog.kt", l = {556}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f18140w;

        /* renamed from: x  reason: collision with root package name */
        public Object f18141x;

        /* renamed from: y  reason: collision with root package name */
        public Object f18142y;

        /* renamed from: z  reason: collision with root package name */
        public int f18143z;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x0124, TryCatch #0 {all -> 0x0124, blocks: (B:6:0x0019, B:15:0x0050, B:17:0x0059, B:22:0x006d, B:35:0x00a1, B:12:0x0041, B:37:0x00b1, B:38:0x00ba, B:40:0x00c0, B:43:0x00de, B:46:0x00e4, B:48:0x00f4, B:51:0x00ff, B:23:0x0077, B:31:0x0087, B:32:0x0096, B:34:0x009a, B:29:0x0083, B:26:0x007d, B:20:0x0065, B:11:0x0037), top: B:61:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x011e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:15:0x0050). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: be.u2.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f18144w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(Fragment fragment) {
            super(0);
            this.f18144w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f18144w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.LiveAppSettingDialog$observeStoreValues$12", f = "LiveAppSettingDialog.kt", l = {556}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f18145w;

        /* renamed from: x  reason: collision with root package name */
        public Object f18146x;

        /* renamed from: y  reason: collision with root package name */
        public Object f18147y;

        /* renamed from: z  reason: collision with root package name */
        public int f18148z;

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
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:25:0x007a, B:33:0x008a, B:34:0x0099, B:36:0x009d, B:31:0x0086, B:28:0x0080, B:22:0x0068), top: B:47:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f18148z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f18147y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f18146x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f18145w
                be.u2 r4 = (be.u2) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lb3
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L53
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                wn.m.b(r11)
                be.u2 r11 = be.u2.this
                nf.s r11 = be.u2.Q3(r11)
                wo.x r3 = r11.p()
                be.u2 r11 = be.u2.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lb3
                r4 = r11
                r11 = r10
            L3d:
                r11.f18145w = r4     // Catch: java.lang.Throwable -> Lb3
                r11.f18146x = r3     // Catch: java.lang.Throwable -> Lb3
                r11.f18147y = r1     // Catch: java.lang.Throwable -> Lb3
                r11.f18148z = r2     // Catch: java.lang.Throwable -> Lb3
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> Lb3
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r9
            L53:
                r6 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Lb0
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Lb0
                if (r11 == 0) goto Laa
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> Lb0
                com.dena.mirrativ.mirrativapi.core.MRError r11 = (com.dena.mirrativ.mirrativapi.core.MRError) r11     // Catch: java.lang.Throwable -> Lb0
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> Lb0
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> Lb0
                boolean r6 = jo.p.c(r11, r6)     // Catch: java.lang.Throwable -> Lb0
            L6e:
                if (r6 == 0) goto L7a
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb0
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> Lb0
                r6.l(r7, r11)     // Catch: java.lang.Throwable -> Lb0
                goto La4
            L7a:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> Lb0
                if (r6 == 0) goto L80
                r6 = r2
                goto L82
            L80:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Blocked     // Catch: java.lang.Throwable -> Lb0
            L82:
                if (r6 == 0) goto L86
                r6 = r2
                goto L88
            L86:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Banned     // Catch: java.lang.Throwable -> Lb0
            L88:
                if (r6 == 0) goto L99
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb0
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> Lb0
                java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> Lb0
                r8 = 0
                r6.B(r7, r11, r8)     // Catch: java.lang.Throwable -> Lb0
                goto La4
            L99:
                boolean r11 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> Lb0
                if (r11 == 0) goto La4
                android.content.Context r11 = r5.N2()     // Catch: java.lang.Throwable -> Lb0
                of.n.z(r11)     // Catch: java.lang.Throwable -> Lb0
            La4:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            Laa:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            Lb0:
                r11 = move-exception
                r3 = r4
                goto Lb4
            Lb3:
                r11 = move-exception
            Lb4:
                throw r11     // Catch: java.lang.Throwable -> Lb5
            Lb5:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: be.u2.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18149w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(io.a aVar) {
            super(0);
            this.f18149w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f18149w.invoke()).b();
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.LiveAppSettingDialog$observeStoreValues$7", f = "LiveAppSettingDialog.kt", l = {556, 420}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f18150w;

        /* renamed from: x  reason: collision with root package name */
        public Object f18151x;

        /* renamed from: y  reason: collision with root package name */
        public Object f18152y;

        /* renamed from: z  reason: collision with root package name */
        public int f18153z;

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[Catch: all -> 0x009f, TryCatch #1 {all -> 0x009f, blocks: (B:7:0x001b, B:26:0x0081, B:28:0x008f, B:16:0x004f, B:20:0x0061, B:22:0x0069, B:31:0x0095, B:12:0x0035, B:15:0x004a), top: B:42:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[Catch: all -> 0x009f, TryCatch #1 {all -> 0x009f, blocks: (B:7:0x001b, B:26:0x0081, B:28:0x008f, B:16:0x004f, B:20:0x0061, B:22:0x0069, B:31:0x0095, B:12:0x0035, B:15:0x004a), top: B:42:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0095 A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #1 {all -> 0x009f, blocks: (B:7:0x001b, B:26:0x0081, B:28:0x008f, B:16:0x004f, B:20:0x0061, B:22:0x0069, B:31:0x0095, B:12:0x0035, B:15:0x004a), top: B:42:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0080 -> B:26:0x0081). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r11.f18153z
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3b
                if (r1 == r4) goto L29
                if (r1 != r3) goto L21
                java.lang.Object r1 = r11.f18152y
                wo.k r1 = (wo.k) r1
                java.lang.Object r5 = r11.f18151x
                wo.x r5 = (wo.x) r5
                java.lang.Object r6 = r11.f18150w
                be.u2 r6 = (be.u2) r6
                wn.m.b(r12)     // Catch: java.lang.Throwable -> L9f
                r12 = r6
                r6 = r11
                goto L81
            L21:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L29:
                java.lang.Object r1 = r11.f18152y
                wo.k r1 = (wo.k) r1
                java.lang.Object r5 = r11.f18151x
                wo.x r5 = (wo.x) r5
                java.lang.Object r6 = r11.f18150w
                be.u2 r6 = (be.u2) r6
                wn.m.b(r12)     // Catch: java.lang.Throwable -> L9f
                r7 = r6
                r6 = r11
                goto L61
            L3b:
                wn.m.b(r12)
                be.u2 r12 = be.u2.this
                nf.s r12 = be.u2.Q3(r12)
                wo.x r5 = r12.y()
                be.u2 r12 = be.u2.this
                wo.k r1 = r5.iterator()     // Catch: java.lang.Throwable -> L9f
                r6 = r11
            L4f:
                r6.f18150w = r12     // Catch: java.lang.Throwable -> L9f
                r6.f18151x = r5     // Catch: java.lang.Throwable -> L9f
                r6.f18152y = r1     // Catch: java.lang.Throwable -> L9f
                r6.f18153z = r4     // Catch: java.lang.Throwable -> L9f
                java.lang.Object r7 = r1.a(r6)     // Catch: java.lang.Throwable -> L9f
                if (r7 != r0) goto L5e
                return r0
            L5e:
                r10 = r7
                r7 = r12
                r12 = r10
            L61:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L9f
                boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L9f
                if (r12 == 0) goto L99
                java.lang.Object r12 = r1.next()     // Catch: java.lang.Throwable -> L9f
                wn.v r12 = (wn.v) r12     // Catch: java.lang.Throwable -> L9f
                r8 = 300(0x12c, double:1.48E-321)
                r6.f18150w = r7     // Catch: java.lang.Throwable -> L9f
                r6.f18151x = r5     // Catch: java.lang.Throwable -> L9f
                r6.f18152y = r1     // Catch: java.lang.Throwable -> L9f
                r6.f18153z = r3     // Catch: java.lang.Throwable -> L9f
                java.lang.Object r12 = uo.b1.a(r8, r6)     // Catch: java.lang.Throwable -> L9f
                if (r12 != r0) goto L80
                return r0
            L80:
                r12 = r7
            L81:
                androidx.fragment.app.FragmentManager r7 = r12.O2()     // Catch: java.lang.Throwable -> L9f
                java.lang.String r8 = "AppUserIdSettingDialog"
                androidx.fragment.app.Fragment r7 = r7.e0(r8)     // Catch: java.lang.Throwable -> L9f
                boolean r8 = r7 instanceof be.r     // Catch: java.lang.Throwable -> L9f
                if (r8 == 0) goto L92
                be.r r7 = (be.r) r7     // Catch: java.lang.Throwable -> L9f
                goto L93
            L92:
                r7 = r2
            L93:
                if (r7 == 0) goto L4f
                r7.n3()     // Catch: java.lang.Throwable -> L9f
                goto L4f
            L99:
                wo.n.a(r5, r2)
                wn.v r12 = wn.v.f59242a
                return r12
            L9f:
                r12 = move-exception
                throw r12     // Catch: java.lang.Throwable -> La1
            La1:
                r0 = move-exception
                wo.n.a(r5, r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: be.u2.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class g0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18154w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18155x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18156y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f18157z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f18154w = aVar;
            this.f18155x = aVar2;
            this.f18156y = aVar3;
            this.f18157z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f18154w;
            vq.a aVar2 = this.f18155x;
            io.a aVar3 = this.f18156y;
            xq.a aVar4 = this.f18157z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(nf.s.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.LiveAppSettingDialog$observeStoreValues$8", f = "LiveAppSettingDialog.kt", l = {556}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f18158w;

        /* renamed from: x  reason: collision with root package name */
        public Object f18159x;

        /* renamed from: y  reason: collision with root package name */
        public Object f18160y;

        /* renamed from: z  reason: collision with root package name */
        public int f18161z;

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:22:0x0068), top: B:35:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f18161z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f18160y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f18159x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f18158w
                be.u2 r4 = (be.u2) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L88
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
                be.u2 r10 = be.u2.this
                nf.s r10 = be.u2.Q3(r10)
                wo.x r3 = r10.o()
                be.u2 r10 = be.u2.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L88
                r4 = r10
                r10 = r9
            L3d:
                r10.f18158w = r4     // Catch: java.lang.Throwable -> L88
                r10.f18159x = r3     // Catch: java.lang.Throwable -> L88
                r10.f18160y = r1     // Catch: java.lang.Throwable -> L88
                r10.f18161z = r2     // Catch: java.lang.Throwable -> L88
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L88
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
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L85
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L85
                if (r10 == 0) goto L7f
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L85
                com.dena.mirrativ.mirrativapi.core.MRError r10 = (com.dena.mirrativ.mirrativapi.core.MRError) r10     // Catch: java.lang.Throwable -> L85
                boolean r6 = r10 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> L85
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> L85
                boolean r6 = jo.p.c(r10, r6)     // Catch: java.lang.Throwable -> L85
            L6e:
                if (r6 == 0) goto L79
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> L85
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> L85
                r6.l(r7, r10)     // Catch: java.lang.Throwable -> L85
            L79:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L7f:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L85:
                r10 = move-exception
                r3 = r4
                goto L89
            L88:
                r10 = move-exception
            L89:
                throw r10     // Catch: java.lang.Throwable -> L8a
            L8a:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: be.u2.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class h0 extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18162w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(io.a aVar) {
            super(0);
            this.f18162w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f18162w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.LiveAppSettingDialog$observeStoreValues$9", f = "LiveAppSettingDialog.kt", l = {556}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f18163w;

        /* renamed from: x  reason: collision with root package name */
        public Object f18164x;

        /* renamed from: y  reason: collision with root package name */
        public Object f18165y;

        /* renamed from: z  reason: collision with root package name */
        public int f18166z;

        public i(ao.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:17:0x0054, B:19:0x005c, B:24:0x0070, B:25:0x007a, B:33:0x008a, B:34:0x0099, B:36:0x009d, B:31:0x0086, B:28:0x0080, B:22:0x0068), top: B:47:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f18166z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f18165y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r10.f18164x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r10.f18163w
                be.u2 r4 = (be.u2) r4
                wn.m.b(r11)     // Catch: java.lang.Throwable -> Lb3
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                goto L53
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                wn.m.b(r11)
                be.u2 r11 = be.u2.this
                nf.s r11 = be.u2.Q3(r11)
                wo.x r3 = r11.q()
                be.u2 r11 = be.u2.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lb3
                r4 = r11
                r11 = r10
            L3d:
                r11.f18163w = r4     // Catch: java.lang.Throwable -> Lb3
                r11.f18164x = r3     // Catch: java.lang.Throwable -> Lb3
                r11.f18165y = r1     // Catch: java.lang.Throwable -> Lb3
                r11.f18166z = r2     // Catch: java.lang.Throwable -> Lb3
                java.lang.Object r5 = r1.a(r11)     // Catch: java.lang.Throwable -> Lb3
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r9 = r0
                r0 = r11
                r11 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r9
            L53:
                r6 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> Lb0
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> Lb0
                if (r11 == 0) goto Laa
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> Lb0
                com.dena.mirrativ.mirrativapi.core.MRError r11 = (com.dena.mirrativ.mirrativapi.core.MRError) r11     // Catch: java.lang.Throwable -> Lb0
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.ForceUpdate     // Catch: java.lang.Throwable -> Lb0
                if (r6 == 0) goto L68
                r6 = r2
                goto L6e
            L68:
                com.dena.mirrativ.mirrativapi.core.MRError$Maintenance r6 = com.dena.mirrativ.mirrativapi.core.MRError.Maintenance.INSTANCE     // Catch: java.lang.Throwable -> Lb0
                boolean r6 = jo.p.c(r11, r6)     // Catch: java.lang.Throwable -> Lb0
            L6e:
                if (r6 == 0) goto L7a
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb0
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> Lb0
                r6.l(r7, r11)     // Catch: java.lang.Throwable -> Lb0
                goto La4
            L7a:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Failure     // Catch: java.lang.Throwable -> Lb0
                if (r6 == 0) goto L80
                r6 = r2
                goto L82
            L80:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Blocked     // Catch: java.lang.Throwable -> Lb0
            L82:
                if (r6 == 0) goto L86
                r6 = r2
                goto L88
            L86:
                boolean r6 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Banned     // Catch: java.lang.Throwable -> Lb0
            L88:
                if (r6 == 0) goto L99
                of.n r6 = of.n.f45411a     // Catch: java.lang.Throwable -> Lb0
                android.content.Context r7 = r5.N2()     // Catch: java.lang.Throwable -> Lb0
                java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> Lb0
                r8 = 0
                r6.B(r7, r11, r8)     // Catch: java.lang.Throwable -> Lb0
                goto La4
            L99:
                boolean r11 = r11 instanceof com.dena.mirrativ.mirrativapi.core.MRError.Network     // Catch: java.lang.Throwable -> Lb0
                if (r11 == 0) goto La4
                android.content.Context r11 = r5.N2()     // Catch: java.lang.Throwable -> Lb0
                of.n.z(r11)     // Catch: java.lang.Throwable -> Lb0
            La4:
                r11 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            Laa:
                wo.n.a(r4, r6)
                wn.v r11 = wn.v.f59242a
                return r11
            Lb0:
                r11 = move-exception
                r3 = r4
                goto Lb4
            Lb3:
                r11 = move-exception
            Lb4:
                throw r11     // Catch: java.lang.Throwable -> Lb5
            Lb5:
                r0 = move-exception
                wo.n.a(r3, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: be.u2.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.l<String, wn.v> {
        public j() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(String str) {
            List<App.AppParams> f10;
            jo.p.h(str, "selectedAppId");
            App.AppParams appParams = null;
            if (!jo.p.c(str, u2.this.a4().v().f()) && (f10 = u2.this.a4().n().f()) != null) {
                Iterator<T> it = f10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (jo.p.c(((App.AppParams) next).getAppId(), str)) {
                        appParams = next;
                        break;
                    }
                }
                appParams = appParams;
            }
            u2.this.T3().m(appParams);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.l<String, wn.v> {
        public k() {
            super(1);
        }

        public final void a(String str) {
            Object obj;
            jo.p.h(str, "appId");
            Iterator it = u2.this.U3().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jo.p.c(((AppCampaign) obj).getAppId(), str)) {
                    break;
                }
            }
            AppCampaign appCampaign = (AppCampaign) obj;
            if (appCampaign != null) {
                u2 u2Var = u2.this;
                jf.b0 a10 = u2Var.b4().a(appCampaign.getUrl());
                if (a10 instanceof b0.l0) {
                    return;
                }
                HandleUrlSchemeActivity.a aVar = HandleUrlSchemeActivity.f25127b0;
                Context N2 = u2Var.N2();
                jo.p.g(N2, "requireContext()");
                u2Var.f3(aVar.a(N2, Referer.Broadcast.APP_SETTING, a10));
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(String str) {
            a(str);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<wn.v> {
        public l() {
            super(0);
        }

        public final void a() {
            new d.a().a().a(u2.this.N2(), Uri.parse(u2.this.X3().X2()));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends RecyclerView.u {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ae.p3 f18171b;

        public m(ae.p3 p3Var) {
            this.f18171b = p3Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            u2.this.c4(this.f18171b, linearLayoutManager.l2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ae.p3 f18173x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ae.p3 p3Var) {
            super(0);
            this.f18173x = p3Var;
        }

        public final void a() {
            u2.this.T3().l(this.f18173x.N.getText().toString(), u2.this.a4().v().f());
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18174w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18175x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18176y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18174w = componentCallbacks;
            this.f18175x = aVar;
            this.f18176y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f18174w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f18175x, this.f18176y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<kf.i> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18177w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18178x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18179y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18177w = componentCallbacks;
            this.f18178x = aVar;
            this.f18179y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.i, java.lang.Object] */
        @Override // io.a
        public final kf.i invoke() {
            ComponentCallbacks componentCallbacks = this.f18177w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.i.class), this.f18178x, this.f18179y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<of.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18180w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18181x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18182y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18180w = componentCallbacks;
            this.f18181x = aVar;
            this.f18182y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.k, java.lang.Object] */
        @Override // io.a
        public final of.k invoke() {
            ComponentCallbacks componentCallbacks = this.f18180w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(of.k.class), this.f18181x, this.f18182y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<nd.i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18183w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18184x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18185y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18183w = componentCallbacks;
            this.f18184x = aVar;
            this.f18185y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final nd.i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f18183w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nd.i1.class), this.f18184x, this.f18185y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f18186w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Fragment fragment) {
            super(0);
            this.f18186w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f18186w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f18186w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18187w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(io.a aVar) {
            super(0);
            this.f18187w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f18187w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18188w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18189x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18190y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f18191z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f18188w = aVar;
            this.f18189x = aVar2;
            this.f18190y = aVar3;
            this.f18191z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f18188w;
            vq.a aVar2 = this.f18189x;
            io.a aVar3 = this.f18190y;
            xq.a aVar4 = this.f18191z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(ud.j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18192w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(io.a aVar) {
            super(0);
            this.f18192w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f18192w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f18193w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Fragment fragment) {
            super(0);
            this.f18193w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f18193w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f18193w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18194w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(io.a aVar) {
            super(0);
            this.f18194w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f18194w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18195w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18196x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18197y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f18198z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f18195w = aVar;
            this.f18196x = aVar2;
            this.f18197y = aVar3;
            this.f18198z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f18195w;
            vq.a aVar2 = this.f18196x;
            io.a aVar3 = this.f18197y;
            xq.a aVar4 = this.f18198z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(ud.i.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f18199w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(io.a aVar) {
            super(0);
            this.f18199w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f18199w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public u2() {
        super(nd.b1.dialog_fragment_live_app_setting);
        this.N0 = new da.j();
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.O0 = wn.g.b(iVar, new o(this, null, null));
        this.P0 = wn.g.b(iVar, new p(this, null, null));
        a0 a0Var = new a0(this);
        xq.a a10 = gq.a.a(this);
        b0 b0Var = new b0(a0Var);
        this.Q0 = androidx.fragment.app.e0.a(this, jo.f0.b(od.t.class), new d0(b0Var), new c0(a0Var, null, null, a10));
        e0 e0Var = new e0(this);
        xq.a a11 = gq.a.a(this);
        f0 f0Var = new f0(e0Var);
        this.R0 = androidx.fragment.app.e0.a(this, jo.f0.b(nf.s.class), new h0(f0Var), new g0(e0Var, null, null, a11));
        s sVar = new s(this);
        xq.a a12 = gq.a.a(this);
        t tVar = new t(sVar);
        this.S0 = androidx.fragment.app.e0.a(this, jo.f0.b(ud.j.class), new v(tVar), new u(sVar, null, null, a12));
        w wVar = new w(this);
        xq.a a13 = gq.a.a(this);
        x xVar = new x(wVar);
        this.T0 = androidx.fragment.app.e0.a(this, jo.f0.b(ud.i.class), new z(xVar), new y(wVar, null, null, a13));
        this.U0 = wn.g.b(iVar, new q(this, null, null));
        this.V0 = wn.g.b(iVar, new r(this, null, null));
        this.W0 = wn.g.a(new b());
        this.X0 = new ud.h(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static final void e4(ae.p3 p3Var, u2 u2Var, ha.a aVar) {
        jo.p.h(p3Var, "$binding");
        jo.p.h(u2Var, "this$0");
        if (aVar instanceof a.b) {
            p3Var.Q.b(StatusView.b.C0181b.f20790w);
        } else if (!(aVar instanceof a.C0439a)) {
            p3Var.Q.b(StatusView.b.c.f20791w);
        } else {
            List<App.AppParams> f10 = u2Var.a4().n().f();
            boolean z10 = true;
            if (f10 == null || !f10.isEmpty()) {
                z10 = false;
            }
            if (z10) {
                StatusView statusView = p3Var.Q;
                String message = ((a.C0439a) aVar).b().getMessage();
                if (message == null) {
                    message = u2Var.U0(nd.f1.f41966c);
                    jo.p.g(message, "getString(R.string.error_access)");
                }
                statusView.b(new StatusView.b.a(message, new c(p3Var)));
            }
        }
    }

    public static final void f4(u2 u2Var, ae.p3 p3Var, List list) {
        List<? extends ud.a> k10;
        rd.d dVar;
        Object obj;
        jo.p.h(u2Var, "this$0");
        jo.p.h(p3Var, "$binding");
        if (list != null) {
            k10 = new ArrayList<>(xn.t.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                App.AppParams appParams = (App.AppParams) it.next();
                f.a aVar = ud.f.I;
                Context N2 = u2Var.N2();
                jo.p.g(N2, "requireContext()");
                String f10 = u2Var.a4().v().f();
                Iterator<T> it2 = u2Var.U3().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (jo.p.c(((AppCampaign) obj).getAppId(), appParams.getAppId())) {
                        break;
                    }
                }
                k10.add(aVar.c(N2, appParams, f10, (AppCampaign) obj));
            }
        } else {
            k10 = xn.s.k();
        }
        if (jo.p.c(u2Var.a4().m().f(), Boolean.TRUE)) {
            RecyclerView.h adapter = p3Var.F.getAdapter();
            dVar = adapter instanceof rd.d ? (rd.d) adapter : null;
            if (dVar == null) {
                return;
            }
            dVar.c(xn.a0.p0(k10, ud.g.f54947x.a()));
            return;
        }
        RecyclerView.h adapter2 = p3Var.F.getAdapter();
        dVar = adapter2 instanceof rd.d ? (rd.d) adapter2 : null;
        if (dVar == null) {
            return;
        }
        dVar.c(k10);
    }

    public static final void g4(ae.p3 p3Var, String str) {
        List<ud.a> b10;
        jo.p.h(p3Var, "$binding");
        RecyclerView.h adapter = p3Var.F.getAdapter();
        rd.d dVar = adapter instanceof rd.d ? (rd.d) adapter : null;
        if (dVar == null || (b10 = dVar.b()) == null) {
            return;
        }
        for (ud.a aVar : b10) {
            if (aVar instanceof ud.f) {
                ud.f fVar = (ud.f) aVar;
                fVar.i().p(Boolean.valueOf(jo.p.c(fVar.c(), str)));
            }
        }
    }

    public static final void h4(u2 u2Var, ae.p3 p3Var, wn.k kVar) {
        List<ud.a> b10;
        boolean z10;
        String appUserIdLabel;
        jo.p.h(u2Var, "this$0");
        jo.p.h(p3Var, "$binding");
        if (kVar == null) {
            return;
        }
        String str = (String) kVar.c();
        AppUserDetailResponse appUserDetailResponse = (AppUserDetailResponse) kVar.d();
        if (appUserDetailResponse.getRequireConfirmation()) {
            App.AppParams f10 = u2Var.a4().t().f();
            if (f10 == null || (appUserIdLabel = f10.getAppUserIdLabel()) == null) {
                return;
            }
            be.j.R0.a(appUserIdLabel, appUserDetailResponse).z3(u2Var.I0(), "AppUserIdConfirmDialog");
            return;
        }
        RecyclerView.h adapter = p3Var.F.getAdapter();
        Object obj = null;
        rd.d dVar = adapter instanceof rd.d ? (rd.d) adapter : null;
        if (dVar != null && (b10 = dVar.b()) != null) {
            Iterator<T> it = b10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ud.a aVar = (ud.a) next;
                if ((aVar instanceof ud.f) && jo.p.c(((ud.f) aVar).c(), str)) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    obj = next;
                    break;
                }
            }
            ud.a aVar2 = (ud.a) obj;
            if (aVar2 != null) {
                Context N2 = u2Var.N2();
                jo.p.g(N2, "requireContext()");
                ((ud.f) aVar2).o(N2, (AppUserDetailResponse) kVar.d());
            }
        }
        if (appUserDetailResponse.getUserId().length() == 0) {
            u2Var.X0.h().p(Boolean.TRUE);
            u2Var.X0.i().p(Boolean.FALSE);
            return;
        }
        u2Var.X0.h().p(Boolean.FALSE);
        u2Var.X0.i().p(Boolean.TRUE);
    }

    public static final void i4(u2 u2Var, App.AppParams appParams) {
        Drawable drawable;
        Integer num;
        int i10;
        int i11;
        jo.p.h(u2Var, "this$0");
        boolean z10 = true;
        int i12 = 0;
        if (appParams != null) {
            boolean z11 = appParams.getRequestAppUserIdRegistration() && u2Var.Z3().a().h();
            u2Var.X0.c().p(u2Var.V0(nd.f1.S3, appParams.getAppUserIdLabel()));
            androidx.lifecycle.e0<Drawable> d10 = u2Var.X0.d();
            Context q02 = u2Var.q0();
            if (q02 != null) {
                if (z11) {
                    i11 = nd.y0.rectangle_stroke_tealish_corner20_transparent;
                } else {
                    i11 = nd.y0.rectangle_stroke_tealish_corner20_pinkishgray;
                }
                drawable = c3.a.f(q02, i11);
            } else {
                drawable = null;
            }
            d10.p(drawable);
            androidx.lifecycle.e0<Integer> e10 = u2Var.X0.e();
            Context q03 = u2Var.q0();
            if (q03 == null) {
                num = 0;
            } else {
                if (z11) {
                    i10 = nd.w0.f42242u0;
                } else {
                    i10 = nd.w0.Y;
                }
                num = Integer.valueOf(q03.getColor(i10));
            }
            e10.p(num);
            u2Var.X0.g().p(u2Var.V0(nd.f1.text_broadcast_game_id_settings_v2, appParams.getAppUserIdLabel()));
            androidx.lifecycle.e0<Integer> b10 = u2Var.X0.b();
            if (!z11) {
                i12 = 8;
            }
            b10.p(i12);
            androidx.lifecycle.e0<SpannableStringBuilder> a10 = u2Var.X0.a();
            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) u2Var.U0(nd.f1.text_app_setting_description_p1));
            jo.p.g(append, "SpannableStringBuilder()…_setting_description_p1))");
            StyleSpan styleSpan = new StyleSpan(1);
            int length = append.length();
            jo.i0 i0Var = jo.i0.f38149a;
            String U0 = u2Var.U0(nd.f1.text_app_setting_description_p2);
            jo.p.g(U0, "getString(R.string.text_…p_setting_description_p2)");
            String format = String.format(U0, Arrays.copyOf(new Object[]{appParams.getAppUserIdLabel()}, 1));
            jo.p.g(format, "format(format, *args)");
            append.append((CharSequence) format);
            append.setSpan(styleSpan, length, append.length(), 17);
            a10.p(append.append((CharSequence) u2Var.U0(nd.f1.text_app_setting_description_p3)));
        }
        if (appParams != null && !appParams.isCategory()) {
            AppUserDetailResponse appUserDetail = appParams.getAppUserDetail();
            String userId = appUserDetail != null ? appUserDetail.getUserId() : null;
            if (userId != null && userId.length() != 0) {
                z10 = false;
            }
            if (z10) {
                u2Var.X0.h().p(Boolean.TRUE);
                u2Var.X0.i().p(Boolean.FALSE);
                return;
            }
            u2Var.X0.h().p(Boolean.FALSE);
            u2Var.X0.i().p(Boolean.TRUE);
            return;
        }
        androidx.lifecycle.e0<Boolean> h10 = u2Var.X0.h();
        Boolean bool = Boolean.FALSE;
        h10.p(bool);
        u2Var.X0.i().p(bool);
    }

    public static final void j4(u2 u2Var, Boolean bool) {
        jo.p.h(u2Var, "this$0");
        ud.j W3 = u2Var.W3();
        jo.p.g(bool, "it");
        W3.T(bool.booleanValue());
    }

    public static final void m4(u2 u2Var, View view) {
        jo.p.h(u2Var, "this$0");
        u2Var.m3();
    }

    public static final void n4(u2 u2Var, View view) {
        App.AppParams appParams;
        Object obj;
        jo.p.h(u2Var, "this$0");
        List<App.AppParams> f10 = u2Var.a4().n().f();
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jo.p.c(((App.AppParams) obj).getAppId(), u2Var.a4().v().f())) {
                    break;
                }
            }
            appParams = (App.AppParams) obj;
        } else {
            appParams = null;
        }
        v2 v2Var = u2Var.Y0;
        if (v2Var != null) {
            v2Var.p1(appParams != null ? new jf.w(appParams.getAppId(), appParams.getIconUrl(), appParams.getTitle(), appParams.getShortTitle()) : null);
        }
        u2Var.m3();
    }

    public static final boolean o4(u2 u2Var, ae.p3 p3Var, TextView textView, int i10, KeyEvent keyEvent) {
        Context q02;
        jo.p.h(u2Var, "this$0");
        jo.p.h(p3Var, "$binding");
        if (i10 == 3) {
            of.j jVar = of.j.f45405a;
            Dialog p32 = u2Var.p3();
            if (p32 == null || (q02 = p32.getContext()) == null) {
                q02 = u2Var.q0();
            }
            jVar.c(q02, p3Var.N);
            u2Var.T3().l(p3Var.N.getText().toString(), u2Var.a4().v().f());
            return true;
        }
        return true;
    }

    public static final void p4(u2 u2Var, View view) {
        Object obj;
        jo.p.h(u2Var, "this$0");
        List<App.AppParams> f10 = u2Var.a4().n().f();
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jo.p.c(((App.AppParams) obj).getAppId(), u2Var.a4().v().f())) {
                    break;
                }
            }
            App.AppParams appParams = (App.AppParams) obj;
            if (appParams == null) {
                return;
            }
            r.a aVar = be.r.f18061c1;
            String appUserIdLabel = appParams.getAppUserIdLabel();
            boolean isAppUserIdHidden = appParams.isAppUserIdHidden();
            AppUserDetailResponse appUserDetail = appParams.getAppUserDetail();
            String str = (appUserDetail == null || (r0 = appUserDetail.getUserId()) == null) ? "" : "";
            AppUserDetailResponse appUserDetail2 = appParams.getAppUserDetail();
            r.a.b(aVar, Referer.Broadcast.SETTING, appUserIdLabel, isAppUserIdHidden, str, appUserDetail2 != null ? appUserDetail2.isPublishedUserId() : false, false, nd.f1.S3, 0, false, true, 160, null).z3(u2Var.I0(), "AppUserIdSettingDialog");
            ud.j W3 = u2Var.W3();
            Context N2 = u2Var.N2();
            jo.p.g(N2, "requireContext()");
            W3.Q(N2, appParams);
            u2Var.W3().p().m(null);
            u2Var.W3().C().m(Boolean.TRUE);
            MRLogger Y3 = u2Var.Y3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SETTING_GAME_ID_EDIT_IMP);
            builder.setTargetId(appParams.getAppId());
            builder.setTargetType(MRLog.TARGET_TYPE_GAME_ID);
            builder.setPageId(Referer.Broadcast.SETTING);
            Y3.sendLog(builder.build());
        }
    }

    public static final void q4(u2 u2Var, View view) {
        Object obj;
        jo.p.h(u2Var, "this$0");
        List<App.AppParams> f10 = u2Var.a4().n().f();
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jo.p.c(((App.AppParams) obj).getAppId(), u2Var.a4().v().f())) {
                    break;
                }
            }
            App.AppParams appParams = (App.AppParams) obj;
            if (appParams == null) {
                return;
            }
            ud.i V3 = u2Var.V3();
            Resources O0 = u2Var.O0();
            jo.p.g(O0, "resources");
            V3.f(O0, appParams.getAppId(), appParams.getAppUserIdLabel(), true, appParams.isAppUserIdHidden(), appParams.getAppUserDetail());
            be.i.Q0.a(appParams).z3(u2Var.O2(), "AppUserIdBottomSheetDialogFragment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void F1() {
        dq.c.c().r(this);
        uo.r0.d(this, null, 1, null);
        super.F1();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        this.Y0 = null;
        super.I1();
    }

    public final od.t T3() {
        return (od.t) this.Q0.getValue();
    }

    public final List<AppCampaign> U3() {
        Object value = this.W0.getValue();
        jo.p.g(value, "<get-appCampaigns>(...)");
        return (List) value;
    }

    public final ud.i V3() {
        return (ud.i) this.T0.getValue();
    }

    public final ud.j W3() {
        return (ud.j) this.S0.getValue();
    }

    public final kf.i X3() {
        return (kf.i) this.P0.getValue();
    }

    public final MRLogger Y3() {
        return (MRLogger) this.O0.getValue();
    }

    public final nd.i1 Z3() {
        return (nd.i1) this.V0.getValue();
    }

    public final nf.s a4() {
        return (nf.s) this.R0.getValue();
    }

    public final of.k b4() {
        return (of.k) this.U0.getValue();
    }

    public final void c4(ae.p3 p3Var, int i10) {
        RecyclerView.h adapter = p3Var.F.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            Integer f10 = a4().u().f();
            if (f10 == null) {
                return;
            }
            int intValue = f10.intValue();
            if (jo.p.c(a4().z().f(), Boolean.TRUE) || intValue < 1 || itemCount > i10 + 10) {
                return;
            }
            T3().i(p3Var.N.getText().toString(), intValue, a4().w().f());
        }
    }

    public final void d4(final ae.p3 p3Var) {
        a4().x().i(this, new androidx.lifecycle.f0() { // from class: be.q2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                u2.e4(ae.p3.this, this, (ha.a) obj);
            }
        });
        a4().n().i(this, new androidx.lifecycle.f0() { // from class: be.t2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                u2.f4(u2.this, p3Var, (List) obj);
            }
        });
        a4().v().i(this, new androidx.lifecycle.f0() { // from class: be.p2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                u2.g4(ae.p3.this, (String) obj);
            }
        });
        a4().l().i(this, new androidx.lifecycle.f0() { // from class: be.k2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                u2.h4(u2.this, p3Var, (wn.k) obj);
            }
        });
        a4().t().i(this, new androidx.lifecycle.f0() { // from class: be.r2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                u2.i4(u2.this, (App.AppParams) obj);
            }
        });
        a4().A().i(a1(), new androidx.lifecycle.f0() { // from class: be.s2
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                u2.j4(u2.this, (Boolean) obj);
            }
        });
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(this, null, null, new h(null), 3, null);
        uo.l.d(this, null, null, new i(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(de.e.b(this, 320), -2);
        }
        ae.p3 T = ae.p3.T(view);
        T.M(a1());
        T.V(this.X0);
        jo.p.g(T, "binding");
        k4(T);
        l4(T);
        d4(T);
        dq.c.c().p(this);
        T3().l("", M2().getString("EXTRA_APP_OD"));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    public final void k4(ae.p3 p3Var) {
        RecyclerView recyclerView = p3Var.F;
        androidx.lifecycle.u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        recyclerView.setAdapter(new rd.d(a12, new j(), new k(), new l()));
        p3Var.F.setLayoutManager(new LinearLayoutManager(q0()));
        p3Var.F.g(new p001if.c(0, 0, 0, 0, de.e.b(this, 70), 0, 32, null));
        String U0 = U0(nd.f1.text_appsetting_broadcast_desc2);
        jo.p.g(U0, "getString(R.string.text_…psetting_broadcast_desc2)");
        String U02 = U0(nd.f1.text_search_detail_description);
        jo.p.g(U02, "getString(R.string.text_search_detail_description)");
        int U = so.o.U(U0, U02, 0, false, 6, null);
        if (U == -1) {
            this.X0.f().m(new SpannableString(U0));
            return;
        }
        int length = U02.length() + U;
        SpannableString spannableString = new SpannableString(U0);
        spannableString.setSpan(new ForegroundColorSpan(c3.a.d(N2(), nd.w0.Y)), U, length, 33);
        spannableString.setSpan(new RelativeSizeSpan(0.83f), U, length, 33);
        this.X0.f().m(spannableString);
    }

    public final void l4(final ae.p3 p3Var) {
        p3Var.I.setOnClickListener(new View.OnClickListener() { // from class: be.n2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u2.m4(u2.this, view);
            }
        });
        p3Var.N.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: be.o2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean o42;
                o42 = u2.o4(u2.this, p3Var, textView, i10, keyEvent);
                return o42;
            }
        });
        p3Var.F.k(new m(p3Var));
        p3Var.E.setOnClickListener(new View.OnClickListener() { // from class: be.m2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u2.p4(u2.this, view);
            }
        });
        p3Var.K.setOnClickListener(new View.OnClickListener() { // from class: be.j2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u2.q4(u2.this, view);
            }
        });
        p3Var.O.setOnClickListener(new View.OnClickListener() { // from class: be.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u2.n4(u2.this, view);
            }
        });
        p3Var.Q.setOnClickRetryDefaultListener(new n(p3Var));
        p3Var.B.setCardBackgroundColor(c3.a.d(N2(), nd.w0.S));
        p3Var.B.setStrokeWidth(de.e.b(this, 2));
        p3Var.B.setStrokeColor(c3.a.d(N2(), nd.w0.U0));
        p3Var.B.setCardElevation(de.e.a(this, 8.0f));
        p3Var.B.setShapeAppearanceModel(tj.k.a().p(new tj.a(de.e.a(this, 8.0f))).q(new tj.o(de.e.a(this, 8.0f), false)).m());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.b bVar) {
        Object obj;
        jo.p.h(bVar, "event");
        List<App.AppParams> f10 = a4().n().f();
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jo.p.c(((App.AppParams) obj).getAppId(), bVar.a())) {
                    break;
                }
            }
            App.AppParams appParams = (App.AppParams) obj;
            if (appParams == null) {
                return;
            }
            r.a aVar = be.r.f18061c1;
            String appUserIdLabel = appParams.getAppUserIdLabel();
            boolean isAppUserIdHidden = appParams.isAppUserIdHidden();
            AppUserDetailResponse appUserDetail = appParams.getAppUserDetail();
            String str = (appUserDetail == null || (r0 = appUserDetail.getUserId()) == null) ? "" : "";
            AppUserDetailResponse appUserDetail2 = appParams.getAppUserDetail();
            r.a.b(aVar, Referer.Broadcast.SETTING, appUserIdLabel, isAppUserIdHidden, str, appUserDetail2 != null ? appUserDetail2.isPublishedUserId() : false, false, nd.f1.S3, 0, false, true, 160, null).z3(I0(), "AppUserIdSettingDialog");
            W3().W(appParams.getAppUserDetail());
            W3().U(appParams.getAppId(), appParams.getTitle(), appParams.getIconUrl());
            W3().C().m(Boolean.TRUE);
            androidx.lifecycle.e0<String> p10 = W3().p();
            AppUserDetailResponse appUserDetail3 = appParams.getAppUserDetail();
            p10.m(appUserDetail3 != null ? appUserDetail3.getUserId() : null);
            MRLogger Y3 = Y3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SETTING_GAME_ID_EDIT_IMP);
            builder.setTargetId(appParams.getAppId());
            builder.setTargetType(MRLog.TARGET_TYPE_GAME_ID);
            builder.setPageId(Referer.Broadcast.SETTING);
            Y3.sendLog(builder.build());
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        v2 v2Var = null;
        v2 v2Var2 = context instanceof v2 ? (v2) context : null;
        if (v2Var2 == null) {
            Fragment H0 = H0();
            if (H0 instanceof v2) {
                v2Var = (v2) H0;
            }
        } else {
            v2Var = v2Var2;
        }
        this.Y0 = v2Var;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.a aVar) {
        jo.p.h(aVar, "event");
        T3().h(aVar.a());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.c cVar) {
        jo.p.h(cVar, "event");
        T3().k(cVar.a(), cVar.b(), cVar.c());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.i iVar) {
        jo.p.h(iVar, "event");
        T3().j(iVar.a(), jf.a.GAME_ID, iVar.b(), iVar.c());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(ce.j jVar) {
        Object obj;
        jo.p.h(jVar, "event");
        List<App.AppParams> f10 = a4().n().f();
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jo.p.c(((App.AppParams) obj).getAppId(), jVar.a())) {
                    break;
                }
            }
            App.AppParams appParams = (App.AppParams) obj;
            if (appParams == null) {
                return;
            }
            W3().U(appParams.getAppId(), appParams.getTitle(), appParams.getIconUrl());
            W3().C().m(Boolean.TRUE);
            W3().p().m(jVar.b());
        }
    }
}
