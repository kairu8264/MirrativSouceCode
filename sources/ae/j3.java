package ae;

import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class j3 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ScrollView C;
    public final AppCompatImageView D;
    public final ConstraintLayout E;

    public j3(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ScrollView scrollView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = scrollView;
        this.D = appCompatImageView2;
        this.E = constraintLayout;
    }

    public static j3 T(View view) {
        return U(view, androidx.databinding.f.d());
    }

    @Deprecated
    public static j3 U(View view, Object obj) {
        return (j3) ViewDataBinding.j(obj, view, nd.b1.dialog_fragment_help_image_popup);
    }
}
