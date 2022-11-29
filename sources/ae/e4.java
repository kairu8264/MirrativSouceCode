package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class e4 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public final AppCompatButton E;
    public final AppCompatTextView F;
    public final ConstraintLayout G;
    public final AppCompatButton H;
    public final Space I;
    public final AppCompatTextView J;

    public e4(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, AppCompatButton appCompatButton, AppCompatTextView appCompatTextView3, ConstraintLayout constraintLayout, AppCompatButton appCompatButton2, Space space, AppCompatTextView appCompatTextView4) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
        this.D = appCompatImageView;
        this.E = appCompatButton;
        this.F = appCompatTextView3;
        this.G = constraintLayout;
        this.H = appCompatButton2;
        this.I = space;
        this.J = appCompatTextView4;
    }

    public static e4 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static e4 U(View view, Object obj) {
        return (e4) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_request_usage_stats_permission);
    }
}
