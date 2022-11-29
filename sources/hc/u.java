package hc;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import com.dena.mirrorman.customview.RoundedButtonView;
import kotlin.KotlinNothingValueException;
import kq.a;
import yd.g1;

/* loaded from: classes2.dex */
public final class u extends androidx.fragment.app.e implements uo.q0 {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public final /* synthetic */ da.j N0;
    public v O0;
    public final wn.f P0;
    public z0 Q0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u a() {
            return new u();
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotGalleryCommentInputDialogFragment$observeStoreValues$1", f = "GroupShotGalleryCommentInputDialogFragment.kt", l = {102}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35261w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ac.s0 f35263y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<String> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ac.s0 f35264w;

            public a(ac.s0 s0Var) {
                this.f35264w = s0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(String str, ao.d<? super wn.v> dVar) {
                AppCompatTextView appCompatTextView = this.f35264w.E;
                appCompatTextView.setText(str.codePointCount(0, str.length()) + "/30");
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ac.s0 s0Var, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f35263y = s0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f35263y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f35261w;
            if (i10 == 0) {
                wn.m.b(obj);
                z0 z0Var = u.this.Q0;
                if (z0Var == null) {
                    jo.p.v("store");
                    z0Var = null;
                }
                xo.g0<String> i11 = z0Var.i();
                a aVar = new a(this.f35263y);
                this.f35261w = 1;
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

    @co.f(c = "com.dena.mirrativ.streaming.groupshot.GroupShotGalleryCommentInputDialogFragment$observeStoreValues$2", f = "GroupShotGalleryCommentInputDialogFragment.kt", l = {108}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35265w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ac.s0 f35267y;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ac.s0 f35268w;

            public a(ac.s0 s0Var) {
                this.f35268w = s0Var;
            }

            public final Object a(boolean z10, ao.d<? super wn.v> dVar) {
                this.f35268w.D.setEnabled(z10);
                return wn.v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ac.s0 s0Var, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f35267y = s0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f35267y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f35265w;
            if (i10 == 0) {
                wn.m.b(obj);
                z0 z0Var = u.this.Q0;
                if (z0Var == null) {
                    jo.p.v("store");
                    z0Var = null;
                }
                xo.c<Boolean> m10 = z0Var.m();
                a aVar = new a(this.f35267y);
                this.f35265w = 1;
                if (m10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f35269w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f35269w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f35269w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35270w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar) {
            super(0);
            this.f35270w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f35270w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35271w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35272x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35273y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f35274z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f35271w = aVar;
            this.f35272x = aVar2;
            this.f35273y = aVar3;
            this.f35274z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f35271w;
            vq.a aVar2 = this.f35272x;
            io.a aVar3 = this.f35273y;
            xq.a aVar4 = this.f35274z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(z0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f35275w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar) {
            super(0);
            this.f35275w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f35275w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.l<View, wn.v> {
        public h() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            v vVar = u.this.O0;
            if (vVar != null) {
                z0 z0Var = u.this.Q0;
                if (z0Var == null) {
                    jo.p.v("store");
                    z0Var = null;
                }
                vVar.z(z0Var.i().getValue());
            }
            u.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements TextWatcher {
        public i() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            u.this.E3().f(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<hc.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f35278w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f35279x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f35280y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f35278w = componentCallbacks;
            this.f35279x = aVar;
            this.f35280y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hc.a] */
        @Override // io.a
        public final hc.a invoke() {
            ComponentCallbacks componentCallbacks = this.f35278w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hc.a.class), this.f35279x, this.f35280y);
        }
    }

    public u() {
        super(xb.p.dialog_fragment_group_shot_gallery_comment_input);
        this.N0 = new da.j();
        this.P0 = wn.g.b(wn.i.SYNCHRONIZED, new j(this, null, null));
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void A1(Bundle bundle) {
        super.A1(bundle);
        Fragment P2 = P2();
        jo.p.g(P2, "requireParentFragment()");
        d dVar = new d(P2);
        xq.a a10 = gq.a.a(P2);
        e eVar = new e(dVar);
        this.Q0 = (z0) ((androidx.lifecycle.q0) androidx.fragment.app.e0.a(P2, jo.f0.b(z0.class), new g(eVar), new f(dVar, null, null, a10)).getValue());
    }

    public final hc.a E3() {
        return (hc.a) this.P0.getValue();
    }

    @SuppressLint({"SetTextI18n"})
    public final void F3(ac.s0 s0Var) {
        uo.l.d(this, null, null, new b(s0Var, null), 3, null);
        uo.l.d(this, null, null, new c(s0Var, null), 3, null);
    }

    public final void G3(ac.s0 s0Var) {
        AppCompatEditText appCompatEditText = s0Var.C;
        appCompatEditText.setFilters(new sf.b[]{new sf.b(30)});
        jo.p.g(appCompatEditText, "");
        appCompatEditText.addTextChangedListener(new i());
        RoundedButtonView roundedButtonView = s0Var.D;
        jo.p.g(roundedButtonView, "binding.postButton");
        g1.a(roundedButtonView, new h());
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void S1() {
        super.S1();
        of.j jVar = of.j.f45405a;
        androidx.fragment.app.h L2 = L2();
        jo.p.g(L2, "requireActivity()");
        jVar.b(L2);
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        Window window;
        super.Z1();
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(5);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -2);
            window.getAttributes().gravity = 80;
        }
        ac.s0 T = ac.s0.T(view);
        jo.p.g(T, "binding");
        G3(T);
        F3(T);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), 16973913);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(xb.l.f59949v);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.clearFlags(2);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        Fragment H0 = H0();
        this.O0 = H0 instanceof v ? (v) H0 : null;
    }
}
