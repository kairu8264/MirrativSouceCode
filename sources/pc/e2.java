package pc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class e2 extends ViewDataBinding {
    public final RecyclerView B;

    public e2(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.B = recyclerView;
    }

    public static e2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static e2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (e2) ViewDataBinding.x(layoutInflater, nc.f.fragment_live_histories, viewGroup, z10, obj);
    }
}
