package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class f3 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final RecyclerView C;
    public final ConstraintLayout D;

    public f3(Object obj, View view, int i10, AppCompatImageView appCompatImageView, RecyclerView recyclerView, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = recyclerView;
        this.D = constraintLayout;
    }

    public static f3 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static f3 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (f3) ViewDataBinding.x(layoutInflater, nd.b1.dialog_fragment_gift_item_detail, viewGroup, z10, obj);
    }
}
