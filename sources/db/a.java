package db;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public abstract class a extends ViewDataBinding {
    public final ConstraintLayout B;

    public a(Object obj, View view, int i10, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.B = constraintLayout;
    }
}
