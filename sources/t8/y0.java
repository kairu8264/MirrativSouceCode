package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.FollowButtonView;

/* loaded from: classes.dex */
public abstract class y0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final FollowButtonView C;
    public final AppCompatTextView D;
    public final LinearLayout E;
    public final AppCompatTextView F;

    public y0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, FollowButtonView followButtonView, AppCompatTextView appCompatTextView, LinearLayout linearLayout, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = followButtonView;
        this.D = appCompatTextView;
        this.E = linearLayout;
        this.F = appCompatTextView2;
    }

    public static y0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static y0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (y0) ViewDataBinding.x(layoutInflater, r8.f1.view_holder_catalog_mirrativ_q, viewGroup, z10, obj);
    }
}
