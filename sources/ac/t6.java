package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class t6 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public hc.y G;

    public t6(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatImageView;
        this.D = appCompatImageView2;
        this.E = appCompatImageView3;
        this.F = appCompatTextView;
    }

    public static t6 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static t6 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (t6) ViewDataBinding.x(layoutInflater, xb.p.view_holder_group_shot_member, viewGroup, z10, obj);
    }

    public abstract void V(hc.y yVar);
}
