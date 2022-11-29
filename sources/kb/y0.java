package kb;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.MyAppView;
import ud.c2;

/* loaded from: classes2.dex */
public abstract class y0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final MyAppView E;
    public c2 F;

    public y0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, MyAppView myAppView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
        this.E = myAppView;
    }

    public abstract void T(c2 c2Var);
}
