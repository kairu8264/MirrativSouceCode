package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class q0 extends ViewDataBinding {
    public final View B;
    public final AppCompatImageView C;
    public final RecyclerView D;
    public final AppCompatTextView E;
    public final View F;

    public q0(Object obj, View view, int i10, View view2, AppCompatImageView appCompatImageView, RecyclerView recyclerView, AppCompatTextView appCompatTextView, View view3) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatImageView;
        this.D = recyclerView;
        this.E = appCompatTextView;
        this.F = view3;
    }

    public static q0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static q0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (q0) ViewDataBinding.x(layoutInflater, r8.f1.view_holder_catalog_group_shot_list, viewGroup, z10, obj);
    }
}
