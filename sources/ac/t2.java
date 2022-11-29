package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class t2 extends ViewDataBinding {
    public final RecyclerView B;

    public t2(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = recyclerView;
    }

    public static t2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static t2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (t2) ViewDataBinding.x(layoutInflater, xb.p.fragment_emokara_popular_tab, viewGroup, z10, obj);
    }
}
