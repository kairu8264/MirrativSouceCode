package s9;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class m1 extends ViewDataBinding {
    public final Space B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final View E;

    public m1(Object obj, View view, int i10, Space space, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, View view2) {
        super(obj, view, i10);
        this.B = space;
        this.C = appCompatImageView;
        this.D = appCompatTextView;
        this.E = view2;
    }
}
