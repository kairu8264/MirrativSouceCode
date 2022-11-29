package be;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import sf.i;

/* loaded from: classes2.dex */
public final class e4 extends androidx.fragment.app.e implements uo.q0 {
    public static final a Q0 = new a(null);
    public static final int R0 = 8;
    public final /* synthetic */ da.j N0;
    public f4 O0;
    public f4 P0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e4 a() {
            return new e4();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements sf.i {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f4 f4Var = e4.this.O0;
            if (f4Var != null) {
                f4Var.a2();
            }
            f4 f4Var2 = e4.this.P0;
            if (f4Var2 != null) {
                f4Var2.a2();
            }
            e4.this.n3();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            i.a.c(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.a.d(this, animator);
        }
    }

    public e4() {
        super(nd.b1.dialog_fragment_shooter_loading);
        this.N0 = new da.j();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        this.O0 = null;
        this.P0 = null;
        uo.r0.d(this, null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        ae.o4 T = ae.o4.T(view);
        T.B.setVisibility(0);
        T.B.setAnimation("ebd_matching_fix/ebd_matching_fix.json");
        T.B.setImageAssetsFolder("ebd_matching_fix/images");
        T.B.e(new b());
        T.B.r();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), nd.g1.f42010i);
        w3(false);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(nd.w0.Q0);
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
        this.O0 = context instanceof f4 ? (f4) context : null;
        Fragment H0 = H0();
        this.P0 = H0 instanceof f4 ? (f4) H0 : null;
    }
}
