package pc;

import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;

/* loaded from: classes2.dex */
public abstract class c0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final FragmentContainerView D;
    public final AppCompatTextView E;

    public c0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = fragmentContainerView;
        this.E = appCompatTextView;
    }

    public static c0 T(LayoutInflater layoutInflater) {
        return U(layoutInflater, androidx.databinding.f.d());
    }

    @Deprecated
    public static c0 U(LayoutInflater layoutInflater, Object obj) {
        return (c0) ViewDataBinding.x(layoutInflater, nc.f.bottom_sheet_dialog_fragment_cheers, null, false, obj);
    }
}
