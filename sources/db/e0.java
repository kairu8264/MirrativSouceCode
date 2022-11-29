package db;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.otherfeature.campaign.CampaignPrizeView;
import com.dena.mirrorman.customview.PrizeGrantView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public abstract class e0 extends ViewDataBinding {
    public final AppCompatTextView B;
    public final AppCompatTextView C;
    public final View D;
    public final CampaignPrizeView E;
    public final AppCompatTextView F;
    public final AppCompatTextView G;
    public final ConstraintLayout H;
    public final AppCompatImageView I;
    public final ConstraintLayout J;
    public final PrizeGrantView K;
    public final RoundedButtonView L;
    public final AppCompatTextView M;
    public za.c N;

    public e0(Object obj, View view, int i10, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, View view2, CampaignPrizeView campaignPrizeView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, PrizeGrantView prizeGrantView, RoundedButtonView roundedButtonView, AppCompatTextView appCompatTextView5) {
        super(obj, view, i10);
        this.B = appCompatTextView;
        this.C = appCompatTextView2;
        this.D = view2;
        this.E = campaignPrizeView;
        this.F = appCompatTextView3;
        this.G = appCompatTextView4;
        this.H = constraintLayout;
        this.I = appCompatImageView;
        this.J = constraintLayout2;
        this.K = prizeGrantView;
        this.L = roundedButtonView;
        this.M = appCompatTextView5;
    }

    public static e0 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static e0 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (e0) ViewDataBinding.x(layoutInflater, wa.f.view_holder_campaign_mission_date, viewGroup, z10, obj);
    }

    public abstract void V(za.c cVar);
}
