package sa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.widget.MultiSwipeRefreshLayout;

/* loaded from: classes2.dex */
public abstract class k extends ViewDataBinding {
    public final MultiSwipeRefreshLayout B;
    public final RecyclerView C;
    public final StatusView D;

    public k(Object obj, View view, int i10, MultiSwipeRefreshLayout multiSwipeRefreshLayout, RecyclerView recyclerView, StatusView statusView) {
        super(obj, view, i10);
        this.B = multiSwipeRefreshLayout;
        this.C = recyclerView;
        this.D = statusView;
    }

    public static k T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static k U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (k) ViewDataBinding.x(layoutInflater, qa.p.fragment_notice_your, viewGroup, z10, obj);
    }
}
