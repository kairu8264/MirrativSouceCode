package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.TopToastMessageView;

/* loaded from: classes2.dex */
public abstract class h2 extends ViewDataBinding {
    public final TopToastMessageView B;
    public final RelativeLayout C;

    public h2(Object obj, View view, int i10, TopToastMessageView topToastMessageView, RelativeLayout relativeLayout) {
        super(obj, view, i10);
        this.B = topToastMessageView;
        this.C = relativeLayout;
    }

    public static h2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static h2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (h2) ViewDataBinding.x(layoutInflater, xb.p.floating_top_toast_message, viewGroup, z10, obj);
    }
}
