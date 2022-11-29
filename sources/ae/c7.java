package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class c7 extends ViewDataBinding {
    public final ConstraintLayout B;
    public final AppCompatButton C;
    public final AppCompatTextView D;
    public final Toolbar E;
    public final AppCompatTextView F;
    public final AppCompatImageView G;

    public c7(Object obj, View view, int i10, ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AppCompatTextView appCompatTextView, Toolbar toolbar, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = constraintLayout;
        this.C = appCompatButton;
        this.D = appCompatTextView;
        this.E = toolbar;
        this.F = appCompatTextView2;
        this.G = appCompatImageView;
    }

    public static c7 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static c7 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (c7) ViewDataBinding.x(layoutInflater, nd.b1.fragment_register_or_login_with_twitter, viewGroup, z10, obj);
    }
}
