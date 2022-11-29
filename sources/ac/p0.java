package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.GiftRankingRankUpTargetUserView;

/* loaded from: classes2.dex */
public class p0 extends o0 {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(xb.o.f60016o1, 4);
        sparseIntArray.put(xb.o.f60014n7, 5);
        sparseIntArray.put(xb.o.E9, 6);
        sparseIntArray.put(xb.o.F9, 7);
        sparseIntArray.put(xb.o.f60009m7, 8);
        sparseIntArray.put(xb.o.recycler_view_space, 9);
        sparseIntArray.put(xb.o.f60047w7, 10);
        sparseIntArray.put(xb.o.roulette_recycler_view, 11);
        sparseIntArray.put(xb.o.rank_up_user_view, 12);
        sparseIntArray.put(xb.o.f60012n2, 13);
    }

    public p0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 14, R, S));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ac.o0
    public void V(ud.f1 f1Var) {
        this.P = f1Var;
        synchronized (this) {
            this.Q |= 1;
        }
        c(xb.b.f59841d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        synchronized (this) {
            j10 = this.Q;
            this.Q = 0L;
        }
        ud.f1 f1Var = this.P;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str3 = null;
        if (i10 == 0 || f1Var == null) {
            str = null;
            str2 = null;
        } else {
            String d10 = f1Var.d();
            str = f1Var.c();
            str2 = d10;
            str3 = f1Var.b();
        }
        if (i10 != 0) {
            x3.e.c(this.C, str3);
            x3.e.c(this.D, str);
            x3.e.c(this.E, str2);
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

    public p0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[13], (Space) objArr[8], (LottieAnimationView) objArr[5], (GiftRankingRankUpTargetUserView) objArr[12], (ConstraintLayout) objArr[10], (Space) objArr[9], (ConstraintLayout) objArr[0], (RecyclerView) objArr[11], (Space) objArr[6], (LottieAnimationView) objArr[7]);
        this.Q = -1L;
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.L.setTag(null);
        N(view);
        y();
    }
}
