package pc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class q0 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final AppCompatImageView E;

    public q0(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
        this.E = appCompatImageView;
    }

    public static q0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static q0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (q0) ViewDataBinding.x(layoutInflater, nc.f.dialog_fragment_emomo_permission, viewGroup, z10, obj);
    }
}
