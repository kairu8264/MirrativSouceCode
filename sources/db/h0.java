package db;

import android.util.SparseIntArray;
import android.view.View;
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
public class h0 extends g0 {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public final ConstraintLayout Q;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(wa.e.C, 1);
        sparseIntArray.put(wa.e.f58538l0, 2);
        sparseIntArray.put(wa.e.item_container, 3);
        sparseIntArray.put(wa.e.campaign_prize_view, 4);
        sparseIntArray.put(wa.e.prize_grant_view, 5);
        sparseIntArray.put(wa.e.f58530d0, 6);
        sparseIntArray.put(wa.e.Q, 7);
        sparseIntArray.put(wa.e.S, 8);
        sparseIntArray.put(wa.e.receive_button_container, 9);
        sparseIntArray.put(wa.e.receive_button_view, 10);
        sparseIntArray.put(wa.e.loading_view, 11);
        sparseIntArray.put(wa.e.F, 12);
        sparseIntArray.put(wa.e.inactivation_text_view, 13);
        sparseIntArray.put(wa.e.completed_image_view, 14);
    }

    public h0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 15, S, T));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // db.g0
    public void V(za.h hVar) {
        this.P = hVar;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.R = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.R != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.R = 2L;
        }
        H();
    }

    public h0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (CampaignPrizeView) objArr[4], (AppCompatImageView) objArr[14], (Guideline) objArr[1], (AppCompatTextView) objArr[13], (ConstraintLayout) objArr[3], (AppCompatImageView) objArr[12], (ConstraintLayout) objArr[11], (PrizeGrantView) objArr[5], (ProgressBar) objArr[7], (AppCompatTextView) objArr[8], (ConstraintLayout) objArr[9], (RoundedButtonView) objArr[10], (AppCompatTextView) objArr[6], (Guideline) objArr[2]);
        this.R = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Q = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
