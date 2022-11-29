package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class z4 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatButton C;
    public final AppCompatTextView D;
    public final AppCompatButton E;

    public z4(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton, AppCompatTextView appCompatTextView2, AppCompatButton appCompatButton2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatButton;
        this.D = appCompatTextView2;
        this.E = appCompatButton2;
    }

    public static z4 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static z4 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (z4) ViewDataBinding.x(layoutInflater, xb.p.view_floating_custom_yes_no, viewGroup, z10, obj);
    }
}
