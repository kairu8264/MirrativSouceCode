package db;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.otherfeature.campaign.CampaignPrizeView;
import com.dena.mirrorman.customview.PrizeGrantView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class f0 extends e0 {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final ConstraintLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(wa.e.item_container, 1);
        sparseIntArray.put(wa.e.campaign_prize_view, 2);
        sparseIntArray.put(wa.e.prize_grant_view, 3);
        sparseIntArray.put(wa.e.f58530d0, 4);
        sparseIntArray.put(wa.e.f58535j, 5);
        sparseIntArray.put(wa.e.achievement_text_view, 6);
        sparseIntArray.put(wa.e.achievement_count_text_view, 7);
        sparseIntArray.put(wa.e.day_text_view, 8);
        sparseIntArray.put(wa.e.receive_button_view, 9);
        sparseIntArray.put(wa.e.inactivation_text_view, 10);
        sparseIntArray.put(wa.e.loading_view, 11);
        sparseIntArray.put(wa.e.F, 12);
    }

    public f0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 13, Q, R));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // db.e0
    public void V(za.c cVar) {
        this.N = cVar;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.P = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.P != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.P = 2L;
        }
        H();
    }

    public f0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[6], (View) objArr[5], (CampaignPrizeView) objArr[2], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[10], (ConstraintLayout) objArr[1], (AppCompatImageView) objArr[12], (ConstraintLayout) objArr[11], (PrizeGrantView) objArr[3], (RoundedButtonView) objArr[9], (AppCompatTextView) objArr[4]);
        this.P = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
