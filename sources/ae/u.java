package ae;

import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.LivePrepareBalloonEncourageLivePopup;
import com.dena.mirrorman.customview.LivePrepareBalloonLiveRequestNumView;
import com.dena.mirrorman.customview.MRBottomNavigationView;

/* loaded from: classes2.dex */
public abstract class u extends ViewDataBinding {
    public final MRBottomNavigationView B;
    public final Space C;
    public final View D;
    public final AppCompatImageView E;
    public final AppCompatImageView F;
    public final AppCompatTextView G;
    public final LivePrepareBalloonEncourageLivePopup H;
    public final LivePrepareBalloonLiveRequestNumView I;
    public final ConstraintLayout J;
    public final ConstraintLayout K;

    public u(Object obj, View view, int i10, MRBottomNavigationView mRBottomNavigationView, Space space, View view2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView, LivePrepareBalloonEncourageLivePopup livePrepareBalloonEncourageLivePopup, LivePrepareBalloonLiveRequestNumView livePrepareBalloonLiveRequestNumView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        super(obj, view, i10);
        this.B = mRBottomNavigationView;
        this.C = space;
        this.D = view2;
        this.E = appCompatImageView;
        this.F = appCompatImageView2;
        this.G = appCompatTextView;
        this.H = livePrepareBalloonEncourageLivePopup;
        this.I = livePrepareBalloonLiveRequestNumView;
        this.J = constraintLayout;
        this.K = constraintLayout2;
    }
}
