package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.TriangleView;

/* loaded from: classes2.dex */
public abstract class mn extends ViewDataBinding {
    public final View B;
    public final View C;
    public final AppCompatTextView D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public final TriangleView G;
    public final TriangleView H;

    public mn(Object obj, View view, int i10, View view2, View view3, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, TriangleView triangleView, TriangleView triangleView2) {
        super(obj, view, i10);
        this.B = view2;
        this.C = view3;
        this.D = appCompatTextView;
        this.E = appCompatImageView;
        this.F = appCompatTextView2;
        this.G = triangleView;
        this.H = triangleView2;
    }

    public static mn T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static mn U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (mn) ViewDataBinding.x(layoutInflater, nd.b1.view_user_profile_anniversary_follow_balloon, viewGroup, z10, obj);
    }
}
