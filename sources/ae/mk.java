package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class mk extends ViewDataBinding {
    public final AppCompatImageView B;

    public mk(Object obj, View view, int i10, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
    }

    public static mk T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static mk U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (mk) ViewDataBinding.x(layoutInflater, nd.b1.view_live_prepare_balloon_encourage_live_popup, viewGroup, z10, obj);
    }
}
