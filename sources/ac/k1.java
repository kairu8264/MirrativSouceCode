package ac;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class k1 extends ViewDataBinding {
    public final AppCompatButton B;
    public final RelativeLayout C;
    public final CheckBox D;
    public final AppCompatButton E;
    public final AppCompatTextView F;

    public k1(Object obj, View view, int i10, AppCompatButton appCompatButton, RelativeLayout relativeLayout, CheckBox checkBox, AppCompatButton appCompatButton2, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatButton;
        this.C = relativeLayout;
        this.D = checkBox;
        this.E = appCompatButton2;
        this.F = appCompatTextView;
    }

    public static k1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static k1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (k1) ViewDataBinding.x(layoutInflater, xb.p.floating_collab_reject_dialog, viewGroup, z10, obj);
    }
}
