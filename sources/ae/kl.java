package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.feature.live.LiveTutorialSpotlightView;

/* loaded from: classes2.dex */
public abstract class kl extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatImageView C;
    public final ConstraintLayout D;
    public final AppCompatImageView E;
    public final AppCompatTextView F;
    public final View G;
    public final LiveTutorialSpotlightView H;
    public final ConstraintLayout I;

    public kl(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView2, View view2, LiveTutorialSpotlightView liveTutorialSpotlightView, ConstraintLayout constraintLayout2) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatImageView;
        this.D = constraintLayout;
        this.E = appCompatImageView2;
        this.F = appCompatTextView2;
        this.G = view2;
        this.H = liveTutorialSpotlightView;
        this.I = constraintLayout2;
    }

    public static kl T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static kl U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (kl) ViewDataBinding.x(layoutInflater, nd.b1.view_my_page_emomo_tutorial, viewGroup, z10, obj);
    }
}
