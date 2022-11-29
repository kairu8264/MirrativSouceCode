package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class g4 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatButton C;
    public final AppCompatTextView D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final AppCompatImageView H;
    public final Space I;

    public g4(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView2, Space space) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatButton;
        this.D = appCompatTextView;
        this.E = appCompatImageView;
        this.F = appCompatTextView2;
        this.G = appCompatTextView3;
        this.H = appCompatImageView2;
        this.I = space;
    }

    public static g4 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static g4 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (g4) ViewDataBinding.x(layoutInflater, nd.b1.dialog_fragment_reward_post_result, viewGroup, z10, obj);
    }
}
