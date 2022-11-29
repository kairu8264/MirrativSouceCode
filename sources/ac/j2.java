package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class j2 extends ViewDataBinding {
    public final FrameLayout B;

    public j2(Object obj, View view, int i10, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.B = frameLayout;
    }

    public static j2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static j2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (j2) ViewDataBinding.x(layoutInflater, xb.p.floating_tutorial_live_link_dialog, viewGroup, z10, obj);
    }
}
