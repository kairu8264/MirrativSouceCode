package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.AutoLinkTextView;

/* loaded from: classes2.dex */
public abstract class m0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final ConstraintLayout C;
    public final AutoLinkTextView D;
    public final AppCompatImageView E;
    public final AppCompatImageView F;
    public final AppCompatTextView G;

    public m0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AutoLinkTextView autoLinkTextView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = constraintLayout;
        this.D = autoLinkTextView;
        this.E = appCompatImageView2;
        this.F = appCompatImageView3;
        this.G = appCompatTextView;
    }
}
