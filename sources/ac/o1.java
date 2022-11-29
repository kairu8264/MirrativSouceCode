package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class o1 extends ViewDataBinding {
    public final ae.t0 B;
    public final LinearLayout C;

    public o1(Object obj, View view, int i10, ae.t0 t0Var, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.B = t0Var;
        this.C = linearLayout;
    }

    public static o1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static o1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (o1) ViewDataBinding.x(layoutInflater, xb.p.floating_confirm_moderator_dialog, viewGroup, z10, obj);
    }
}
