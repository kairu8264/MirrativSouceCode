package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class x4 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatButton C;

    public x4(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatButton;
    }

    public static x4 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static x4 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (x4) ViewDataBinding.x(layoutInflater, xb.p.view_floating_custom_message, viewGroup, z10, obj);
    }
}
