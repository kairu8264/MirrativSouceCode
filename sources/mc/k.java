package mc;

import ac.a0;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import hf.v0;
import jo.f0;
import kotlin.KotlinNothingValueException;
import uo.q0;
import uo.r0;
import yd.g1;

/* loaded from: classes2.dex */
public final class k extends androidx.fragment.app.e implements q0 {
    public static final a T0 = new a(null);
    public static final int U0 = 8;
    public final /* synthetic */ q0 N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public b S0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k a(String str) {
            jo.p.h(str, "referer");
            k kVar = new k();
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_KEY_REFERER", str);
            kVar.V2(bundle);
            return kVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void l2();
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            k.this.G3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            k.this.G3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ a0 f40771w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ k f40772x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a0 a0Var, k kVar) {
            super(1);
            this.f40771w = a0Var;
            this.f40772x = kVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f40772x.M3(this.f40771w.G.getText().toString());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements TextWatcher {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a0 f40774x;

        public f(a0 a0Var) {
            this.f40774x = a0Var;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            jo.p.h(editable, "text");
            if (!TextUtils.isEmpty(editable.toString()) && of.s.f45426a.b(editable.toString())) {
                this.f40774x.F.setEnabled(false);
                return;
            }
            k kVar = k.this;
            a0 a0Var = this.f40774x;
            jo.p.g(a0Var, "binding");
            kVar.N3(a0Var, editable.length());
            this.f40774x.F.setEnabled(true);
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

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultCustomThanksMessageDialog$onViewCreated$5", f = "BroadcastResultCustomThanksMessageDialog.kt", l = {105}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40775w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ k f40777w;

            public a(k kVar) {
                this.f40777w = kVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                b bVar = this.f40777w.S0;
                if (bVar != null) {
                    bVar.l2();
                }
                this.f40777w.G3();
                return wn.v.f59242a;
            }
        }

        public g(ao.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40775w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> t10 = k.this.L3().t();
                a aVar = new a(k.this);
                this.f40775w = 1;
                if (t10.a(aVar, this) == c10) {
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

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultCustomThanksMessageDialog$onViewCreated$6", f = "BroadcastResultCustomThanksMessageDialog.kt", l = {112}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40778w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ k f40780w;

            public a(k kVar) {
                this.f40780w = kVar;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                if (mRError instanceof MRError.Maintenance ? true : jo.p.c(mRError, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(this.f40780w.N2(), mRError);
                } else {
                    of.n nVar = of.n.f45411a;
                    Context N2 = this.f40780w.N2();
                    String message = mRError.getMessage();
                    if (message == null) {
                        message = this.f40780w.U0(xb.r.f60070c);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(N2, message, false);
                }
                this.f40780w.G3();
                return wn.v.f59242a;
            }
        }

        public h(ao.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40778w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> s10 = k.this.L3().s();
                a aVar = new a(k.this);
                this.f40778w = 1;
                if (s10.a(aVar, this) == c10) {
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
    public static final class i extends jo.q implements io.a<String> {
        public i() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = k.this.M2().getString("BUNDLE_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40782w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40783x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40784y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40782w = componentCallbacks;
            this.f40783x = aVar;
            this.f40784y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f40782w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f40783x, this.f40784y);
        }
    }

    /* renamed from: mc.k$k  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0601k extends jo.q implements io.a<mc.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40785w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40786x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40787y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0601k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40785w = componentCallbacks;
            this.f40786x = aVar;
            this.f40787y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mc.a] */
        @Override // io.a
        public final mc.a invoke() {
            ComponentCallbacks componentCallbacks = this.f40785w;
            return gq.a.a(componentCallbacks).c(f0.b(mc.a.class), this.f40786x, this.f40787y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40788w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40789x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40790y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40788w = componentCallbacks;
            this.f40789x = aVar;
            this.f40790y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [mc.m, java.lang.Object] */
        @Override // io.a
        public final m invoke() {
            ComponentCallbacks componentCallbacks = this.f40788w;
            return gq.a.a(componentCallbacks).c(f0.b(m.class), this.f40789x, this.f40790y);
        }
    }

    public k() {
        super(xb.p.dialog_fragment_custom_thanks_message);
        this.N0 = r0.b();
        this.O0 = wn.g.a(new i());
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P0 = wn.g.b(iVar, new j(this, null, null));
        this.Q0 = wn.g.b(iVar, new C0601k(this, null, null));
        this.R0 = wn.g.b(iVar, new l(this, null, null));
    }

    public final void G3() {
        if (m1() || h1()) {
            return;
        }
        n3();
    }

    public final mc.a H3() {
        return (mc.a) this.Q0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.S0 = null;
        r0.d(this, null, 1, null);
        super.I1();
    }

    public final String I3(int i10) {
        return i10 + '/' + U0(xb.r.limit_custom_thanks_message);
    }

    public final v0 J3() {
        return (v0) this.P0.getValue();
    }

    public final String K3() {
        return (String) this.O0.getValue();
    }

    public final m L3() {
        return (m) this.R0.getValue();
    }

    public final void M3(String str) {
        if (of.s.f45426a.b(str)) {
            return;
        }
        if (str.length() > Integer.parseInt(U0(xb.r.limit_custom_thanks_message))) {
            of.n.A(q0(), xb.r.f60073e, false);
            return;
        }
        mc.a H3 = H3();
        String K3 = K3();
        jo.p.g(K3, "referer");
        H3.l(K3, str);
    }

    public final void N3(a0 a0Var, int i10) {
        a0Var.D.setText(I3(i10));
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        a0 T = a0.T(view);
        View view2 = T.H;
        jo.p.g(view2, "binding.grayView");
        g1.a(view2, new c());
        AppCompatTextView appCompatTextView = T.E;
        jo.p.g(appCompatTextView, "binding.dialogNoButton");
        g1.a(appCompatTextView, new d());
        AppCompatTextView appCompatTextView2 = T.F;
        jo.p.g(appCompatTextView2, "binding.dialogYesButton");
        g1.a(appCompatTextView2, new e(T, this));
        String f10 = J3().f();
        int length = f10.length();
        if (length > 0) {
            T.G.setText(f10);
            T.F.setEnabled(true);
        } else {
            T.F.setEnabled(false);
        }
        jo.p.g(T, "binding");
        N3(T, length);
        T.G.requestFocus();
        T.G.addTextChangedListener(new f(T));
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setSoftInputMode(5);
        }
        uo.l.d(this, null, null, new g(null), 3, null);
        uo.l.d(this, null, null, new h(null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), xb.s.f60094a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.S0 = context instanceof b ? (b) context : null;
    }
}
