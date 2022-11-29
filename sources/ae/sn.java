package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class sn extends ViewDataBinding {
    public final AppCompatTextView B;
    public final ConstraintLayout C;
    public final AppCompatImageView D;

    public sn(Object obj, View view, int i10, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = constraintLayout;
        this.D = appCompatImageView;
    }

    public static sn T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static sn U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (sn) ViewDataBinding.x(layoutInflater, nd.b1.view_yell_rank_icon, viewGroup, z10, obj);
    }
}
