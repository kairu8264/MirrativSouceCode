package ae;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class k9 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final EditText D;
    public final AppCompatTextView E;
    public jf.p F;

    public k9(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, EditText editText, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = editText;
        this.E = appCompatTextView;
    }

    public jf.p T() {
        return this.F;
    }

    public abstract void U(jf.p pVar);
}
