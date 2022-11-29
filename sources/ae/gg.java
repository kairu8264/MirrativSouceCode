package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class gg extends ViewDataBinding {
    public final View B;

    public gg(Object obj, View view, int i10, View view2) {
        super(obj, view, i10);
        this.B = view2;
    }

    public static gg T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static gg U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (gg) ViewDataBinding.x(layoutInflater, nd.b1.view_holder_live_gift_cheer_user_divider, viewGroup, z10, obj);
    }
}
