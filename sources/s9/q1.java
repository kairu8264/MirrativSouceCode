package s9;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class q1 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final AppCompatTextView D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public final AppCompatImageView G;
    public ud.q H;

    public q1(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView3) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = appCompatTextView;
        this.E = appCompatImageView2;
        this.F = appCompatTextView2;
        this.G = appCompatImageView3;
    }

    public abstract void T(ud.q qVar);
}
