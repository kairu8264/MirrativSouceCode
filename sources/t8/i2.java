package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class i2 extends ViewDataBinding {
    public final View B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final AppCompatButton E;
    public final ConstraintLayout F;
    public final ProgressBar G;
    public final AppCompatTextView H;
    public final AppCompatTextView I;
    public final AppCompatImageView J;
    public final AppCompatTextView K;
    public final AppCompatImageView L;

    public i2(Object obj, View view, int i10, View view2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton, ConstraintLayout constraintLayout, ProgressBar progressBar, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView4, AppCompatImageView appCompatImageView3) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatImageView;
        this.D = appCompatTextView;
        this.E = appCompatButton;
        this.F = constraintLayout;
        this.G = progressBar;
        this.H = appCompatTextView2;
        this.I = appCompatTextView3;
        this.J = appCompatImageView2;
        this.K = appCompatTextView4;
        this.L = appCompatImageView3;
    }

    public static i2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static i2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (i2) ViewDataBinding.x(layoutInflater, r8.f1.view_mission_item, viewGroup, z10, obj);
    }
}
