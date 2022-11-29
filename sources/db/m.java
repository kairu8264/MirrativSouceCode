package db;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class m extends ViewDataBinding {
    public final AppCompatTextView B;
    public final TextureView C;
    public final AppCompatTextView D;
    public final AppCompatTextView E;
    public final AppCompatButton F;
    public final ConstraintLayout G;

    public m(Object obj, View view, int i10, AppCompatTextView appCompatTextView, TextureView textureView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatButton appCompatButton, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = textureView;
        this.D = appCompatTextView2;
        this.E = appCompatTextView3;
        this.F = appCompatButton;
        this.G = constraintLayout;
    }

    public static m T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static m U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (m) ViewDataBinding.x(layoutInflater, wa.f.fragment_make_emomo_onboarding, viewGroup, z10, obj);
    }
}
