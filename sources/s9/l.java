package s9;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.ShooterEventRankingInfoView;
import com.dena.mirrorman.customview.ShooterEventRankingUserSummaryView;
import com.dena.mirrorman.customview.ShooterMatchingViewerPopUpView;
import com.dena.mirrorman.feature.event.LandingPageDescriptionListView;
import ud.v3;

/* loaded from: classes.dex */
public class l extends k {
    public static final SparseIntArray A0;

    /* renamed from: z0  reason: collision with root package name */
    public static final ViewDataBinding.i f52523z0 = null;

    /* renamed from: x0  reason: collision with root package name */
    public final ConstraintLayout f52524x0;

    /* renamed from: y0  reason: collision with root package name */
    public long f52525y0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A0 = sparseIntArray;
        sparseIntArray.put(q9.g.user_summary_container, 23);
        sparseIntArray.put(q9.g.my_score_reward_header_text_view, 24);
        sparseIntArray.put(q9.g.my_total_score_reward_list_recycler_view, 25);
        sparseIntArray.put(q9.g.my_total_reward_divider, 26);
        sparseIntArray.put(q9.g.my_total_score_rank_reward_header_text_view, 27);
        sparseIntArray.put(q9.g.my_total_score_rank_reward_list_recycler_view, 28);
        sparseIntArray.put(q9.g.streamer_text_view, 29);
        sparseIntArray.put(q9.g.streamer_total_score_reward_header_text_view, 30);
        sparseIntArray.put(q9.g.streamer_total_score_reward_list_recycler_view, 31);
        sparseIntArray.put(q9.g.my_rating_class_reward_header_text_view, 32);
        sparseIntArray.put(q9.g.my_rating_class_reward_list_recycler_view, 33);
        sparseIntArray.put(q9.g.rating_reward_divider, 34);
        sparseIntArray.put(q9.g.my_rating_rank_reward_header_text_view, 35);
        sparseIntArray.put(q9.g.my_rating_rank_reward_list_recycler_view, 36);
        sparseIntArray.put(q9.g.streamer_rating_text_view, 37);
        sparseIntArray.put(q9.g.ranking_text_view, 38);
        sparseIntArray.put(q9.g.O2, 39);
        sparseIntArray.put(q9.g.event_description_container, 40);
        sparseIntArray.put(q9.g.event_footer_container, 41);
        sparseIntArray.put(q9.g.event_footer_anchor_view, 42);
        sparseIntArray.put(q9.g.event_footer_play_view, 43);
        sparseIntArray.put(q9.g.pop_up_anchor_space, 44);
        sparseIntArray.put(q9.g.pop_up_view, 45);
        sparseIntArray.put(q9.g.shooter_matching_tutorial_pop_up_image_view, 46);
        sparseIntArray.put(q9.g.J, 47);
    }

    public l(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 48, f52523z0, A0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // s9.k
    public void T(v3 v3Var) {
        this.f52522w0 = v3Var;
        synchronized (this) {
            this.f52525y0 |= 1;
        }
        c(q9.a.f48787b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        long j11;
        int i10;
        boolean z10;
        int i11;
        int i12;
        SpannableString spannableString;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        String str;
        String str2;
        SpannableString spannableString2;
        synchronized (this) {
            j10 = this.f52525y0;
            this.f52525y0 = 0L;
        }
        v3 v3Var = this.f52522w0;
        int i13 = ((3 & j10) > 0L ? 1 : ((3 & j10) == 0L ? 0 : -1));
        int i14 = 0;
        String str3 = null;
        if (i13 == 0 || v3Var == null) {
            j11 = j10;
            i10 = 0;
            z10 = false;
            i11 = 0;
            i12 = 0;
            spannableString = null;
            drawable = null;
            drawable2 = null;
            drawable3 = null;
            str = null;
            str2 = null;
            spannableString2 = null;
        } else {
            Drawable j12 = v3Var.j();
            String c10 = v3Var.c();
            int k10 = v3Var.k();
            z10 = v3Var.m();
            String g10 = v3Var.g();
            SpannableString b10 = v3Var.b();
            i11 = v3Var.i();
            str2 = v3Var.a();
            spannableString2 = v3Var.d();
            Drawable l10 = v3Var.l();
            Drawable f10 = v3Var.f();
            i12 = v3Var.e();
            i10 = v3Var.h();
            j11 = j10;
            spannableString = b10;
            drawable = l10;
            str = g10;
            drawable3 = f10;
            str3 = c10;
            i14 = k10;
            drawable2 = j12;
        }
        if (i13 != 0) {
            td.a.f(this.F, str3);
            td.a.f(this.H, str2);
            x3.f.a(this.I, drawable2);
            x3.e.c(this.U, spannableString2);
            x3.f.a(this.X, x3.b.a(i14));
            x3.f.a(this.f52500a0, x3.b.a(i12));
            td.c.d(this.f52502c0, 12, Integer.valueOf(i12));
            x3.f.a(this.f52503d0, x3.b.a(i11));
            x3.f.a(this.f52504e0, drawable3);
            x3.e.c(this.f52504e0, str);
            this.f52504e0.setTextColor(i10);
            td.c.e(this.f52506g0, Boolean.valueOf(z10));
            td.c.e(this.f52511l0, Boolean.valueOf(z10));
            x3.e.c(this.f52516q0, spannableString);
            x3.f.a(this.f52517r0, x3.b.a(i14));
            td.c.d(this.f52518s0, 12, Integer.valueOf(i14));
            if (ViewDataBinding.s() >= 16) {
                this.f52520u0.setBackground(drawable);
            }
        }
        if ((j11 & 2) != 0) {
            ConstraintLayout constraintLayout = this.N;
            ConstraintLayout constraintLayout2 = this.N;
            int i15 = q9.d.G;
            td.c.b(constraintLayout, 12, Integer.valueOf(ViewDataBinding.t(constraintLayout2, i15)));
            td.c.b(this.S, 12, Integer.valueOf(ViewDataBinding.t(this.S, i15)));
            ShooterEventRankingInfoView shooterEventRankingInfoView = this.f52507h0;
            ShooterEventRankingInfoView shooterEventRankingInfoView2 = this.f52507h0;
            int i16 = q9.d.D;
            td.c.b(shooterEventRankingInfoView, 12, Integer.valueOf(ViewDataBinding.t(shooterEventRankingInfoView2, i16)));
            td.c.b(this.f52508i0, 12, Integer.valueOf(ViewDataBinding.t(this.f52508i0, i16)));
            td.c.d(this.f52512m0, 12, Integer.valueOf(ViewDataBinding.t(this.f52512m0, i16)));
            td.c.b(this.f52513n0, 12, Integer.valueOf(ViewDataBinding.t(this.f52513n0, i15)));
            td.c.b(this.f52521v0, 16, Integer.valueOf(ViewDataBinding.t(this.f52521v0, i15)));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f52525y0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f52525y0 = 2L;
        }
        H();
    }

    public l(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[47], (LandingPageDescriptionListView) objArr[40], (View) objArr[42], (ConstraintLayout) objArr[41], (AppCompatImageView) objArr[22], (View) objArr[43], (ImageView) objArr[1], (ConstraintLayout) objArr[2], (AppCompatTextView) objArr[32], (RecyclerView) objArr[33], (AppCompatTextView) objArr[35], (RecyclerView) objArr[36], (ConstraintLayout) objArr[17], (AppCompatTextView) objArr[24], (View) objArr[26], (AppCompatTextView) objArr[27], (RecyclerView) objArr[28], (ConstraintLayout) objArr[12], (RecyclerView) objArr[25], (TextView) objArr[4], (Space) objArr[44], (ShooterMatchingViewerPopUpView) objArr[45], (ConstraintLayout) objArr[21], (RecyclerView) objArr[39], (AppCompatTextView) objArr[38], (ConstraintLayout) objArr[16], (View) objArr[34], (AppCompatTextView) objArr[10], (ConstraintLayout) objArr[8], (TextView) objArr[5], (AppCompatImageView) objArr[46], (ConstraintLayout) objArr[18], (ShooterEventRankingInfoView) objArr[20], (ConstraintLayout) objArr[19], (AppCompatTextView) objArr[37], (AppCompatTextView) objArr[29], (ConstraintLayout) objArr[13], (ShooterEventRankingInfoView) objArr[15], (ConstraintLayout) objArr[14], (AppCompatTextView) objArr[30], (RecyclerView) objArr[31], (TextView) objArr[3], (ConstraintLayout) objArr[11], (AppCompatTextView) objArr[9], (ConstraintLayout) objArr[23], (View) objArr[6], (ShooterEventRankingUserSummaryView) objArr[7]);
        this.f52525y0 = -1L;
        this.F.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f52524x0 = constraintLayout;
        constraintLayout.setTag(null);
        this.N.setTag(null);
        this.S.setTag(null);
        this.U.setTag(null);
        this.X.setTag(null);
        this.f52500a0.setTag(null);
        this.f52502c0.setTag(null);
        this.f52503d0.setTag(null);
        this.f52504e0.setTag(null);
        this.f52506g0.setTag(null);
        this.f52507h0.setTag(null);
        this.f52508i0.setTag(null);
        this.f52511l0.setTag(null);
        this.f52512m0.setTag(null);
        this.f52513n0.setTag(null);
        this.f52516q0.setTag(null);
        this.f52517r0.setTag(null);
        this.f52518s0.setTag(null);
        this.f52520u0.setTag(null);
        this.f52521v0.setTag(null);
        N(view);
        y();
    }
}
