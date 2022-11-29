package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.TriangleView;

/* loaded from: classes2.dex */
public abstract class ok extends ViewDataBinding {
    public final AppCompatImageView B;
    public final View C;
    public final ConstraintLayout D;
    public final View E;
    public final AppCompatTextView F;
    public final AppCompatImageView G;
    public final RecyclerView H;
    public final AppCompatTextView I;
    public final View J;
    public final TriangleView K;
    public final TriangleView L;

    public ok(Object obj, View view, int i10, AppCompatImageView appCompatImageView, View view2, ConstraintLayout constraintLayout, View view3, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, RecyclerView recyclerView, AppCompatTextView appCompatTextView2, View view4, TriangleView triangleView, TriangleView triangleView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = view2;
        this.D = constraintLayout;
        this.E = view3;
        this.F = appCompatTextView;
        this.G = appCompatImageView2;
        this.H = recyclerView;
        this.I = appCompatTextView2;
        this.J = view4;
        this.K = triangleView;
        this.L = triangleView2;
    }

    public static ok T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static ok U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (ok) ViewDataBinding.x(layoutInflater, nd.b1.view_live_prepare_balloon_live_request_num, viewGroup, z10, obj);
    }
}
