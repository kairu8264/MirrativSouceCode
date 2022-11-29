package com.dena.mirrorman.feature.app;

import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.z;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import com.cookpad.puree.Puree;
import com.dena.mirrorman.clientlog.logs.AppPage;
import com.dena.mirrorman.feature.app.AppPageActivity;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.DashboardCatalog;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.dena.mirrorman.net.retrofit.MRRequest;
import hf.v0;
import java.io.Serializable;
import java.util.UUID;
import jo.f0;
import jo.p;
import jo.q;
import kq.a;
import nd.b1;
import nd.d1;
import nd.f1;
import nd.w0;
import nd.y0;
import of.t;
import uo.q0;
import uo.r0;
import wb.a;
import wn.v;

/* loaded from: classes2.dex */
public final class AppPageActivity extends e.b implements q0 {

    /* renamed from: c0  reason: collision with root package name */
    public static final a f25660c0 = new a(null);

    /* renamed from: d0  reason: collision with root package name */
    public static final int f25661d0 = 8;
    public final /* synthetic */ q0 O = r0.b();
    public boolean P;
    public boolean Q;
    public App.AppParams R;
    public final String S;
    public final wn.f T;
    public final wn.f U;
    public final wn.f V;
    public final wn.f W;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public ae.c f25662a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f25663b0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, String str2, App.AppParams appParams) {
            p.h(context, "context");
            p.h(str, "appId");
            p.h(str2, "launchedFrom");
            p.h(appParams, "appParams");
            return b(context, str, false, str2, appParams);
        }

        public final Intent b(Context context, String str, boolean z10, String str2, App.AppParams appParams) {
            p.h(context, "context");
            p.h(str, "appId");
            p.h(str2, "launchedFrom");
            Intent intent = new Intent(context, AppPageActivity.class);
            intent.putExtra("EXTRA_APP_ID", str);
            intent.putExtra("EXTRA_IS_DEEP_LINK", z10);
            intent.putExtra("EXTRA_LAUNCHED_FROM", str2);
            intent.putExtra("EXTRA_APP_PARAMS", appParams);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<uq.a> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(AppPageActivity.this.S);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25665w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25666x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25667y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25665w = componentCallbacks;
            this.f25666x = aVar;
            this.f25667y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f25665w;
            return gq.a.a(componentCallbacks).c(f0.b(MRRequest.class), this.f25666x, this.f25667y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<q8.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25668w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25669x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25670y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25668w = componentCallbacks;
            this.f25669x = aVar;
            this.f25670y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, q8.a] */
        @Override // io.a
        public final q8.a invoke() {
            ComponentCallbacks componentCallbacks = this.f25668w;
            return gq.a.a(componentCallbacks).c(f0.b(q8.a.class), this.f25669x, this.f25670y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<hf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25671w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25672x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25673y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25671w = componentCallbacks;
            this.f25672x = aVar;
            this.f25673y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.c, java.lang.Object] */
        @Override // io.a
        public final hf.c invoke() {
            ComponentCallbacks componentCallbacks = this.f25671w;
            return gq.a.a(componentCallbacks).c(f0.b(hf.c.class), this.f25672x, this.f25673y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<hf.d> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25674w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25675x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25676y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25674w = componentCallbacks;
            this.f25675x = aVar;
            this.f25676y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d, java.lang.Object] */
        @Override // io.a
        public final hf.d invoke() {
            ComponentCallbacks componentCallbacks = this.f25674w;
            return gq.a.a(componentCallbacks).c(f0.b(hf.d.class), this.f25675x, this.f25676y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25677w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25678x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25679y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25677w = componentCallbacks;
            this.f25678x = aVar;
            this.f25679y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f25677w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f25678x, this.f25679y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25680w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25681x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25682y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25680w = componentCallbacks;
            this.f25681x = aVar;
            this.f25682y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f25680w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f25681x, this.f25682y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25683w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f25683w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f25683w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f25684w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25685x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25686y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f25687z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f25684w = aVar;
            this.f25685x = aVar2;
            this.f25686y = aVar3;
            this.f25687z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f25684w;
            vq.a aVar2 = this.f25685x;
            io.a aVar3 = this.f25686y;
            xq.a aVar4 = this.f25687z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(nf.a.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f25688w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f25688w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f25688w.U();
            p.g(U, "viewModelStore");
            return U;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.app.AppPageActivity$toggleRegistration$1", f = "AppPageActivity.kt", l = {220, 225}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25689w;

        public l(ao.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new l(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((l) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:6:0x0011, B:31:0x0090, B:33:0x0098, B:10:0x001e, B:22:0x0054, B:24:0x005c, B:13:0x0025, B:16:0x002f, B:18:0x003f, B:19:0x0043, B:25:0x006b, B:27:0x007b, B:28:0x007f), top: B:44:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0098 A[Catch: Exception -> 0x00a6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a6, blocks: (B:6:0x0011, B:31:0x0090, B:33:0x0098, B:10:0x001e, B:22:0x0054, B:24:0x005c, B:13:0x0025, B:16:0x002f, B:18:0x003f, B:19:0x0043, B:25:0x006b, B:27:0x007b, B:28:0x007f), top: B:44:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f25689w
                r2 = 2
                java.lang.String r3 = "appId"
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 != r2) goto L16
                wn.m.b(r9)     // Catch: java.lang.Exception -> La6
                goto L90
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                wn.m.b(r9)     // Catch: java.lang.Exception -> La6
                goto L54
            L22:
                wn.m.b(r9)
                com.dena.mirrorman.feature.app.AppPageActivity r9 = com.dena.mirrorman.feature.app.AppPageActivity.this     // Catch: java.lang.Exception -> La6
                boolean r9 = com.dena.mirrorman.feature.app.AppPageActivity.I3(r9)     // Catch: java.lang.Exception -> La6
                java.lang.String r1 = "app_page"
                if (r9 == 0) goto L6b
                com.dena.mirrorman.feature.app.AppPageActivity r9 = com.dena.mirrorman.feature.app.AppPageActivity.this     // Catch: java.lang.Exception -> La6
                com.dena.mirrorman.net.retrofit.MRRequest r9 = com.dena.mirrorman.feature.app.AppPageActivity.H3(r9)     // Catch: java.lang.Exception -> La6
                com.dena.mirrativ.mirrativapi.core.ApiUtil r2 = com.dena.mirrativ.mirrativapi.core.ApiUtil.INSTANCE     // Catch: java.lang.Exception -> La6
                com.dena.mirrorman.feature.app.AppPageActivity r6 = com.dena.mirrorman.feature.app.AppPageActivity.this     // Catch: java.lang.Exception -> La6
                java.lang.String r6 = com.dena.mirrorman.feature.app.AppPageActivity.D3(r6)     // Catch: java.lang.Exception -> La6
                if (r6 != 0) goto L43
                jo.p.v(r3)     // Catch: java.lang.Exception -> La6
                r6 = r5
            L43:
                java.util.List r6 = xn.r.d(r6)     // Catch: java.lang.Exception -> La6
                ep.c0 r2 = r2.appMyAppRequestBody(r6)     // Catch: java.lang.Exception -> La6
                r8.f25689w = r4     // Catch: java.lang.Exception -> La6
                java.lang.Object r9 = r9.postAddMyApp(r1, r2, r8)     // Catch: java.lang.Exception -> La6
                if (r9 != r0) goto L54
                return r0
            L54:
                com.dena.mirrorman.feature.app.AppPageActivity r9 = com.dena.mirrorman.feature.app.AppPageActivity.this     // Catch: java.lang.Exception -> La6
                com.dena.mirrorman.net.api.response.App$AppParams r9 = com.dena.mirrorman.feature.app.AppPageActivity.E3(r9)     // Catch: java.lang.Exception -> La6
                if (r9 == 0) goto La6
                com.dena.mirrorman.feature.app.AppPageActivity r0 = com.dena.mirrorman.feature.app.AppPageActivity.this     // Catch: java.lang.Exception -> La6
                q8.a r0 = com.dena.mirrorman.feature.app.AppPageActivity.G3(r0)     // Catch: java.lang.Exception -> La6
                pd.s$a r1 = new pd.s$a     // Catch: java.lang.Exception -> La6
                r1.<init>(r9)     // Catch: java.lang.Exception -> La6
                r0.a(r1)     // Catch: java.lang.Exception -> La6
                goto La6
            L6b:
                com.dena.mirrorman.feature.app.AppPageActivity r9 = com.dena.mirrorman.feature.app.AppPageActivity.this     // Catch: java.lang.Exception -> La6
                com.dena.mirrorman.net.retrofit.MRRequest r9 = com.dena.mirrorman.feature.app.AppPageActivity.H3(r9)     // Catch: java.lang.Exception -> La6
                com.dena.mirrativ.mirrativapi.core.ApiUtil r6 = com.dena.mirrativ.mirrativapi.core.ApiUtil.INSTANCE     // Catch: java.lang.Exception -> La6
                com.dena.mirrorman.feature.app.AppPageActivity r7 = com.dena.mirrorman.feature.app.AppPageActivity.this     // Catch: java.lang.Exception -> La6
                java.lang.String r7 = com.dena.mirrorman.feature.app.AppPageActivity.D3(r7)     // Catch: java.lang.Exception -> La6
                if (r7 != 0) goto L7f
                jo.p.v(r3)     // Catch: java.lang.Exception -> La6
                r7 = r5
            L7f:
                java.util.List r7 = xn.r.d(r7)     // Catch: java.lang.Exception -> La6
                ep.c0 r6 = r6.appMyAppRequestBody(r7)     // Catch: java.lang.Exception -> La6
                r8.f25689w = r2     // Catch: java.lang.Exception -> La6
                java.lang.Object r9 = r9.postDeleteMyApp(r1, r6, r8)     // Catch: java.lang.Exception -> La6
                if (r9 != r0) goto L90
                return r0
            L90:
                com.dena.mirrorman.feature.app.AppPageActivity r9 = com.dena.mirrorman.feature.app.AppPageActivity.this     // Catch: java.lang.Exception -> La6
                com.dena.mirrorman.net.api.response.App$AppParams r9 = com.dena.mirrorman.feature.app.AppPageActivity.E3(r9)     // Catch: java.lang.Exception -> La6
                if (r9 == 0) goto La6
                com.dena.mirrorman.feature.app.AppPageActivity r0 = com.dena.mirrorman.feature.app.AppPageActivity.this     // Catch: java.lang.Exception -> La6
                q8.a r0 = com.dena.mirrorman.feature.app.AppPageActivity.G3(r0)     // Catch: java.lang.Exception -> La6
                pd.s$c r1 = new pd.s$c     // Catch: java.lang.Exception -> La6
                r1.<init>(r9)     // Catch: java.lang.Exception -> La6
                r0.a(r1)     // Catch: java.lang.Exception -> La6
            La6:
                com.dena.mirrorman.feature.app.AppPageActivity r9 = com.dena.mirrorman.feature.app.AppPageActivity.this
                ae.c r9 = com.dena.mirrorman.feature.app.AppPageActivity.F3(r9)
                if (r9 != 0) goto Lb4
                java.lang.String r9 = "binding"
                jo.p.v(r9)
                r9 = r5
            Lb4:
                androidx.appcompat.widget.AppCompatTextView r9 = r9.G
                r9.setEnabled(r4)
                dq.c r9 = dq.c.c()
                nd.d r0 = new nd.d
                com.dena.mirrorman.feature.app.AppPageActivity r1 = com.dena.mirrorman.feature.app.AppPageActivity.this
                java.lang.String r1 = com.dena.mirrorman.feature.app.AppPageActivity.D3(r1)
                if (r1 != 0) goto Lcb
                jo.p.v(r3)
                goto Lcc
            Lcb:
                r5 = r1
            Lcc:
                com.dena.mirrorman.feature.app.AppPageActivity r1 = com.dena.mirrorman.feature.app.AppPageActivity.this
                boolean r1 = com.dena.mirrorman.feature.app.AppPageActivity.I3(r1)
                r0.<init>(r5, r1)
                r9.l(r0)
                wn.v r9 = wn.v.f59242a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.feature.app.AppPageActivity.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AppPageActivity() {
        String uuid = UUID.randomUUID().toString();
        p.g(uuid, "randomUUID().toString()");
        this.S = uuid;
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.T = wn.g.b(iVar, new c(this, null, null));
        this.U = wn.g.b(iVar, new d(this, null, null));
        this.V = wn.g.b(iVar, new e(this, null, null));
        this.W = wn.g.b(iVar, new f(this, null, null));
        this.X = wn.g.b(iVar, new g(this, null, null));
        this.Y = wn.g.b(iVar, new h(this, null, null));
        this.Z = new s0(f0.b(nf.a.class), new k(this), new j(new i(this), null, new b(), gq.a.a(this)));
    }

    public static final void T3(AppPageActivity appPageActivity, View view) {
        p.h(appPageActivity, "this$0");
        appPageActivity.onBackPressed();
    }

    public static final void U3(AppPageActivity appPageActivity, View view) {
        p.h(appPageActivity, "this$0");
        appPageActivity.Y3();
    }

    public static final void V3(AppPageActivity appPageActivity, View view) {
        p.h(appPageActivity, "this$0");
        appPageActivity.Q3();
    }

    public static final void W3(AppPageActivity appPageActivity, DashboardCatalog dashboardCatalog) {
        p.h(appPageActivity, "this$0");
        if (dashboardCatalog == null) {
            return;
        }
        GlideRequest<Drawable> placeholder = GlideApp.with((androidx.fragment.app.h) appPageActivity).load(dashboardCatalog.getIconUrl()).placeholder(d1.ic_app_64_default);
        ae.c cVar = appPageActivity.f25662a0;
        ae.c cVar2 = null;
        if (cVar == null) {
            p.v("binding");
            cVar = null;
        }
        placeholder.into(cVar.D);
        ae.c cVar3 = appPageActivity.f25662a0;
        if (cVar3 == null) {
            p.v("binding");
        } else {
            cVar2 = cVar3;
        }
        cVar2.F.setText(dashboardCatalog.getTitle());
        appPageActivity.P = dashboardCatalog.isMyApp() != 0;
        appPageActivity.b4();
        appPageActivity.Q = appPageActivity.R3(dashboardCatalog.getAppId());
        appPageActivity.Z3();
    }

    public static final void X3(AppPageActivity appPageActivity, Boolean bool) {
        p.h(appPageActivity, "this$0");
        ae.c cVar = appPageActivity.f25662a0;
        if (cVar == null) {
            p.v("binding");
            cVar = null;
        }
        AppCompatTextView appCompatTextView = cVar.G;
        p.g(bool, "it");
        appCompatTextView.setEnabled(bool.booleanValue());
    }

    public final hf.c J3() {
        return (hf.c) this.V.getValue();
    }

    public final nf.a K3() {
        return (nf.a) this.Z.getValue();
    }

    public final hf.d L3() {
        return (hf.d) this.W.getValue();
    }

    public final q8.a M3() {
        return (q8.a) this.U.getValue();
    }

    public final tb.c N3() {
        return (tb.c) this.Y.getValue();
    }

    public final MRRequest O3() {
        return (MRRequest) this.T.getValue();
    }

    public final v0 P3() {
        return (v0) this.X.getValue();
    }

    public final void Q3() {
        ae.c cVar = this.f25662a0;
        String str = null;
        if (cVar == null) {
            p.v("binding");
            cVar = null;
        }
        cVar.E.setEnabled(false);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("market://details?id=");
            String str2 = this.f25663b0;
            if (str2 == null) {
                p.v("appId");
                str2 = null;
            }
            sb2.append(str2);
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb2.toString())));
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https://play.google.com/store/apps/details?id=");
            String str3 = this.f25663b0;
            if (str3 == null) {
                p.v("appId");
            } else {
                str = str3;
            }
            sb3.append(str);
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb3.toString())));
        }
    }

    public final boolean R3(String str) {
        if (str == null) {
            return false;
        }
        return J3().c(str);
    }

    public final void S3() {
        ae.c cVar = this.f25662a0;
        ae.c cVar2 = null;
        if (cVar == null) {
            p.v("binding");
            cVar = null;
        }
        Toolbar toolbar = cVar.I.B;
        toolbar.setBackgroundColor(toolbar.getResources().getColor(w0.Q0));
        toolbar.setNavigationIcon(y0.ic_arrow_back_slategray);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: ee.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppPageActivity.T3(AppPageActivity.this, view);
            }
        });
        L3().a(Referer.APP_PAGE);
        String str = this.f25663b0;
        if (str == null) {
            p.v("appId");
            str = null;
        }
        tb.b a10 = N3().a(this.S, Referer.APP_PAGE, new a.C0967a(str));
        z k10 = a3().k();
        ae.c cVar3 = this.f25662a0;
        if (cVar3 == null) {
            p.v("binding");
            cVar3 = null;
        }
        k10.s(cVar3.B.getId(), a10.a(), a10.b()).i();
        ae.c cVar4 = this.f25662a0;
        if (cVar4 == null) {
            p.v("binding");
        } else {
            cVar2 = cVar4;
        }
        cVar2.G.setEnabled(false);
    }

    public final void Y3() {
        v0 P3 = P3();
        FragmentManager a32 = a3();
        p.g(a32, "supportFragmentManager");
        if (v0.c(P3, a32, Referer.APP_PAGE, false, 4, null)) {
            boolean z10 = this.P;
            ae.c cVar = this.f25662a0;
            if (cVar == null) {
                p.v("binding");
                cVar = null;
            }
            cVar.G.setEnabled(false);
            this.P = !z10;
            b4();
            uo.l.d(this, null, null, new l(null), 3, null);
        }
    }

    public final void Z3() {
        ae.c cVar = this.f25662a0;
        if (cVar == null) {
            p.v("binding");
            cVar = null;
        }
        cVar.E.setVisibility(this.Q ? 8 : 0);
    }

    public final void a4() {
        ae.c cVar = this.f25662a0;
        String str = null;
        if (cVar == null) {
            p.v("binding");
            cVar = null;
        }
        cVar.E.setEnabled(true);
        String str2 = this.f25663b0;
        if (str2 == null) {
            p.v("appId");
        } else {
            str = str2;
        }
        this.Q = R3(str);
        Z3();
    }

    public final void b4() {
        ae.c cVar = this.f25662a0;
        if (cVar == null) {
            p.v("binding");
            cVar = null;
        }
        AppCompatTextView appCompatTextView = cVar.G;
        p.g(appCompatTextView, "binding.register");
        if (this.P) {
            appCompatTextView.setBackgroundResource(y0.btn_rectangle_corner4_tealish);
            Resources resources = getResources();
            p.g(resources, "resources");
            t.c(appCompatTextView, resources, 8388611, d1.btn_mypage_follow_selected2);
            appCompatTextView.setText(f1.text_apppage_myapp_added);
            appCompatTextView.setTextColor(getResources().getColor(w0.O0));
        } else {
            appCompatTextView.setBackgroundResource(y0.btn_stroke_corner4_tealish);
            Resources resources2 = getResources();
            p.g(resources2, "resources");
            t.c(appCompatTextView, resources2, 8388611, d1.f41951e);
            appCompatTextView.setText(f1.text_apppage_myapp_add);
            appCompatTextView.setTextColor(getResources().getColor(w0.M0));
        }
        appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), 0, appCompatTextView.getPaddingRight(), 0);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 140) {
            new jn.f().f(i10, i11, intent);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, b1.activity_app_page);
        p.g(g10, "setContentView(this, R.layout.activity_app_page)");
        ae.c cVar = (ae.c) g10;
        this.f25662a0 = cVar;
        String str = null;
        if (cVar == null) {
            p.v("binding");
            cVar = null;
        }
        cVar.G.setOnClickListener(new View.OnClickListener() { // from class: ee.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppPageActivity.U3(AppPageActivity.this, view);
            }
        });
        ae.c cVar2 = this.f25662a0;
        if (cVar2 == null) {
            p.v("binding");
            cVar2 = null;
        }
        cVar2.E.setOnClickListener(new View.OnClickListener() { // from class: ee.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppPageActivity.V3(AppPageActivity.this, view);
            }
        });
        String stringExtra = getIntent().getStringExtra("EXTRA_APP_ID");
        p.e(stringExtra);
        this.f25663b0 = stringExtra;
        hf.c J3 = J3();
        String str2 = this.f25663b0;
        if (str2 == null) {
            p.v("appId");
            str2 = null;
        }
        this.P = J3.d(str2);
        String stringExtra2 = getIntent().getStringExtra("EXTRA_LAUNCHED_FROM");
        boolean booleanExtra = getIntent().getBooleanExtra("EXTRA_IS_DEEP_LINK", false);
        if (getIntent().getSerializableExtra("EXTRA_APP_PARAMS") != null) {
            Serializable serializableExtra = getIntent().getSerializableExtra("EXTRA_APP_PARAMS");
            p.f(serializableExtra, "null cannot be cast to non-null type com.dena.mirrorman.net.api.response.App.AppParams");
            this.R = (App.AppParams) serializableExtra;
        }
        if (bundle != null) {
            this.Q = bundle.getBoolean("STATE_KEY_INSTALLED");
        }
        String str3 = this.f25663b0;
        if (str3 == null) {
            p.v("appId");
        } else {
            str = str3;
        }
        Puree.d(new AppPage.Launch(str, stringExtra2, booleanExtra));
        K3().g().i(this, new androidx.lifecycle.f0() { // from class: ee.d
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                AppPageActivity.W3(AppPageActivity.this, (DashboardCatalog) obj);
            }
        });
        K3().f().i(this, new androidx.lifecycle.f0() { // from class: ee.e
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                AppPageActivity.X3(AppPageActivity.this, (Boolean) obj);
            }
        });
        S3();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.Q) {
            return;
        }
        a4();
    }

    @Override // androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        p.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("STATE_KEY_INSTALLED", this.Q);
    }
}
