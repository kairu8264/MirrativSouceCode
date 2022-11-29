package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.catalog.mission.MissionItemView;
import com.google.android.exoplayer2.ui.PlayerView;

/* loaded from: classes.dex */
public abstract class a2 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatImageView C;
    public final AppCompatTextView D;
    public final AppCompatImageView E;
    public final AppCompatImageView F;
    public final View G;
    public final ConstraintLayout H;
    public final PlayerView I;
    public final MissionItemView J;
    public final ProgressBar K;

    public a2(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, View view2, ConstraintLayout constraintLayout, PlayerView playerView, MissionItemView missionItemView, ProgressBar progressBar) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatImageView;
        this.D = appCompatTextView2;
        this.E = appCompatImageView2;
        this.F = appCompatImageView3;
        this.G = view2;
        this.H = constraintLayout;
        this.I = playerView;
        this.J = missionItemView;
        this.K = progressBar;
    }

    public static a2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static a2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (a2) ViewDataBinding.x(layoutInflater, r8.f1.view_holder_special_mission, viewGroup, z10, obj);
    }
}
