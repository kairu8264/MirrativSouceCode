package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class q9 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;

    public q9(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
    }

    public static q9 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static q9 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (q9) ViewDataBinding.x(layoutInflater, nd.b1.view_emomo_pose, viewGroup, z10, obj);
    }
}
