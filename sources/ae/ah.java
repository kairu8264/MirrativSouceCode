package ae;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.LiveAnnounceAppView;

/* loaded from: classes2.dex */
public abstract class ah extends ViewDataBinding {
    public final LiveAnnounceAppView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public final AppCompatImageView G;
    public final LinearLayout H;
    public ud.n2 I;

    public ah(Object obj, View view, int i10, LiveAnnounceAppView liveAnnounceAppView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView2, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.B = liveAnnounceAppView;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
        this.E = appCompatImageView;
        this.F = appCompatTextView3;
        this.G = appCompatImageView2;
        this.H = linearLayout;
    }

    public abstract void T(ud.n2 n2Var);
}
