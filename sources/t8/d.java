package t8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.LiveBadgeView;
import com.dena.mirrorman.customview.MultipleUserView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public class d extends c {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final ConstraintLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(r8.e1.horizontal_top_guideline, 8);
        sparseIntArray.put(r8.e1.horizontal_bottom_guideline, 9);
        sparseIntArray.put(r8.e1.E, 10);
        sparseIntArray.put(r8.e1.group_shot_image_view, 11);
        sparseIntArray.put(r8.e1.collab_lottie_animation_view, 12);
        sparseIntArray.put(r8.e1.collab_viewers_view, 13);
        sparseIntArray.put(r8.e1.group_shot_comment_container, 14);
        sparseIntArray.put(r8.e1.group_shot_comment_card_view, 15);
    }

    public d(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 16, T, U));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // t8.c
    public void T(v8.g gVar) {
        this.Q = gVar;
        synchronized (this) {
            this.S |= 1;
        }
        c(r8.a.f49827b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        boolean z11;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j10 = this.S;
            this.S = 0L;
        }
        v8.g gVar = this.Q;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        boolean z12 = false;
        String str4 = null;
        if (i10 == 0 || gVar == null) {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
            str3 = null;
        } else {
            String c10 = gVar.c();
            z12 = gVar.j();
            String f10 = gVar.f();
            String b10 = gVar.b();
            str3 = gVar.h();
            z11 = gVar.k();
            z10 = gVar.l();
            str = c10;
            str4 = b10;
            str2 = f10;
        }
        if (i10 != 0) {
            td.c.e(this.C, Boolean.valueOf(z12));
            td.a.f(this.F, str4);
            x3.e.c(this.I, str);
            td.c.e(this.M, Boolean.valueOf(z11));
            td.a.c(this.N, str2);
            x3.e.c(this.O, str3);
            td.c.e(this.P, Boolean.valueOf(z10));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.S != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.S = 2L;
        }
        H();
    }

    public d(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[10], (ConstraintLayout) objArr[2], (LottieAnimationView) objArr[12], (MultipleUserView) objArr[13], (AppCompatImageView) objArr[4], (MaterialCardView) objArr[15], (FrameLayout) objArr[14], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[11], (Guideline) objArr[9], (Guideline) objArr[8], (LiveBadgeView) objArr[1], (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[5], (RoundedButtonView) objArr[7]);
        this.S = -1L;
        this.C.setTag(null);
        this.F.setTag(null);
        this.I.setTag(null);
        this.M.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.R = constraintLayout;
        constraintLayout.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        N(view);
        y();
    }
}
