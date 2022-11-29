package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class x1 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final AppCompatImageView F;
    public final AppCompatTextView G;
    public final AppCompatImageView H;
    public final AppCompatTextView I;

    public x1(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = appCompatImageView2;
        this.E = appCompatTextView;
        this.F = appCompatImageView3;
        this.G = appCompatTextView2;
        this.H = appCompatImageView4;
        this.I = appCompatTextView3;
    }

    public static x1 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static x1 U(View view, Object obj) {
        return (x1) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_collab_start);
    }
}
