package pe;

import ae.c4;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.RegCancel;
import com.dena.mirrorman.clientlog.logs.RegStep;
import com.dena.mirrorman.net.api.response.Social;
import com.dena.mirrorman.unity.UnityManager;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.firebase.analytics.FirebaseAnalytics;
import gf.c0;
import hf.o0;
import hf.v0;
import java.util.ArrayList;
import java.util.List;
import jo.f0;
import kotlin.KotlinNothingValueException;
import kq.a;
import nd.a1;
import nd.b1;
import nd.f1;
import nd.w0;
import nf.b0;
import od.h0;
import org.greenrobot.eventbus.ThreadMode;
import uo.q0;
import uo.r0;
import xn.a0;
import yd.g1;

/* loaded from: classes2.dex */
public final class b extends androidx.fragment.app.e implements q0 {

    /* renamed from: a1  reason: collision with root package name */
    public static final a f47398a1 = new a(null);

    /* renamed from: b1  reason: collision with root package name */
    public static final int f47399b1 = 8;
    public final /* synthetic */ q0 N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public pe.c R0;
    public boolean S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public final wn.f W0;
    public final wn.f X0;
    public final wn.f Y0;
    public final FragmentRunner Z0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b a(String str, boolean z10, boolean z11) {
            jo.p.h(str, "referer");
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_REFERER", str);
            bundle.putBoolean("EXTRA_SHOW_URGE_USERS", z10);
            bundle.putBoolean("EXTRA_SHOW_SOCIAL", z11);
            bVar.V2(bundle);
            return bVar;
        }
    }

    /* renamed from: pe.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0721b extends jo.q implements io.a<uq.a> {
        public C0721b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return uq.b.b(b.this.j0());
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.login.RegistrationDialog$loginTwitter$1", f = "RegistrationDialog.kt", l = {200}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f47401w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.h f47403y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.h hVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f47403y = hVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f47403y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f47401w;
            if (i10 == 0) {
                wn.m.b(obj);
                o0 V3 = b.this.V3();
                androidx.fragment.app.h hVar = this.f47403y;
                FragmentManager I0 = b.this.I0();
                jo.p.g(I0, "parentFragmentManager");
                String R3 = b.this.R3();
                jo.p.g(R3, "referer");
                this.f47401w = 1;
                obj = V3.j(hVar, I0, R3, this);
                if (obj == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            wn.p pVar = (wn.p) obj;
            o0.b bVar = (o0.b) pVar.a();
            Social.SocialAccount socialAccount = (Social.SocialAccount) pVar.b();
            in.x xVar = (in.x) pVar.c();
            b.this.X3();
            if (bVar != o0.b.Failed && bVar != o0.b.Cancelled) {
                jo.p.e(socialAccount);
                Integer isFollowOfficialTwitter = socialAccount.isFollowOfficialTwitter();
                if (isFollowOfficialTwitter != null && isFollowOfficialTwitter.intValue() == 0) {
                    c0.a aVar = c0.Q0;
                    String R32 = b.this.R3();
                    jo.p.g(R32, "referer");
                    jo.p.e(xVar);
                    String c11 = xVar.c();
                    jo.p.g(c11, "twitterSession!!.userName");
                    aVar.a(R32, c11).z3(b.this.I0(), "FollowOfficialTwitterAccountDialog");
                }
                b.this.a4(true);
                b.this.N3();
                return wn.v.f59242a;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.login.RegistrationDialog$observeStoreValues$1", f = "RegistrationDialog.kt", l = {260}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f47404w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b f47406w;

            /* renamed from: pe.b$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0722a extends jo.q implements io.a<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ boolean f47407w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ b f47408x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0722a(boolean z10, b bVar) {
                    super(0);
                    this.f47407w = z10;
                    this.f47408x = bVar;
                }

                public final void a() {
                    if (this.f47407w) {
                        this.f47408x.g4();
                    } else {
                        this.f47408x.X3();
                    }
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ wn.v invoke() {
                    a();
                    return wn.v.f59242a;
                }
            }

            public a(b bVar) {
                this.f47406w = bVar;
            }

            public final Object a(boolean z10, ao.d<? super wn.v> dVar) {
                this.f47406w.Z0.c(new C0722a(z10, this.f47406w));
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
            }
        }

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

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f47404w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<Boolean> i11 = b.this.U3().i();
                a aVar = new a(b.this);
                this.f47404w = 1;
                if (i11.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.login.RegistrationDialog$observeStoreValues$2", f = "RegistrationDialog.kt", l = {272}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f47409w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b f47411w;

            public a(b bVar) {
                this.f47411w = bVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                this.f47411w.a4(false);
                this.f47411w.N3();
                return wn.v.f59242a;
            }
        }

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f47409w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> k10 = b.this.U3().k();
                a aVar = new a(b.this);
                this.f47409w = 1;
                if (k10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrorman.feature.login.RegistrationDialog$observeStoreValues$3", f = "RegistrationDialog.kt", l = {279}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f47412w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b f47414w;

            public a(b bVar) {
                this.f47414w = bVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                if (this.f47414w.q0() != null) {
                    b bVar = this.f47414w;
                    if (mRError instanceof MRError.Maintenance ? true : jo.p.c(mRError, MRError.ForceUpdate.INSTANCE)) {
                        of.n.f45411a.l(bVar.q0(), mRError);
                    } else {
                        of.n nVar = of.n.f45411a;
                        Context q02 = bVar.q0();
                        String message = mRError.getMessage();
                        if (message == null) {
                            message = bVar.U0(f1.f41966c);
                            jo.p.g(message, "getString(R.string.error_access)");
                        }
                        nVar.B(q02, message, false);
                    }
                    bVar.N3();
                }
                return wn.v.f59242a;
            }
        }

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f47412w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> j10 = b.this.U3().j();
                a aVar = new a(b.this);
                this.f47412w = 1;
                if (j10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<View, wn.v> {
        public g() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b.this.Z3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.l<View, wn.v> {
        public h() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b.this.N3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c4 f47418x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(c4 c4Var) {
            super(1);
            this.f47418x = c4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b bVar = b.this;
            c4 c4Var = this.f47418x;
            jo.p.g(c4Var, "binding");
            bVar.f4(c4Var);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c4 f47419w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(c4 c4Var) {
            super(1);
            this.f47419w = c4Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f47419w.K.setText("", TextView.BufferType.EDITABLE);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.p<Integer, KeyEvent, wn.v> {
        public k() {
            super(2);
        }

        public final void a(int i10, KeyEvent keyEvent) {
            jo.p.h(keyEvent, "event");
            if (i10 == 4 && keyEvent.getAction() == 1) {
                b.this.m3();
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num, KeyEvent keyEvent) {
            a(num.intValue(), keyEvent);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l implements TextWatcher {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ c4 f47422x;

        public l(c4 c4Var) {
            this.f47422x = c4Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            jo.p.h(editable, "editable");
            b bVar = b.this;
            c4 c4Var = this.f47422x;
            jo.p.g(c4Var, "binding");
            bVar.d4(c4Var, editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            jo.p.h(charSequence, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            jo.p.h(charSequence, "s");
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.a<String> {
        public m() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = b.this.M2().getString("EXTRA_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<Boolean> {
        public n() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(b.this.M2().getBoolean("EXTRA_SHOW_SOCIAL"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<Boolean> {
        public o() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(b.this.M2().getBoolean("EXTRA_SHOW_URGE_USERS"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<o0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f47426w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f47427x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f47428y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f47426w = componentCallbacks;
            this.f47427x = aVar;
            this.f47428y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.o0, java.lang.Object] */
        @Override // io.a
        public final o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f47426w;
            return gq.a.a(componentCallbacks).c(f0.b(o0.class), this.f47427x, this.f47428y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<od.p> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f47429w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f47430x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f47431y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f47429w = componentCallbacks;
            this.f47430x = aVar;
            this.f47431y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.p, java.lang.Object] */
        @Override // io.a
        public final od.p invoke() {
            ComponentCallbacks componentCallbacks = this.f47429w;
            return gq.a.a(componentCallbacks).c(f0.b(od.p.class), this.f47430x, this.f47431y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<hf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f47432w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f47433x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f47434y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f47432w = componentCallbacks;
            this.f47433x = aVar;
            this.f47434y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.r, java.lang.Object] */
        @Override // io.a
        public final hf.r invoke() {
            ComponentCallbacks componentCallbacks = this.f47432w;
            return gq.a.a(componentCallbacks).c(f0.b(hf.r.class), this.f47433x, this.f47434y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f47435w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f47436x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f47437y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f47435w = componentCallbacks;
            this.f47436x = aVar;
            this.f47437y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f47435w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f47436x, this.f47437y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<h0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f47438w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f47439x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f47440y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f47438w = componentCallbacks;
            this.f47439x = aVar;
            this.f47440y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.h0] */
        @Override // io.a
        public final h0 invoke() {
            ComponentCallbacks componentCallbacks = this.f47438w;
            return gq.a.a(componentCallbacks).c(f0.b(h0.class), this.f47439x, this.f47440y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f47441w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Fragment fragment) {
            super(0);
            this.f47441w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f47441w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f47442w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(io.a aVar) {
            super(0);
            this.f47442w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f47442w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f47443w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f47444x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f47445y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f47446z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f47443w = aVar;
            this.f47444x = aVar2;
            this.f47445y = aVar3;
            this.f47446z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f47443w;
            vq.a aVar2 = this.f47444x;
            io.a aVar3 = this.f47445y;
            xq.a aVar4 = this.f47446z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(b0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f47447w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(io.a aVar) {
            super(0);
            this.f47447w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((androidx.lifecycle.v0) this.f47447w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public b() {
        super(b1.dialog_fragment_registration);
        this.N0 = r0.b();
        this.O0 = wn.g.a(new m());
        this.P0 = wn.g.a(new o());
        this.Q0 = wn.g.a(new n());
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.T0 = wn.g.b(iVar, new p(this, null, null));
        this.U0 = wn.g.b(iVar, new q(this, null, null));
        this.V0 = wn.g.b(iVar, new r(this, null, null));
        this.W0 = wn.g.b(iVar, new s(this, null, null));
        this.X0 = wn.g.b(iVar, new t(this, null, new C0721b()));
        u uVar = new u(this);
        xq.a a10 = gq.a.a(this);
        v vVar = new v(uVar);
        this.Y0 = e0.a(this, f0.b(b0.class), new x(vVar), new w(uVar, null, null, a10));
        this.Z0 = new FragmentRunner(this);
    }

    public static final boolean e4(b bVar, c4 c4Var, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(bVar, "this$0");
        jo.p.g(c4Var, "binding");
        bVar.f4(c4Var);
        return true;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.R0 = null;
        r0.d(this, null, 1, null);
        dq.c.c().r(this);
        super.I1();
    }

    public final void N3() {
        if (m1() || h1() || A0() == null) {
            return;
        }
        n3();
    }

    public final h0 O3() {
        return (h0) this.X0.getValue();
    }

    public final hf.r P3() {
        return (hf.r) this.V0.getValue();
    }

    public final od.p Q3() {
        return (od.p) this.U0.getValue();
    }

    public final String R3() {
        return (String) this.O0.getValue();
    }

    public final boolean S3() {
        return ((Boolean) this.Q0.getValue()).booleanValue();
    }

    public final boolean T3() {
        return ((Boolean) this.P0.getValue()).booleanValue();
    }

    public final b0 U3() {
        return (b0) this.Y0.getValue();
    }

    public final o0 V3() {
        return (o0) this.T0.getValue();
    }

    public final v0 W3() {
        return (v0) this.W0.getValue();
    }

    public final void X3() {
        FragmentManager a32;
        androidx.fragment.app.h j02 = j0();
        if (j02 == null || (a32 = j02.a3()) == null) {
            return;
        }
        List<Fragment> p02 = a32.p0();
        jo.p.g(p02, "fragmentManager.fragments");
        ArrayList<sd.b> arrayList = new ArrayList();
        for (Object obj : p02) {
            if (obj instanceof sd.b) {
                arrayList.add(obj);
            }
        }
        for (sd.b bVar : arrayList) {
            bVar.n3();
        }
    }

    public final void Y3(c4 c4Var) {
        if (S3()) {
            c4Var.I.setVisibility(0);
        }
        List<String> a10 = P3().a();
        String str = (a10 == null || (str = (String) a0.q0(a10, no.c.f43727w)) == null) ? "" : "";
        c4Var.K.setText(str, TextView.BufferType.EDITABLE);
        c4Var.K.setSelection(str.length());
    }

    public final void Z3() {
        androidx.fragment.app.h j02 = j0();
        if (j02 == null) {
            return;
        }
        g4();
        uo.l.d(this, null, null, new c(j02, null), 3, null);
    }

    public final void a4(boolean z10) {
        if (z10) {
            Q3().m();
        } else {
            Q3().q();
        }
        UnityManager companion = UnityManager.Companion.getInstance();
        String x10 = W3().x();
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        companion.setUserTrackingInfo(x10, of.n.c(N2));
        hf.b.f35490a.l();
        Context q02 = q0();
        if (q02 != null) {
            FirebaseAnalytics.getInstance(q02).a("eeiaib", null);
        }
    }

    public final void b4() {
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
    }

    public final void c4() {
        if (this.S0) {
            this.S0 = false;
            Puree.d(new RegStep(1, R3()));
        }
    }

    public final void d4(c4 c4Var, Editable editable) {
        if (editable.length() > 0) {
            c4Var.H.setEnabled(true);
            c4Var.H.setTextColor(c3.a.d(N2(), w0.U0));
            return;
        }
        c4Var.H.setEnabled(false);
        c4Var.H.setTextColor(c3.a.d(N2(), w0.S0));
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        Window window2;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        final c4 T = c4.T(view);
        AppCompatTextView appCompatTextView = T.B;
        jo.p.g(appCompatTextView, "binding.btnLoginTwitter");
        g1.a(appCompatTextView, new g());
        AppCompatImageView appCompatImageView = T.D;
        jo.p.g(appCompatImageView, "binding.close");
        g1.a(appCompatImageView, new h());
        AppCompatTextView appCompatTextView2 = T.H;
        jo.p.g(appCompatTextView2, "binding.registerAccount");
        g1.a(appCompatTextView2, new i(T));
        AppCompatImageView appCompatImageView2 = T.F;
        jo.p.g(appCompatImageView2, "binding.deleteInputImageView");
        g1.a(appCompatImageView2, new j(T));
        T.K.requestFocus();
        T.K.setOnKeyPreImeListener(new k());
        T.K.addTextChangedListener(new l(T));
        T.K.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: pe.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean e42;
                e42 = b.e4(b.this, T, textView, i10, keyEvent);
                return e42;
            }
        });
        jo.p.g(T, "binding");
        Y3(T);
        c4();
        b4();
        Dialog p32 = p3();
        if (p32 != null && (window2 = p32.getWindow()) != null) {
            window2.setLayout((int) (O0().getDisplayMetrics().density * 280), -2);
        }
        Dialog p33 = p3();
        if (p33 == null || (window = p33.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(5);
    }

    public final void f4(c4 c4Var) {
        String valueOf = String.valueOf(c4Var.K.getText());
        of.s sVar = of.s.f45426a;
        if (sVar.b(valueOf) || sVar.b(valueOf)) {
            return;
        }
        if (valueOf.length() > O0().getInteger(a1.limit_user_name)) {
            of.n.A(j0(), f1.f41971g, false);
            return;
        }
        h0 O3 = O3();
        String R3 = R3();
        jo.p.g(R3, "referer");
        O3.n(R3, valueOf, T3());
    }

    public final void g4() {
        FragmentManager a32;
        androidx.fragment.app.h j02 = j0();
        if (j02 == null || (a32 = j02.a3()) == null) {
            return;
        }
        List<Fragment> p02 = a32.p0();
        jo.p.g(p02, "fragmentManager.fragments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : p02) {
            if (obj instanceof sd.b) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            sd.b.O0.a(false).z3(a32, "ProgressDialogFragment");
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        jo.p.h(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        Puree.d(new RegCancel(1, R3()));
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        jo.p.h(dialogInterface, "dialog");
        pe.c cVar = this.R0;
        if (cVar != null) {
            cVar.y();
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(nd.n nVar) {
        jo.p.h(nVar, "event");
        N3();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), nd.g1.f42004a);
        w3(false);
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.S0 = true;
        dq.c.c().p(this);
        this.R0 = context instanceof pe.c ? (pe.c) context : null;
    }
}
