package t8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.LiveBadgeView;
import com.dena.mirrorman.customview.MultipleUserView;

/* loaded from: classes.dex */
public class h1 extends g1 {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public final ConstraintLayout O;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(r8.e1.center_anchor_space, 8);
        sparseIntArray.put(r8.e1.f49887w, 9);
        sparseIntArray.put(r8.e1.H, 10);
        sparseIntArray.put(r8.e1.collab_lottie_animation_view, 11);
        sparseIntArray.put(r8.e1.collab_viewers_view, 12);
    }

    public h1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 13, Q, R));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // t8.g1
    public void T(v8.l lVar) {
        this.N = lVar;
        synchronized (this) {
            this.P |= 1;
        }
        c(r8.a.f49827b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        String str;
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            j10 = this.P;
            this.P = 0L;
        }
        v8.l lVar = this.N;
        int i10 = ((3 & j10) > 0L ? 1 : ((3 & j10) == 0L ? 0 : -1));
        int i11 = 0;
        String str5 = null;
        if (i10 == 0 || lVar == null) {
            z10 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        } else {
            String c10 = lVar.c();
            String d10 = lVar.d();
            String g10 = lVar.g();
            String b10 = lVar.b();
            int e10 = lVar.e();
            str4 = lVar.i();
            z10 = lVar.k();
            str2 = d10;
            i11 = e10;
            str3 = g10;
            str = c10;
            str5 = b10;
        }
        if ((j10 & 2) != 0) {
            td.c.b(this.C, 12, Integer.valueOf(ViewDataBinding.t(this.C, r8.b1.f49836f)));
        }
        if (i10 != 0) {
            td.a.f(this.H, str5);
            x3.e.c(this.I, str);
            td.a.t(this.J, str2, 12, 3, Integer.valueOf(i11));
            td.c.e(this.K, Boolean.valueOf(z10));
            td.a.i(this.L, str3);
            x3.e.c(this.M, str4);
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

    public h1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[9], (CardView) objArr[1], (Space) objArr[8], (ConstraintLayout) objArr[10], (LottieAnimationView) objArr[11], (MultipleUserView) objArr[12], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[7], (AppCompatImageView) objArr[2], (LiveBadgeView) objArr[3], (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[6]);
        this.P = -1L;
        this.C.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.O = constraintLayout;
        constraintLayout.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        N(view);
        y();
    }
}
