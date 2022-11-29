package db;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public abstract class c extends ViewDataBinding {
    public final CoordinatorLayout B;
    public final StatusView C;

    public c(Object obj, View view, int i10, CoordinatorLayout coordinatorLayout, StatusView statusView) {
        super(obj, view, i10);
        this.B = coordinatorLayout;
        this.C = statusView;
    }
}
