package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class g1 extends ViewDataBinding {
    public final View B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final AppCompatButton F;
    public final ConstraintLayout G;

    public g1(Object obj, View view, int i10, View view2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, AppCompatButton appCompatButton, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatTextView;
        this.D = appCompatImageView;
        this.E = appCompatTextView2;
        this.F = appCompatButton;
        this.G = constraintLayout;
    }

    public static g1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static g1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (g1) ViewDataBinding.x(layoutInflater, xb.p.floating_add_moderator_result_dialog, viewGroup, z10, obj);
    }
}
