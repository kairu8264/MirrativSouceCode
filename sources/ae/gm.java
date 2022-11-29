package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes2.dex */
public abstract class gm extends ViewDataBinding {
    public final MaterialCardView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public ud.g3 E;

    public gm(Object obj, View view, int i10, MaterialCardView materialCardView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = materialCardView;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
    }

    public abstract void T(ud.g3 g3Var);
}
