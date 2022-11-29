package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* renamed from: ae.if  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class Cif extends ViewDataBinding {
    public final Guideline B;
    public final Guideline C;
    public final Guideline D;
    public final Guideline E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public ud.s0 H;

    public Cif(Object obj, View view, int i10, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = guideline;
        this.C = guideline2;
        this.D = guideline3;
        this.E = guideline4;
        this.F = appCompatTextView;
        this.G = appCompatTextView2;
    }

    public abstract void T(ud.s0 s0Var);
}
