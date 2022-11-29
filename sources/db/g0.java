package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.otherfeature.campaign.CampaignPrizeView;
import com.dena.mirrorman.customview.PrizeGrantView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class g0 extends ViewDataBinding {
    public final CampaignPrizeView B;
    public final AppCompatImageView C;
    public final Guideline D;
    public final AppCompatTextView E;
    public final ConstraintLayout F;
    public final AppCompatImageView G;
    public final ConstraintLayout H;
    public final PrizeGrantView I;
    public final ProgressBar J;
    public final AppCompatTextView K;
    public final ConstraintLayout L;
    public final RoundedButtonView M;
    public final AppCompatTextView N;
    public final Guideline O;
    public za.h P;

    public g0(Object obj, View view, int i10, CampaignPrizeView campaignPrizeView, AppCompatImageView appCompatImageView, Guideline guideline, AppCompatTextView appCompatTextView, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout2, PrizeGrantView prizeGrantView, ProgressBar progressBar, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout3, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView3, Guideline guideline2) {
        super(obj, view, i10);
        this.B = campaignPrizeView;
        this.C = appCompatImageView;
        this.D = guideline;
        this.E = appCompatTextView;
        this.F = constraintLayout;
        this.G = appCompatImageView2;
        this.H = constraintLayout2;
        this.I = prizeGrantView;
        this.J = progressBar;
        this.K = appCompatTextView2;
        this.L = constraintLayout3;
        this.M = roundedButtonView;
        this.N = appCompatTextView3;
        this.O = guideline2;
    }

    public static g0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static g0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (g0) ViewDataBinding.x(layoutInflater, wa.f.view_holder_campaign_mission_progress_bar, viewGroup, z10, obj);
    }

    public abstract void V(za.h hVar);
}
