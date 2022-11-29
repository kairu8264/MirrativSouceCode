package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class v2 extends ViewDataBinding {
    public final View B;

    public v2(Object obj, View view, int i10, View view2) {
        super(obj, view, i10);
        this.B = view2;
    }

    public static v2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static v2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (v2) ViewDataBinding.x(layoutInflater, nd.b1.dialog_fragment_emomo_shutter_effect, viewGroup, z10, obj);
    }
}
