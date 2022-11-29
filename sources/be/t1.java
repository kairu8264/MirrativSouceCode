package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public final class t1 extends androidx.fragment.app.e {
    public final wn.f N0 = wn.g.b(wn.i.SYNCHRONIZED, new e(this, null, null));
    public final AutoClearedValue O0 = nd.a.a(this);
    public b P0;
    public static final /* synthetic */ qo.h<Object>[] R0 = {jo.f0.d(new jo.s(t1.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentQuizPopupBinding;", 0))};
    public static final a Q0 = new a(null);
    public static final int S0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final t1 a(String str) {
            jo.p.h(str, "shareText");
            t1 t1Var = new t1();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_SHARE_TEXT", str);
            t1Var.V2(bundle);
            return t1Var;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void C(String str);

        void y();
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b bVar = t1.this.P0;
            if (bVar != null) {
                bVar.y();
            }
            t1.this.m3();
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
            b bVar = t1.this.P0;
            if (bVar != null) {
                String string = t1.this.M2().getString("EXTRA_SHARE_TEXT");
                jo.p.e(string);
                bVar.C(string);
            }
            t1.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<nf.k> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18116w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18117x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18118y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18116w = componentCallbacks;
            this.f18117x = aVar;
            this.f18118y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.k, java.lang.Object] */
        @Override // io.a
        public final nf.k invoke() {
            ComponentCallbacks componentCallbacks = this.f18116w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.k.class), this.f18117x, this.f18118y);
        }
    }

    public final ae.a4 C3() {
        return (ae.a4) this.O0.b(this, R0[0]);
    }

    public final nf.k D3() {
        return (nf.k) this.N0.getValue();
    }

    public final void E3(ae.a4 a4Var) {
        this.O0.a(this, R0[0], a4Var);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.P0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), nd.b1.f41938n0, null, false);
        ae.a4 a4Var = (ae.a4) e10;
        a4Var.H.setText(m3.b.a(D3().s(), 0));
        a4Var.B.setText(D3().r());
        a4Var.D.setTitle(U0(nd.f1.R3));
        a4Var.E.setTitle(U0(nd.f1.text_invite));
        a4Var.I.setImageResource(nd.d1.f41957u);
        RoundedButtonView roundedButtonView = a4Var.D;
        jo.p.g(roundedButtonView, "optionButton1");
        yd.g1.a(roundedButtonView, new c());
        RoundedButtonView roundedButtonView2 = a4Var.E;
        jo.p.g(roundedButtonView2, "optionButton2");
        yd.g1.a(roundedButtonView2, new d());
        jo.p.g(e10, "inflate<DialogFragmentQu…)\n            }\n        }");
        E3(a4Var);
        Dialog dialog = new Dialog(N2(), 16973835);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setLayout(-2, -2);
        }
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setWindowAnimations(nd.g1.f42006e);
        }
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(false);
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        Fragment H0 = H0();
        this.P0 = H0 instanceof b ? (b) H0 : null;
    }
}
