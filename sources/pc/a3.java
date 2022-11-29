package pc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class a3 extends ViewDataBinding {
    public final View B;
    public final AppCompatTextView C;

    public a3(Object obj, View view, int i10, View view2, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = view2;
        this.C = appCompatTextView;
    }

    public static a3 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static a3 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (a3) ViewDataBinding.x(layoutInflater, nc.f.view_holder_bank_index, viewGroup, z10, obj);
    }
}
