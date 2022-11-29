package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.PageControl;

/* loaded from: classes2.dex */
public abstract class w8 extends ViewDataBinding {
    public final PageControl B;
    public final RecyclerView C;

    public w8(Object obj, View view, int i10, PageControl pageControl, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = pageControl;
        this.C = recyclerView;
    }

    public static w8 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static w8 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (w8) ViewDataBinding.x(layoutInflater, nd.b1.view_carousel, viewGroup, z10, obj);
    }
}
