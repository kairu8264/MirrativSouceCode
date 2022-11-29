package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class f5 extends ViewDataBinding {
    public final CardView B;
    public final AppCompatTextView C;
    public final RoundedButtonView D;
    public final RoundedButtonView E;
    public final AppCompatImageView F;

    public f5(Object obj, View view, int i10, CardView cardView, AppCompatTextView appCompatTextView, RoundedButtonView roundedButtonView, RoundedButtonView roundedButtonView2, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = cardView;
        this.C = appCompatTextView;
        this.D = roundedButtonView;
        this.E = roundedButtonView2;
        this.F = appCompatImageView;
    }

    public static f5 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static f5 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (f5) ViewDataBinding.x(layoutInflater, xb.p.view_floating_yes_no_with_image, viewGroup, z10, obj);
    }
}
