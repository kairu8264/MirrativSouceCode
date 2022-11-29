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
public abstract class e1 extends ViewDataBinding {
    public final AppCompatButton B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final AppCompatButton E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final AppCompatImageView H;
    public final AppCompatTextView I;

    public e1(Object obj, View view, int i10, AppCompatButton appCompatButton, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AppCompatButton appCompatButton2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatButton;
        this.C = appCompatImageView;
        this.D = constraintLayout;
        this.E = appCompatButton2;
        this.F = appCompatTextView;
        this.G = appCompatTextView2;
        this.H = appCompatImageView2;
        this.I = appCompatTextView3;
    }

    public static e1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static e1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (e1) ViewDataBinding.x(layoutInflater, xb.p.dialog_fragment_stop_screen_share, viewGroup, z10, obj);
    }
}
