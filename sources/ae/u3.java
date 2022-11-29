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
public abstract class u3 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final AppCompatButton E;
    public final AppCompatImageView F;
    public final AppCompatTextView G;
    public final AppCompatImageView H;
    public final Space I;
    public final AppCompatTextView J;

    public u3(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView4, Space space, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = constraintLayout;
        this.E = appCompatButton;
        this.F = appCompatImageView3;
        this.G = appCompatTextView;
        this.H = appCompatImageView4;
        this.I = space;
        this.J = appCompatTextView2;
    }

    public static u3 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static u3 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (u3) ViewDataBinding.x(layoutInflater, nd.b1.dialog_fragment_mission_achievement, viewGroup, z10, obj);
    }
}
