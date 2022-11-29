package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.TopToastMessageView;

/* loaded from: classes2.dex */
public abstract class i1 extends ViewDataBinding {
    public final TopToastMessageView B;

    public i1(Object obj, View view, int i10, TopToastMessageView topToastMessageView) {
        super(obj, view, i10);
        this.B = topToastMessageView;
    }

    public static i1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static i1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (i1) ViewDataBinding.x(layoutInflater, xb.p.floating_collab_connected_message, viewGroup, z10, obj);
    }
}
