package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public abstract class g extends ViewDataBinding {
    public final ConstraintLayout B;
    public final RecyclerView C;
    public final StatusView D;

    public g(Object obj, View view, int i10, ConstraintLayout constraintLayout, RecyclerView recyclerView, StatusView statusView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = recyclerView;
        this.D = statusView;
    }

    public static g T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static g U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (g) ViewDataBinding.x(layoutInflater, wa.f.bottom_sheet_dialog_fragment_campaign_detail, viewGroup, z10, obj);
    }
}
