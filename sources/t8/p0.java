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
public class p0 extends o0 {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final CardView N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(r8.e1.center_anchor_space, 7);
        sparseIntArray.put(r8.e1.f49887w, 8);
        sparseIntArray.put(r8.e1.H, 9);
        sparseIntArray.put(r8.e1.collab_lottie_animation_view, 10);
        sparseIntArray.put(r8.e1.collab_viewers_view, 11);
    }

    public p0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 12, P, Q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // t8.o0
    public void V(v8.a aVar) {
        this.M = aVar;
        synchronized (this) {
            this.O |= 1;
        }
        c(r8.a.f49827b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z10;
        String str5;
        synchronized (this) {
            j10 = this.O;
            this.O = 0L;
        }
        v8.a aVar = this.M;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        if (i10 == 0 || aVar == null) {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            z10 = false;
            str5 = null;
        } else {
            str = aVar.c();
            str2 = aVar.f();
            str5 = aVar.b();
            str4 = aVar.h();
            z10 = aVar.j();
            str3 = aVar.d();
        }
        if (i10 != 0) {
            td.a.f(this.G, str5);
            x3.e.c(this.H, str);
            td.a.t(this.I, str3, 12, null, null);
            td.c.e(this.J, Boolean.valueOf(z10));
            td.a.i(this.K, str2);
            x3.e.c(this.L, str4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.O != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.O = 2L;
        }
        H();
    }

    public p0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[8], (Space) objArr[7], (ConstraintLayout) objArr[9], (LottieAnimationView) objArr[10], (MultipleUserView) objArr[11], (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[1], (LiveBadgeView) objArr[2], (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[5]);
        this.O = -1L;
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        CardView cardView = (CardView) objArr[0];
        this.N = cardView;
        cardView.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        N(view);
        y();
    }
}
