package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.PinCodeView;

/* loaded from: classes2.dex */
public abstract class s5 extends ViewDataBinding {
    public final AppCompatButton B;
    public final AppCompatTextView C;
    public final AppCompatButton D;
    public final PinCodeView E;
    public final AppCompatTextView F;
    public ud.l1 G;

    public s5(Object obj, View view, int i10, AppCompatButton appCompatButton, AppCompatTextView appCompatTextView, AppCompatButton appCompatButton2, PinCodeView pinCodeView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = appCompatButton;
        this.C = appCompatTextView;
        this.D = appCompatButton2;
        this.E = pinCodeView;
        this.F = appCompatTextView2;
    }

    public abstract void T(ud.l1 l1Var);
}
