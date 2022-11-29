package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.catalog.home.app.AppsMyAppButton;

/* loaded from: classes.dex */
public abstract class i0 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final RecyclerView C;
    public final ConstraintLayout D;
    public final AppCompatTextView E;
    public final ConstraintLayout F;
    public final AppCompatTextView G;
    public final AppsMyAppButton H;
    public final ConstraintLayout I;
    public final ConstraintLayout J;
    public final AppCompatTextView K;
    public final ConstraintLayout L;
    public final AppCompatTextView M;

    public i0(Object obj, View view, int i10, ConstraintLayout constraintLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout3, AppCompatTextView appCompatTextView2, AppsMyAppButton appsMyAppButton, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, AppCompatTextView appCompatTextView3, ConstraintLayout constraintLayout6, AppCompatTextView appCompatTextView4) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = recyclerView;
        this.D = constraintLayout2;
        this.E = appCompatTextView;
        this.F = constraintLayout3;
        this.G = appCompatTextView2;
        this.H = appsMyAppButton;
        this.I = constraintLayout4;
        this.J = constraintLayout5;
        this.K = appCompatTextView3;
        this.L = constraintLayout6;
        this.M = appCompatTextView4;
    }

    public static i0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static i0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (i0) ViewDataBinding.x(layoutInflater, r8.f1.view_apps, viewGroup, z10, obj);
    }
}
