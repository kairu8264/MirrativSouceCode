package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.YellRankIconView;
import com.google.android.flexbox.FlexboxLayout;

/* loaded from: classes2.dex */
public abstract class l5 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public final FlexboxLayout E;
    public final LinearLayout F;
    public final AppCompatTextView G;
    public final AppCompatTextView H;
    public final AppCompatImageView I;
    public final AppCompatImageView J;
    public final AppCompatTextView K;
    public final YellRankIconView L;

    public l5(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, FlexboxLayout flexboxLayout, LinearLayout linearLayout, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatTextView appCompatTextView4, YellRankIconView yellRankIconView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
        this.D = appCompatImageView2;
        this.E = flexboxLayout;
        this.F = linearLayout;
        this.G = appCompatTextView2;
        this.H = appCompatTextView3;
        this.I = appCompatImageView3;
        this.J = appCompatImageView4;
        this.K = appCompatTextView4;
        this.L = yellRankIconView;
    }

    public static l5 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static l5 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (l5) ViewDataBinding.x(layoutInflater, xb.p.view_holder_broadcast_user, viewGroup, z10, obj);
    }
}
