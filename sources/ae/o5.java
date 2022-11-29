package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.PinCodeView;

/* loaded from: classes2.dex */
public abstract class o5 extends ViewDataBinding {
    public final AppCompatButton B;
    public final AppCompatTextView C;
    public final AppCompatImageView D;
    public final AppCompatButton E;
    public final PinCodeView F;
    public ud.m1 G;

    public o5(Object obj, View view, int i10, AppCompatButton appCompatButton, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatButton appCompatButton2, PinCodeView pinCodeView) {
        super(obj, view, i10);
        this.B = appCompatButton;
        this.C = appCompatTextView;
        this.D = appCompatImageView;
        this.E = appCompatButton2;
        this.F = pinCodeView;
    }

    public abstract void T(ud.m1 m1Var);
}
