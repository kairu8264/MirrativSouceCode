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
public class l1 extends k1 {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final ConstraintLayout P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(r8.e1.center_anchor_space, 9);
        sparseIntArray.put(r8.e1.f49887w, 10);
        sparseIntArray.put(r8.e1.H, 11);
        sparseIntArray.put(r8.e1.collab_lottie_animation_view, 12);
        sparseIntArray.put(r8.e1.collab_viewers_view, 13);
    }

    public l1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 14, R, S));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // t8.k1
    public void T(v8.l lVar) {
        this.O = lVar;
        synchronized (this) {
            this.Q |= 1;
        }
        c(r8.a.f49827b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        synchronized (this) {
            j10 = this.Q;
            this.Q = 0L;
        }
        v8.l lVar = this.O;
        int i11 = ((3 & j10) > 0L ? 1 : ((3 & j10) == 0L ? 0 : -1));
        if (i11 == 0 || lVar == null) {
            z10 = false;
            i10 = 0;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        } else {
            str = lVar.c();
            str2 = lVar.d();
            str3 = lVar.g();
            str4 = lVar.b();
            i10 = lVar.e();
            str5 = lVar.i();
            z10 = lVar.k();
        }
        if ((j10 & 2) != 0) {
            View view = this.B;
            View view2 = this.B;
            int i12 = r8.b1.f49836f;
            td.c.c(view, 12, 3, Integer.valueOf(ViewDataBinding.t(view2, i12)), null);
            td.c.b(this.D, 12, Integer.valueOf(ViewDataBinding.t(this.D, i12)));
        }
        if (i11 != 0) {
            td.a.f(this.I, str4);
            x3.e.c(this.J, str);
            td.a.t(this.K, str2, 12, 3, Integer.valueOf(i10));
            td.c.e(this.L, Boolean.valueOf(z10));
            td.a.i(this.M, str3);
            x3.e.c(this.N, str5);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.Q != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.Q = 2L;
        }
        H();
    }

    public l1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[3], (AppCompatImageView) objArr[10], (CardView) objArr[1], (Space) objArr[9], (ConstraintLayout) objArr[11], (LottieAnimationView) objArr[12], (MultipleUserView) objArr[13], (AppCompatImageView) objArr[6], (AppCompatTextView) objArr[8], (AppCompatImageView) objArr[2], (LiveBadgeView) objArr[4], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[7]);
        this.Q = -1L;
        this.B.setTag(null);
        this.D.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.P = constraintLayout;
        constraintLayout.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        N(view);
        y();
    }
}
