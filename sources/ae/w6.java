package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public abstract class w6 extends ViewDataBinding {
    public final View B;
    public final View C;
    public final RecyclerView D;
    public final StatusView E;

    public w6(Object obj, View view, int i10, View view2, View view3, RecyclerView recyclerView, StatusView statusView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = view3;
        this.D = recyclerView;
        this.E = statusView;
    }

    public static w6 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static w6 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (w6) ViewDataBinding.x(layoutInflater, nd.b1.fragment_live_gift_ranking_users, viewGroup, z10, obj);
    }
}
