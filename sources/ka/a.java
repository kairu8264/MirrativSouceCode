package ka;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;

/* loaded from: classes.dex */
public abstract class a extends ViewDataBinding {
    public final AppCompatImageView B;
    public final FragmentContainerView C;
    public final AppCompatTextView D;
    public final Toolbar E;

    public a(Object obj, View view, int i10, AppCompatImageView appCompatImageView, FragmentContainerView fragmentContainerView, AppCompatTextView appCompatTextView, Toolbar toolbar) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = fragmentContainerView;
        this.D = appCompatTextView;
        this.E = toolbar;
    }
}
