package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class ol extends ViewDataBinding {
    public final View B;
    public final View C;
    public final View D;
    public final ConstraintLayout E;
    public final AppCompatImageView F;
    public final AppCompatTextView G;
    public final AppCompatImageView H;
    public final ConstraintLayout I;
    public final AppCompatTextView J;
    public final AppCompatTextView K;
    public final AppCompatTextView L;
    public final ConstraintLayout M;
    public final AppCompatTextView N;
    public final AppCompatImageView O;
    public final AppCompatTextView P;
    public final AppCompatImageView Q;

    public ol(Object obj, View view, int i10, View view2, View view3, View view4, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, ConstraintLayout constraintLayout3, AppCompatTextView appCompatTextView5, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView6, AppCompatImageView appCompatImageView4) {
        super(obj, view, i10);
        this.B = view2;
        this.C = view3;
        this.D = view4;
        this.E = constraintLayout;
        this.F = appCompatImageView;
        this.G = appCompatTextView;
        this.H = appCompatImageView2;
        this.I = constraintLayout2;
        this.J = appCompatTextView2;
        this.K = appCompatTextView3;
        this.L = appCompatTextView4;
        this.M = constraintLayout3;
        this.N = appCompatTextView5;
        this.O = appCompatImageView3;
        this.P = appCompatTextView6;
        this.Q = appCompatImageView4;
    }

    public static ol T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static ol U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ol) ViewDataBinding.x(layoutInflater, nd.b1.view_notification_guard_broadcast, viewGroup, z10, obj);
    }
}
