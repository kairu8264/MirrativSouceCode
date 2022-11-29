package kb;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.NextLiveView;

/* loaded from: classes2.dex */
public abstract class j extends ViewDataBinding {
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final NextLiveView D;
    public final NextLiveView E;
    public final StatusView F;
    public final AppCompatTextView G;

    public j(Object obj, View view, int i10, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, NextLiveView nextLiveView, NextLiveView nextLiveView2, StatusView statusView, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = nextLiveView;
        this.E = nextLiveView2;
        this.F = statusView;
        this.G = appCompatTextView;
    }
}
