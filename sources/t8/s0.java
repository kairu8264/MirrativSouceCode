package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.LiveAnnounceAppView;

/* loaded from: classes.dex */
public abstract class s0 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final ConstraintLayout E;
    public final LiveAnnounceAppView F;
    public final AppCompatImageView G;
    public final AppCompatTextView H;

    public s0(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, LiveAnnounceAppView liveAnnounceAppView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatImageView;
        this.D = appCompatTextView2;
        this.E = constraintLayout;
        this.F = liveAnnounceAppView;
        this.G = appCompatImageView2;
        this.H = appCompatTextView3;
    }

    public static s0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static s0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (s0) ViewDataBinding.x(layoutInflater, r8.f1.view_holder_catalog_live_announcement, viewGroup, z10, obj);
    }
}
