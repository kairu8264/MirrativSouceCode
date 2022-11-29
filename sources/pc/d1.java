package pc;

import android.text.Spannable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class d1 extends c1 {

    /* renamed from: e0  reason: collision with root package name */
    public static final ViewDataBinding.i f46383e0 = null;

    /* renamed from: f0  reason: collision with root package name */
    public static final SparseIntArray f46384f0;

    /* renamed from: c0  reason: collision with root package name */
    public final LinearLayout f46385c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f46386d0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f46384f0 = sparseIntArray;
        sparseIntArray.put(nc.e.f41823g1, 3);
        sparseIntArray.put(nc.e.F2, 4);
        sparseIntArray.put(nc.e.E2, 5);
        sparseIntArray.put(nc.e.T0, 6);
        sparseIntArray.put(nc.e.S4, 7);
        sparseIntArray.put(nc.e.f41851w6, 8);
        sparseIntArray.put(nc.e.f41852x6, 9);
        sparseIntArray.put(nc.e.C, 10);
        sparseIntArray.put(nc.e.rank_number_root_container, 11);
        sparseIntArray.put(nc.e.rank_number_left_decoration_image_view, 12);
        sparseIntArray.put(nc.e.rank_number_image_container, 13);
        sparseIntArray.put(nc.e.rank_1_anchor_space, 14);
        sparseIntArray.put(nc.e.rank_2_anchor_space, 15);
        sparseIntArray.put(nc.e.rank_3_anchor_space, 16);
        sparseIntArray.put(nc.e.rank_4_anchor_space, 17);
        sparseIntArray.put(nc.e.rank_1_image_view, 18);
        sparseIntArray.put(nc.e.rank_2_image_view, 19);
        sparseIntArray.put(nc.e.rank_3_image_view, 20);
        sparseIntArray.put(nc.e.rank_4_image_view, 21);
        sparseIntArray.put(nc.e.rank_number_right_decoration_image_view, 22);
        sparseIntArray.put(nc.e.ranking_prize_image_view, 23);
        sparseIntArray.put(nc.e.congrats_image_view, 24);
        sparseIntArray.put(nc.e.contract_textview, 25);
        sparseIntArray.put(nc.e.check_button, 26);
    }

    public d1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 27, f46383e0, f46384f0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // pc.c1
    public void V(ed.c cVar) {
        this.f46382b0 = cVar;
        synchronized (this) {
            this.f46386d0 |= 1;
        }
        c(nc.a.f41788b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        Spannable spannable;
        synchronized (this) {
            j10 = this.f46386d0;
            this.f46386d0 = 0L;
        }
        ed.c cVar = this.f46382b0;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        Spannable spannable2 = null;
        if (i10 == 0 || cVar == null) {
            spannable = null;
        } else {
            spannable2 = cVar.d();
            spannable = cVar.e();
        }
        if (i10 != 0) {
            x3.e.c(this.X, spannable2);
            x3.e.c(this.Y, spannable);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f46386d0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f46386d0 = 2L;
        }
        H();
    }

    public d1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[10], (RoundedButtonView) objArr[26], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[24], (ConstraintLayout) objArr[3], (AppCompatTextView) objArr[25], (Guideline) objArr[5], (Guideline) objArr[4], (Space) objArr[14], (AppCompatImageView) objArr[18], (Space) objArr[15], (AppCompatImageView) objArr[19], (Space) objArr[16], (AppCompatImageView) objArr[20], (Space) objArr[17], (AppCompatImageView) objArr[21], (ConstraintLayout) objArr[13], (AppCompatImageView) objArr[12], (LottieAnimationView) objArr[7], (AppCompatImageView) objArr[22], (ConstraintLayout) objArr[11], (AppCompatImageView) objArr[23], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[2], (Space) objArr[8], (LottieAnimationView) objArr[9]);
        this.f46386d0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f46385c0 = linearLayout;
        linearLayout.setTag(null);
        this.X.setTag(null);
        this.Y.setTag(null);
        N(view);
        y();
    }
}
