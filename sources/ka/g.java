package ka;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import ja.m;

/* loaded from: classes.dex */
public abstract class g extends ViewDataBinding {
    public final FragmentContainerView B;
    public final View C;
    public final ConstraintLayout D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public final Toolbar G;

    public g(Object obj, View view, int i10, FragmentContainerView fragmentContainerView, View view2, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, Toolbar toolbar) {
        super(obj, view, i10);
        this.B = fragmentContainerView;
        this.C = view2;
        this.D = constraintLayout;
        this.E = appCompatImageView;
        this.F = appCompatTextView;
        this.G = toolbar;
    }

    public static g T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static g U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (g) ViewDataBinding.x(layoutInflater, m.fragment_live_game, viewGroup, z10, obj);
    }
}
