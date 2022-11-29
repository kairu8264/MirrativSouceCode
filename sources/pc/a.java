package pc;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;

/* loaded from: classes2.dex */
public abstract class a extends ViewDataBinding {
    public final FragmentContainerView B;

    public a(Object obj, View view, int i10, FragmentContainerView fragmentContainerView) {
        super(obj, view, i10);
        this.B = fragmentContainerView;
    }
}
