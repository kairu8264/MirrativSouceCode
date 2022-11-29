package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class ob extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final View D;
    public final AppCompatTextView E;
    public final AppCompatTextView F;
    public final Switch G;
    public final AppCompatTextView H;

    public ob(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, View view2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, Switch r92, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = view2;
        this.E = appCompatTextView;
        this.F = appCompatTextView2;
        this.G = r92;
        this.H = appCompatTextView3;
    }

    public static ob T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static ob U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ob) ViewDataBinding.x(layoutInflater, nd.b1.view_gift_overlay_setting, viewGroup, z10, obj);
    }
}
