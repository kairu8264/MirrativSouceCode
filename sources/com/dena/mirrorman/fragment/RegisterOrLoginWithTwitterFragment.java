package com.dena.mirrorman.fragment;

import ae.c7;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.fragment.RegisterOrLoginWithTwitterFragment;
import com.dena.mirrorman.net.MRUrl;
import com.dena.mirrorman.net.api.Referer;
import jo.f0;
import jo.p;
import jo.q;
import jo.s;
import nd.c1;
import nd.f1;
import nd.w0;
import nd.z0;
import od.h0;
import pe.b;
import qo.h;
import so.o;
import wn.i;

/* loaded from: classes2.dex */
public final class RegisterOrLoginWithTwitterFragment extends Fragment {
    public final wn.f A0;
    public final AutoClearedValue B0;

    /* renamed from: x0  reason: collision with root package name */
    public final wn.f f26116x0 = wn.g.a(new c());

    /* renamed from: y0  reason: collision with root package name */
    public final wn.f f26117y0;

    /* renamed from: z0  reason: collision with root package name */
    public final wn.f f26118z0;
    public static final /* synthetic */ h<Object>[] D0 = {f0.d(new s(RegisterOrLoginWithTwitterFragment.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/FragmentRegisterOrLoginWithTwitterBinding;", 0))};
    public static final a C0 = new a(null);
    public static final int E0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final RegisterOrLoginWithTwitterFragment a(String str, boolean z10) {
            p.h(str, "referer");
            RegisterOrLoginWithTwitterFragment registerOrLoginWithTwitterFragment = new RegisterOrLoginWithTwitterFragment();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_REFERER", str);
            bundle.putBoolean("EXTRA_SHOW_MENU_ITEMS", z10);
            registerOrLoginWithTwitterFragment.V2(bundle);
            return registerOrLoginWithTwitterFragment;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends sf.a {

        /* renamed from: x  reason: collision with root package name */
        public final Context f26119x;

        /* renamed from: y  reason: collision with root package name */
        public final String f26120y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, int i10) {
            super(i10);
            p.h(context, "context");
            p.h(str, "url");
            this.f26119x = context;
            this.f26120y = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            p.h(view, "view");
            Context context = this.f26119x;
            context.startActivity(WebViewActivity.a.b(WebViewActivity.X, context, this.f26120y, false, false, 12, null));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string;
            Bundle n02 = RegisterOrLoginWithTwitterFragment.this.n0();
            return (n02 == null || (string = n02.getString("EXTRA_REFERER")) == null) ? "" : string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<uq.a> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(RegisterOrLoginWithTwitterFragment.this.j0());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26123w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26124x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26125y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26123w = componentCallbacks;
            this.f26124x = aVar;
            this.f26125y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f26123w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f26124x, this.f26125y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<ServerConfig> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26126w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26127x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26128y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26126w = componentCallbacks;
            this.f26127x = aVar;
            this.f26128y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrativ.mirrativapi.core.ServerConfig, java.lang.Object] */
        @Override // io.a
        public final ServerConfig invoke() {
            ComponentCallbacks componentCallbacks = this.f26126w;
            return gq.a.a(componentCallbacks).c(f0.b(ServerConfig.class), this.f26127x, this.f26128y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<h0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26129w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26130x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26131y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26129w = componentCallbacks;
            this.f26130x = aVar;
            this.f26131y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.h0] */
        @Override // io.a
        public final h0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26129w;
            return gq.a.a(componentCallbacks).c(f0.b(h0.class), this.f26130x, this.f26131y);
        }
    }

    public RegisterOrLoginWithTwitterFragment() {
        i iVar = i.SYNCHRONIZED;
        this.f26117y0 = wn.g.b(iVar, new e(this, null, null));
        this.f26118z0 = wn.g.b(iVar, new f(this, null, null));
        this.A0 = wn.g.b(iVar, new g(this, null, new d()));
        this.B0 = nd.a.a(this);
    }

    public static final boolean r3(RegisterOrLoginWithTwitterFragment registerOrLoginWithTwitterFragment, MenuItem menuItem) {
        p.h(registerOrLoginWithTwitterFragment, "this$0");
        if (menuItem.getItemId() == z0.f42280ea) {
            tb.c n32 = registerOrLoginWithTwitterFragment.n3();
            Context N2 = registerOrLoginWithTwitterFragment.N2();
            p.g(N2, "requireContext()");
            registerOrLoginWithTwitterFragment.f3(n32.l(N2));
            return true;
        }
        return true;
    }

    public static final void v3(RegisterOrLoginWithTwitterFragment registerOrLoginWithTwitterFragment, View view) {
        p.h(registerOrLoginWithTwitterFragment, "this$0");
        h0 p32 = registerOrLoginWithTwitterFragment.p3();
        String o32 = registerOrLoginWithTwitterFragment.o3();
        p.g(o32, "referer");
        p32.i(o32);
        registerOrLoginWithTwitterFragment.p3().l();
    }

    public static final void w3(RegisterOrLoginWithTwitterFragment registerOrLoginWithTwitterFragment, View view) {
        p.h(registerOrLoginWithTwitterFragment, "this$0");
        registerOrLoginWithTwitterFragment.p3().j();
        b.a aVar = pe.b.f47398a1;
        String o32 = registerOrLoginWithTwitterFragment.o3();
        p.g(o32, "referer");
        aVar.a(o32, true, false).z3(registerOrLoginWithTwitterFragment.p0(), "RegistrationDialog");
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        c7 T = c7.T(layoutInflater, viewGroup, false);
        p.g(T, "inflate(\n            inf…          false\n        )");
        s3(T);
        Bundle n02 = n0();
        if (n02 != null ? n02.getBoolean("EXTRA_SHOW_MENU_ITEMS") : false) {
            m3().E.inflateMenu(c1.login_and_connect_with_your_friends_menu);
            m3().E.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: gf.u0
                @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean r32;
                    r32 = RegisterOrLoginWithTwitterFragment.r3(RegisterOrLoginWithTwitterFragment.this, menuItem);
                    return r32;
                }
            });
        }
        View u10 = m3().u();
        p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        p.h(view, "view");
        super.e2(view, bundle);
        x3();
        u3();
        t3();
        p3().k();
    }

