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
public class n0 extends m0 {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(xb.o.f60016o1, 4);
        sparseIntArray.put(xb.o.f60014n7, 5);
        sparseIntArray.put(xb.o.E9, 6);
        sparseIntArray.put(xb.o.F9, 7);
        sparseIntArray.put(xb.o.f60009m7, 8);
        sparseIntArray.put(xb.o.recycler_view_space, 9);
        sparseIntArray.put(xb.o.f60047w7, 10);
        sparseIntArray.put(xb.o.roulette_recycler_view, 11);
        sparseIntArray.put(xb.o.rank_up_user_view, 12);
    }

    public n0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 13, Q, R));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ac.m0
    public void V(cc.n nVar) {
        this.O = nVar;
        synchronized (this) {
            this.P |= 1;
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
            j10 = this.P;
            this.P = 0L;
        }
        cc.n nVar = this.O;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str3 = null;
        if (i10 == 0 || nVar == null) {
            str = null;
            str2 = null;
        } else {
            str3 = nVar.e();
            str = nVar.g();
            str2 = nVar.f();
        }
        if (i10 != 0) {
            td.a.f(this.J, str3);
            td.a.i(this.K, str2);
            x3.e.c(this.L, str);
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

    public n0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[4], (Space) objArr[8], (LottieAnimationView) objArr[5], (GiftRankingRankUpTargetUserView) objArr[12], (ConstraintLayout) objArr[10], (Space) objArr[9], (ConstraintLayout) objArr[0], (RecyclerView) objArr[11], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[3], (Space) objArr[6], (LottieAnimationView) objArr[7]);
        this.P = -1L;
        this.H.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        N(view);
        y();
    }
}
