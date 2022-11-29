package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class d2 extends ViewDataBinding {
    public final RoundedButtonView B;
    public final RoundedButtonView C;
    public final AppCompatTextView D;

    public d2(Object obj, View view, int i10, RoundedButtonView roundedButtonView, RoundedButtonView roundedButtonView2, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = roundedButtonView;
        this.C = roundedButtonView2;
        this.D = appCompatTextView;
    }

    public static d2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static d2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (d2) ViewDataBinding.x(layoutInflater, nd.b1.dialog_fragment_confirm_overwrite, viewGroup, z10, obj);
    }
}
