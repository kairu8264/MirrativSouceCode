package com.dena.mirrativ.user.mypage.setting;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity;
import com.dena.mirrorman.customview.RoundedButtonView;
import ie.f;
import io.l;
import jo.f0;
import jo.p;
import jo.q;
import kotlin.KotlinNothingValueException;
import kq.a;
import ld.i1;
import ld.t;
import nd.f1;
import of.n;
import of.r;
import pc.y;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;
import xo.w;
import yd.g1;
import yd.t1;

/* loaded from: classes2.dex */
public final class UserWithdrawActivity extends e.b implements f.b, q0 {
    public static final a T = new a(null);
    public static final int U = 8;
    public final /* synthetic */ q0 O = r0.b();
    public y P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context) {
            p.h(context, "context");
            return new Intent(context, UserWithdrawActivity.class);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements l<View, v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            f.a aVar = ie.f.V0;
            String string = UserWithdrawActivity.this.getString(f1.text_user_withdraw_confirm_title);
            p.g(string, "getString(com.dena.mirro…r_withdraw_confirm_title)");
            f.a.b(aVar, string, UserWithdrawActivity.this.getString(f1.text_user_withdraw_perform), UserWithdrawActivity.this.getString(f1.f41995w0), UserWithdrawActivity.this.getString(f1.text_user_withdraw_confirm_message), false, 16, null).z3(UserWithdrawActivity.this.a3(), "TAG_WITHDRAW_DIALOG");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity$onCreate$3", f = "UserWithdrawActivity.kt", l = {65}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24893w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ UserWithdrawActivity f24895w;

            @co.f(c = "com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity$onCreate$3$1", f = "UserWithdrawActivity.kt", l = {67}, m = "emit")
            /* renamed from: com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0216a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public Object f24896w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f24897x;

                /* renamed from: z  reason: collision with root package name */
                public int f24899z;

                public C0216a(ao.d<? super C0216a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f24897x = obj;
                    this.f24899z |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(UserWithdrawActivity userWithdrawActivity) {
                this.f24895w = userWithdrawActivity;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            @Override // xo.d
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(wn.v r12, ao.d<? super wn.v> r13) {
                /*
                    r11 = this;
                    boolean r12 = r13 instanceof com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity.c.a.C0216a
                    if (r12 == 0) goto L13
                    r12 = r13
                    com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity$c$a$a r12 = (com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity.c.a.C0216a) r12
                    int r0 = r12.f24899z
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r0 & r1
                    if (r2 == 0) goto L13
                    int r0 = r0 - r1
                    r12.f24899z = r0
                    goto L18
                L13:
                    com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity$c$a$a r12 = new com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity$c$a$a
                    r12.<init>(r13)
                L18:
                    java.lang.Object r13 = r12.f24897x
                    java.lang.Object r0 = bo.c.c()
                    int r1 = r12.f24899z
                    r2 = 1
                    if (r1 == 0) goto L35
                    if (r1 != r2) goto L2d
                    java.lang.Object r12 = r12.f24896w
                    com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity$c$a r12 = (com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity.c.a) r12
                    wn.m.b(r13)
                    goto L4e
                L2d:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L35:
                    wn.m.b(r13)
                    com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity r13 = r11.f24895w
                    of.r r13 = com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity.y3(r13)
                    com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity r1 = r11.f24895w
                    r12.f24896w = r11
                    r12.f24899z = r2
                    java.lang.String r2 = "setting.withdraw"
                    java.lang.Object r12 = r13.e(r1, r2, r12)
                    if (r12 != r0) goto L4d
                    return r0
                L4d:
                    r12 = r11
                L4e:
                    com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity r13 = r12.f24895w
                    com.dena.mirrorman.activity.MainActivity$a r0 = com.dena.mirrorman.activity.MainActivity.f25195m0
                    r2 = 0
                    r3 = 0
                    r5 = 0
                    r6 = 0
                    com.dena.mirrorman.activity.MainActivity$a$a r7 = com.dena.mirrorman.activity.MainActivity.a.EnumC0218a.MyPage
                    r8 = 0
                    r9 = 64
                    r10 = 0
                    r1 = r13
                    android.content.Intent r0 = com.dena.mirrorman.activity.MainActivity.a.b(r0, r1, r2, r3, r5, r6, r7, r8, r9, r10)
                    r1 = 268468224(0x10008000, float:2.5342157E-29)
                    r0.addFlags(r1)
                    r13.startActivity(r0)
                    com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity r12 = r12.f24895w
                    r12.finish()
                    wn.v r12 = wn.v.f59242a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity.c.a.emit(wn.v, ao.d):java.lang.Object");
            }
        }

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
            int i10 = this.f24893w;
            if (i10 == 0) {
                m.b(obj);
                w<v> p10 = UserWithdrawActivity.this.C3().p();
                a aVar = new a(UserWithdrawActivity.this);
                this.f24893w = 1;
                if (p10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.UserWithdrawActivity$onCreate$4", f = "UserWithdrawActivity.kt", l = {84}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24900w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ UserWithdrawActivity f24902w;

            public a(UserWithdrawActivity userWithdrawActivity) {
                this.f24902w = userWithdrawActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super v> dVar) {
                if (mRError instanceof MRError.ForceUpdate ? true : p.c(mRError, MRError.Maintenance.INSTANCE)) {
                    n.f45411a.l(this.f24902w.getApplicationContext(), mRError);
                } else {
                    t1.a aVar = t1.f61795x;
                    Context applicationContext = this.f24902w.getApplicationContext();
                    p.g(applicationContext, "applicationContext");
                    String message = mRError.getMessage();
                    if (message == null) {
                        message = this.f24902w.getString(f1.f41966c);
                        p.g(message, "getString(com.dena.mirro…an.R.string.error_access)");
                    }
                    aVar.a(applicationContext, message);
                }
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

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24900w;
            if (i10 == 0) {
                m.b(obj);
                w<MRError> o10 = UserWithdrawActivity.this.C3().o();
                a aVar = new a(UserWithdrawActivity.this);
                this.f24900w = 1;
                if (o10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24903w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24904x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24905y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24903w = componentCallbacks;
            this.f24904x = aVar;
            this.f24905y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.r, java.lang.Object] */
        @Override // io.a
        public final r invoke() {
            ComponentCallbacks componentCallbacks = this.f24903w;
            return gq.a.a(componentCallbacks).c(f0.b(r.class), this.f24904x, this.f24905y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24906w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24907x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24908y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24906w = componentCallbacks;
            this.f24907x = aVar;
            this.f24908y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ld.t] */
        @Override // io.a
        public final t invoke() {
            ComponentCallbacks componentCallbacks = this.f24906w;
            return gq.a.a(componentCallbacks).c(f0.b(t.class), this.f24907x, this.f24908y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24909w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f24909w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f24909w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24910w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24911x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24912y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f24913z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f24910w = aVar;
            this.f24911x = aVar2;
            this.f24912y = aVar3;
            this.f24913z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f24910w;
            vq.a aVar2 = this.f24911x;
            io.a aVar3 = this.f24912y;
            xq.a aVar4 = this.f24913z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(i1.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24914w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f24914w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f24914w.U();
            p.g(U, "viewModelStore");
            return U;
        }
    }

    public UserWithdrawActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.Q = wn.g.b(iVar, new e(this, null, null));
        this.R = wn.g.b(iVar, new f(this, null, null));
        this.S = new s0(f0.b(i1.class), new i(this), new h(new g(this), null, null, gq.a.a(this)));
    }

    public static final void D3(UserWithdrawActivity userWithdrawActivity, View view) {
        p.h(userWithdrawActivity, "this$0");
        userWithdrawActivity.onBackPressed();
    }

    public final r A3() {
        return (r) this.Q.getValue();
    }

    public final t B3() {
        return (t) this.R.getValue();
    }

    public final i1 C3() {
        return (i1) this.S.getValue();
    }

    @Override // ie.f.b
    public void b(String str) {
        p.h(str, "tag");
        if (p.c(str, "TAG_WITHDRAW_DIALOG")) {
            B3().o();
        }
    }

    @Override // ie.f.b
    public void c(String str) {
        f.b.a.a(this, str);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, nc.f.activity_user_withdraw);
        p.g(g10, "setContentView(this, R.l…t.activity_user_withdraw)");
        y yVar = (y) g10;
        this.P = yVar;
        if (yVar == null) {
            p.v("binding");
            yVar = null;
        }
        Toolbar toolbar = yVar.E.B;
        toolbar.setNavigationIcon(nc.d.f41815v);
        TextView textView = (TextView) toolbar.findViewById(nc.e.B6);
        if (textView == null) {
            return;
        }
        p.g(textView, "findViewById<TextView>(R….toolbar_title) ?: return");
        toolbar.setBackgroundResource(nc.h.f41869c);
        textView.setVisibility(0);
        textView.setText(toolbar.getResources().getString(nc.i.text_user_withdraw));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: ld.j1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserWithdrawActivity.D3(UserWithdrawActivity.this, view);
            }
        });
        y yVar2 = this.P;
        if (yVar2 == null) {
            p.v("binding");
            yVar2 = null;
        }
        RoundedButtonView roundedButtonView = yVar2.C;
        p.g(roundedButtonView, "binding.leaveButtonView");
        g1.a(roundedButtonView, new b());
        uo.l.d(this, null, null, new c(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }
}
