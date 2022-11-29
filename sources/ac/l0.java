package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.GiftRankingRankUpTargetUserView;

/* loaded from: classes2.dex */
public class l0 extends k0 {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(xb.o.f60016o1, 5);
        sparseIntArray.put(xb.o.f60014n7, 6);
        sparseIntArray.put(xb.o.E9, 7);
        sparseIntArray.put(xb.o.F9, 8);
        sparseIntArray.put(xb.o.f60009m7, 9);
        sparseIntArray.put(xb.o.recycler_view_space, 10);
        sparseIntArray.put(xb.o.f60047w7, 11);
        sparseIntArray.put(xb.o.roulette_recycler_view, 12);
        sparseIntArray.put(xb.o.rank_up_user_view, 13);
        sparseIntArray.put(xb.o.f60002l2, 14);
        sparseIntArray.put(xb.o.f60012n2, 15);
    }

    public l0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 16, T, U));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ac.k0
    public void V(ud.f1 f1Var) {
        this.R = f1Var;
        synchronized (this) {
            this.S |= 1;
        }
        c(xb.b.f59841d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j10 = this.S;
            this.S = 0L;
        }
        ud.f1 f1Var = this.R;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str4 = null;
        if (i10 == 0 || f1Var == null) {
            str = null;
            str2 = null;
            str3 = null;
        } else {
            String d10 = f1Var.d();
            String f10 = f1Var.f();
            str2 = f1Var.e();
            str = d10;
            str4 = f1Var.c();
            str3 = f10;
        }
        if (i10 != 0) {
            x3.e.c(this.D, str4);
            x3.e.c(this.E, str);
            x3.e.c(this.G, str2);
            td.a.q(this.H, str3, 0);
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

    public l0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[5], (LinearLayoutCompat) objArr[14], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[15], (AppCompatTextView) objArr[2], (AppCompatImageView) objArr[1], (Space) objArr[9], (LottieAnimationView) objArr[6], (GiftRankingRankUpTargetUserView) objArr[13], (ConstraintLayout) objArr[11], (Space) objArr[10], (ConstraintLayout) objArr[0], (RecyclerView) objArr[12], (Space) objArr[7], (LottieAnimationView) objArr[8]);
        this.S = -1L;
        this.D.setTag(null);
        this.E.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.N.setTag(null);
        N(view);
        y();
    }
}
