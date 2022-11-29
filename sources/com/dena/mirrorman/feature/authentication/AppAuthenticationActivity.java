package com.dena.mirrorman.feature.authentication;

import android.app.AlertDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import ao.g;
import co.l;
import com.dena.mirrorman.feature.authentication.AppAuthenticationActivity;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.ConnectAuthorizeResponse;
import com.dena.mirrorman.net.api.response.ConnectConfirmResponse;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.util.Arrays;
import jo.f0;
import jo.h;
import jo.i0;
import jo.p;
import jo.q;
import nd.b1;
import nd.f1;
import so.n;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.o2;
import uo.q0;
import uo.r0;
import v7.i;
import v7.y;
import wn.f;
import wn.m;
import wn.v;

/* loaded from: classes2.dex */
public final class AppAuthenticationActivity extends e.b implements q0 {
    public static final a T = new a(null);
    public static final int U = 8;
    public ae.a O;
    public final g P;
    public final f Q;
    public String R;
    public final f S;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context, fe.e eVar) {
            p.h(context, "context");
            p.h(eVar, "params");
            Intent intent = new Intent(context, AppAuthenticationActivity.class);
            intent.putExtra("EXTRA_APP_AUTHENTICATE_PARAMS", eVar);
            return intent;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.authentication.AppAuthenticationActivity$authorize$1", f = "AppAuthenticationActivity.kt", l = {123}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25691w;

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

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object connectAuthorizeRequest$default;
            ConnectAuthorizeResponse connectAuthorizeResponse;
            Object c10 = bo.c.c();
            int i10 = this.f25691w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest M3 = AppAuthenticationActivity.this.M3();
                    String b10 = AppAuthenticationActivity.this.L3().b();
                    String d10 = AppAuthenticationActivity.this.L3().d();
                    String e10 = AppAuthenticationActivity.this.L3().e();
                    String f10 = AppAuthenticationActivity.this.L3().f();
                    String c11 = AppAuthenticationActivity.this.L3().c();
                    String g10 = AppAuthenticationActivity.this.L3().g();
                    this.f25691w = 1;
                    connectAuthorizeRequest$default = MRRequest.DefaultImpls.connectAuthorizeRequest$default(M3, Referer.Connect, e10, b10, d10, f10, c11, g10, null, this, 128, null);
                    if (connectAuthorizeRequest$default == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                    connectAuthorizeRequest$default = obj;
                }
                String uri = ((ConnectAuthorizeResponse) connectAuthorizeRequest$default).getUri();
                if (!n.r(AppAuthenticationActivity.this.L3().a())) {
                    uri = AppAuthenticationActivity.this.L3().d() + "login?access_token=" + connectAuthorizeResponse.getAccessToken();
                }
                AppAuthenticationActivity.this.I3(uri);
            } catch (Throwable th2) {
                g9.a.c(th2);
                AppAuthenticationActivity.this.P3();
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.authentication.AppAuthenticationActivity$fetchClientApp$1", f = "AppAuthenticationActivity.kt", l = {85}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25693w;

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

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f25693w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest M3 = AppAuthenticationActivity.this.M3();
                    String b10 = AppAuthenticationActivity.this.L3().b();
                    String d10 = AppAuthenticationActivity.this.L3().d();
                    String e10 = AppAuthenticationActivity.this.L3().e();
                    String f10 = AppAuthenticationActivity.this.L3().f();
                    String c11 = AppAuthenticationActivity.this.L3().c();
                    String g10 = AppAuthenticationActivity.this.L3().g();
                    this.f25693w = 1;
                    obj = M3.connectConfirmRequest(Referer.Connect, e10, b10, d10, f10, c11, g10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                ConnectConfirmResponse connectConfirmResponse = (ConnectConfirmResponse) obj;
                String name = connectConfirmResponse.getClient().getName();
                AppAuthenticationActivity.this.R = name;
                ae.a aVar = AppAuthenticationActivity.this.O;
                ae.a aVar2 = null;
                if (aVar == null) {
                    p.v("binding");
                    aVar = null;
                }
                aVar.C.setVisibility(0);
                ae.a aVar3 = AppAuthenticationActivity.this.O;
                if (aVar3 == null) {
                    p.v("binding");
                    aVar3 = null;
                }
                AppCompatTextView appCompatTextView = aVar3.J;
                i0 i0Var = i0.f38149a;
                String string = AppAuthenticationActivity.this.getString(f1.text_app_link);
                p.g(string, "getString(R.string.text_app_link)");
                String format = String.format(string, Arrays.copyOf(new Object[]{name}, 1));
                p.g(format, "format(format, *args)");
                appCompatTextView.setText(format);
                ae.a aVar4 = AppAuthenticationActivity.this.O;
                if (aVar4 == null) {
                    p.v("binding");
                    aVar4 = null;
                }
                AppCompatTextView appCompatTextView2 = aVar4.H;
                String string2 = AppAuthenticationActivity.this.getString(f1.text_app_link_usage_permission);
                p.g(string2, "getString(R.string.text_app_link_usage_permission)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{name}, 1));
                p.g(format2, "format(format, *args)");
                appCompatTextView2.setText(format2);
                String appIcon = connectConfirmResponse.getClient().getAppIcon();
                ae.a aVar5 = AppAuthenticationActivity.this.O;
                if (aVar5 == null) {
                    p.v("binding");
                    aVar5 = null;
                }
                GlideRequest<Drawable> load = GlideApp.with(aVar5.F).load(appIcon);
                m7.l[] lVarArr = new m7.l[2];
                lVarArr[0] = new i();
                ae.a aVar6 = AppAuthenticationActivity.this.O;
                if (aVar6 == null) {
                    p.v("binding");
                    aVar6 = null;
                }
                AppCompatImageView appCompatImageView = aVar6.F;
                p.g(appCompatImageView, "binding.iconImageView");
                lVarArr[1] = new y(de.n.b(appCompatImageView, 12));
                GlideRequest<Drawable> apply = load.apply((e8.a<?>) e8.h.bitmapTransform(new m7.f(lVarArr)));
                ae.a aVar7 = AppAuthenticationActivity.this.O;
                if (aVar7 == null) {
                    p.v("binding");
                } else {
                    aVar2 = aVar7;
                }
                apply.into(aVar2.F);
            } catch (Throwable th2) {
                g9.a.c(th2);
                AppAuthenticationActivity.this.P3();
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<fe.e> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final fe.e invoke() {
            Parcelable parcelableExtra = AppAuthenticationActivity.this.getIntent().getParcelableExtra("EXTRA_APP_AUTHENTICATE_PARAMS");
            p.e(parcelableExtra);
            return (fe.e) parcelableExtra;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f25696w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f25697x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f25698y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f25696w = componentCallbacks;
            this.f25697x = aVar;
            this.f25698y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f25696w;
            return gq.a.a(componentCallbacks).c(f0.b(MRRequest.class), this.f25697x, this.f25698y);
        }
    }

    public AppAuthenticationActivity() {
        b0 b10;
        o2 c10 = g1.c();
        b10 = i2.b(null, 1, null);
        this.P = c10.plus(b10);
        this.Q = wn.g.a(new d());
        this.R = "";
        this.S = wn.g.b(wn.i.SYNCHRONIZED, new e(this, null, null));
    }

    public static final void J3(DialogInterface dialogInterface, int i10) {
    }

    public static final void N3(AppAuthenticationActivity appAuthenticationActivity, View view) {
        p.h(appAuthenticationActivity, "this$0");
        appAuthenticationActivity.H3();
    }

    public static final void O3(AppAuthenticationActivity appAuthenticationActivity, View view) {
        p.h(appAuthenticationActivity, "this$0");
        appAuthenticationActivity.I3("");
    }

    public static final void Q3(DialogInterface dialogInterface, int i10) {
    }

    public final void H3() {
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    public final void I3(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(335544320);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            i0 i0Var = i0.f38149a;
            String string = getString(f1.text_app_link_can_not_open_app);
            p.g(string, "getString(R.string.text_app_link_can_not_open_app)");
            String format = String.format(string, Arrays.copyOf(new Object[]{this.R}, 1));
            p.g(format, "format(format, *args)");
            builder.setMessage(format).setPositiveButton("OK", fe.b.f31968w).show();
        }
    }

    public final void K3() {
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    public final fe.e L3() {
        return (fe.e) this.Q.getValue();
    }

    public final MRRequest M3() {
        return (MRRequest) this.S.getValue();
    }

    public final void P3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(f1.error_auth);
        builder.setCancelable(true);
        builder.setPositiveButton(f1.C3, fe.a.f31967w);
        builder.create().show();
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.P;
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, b1.activity_app_authentication);
        p.g(g10, "setContentView(this, R.l…ivity_app_authentication)");
        ae.a aVar = (ae.a) g10;
        this.O = aVar;
        ae.a aVar2 = null;
        if (aVar == null) {
            p.v("binding");
            aVar = null;
        }
        aVar.B.setOnClickListener(new View.OnClickListener() { // from class: fe.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppAuthenticationActivity.N3(AppAuthenticationActivity.this, view);
            }
        });
        ae.a aVar3 = this.O;
        if (aVar3 == null) {
            p.v("binding");
        } else {
            aVar2 = aVar3;
        }
        aVar2.D.setOnClickListener(new View.OnClickListener() { // from class: fe.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppAuthenticationActivity.O3(AppAuthenticationActivity.this, view);
            }
        });
        K3();
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }
}
