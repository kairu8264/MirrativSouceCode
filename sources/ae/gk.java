package ae;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class gk extends ViewDataBinding {
    public final AppCompatImageView B;
    public final LinearLayout C;
    public final AppCompatImageView D;
    public final AppCompatTextView E;
    public final AppCompatImageView F;
    public final AppCompatTextView G;

    public gk(Object obj, View view, int i10, AppCompatImageView appCompatImageView, LinearLayout linearLayout, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = linearLayout;
        this.D = appCompatImageView2;
        this.E = appCompatTextView;
        this.F = appCompatImageView3;
        this.G = appCompatTextView2;
    }
}
