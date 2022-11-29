package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class o9 extends ViewDataBinding {
    public final View B;
    public final AppCompatImageView C;
    public final View D;
    public final AppCompatTextView E;

    public o9(Object obj, View view, int i10, View view2, AppCompatImageView appCompatImageView, View view3, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatImageView;
        this.D = view3;
        this.E = appCompatTextView;
    }

    public static o9 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static o9 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (o9) ViewDataBinding.x(layoutInflater, nd.b1.view_emomo_pose_and_title, viewGroup, z10, obj);
    }
}
