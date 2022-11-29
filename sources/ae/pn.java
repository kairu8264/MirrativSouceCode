package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.UserProfileYellStatusConditionProgressView;

/* loaded from: classes2.dex */
public class pn extends on {

    /* renamed from: q0  reason: collision with root package name */
    public static final ViewDataBinding.i f1461q0 = null;

    /* renamed from: r0  reason: collision with root package name */
    public static final SparseIntArray f1462r0;

    /* renamed from: o0  reason: collision with root package name */
    public final ConstraintLayout f1463o0;

    /* renamed from: p0  reason: collision with root package name */
    public long f1464p0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1462r0 = sparseIntArray;
        sparseIntArray.put(nd.z0.guideline_begin, 4);
        sparseIntArray.put(nd.z0.guideline_end, 5);
        sparseIntArray.put(nd.z0.yell_status_divider_space, 6);
        sparseIntArray.put(nd.z0.yell_status_divider_view, 7);
        sparseIntArray.put(nd.z0.yell_rank_image_view, 8);
        sparseIntArray.put(nd.z0.yell_level_title_text_view, 9);
        sparseIntArray.put(nd.z0.yell_level_text_view, 10);
        sparseIntArray.put(nd.z0.yell_rank_divider_view, 11);
        sparseIntArray.put(nd.z0.yell_rank_title_text_view, 12);
        sparseIntArray.put(nd.z0.yell_rank_text_view, 13);
        sparseIntArray.put(nd.z0.yell_status_lp_button_image_view, 14);
        sparseIntArray.put(nd.z0.yell_status_group, 15);
        sparseIntArray.put(nd.z0.yell_status_level_max_image_view, 16);
        sparseIntArray.put(nd.z0.yell_status_next_condition_message_text_view, 17);
        sparseIntArray.put(nd.z0.yell_status_next_condition_horizontal_scroll_view, 18);
        sparseIntArray.put(nd.z0.yell_status_next_condition_constraint_layout, 19);
        sparseIntArray.put(nd.z0.condition_1_title_text_view, 20);
        sparseIntArray.put(nd.z0.condition_a_container, 21);
        sparseIntArray.put(nd.z0.condition_1_gift_score_view, 22);
        sparseIntArray.put(nd.z0.condition_1_comment_count_view, 23);
        sparseIntArray.put(nd.z0.condition_1_total_viewing_time_view, 24);
        sparseIntArray.put(nd.z0.condition_1_total_view_days_view, 25);
        sparseIntArray.put(nd.z0.condition_2_title_text_view, 26);
        sparseIntArray.put(nd.z0.condition_b_container, 27);
        sparseIntArray.put(nd.z0.condition_2_gift_score_view, 28);
        sparseIntArray.put(nd.z0.condition_2_comment_count_view, 29);
        sparseIntArray.put(nd.z0.condition_2_total_viewing_time_view, 30);
        sparseIntArray.put(nd.z0.condition_2_total_view_days_view, 31);
        sparseIntArray.put(nd.z0.condition_3_title_text_view, 32);
        sparseIntArray.put(nd.z0.condition_c_container, 33);
        sparseIntArray.put(nd.z0.condition_3_gift_score_view, 34);
        sparseIntArray.put(nd.z0.condition_3_comment_count_view, 35);
        sparseIntArray.put(nd.z0.condition_3_total_viewing_time_view, 36);
        sparseIntArray.put(nd.z0.condition_3_total_view_days_view, 37);
        sparseIntArray.put(nd.z0.or_text_view, 38);
        sparseIntArray.put(nd.z0.or_text_view2, 39);
    }

    public pn(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 40, f1461q0, f1462r0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.f1464p0;
            this.f1464p0 = 0L;
        }
        if ((j10 & 1) != 0) {
            ConstraintLayout constraintLayout = this.f1446d0;
            ConstraintLayout constraintLayout2 = this.f1446d0;
            int i10 = nd.w0.f42235k;
            td.c.c(constraintLayout, 8, 1, Integer.valueOf(ViewDataBinding.t(constraintLayout2, i10)), null);
            td.c.c(this.f1447e0, 8, 1, Integer.valueOf(ViewDataBinding.t(this.f1447e0, i10)), null);
            td.c.c(this.f1448f0, 8, 1, Integer.valueOf(ViewDataBinding.t(this.f1448f0, i10)), null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f1464p0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f1464p0 = 1L;
        }
        H();
    }

    public pn(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (UserProfileYellStatusConditionProgressView) objArr[23], (UserProfileYellStatusConditionProgressView) objArr[22], (AppCompatTextView) objArr[20], (UserProfileYellStatusConditionProgressView) objArr[25], (UserProfileYellStatusConditionProgressView) objArr[24], (UserProfileYellStatusConditionProgressView) objArr[29], (UserProfileYellStatusConditionProgressView) objArr[28], (AppCompatTextView) objArr[26], (UserProfileYellStatusConditionProgressView) objArr[31], (UserProfileYellStatusConditionProgressView) objArr[30], (UserProfileYellStatusConditionProgressView) objArr[35], (UserProfileYellStatusConditionProgressView) objArr[34], (AppCompatTextView) objArr[32], (UserProfileYellStatusConditionProgressView) objArr[37], (UserProfileYellStatusConditionProgressView) objArr[36], (ConstraintLayout) objArr[21], (ConstraintLayout) objArr[27], (ConstraintLayout) objArr[33], (Guideline) objArr[4], (Guideline) objArr[5], (AppCompatTextView) objArr[38], (AppCompatTextView) objArr[39], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[9], (View) objArr[11], (AppCompatImageView) objArr[8], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[12], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[3], (Space) objArr[6], (View) objArr[7], (Group) objArr[15], (AppCompatImageView) objArr[16], (AppCompatImageView) objArr[14], (ConstraintLayout) objArr[19], (HorizontalScrollView) objArr[18], (AppCompatTextView) objArr[17]);
        this.f1464p0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f1463o0 = constraintLayout;
        constraintLayout.setTag(null);
        this.f1446d0.setTag(null);
        this.f1447e0.setTag(null);
        this.f1448f0.setTag(null);
        N(view);
        y();
    }
}
