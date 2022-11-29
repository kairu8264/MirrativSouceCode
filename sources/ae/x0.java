package ae;

import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class x0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final AppCompatImageView D;
    public final ScrollView E;

    public x0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2, ScrollView scrollView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = appCompatImageView2;
        this.E = scrollView;
    }
}
