package be;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import com.dena.mirrorman.AutoClearedValue;

/* loaded from: classes2.dex */
public final class r1 extends androidx.fragment.app.e {
    public ViewTreeObserver.OnGlobalLayoutListener O0;
    public s1 P0;
    public static final /* synthetic */ qo.h<Object>[] S0 = {jo.f0.d(new jo.s(r1.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentEmomoShutterEffectBinding;", 0))};
    public static final a R0 = new a(null);
    public static final int T0 = 8;
    public final wn.f N0 = wn.g.a(new b());
    public final AutoClearedValue Q0 = nd.a.a(this);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ r1 b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "";
            }
            return aVar.a(str);
        }

        public final r1 a(String str) {
            jo.p.h(str, "key");
            r1 r1Var = new r1();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_KEY", str);
            r1Var.V2(bundle);
            return r1Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            r1.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = r1.this.M2().getString("EXTRA_KEY_KEY");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements Animation.AnimationListener {
        public c() {
            r1.this = r1;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            s1 s1Var = r1.this.P0;
            if (s1Var != null) {
                String F3 = r1.this.F3();
                jo.p.g(F3, "key");
                s1Var.G0(F3);
            }
            r1.this.m3();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public static final void G3(ae.v2 v2Var, r1 r1Var) {
        jo.p.h(v2Var, "$this_apply");
        jo.p.h(r1Var, "this$0");
        v2Var.B.getViewTreeObserver().removeOnGlobalLayoutListener(r1Var.O0);
        View view = v2Var.B;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new c());
        view.setAnimation(alphaAnimation);
    }

    public final ae.v2 E3() {
        return (ae.v2) this.Q0.b(this, S0[0]);
    }

    public final String F3() {
        return (String) this.N0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void H1() {
        E3().B.getViewTreeObserver().removeOnGlobalLayoutListener(this.O0);
        super.H1();
    }

    public final void H3(ae.v2 v2Var) {
        this.Q0.a(this, S0[0], v2Var);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.P0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        w3(false);
        final ae.v2 T = ae.v2.T(LayoutInflater.from(q0()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        this.O0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: be.q1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                r1.G3(ae.v2.this, this);
            }
        };
        T.B.getViewTreeObserver().addOnGlobalLayoutListener(this.O0);
        H3(T);
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(E3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.P0 = context instanceof s1 ? (s1) context : null;
    }
}
