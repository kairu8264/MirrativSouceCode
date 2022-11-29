package pc;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.RoundedMultipleImagesView;

/* loaded from: classes2.dex */
public abstract class c3 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final RoundedMultipleImagesView E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public uc.b H;

    public c3(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, RoundedMultipleImagesView roundedMultipleImagesView, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
        this.D = appCompatTextView3;
        this.E = roundedMultipleImagesView;
        this.F = appCompatTextView4;
        this.G = appCompatTextView5;
    }

    public abstract void T(uc.b bVar);
}
