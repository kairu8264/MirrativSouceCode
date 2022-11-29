package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class h1 extends ViewDataBinding {
    public final RoundedButtonView B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;

    public h1(Object obj, View view, int i10, RoundedButtonView roundedButtonView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = roundedButtonView;
        this.C = appCompatImageView;
        this.D = appCompatTextView;
    }

    public static h1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static h1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (h1) ViewDataBinding.x(layoutInflater, nd.b1.dialog_fragment_avatar_parts_purchase_result, viewGroup, z10, obj);
    }
}
