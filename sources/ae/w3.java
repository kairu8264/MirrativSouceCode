package ae;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class w3 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final AppCompatButton D;
    public final RelativeLayout E;
    public final AppCompatImageView F;
    public final AppCompatTextView G;

    public w3(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatButton appCompatButton, RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
        this.D = appCompatButton;
        this.E = relativeLayout;
        this.F = appCompatImageView;
        this.G = appCompatTextView3;
    }

    public static w3 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static w3 U(View view, Object obj) {
        return (w3) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_overlay_permission_setting);
    }
}
