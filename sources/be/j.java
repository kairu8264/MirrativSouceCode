package be;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import java.io.Serializable;
import kq.a;

/* loaded from: classes2.dex */
public final class j extends androidx.fragment.app.e implements uo.q0 {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public final /* synthetic */ da.j N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a(String str, AppUserDetailResponse appUserDetailResponse) {
            jo.p.h(str, "appUserIdLabel");
            jo.p.h(appUserDetailResponse, "appUserDetail");
            j jVar = new j();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_APP_USER_ID_LABEL", str);
            bundle.putSerializable("EXTRA_KEY_APP_USER_DETAIL", appUserDetailResponse);
            jVar.V2(bundle);
            return jVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<AppUserDetailResponse> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final AppUserDetailResponse invoke() {
            Serializable serializable = j.this.M2().getSerializable("EXTRA_KEY_APP_USER_DETAIL");
            jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.net.api.response.AppUserDetailResponse");
            return (AppUserDetailResponse) serializable;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = j.this.M2().getString("EXTRA_KEY_APP_USER_ID_LABEL");
            jo.p.f(string, "null cannot be cast to non-null type kotlin.String");
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            String f10 = j.this.F3().f().f();
            if (f10 != null) {
                dq.c.c().l(new ce.i(f10, j.this.D3().getUserId(), true));
            }
            j.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {

        @co.f(c = "com.dena.mirrorman.dialog.AppUserIdConfirmDialog$onViewCreated$2$2", f = "AppUserIdConfirmDialog.kt", l = {74}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f17928w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ j f17929x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j jVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f17929x = jVar;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f17929x, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f17928w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f17928w = 1;
                    if (uo.b1.a(500L, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                this.f17929x.n3();
                return wn.v.f59242a;
            }
        }

        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            String f10 = j.this.F3().f().f();
            if (f10 != null) {
                dq.c.c().l(new ce.j(f10, j.this.D3().getUserId()));
            }
            j jVar = j.this;
            uo.l.d(jVar, null, null, new a(jVar, null), 3, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f17930w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f17930w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f17930w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f17930w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17931w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar) {
            super(0);
            this.f17931w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f17931w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17932w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17933x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17934y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f17935z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f17932w = aVar;
            this.f17933x = aVar2;
            this.f17934y = aVar3;
            this.f17935z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f17932w;
            vq.a aVar2 = this.f17933x;
            io.a aVar3 = this.f17934y;
            xq.a aVar4 = this.f17935z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(ud.j.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17936w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(io.a aVar) {
            super(0);
            this.f17936w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f17936w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public j() {
        super(nd.b1.dialog_fragment_app_user_id_confirm);
        this.N0 = new da.j();
        f fVar = new f(this);
        xq.a a10 = gq.a.a(this);
        g gVar = new g(fVar);
        this.O0 = androidx.fragment.app.e0.a(this, jo.f0.b(ud.j.class), new i(gVar), new h(fVar, null, null, a10));
        this.P0 = wn.g.a(new c());
        this.Q0 = wn.g.a(new b());
    }

    public final AppUserDetailResponse D3() {
        return (AppUserDetailResponse) this.Q0.getValue();
    }

    public final String E3() {
        return (String) this.P0.getValue();
    }

    public final ud.j F3() {
        return (ud.j) this.O0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(de.e.b(this, 280), -2);
        }
        ae.d1 T = ae.d1.T(view);
        T.B.setText(F3().h().f());
        AppCompatTextView appCompatTextView = T.F;
        appCompatTextView.setText(V0(nd.f1.text_broadcast_game_id_v2, E3()) + D3().getUserId());
        AppCompatTextView appCompatTextView2 = T.H;
        appCompatTextView2.setText(U0(nd.f1.text_user_name) + D3().getName());
        AppCompatTextView appCompatTextView3 = T.C;
        jo.p.g(appCompatTextView3, "binding.okTextView");
        yd.g1.a(appCompatTextView3, new d());
        AppCompatTextView appCompatTextView4 = T.E;
        jo.p.g(appCompatTextView4, "binding.retypeTextView");
        yd.g1.a(appCompatTextView4, new e());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), nd.g1.f42004a);
        w3(false);
        return dialog;
    }
}
