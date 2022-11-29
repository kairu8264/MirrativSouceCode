package ac;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.PageControl;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class i0 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final PageControl C;
    public final RecyclerView D;
    public final StatusView E;
    public final AppCompatTextView F;
    public final RoundedButtonView G;
    public final RoundedButtonView H;

    public i0(Object obj, View view, int i10, AppCompatImageView appCompatImageView, PageControl pageControl, RecyclerView recyclerView, StatusView statusView, AppCompatTextView appCompatTextView, RoundedButtonView roundedButtonView, RoundedButtonView roundedButtonView2) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = pageControl;
        this.D = recyclerView;
        this.E = statusView;
        this.F = appCompatTextView;
        this.G = roundedButtonView;
        this.H = roundedButtonView2;
    }
}
