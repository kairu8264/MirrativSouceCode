package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes.dex */
public abstract class u extends ViewDataBinding {
    public final CoordinatorLayout B;
    public final ConstraintLayout C;
    public final StatusView D;
    public final RecyclerView E;
    public final AppCompatImageView F;

    public u(Object obj, View view, int i10, CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, StatusView statusView, RecyclerView recyclerView, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = coordinatorLayout;
        this.C = constraintLayout;
        this.D = statusView;
        this.E = recyclerView;
        this.F = appCompatImageView;
    }

    public static u T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static u U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (u) ViewDataBinding.x(layoutInflater, r8.f1.fragment_mission_tab, viewGroup, z10, obj);
    }
}
