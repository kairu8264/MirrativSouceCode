package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class d5 extends ViewDataBinding {
    public final ProgressBar B;

    public d5(Object obj, View view, int i10, ProgressBar progressBar) {
        super(obj, view, i10);
        this.B = progressBar;
    }

    public static d5 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static d5 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (d5) ViewDataBinding.x(layoutInflater, xb.p.view_floating_loading, viewGroup, z10, obj);
    }
}
