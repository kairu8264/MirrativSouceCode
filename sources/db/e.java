package db;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class e extends ViewDataBinding {
    public final FrameLayout B;
    public final ConstraintLayout C;

    public e(Object obj, View view, int i10, FrameLayout frameLayout, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.B = frameLayout;
        this.C = constraintLayout;
    }
}
