package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.OutlineTextView;

/* loaded from: classes2.dex */
public abstract class il extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;
    public final OutlineTextView D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public ud.m2 G;

    public il(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, OutlineTextView outlineTextView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
        this.D = outlineTextView;
        this.E = appCompatImageView2;
        this.F = appCompatTextView2;
    }

    public abstract void T(ud.m2 m2Var);
}
