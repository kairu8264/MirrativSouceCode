package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.OutlineTextView;

/* loaded from: classes2.dex */
public abstract class i8 extends ViewDataBinding {
    public final OutlineTextView B;
    public final AppCompatImageView C;
    public final OutlineTextView D;
    public final AppCompatTextView E;
    public final AppCompatImageView F;
    public final ConstraintLayout G;
    public final OutlineTextView H;
    public final OutlineTextView I;

    public i8(Object obj, View view, int i10, OutlineTextView outlineTextView, AppCompatImageView appCompatImageView, OutlineTextView outlineTextView2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, OutlineTextView outlineTextView3, OutlineTextView outlineTextView4) {
        super(obj, view, i10);
        this.B = outlineTextView;
        this.C = appCompatImageView;
        this.D = outlineTextView2;
        this.E = appCompatTextView;
        this.F = appCompatImageView2;
        this.G = constraintLayout;
        this.H = outlineTextView3;
        this.I = outlineTextView4;
    }
}
