package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class b2 extends ViewDataBinding {
    public final RoundedButtonView B;
    public final AppCompatTextView C;
    public final RoundedButtonView D;
    public final AppCompatTextView E;

    public b2(Object obj, View view, int i10, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView, RoundedButtonView roundedButtonView2, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = roundedButtonView;
        this.C = appCompatTextView;
        this.D = roundedButtonView2;
        this.E = appCompatTextView2;
    }

    public static b2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static b2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (b2) ViewDataBinding.x(layoutInflater, nd.b1.dialog_fragment_confirm_override, viewGroup, z10, obj);
    }
}
