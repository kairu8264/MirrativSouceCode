package ea;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import da.g;

/* loaded from: classes.dex */
public abstract class a extends ViewDataBinding {
    public final AppCompatTextView B;

    public a(Object obj, View view, int i10, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatTextView;
    }

    public static a T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, f.d());
    }

    @Deprecated
    public static a U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (a) ViewDataBinding.x(layoutInflater, g.view_float_toast, viewGroup, z10, obj);
    }
}