    public final c7 m3() {
        return (c7) this.B0.b(this, D0[0]);
    }

    public final tb.c n3() {
        return (tb.c) this.f26117y0.getValue();
    }

    public final String o3() {
        return (String) this.f26116x0.getValue();
    }

    public final h0 p3() {
        return (h0) this.A0.getValue();
    }

    public final ServerConfig q3() {
        return (ServerConfig) this.f26118z0.getValue();
    }

    public final void s3(c7 c7Var) {
        this.B0.a(this, D0[0], c7Var);
    }

    public final void t3() {
        Context q02 = q0();
        if (q02 == null) {
            return;
        }
        String string = q02.getString(f1.text_agree_to_terms_of_use_and_privacy_policy_message);
        p.g(string, "context.getString(R.stri…d_privacy_policy_message)");
        String string2 = q02.getString(f1.text_user_policy);
        p.g(string2, "context.getString(R.string.text_user_policy)");
        String string3 = q02.getString(f1.text_privacy_policy);
        p.g(string3, "context.getString(R.string.text_privacy_policy)");
        String string4 = q02.getString(f1.T4);
        p.g(string4, "context.getString(R.stri…xt_streamer_terms_of_use)");
        int U = o.U(string, string2, 0, false, 6, null);
        int length = U + string2.length();
        int U2 = o.U(string, string3, 0, false, 6, null);
        int length2 = U2 + string3.length();
        int U3 = o.U(string, string4, 0, false, 6, null);
        SpannableString spannableString = new SpannableString(string);
        Context applicationContext = N2().getApplicationContext();
        p.g(applicationContext, "requireContext().applicationContext");
        ApiUtil apiUtil = ApiUtil.INSTANCE;
        String urlTerms = apiUtil.urlTerms(q3());
        int i10 = w0.O0;
        b bVar = new b(applicationContext, urlTerms, c3.a.d(q02, i10));
        Context applicationContext2 = N2().getApplicationContext();
        p.g(applicationContext2, "requireContext().applicationContext");
        b bVar2 = new b(applicationContext2, apiUtil.urlPrivacy(q3()), c3.a.d(q02, i10));
        Context applicationContext3 = N2().getApplicationContext();
        p.g(applicationContext3, "requireContext().applicationContext");
        b bVar3 = new b(applicationContext3, MRUrl.TermsForStreamer.INSTANCE.getUrl(), c3.a.d(q02, i10));
        spannableString.setSpan(bVar, U, length, 33);
        spannableString.setSpan(bVar2, U2, length2, 33);
        spannableString.setSpan(bVar3, U3, string4.length() + U3, 33);
        AppCompatTextView appCompatTextView = m3().D;
        appCompatTextView.setText(spannableString);
        appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void u3() {
        m3().B.setOnClickListener(new View.OnClickListener() { // from class: gf.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegisterOrLoginWithTwitterFragment.v3(RegisterOrLoginWithTwitterFragment.this, view);
            }
        });
        m3().C.setOnClickListener(new View.OnClickListener() { // from class: gf.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegisterOrLoginWithTwitterFragment.w3(RegisterOrLoginWithTwitterFragment.this, view);
            }
        });
    }

    public final void x3() {
        boolean c10 = p.c(o3(), Referer.TUTORIAL);
        m3().C.setText(U0(c10 ? f1.text_start : f1.text_login));
        m3().F.setText(U0(c10 ? f1.text_start_with_twitter : f1.text_login_with_twitter));
        if (c10) {
            return;
        }
        m3().D.setVisibility(8);
    }
}
