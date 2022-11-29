package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class t extends s {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final AppCompatTextView P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(xb.o.particle_image_view, 3);
        sparseIntArray.put(xb.o.content_anchor_view, 4);
        sparseIntArray.put(xb.o.V1, 5);
        sparseIntArray.put(xb.o.light_lottie_view, 6);
        sparseIntArray.put(xb.o.f59984g7, 7);
        sparseIntArray.put(xb.o.cheerleader_badge_image_view, 8);
        sparseIntArray.put(xb.o.profile_name_container, 9);
        sparseIntArray.put(xb.o.f60017o2, 10);
        sparseIntArray.put(xb.o.f60016o1, 11);
        sparseIntArray.put(xb.o.show_tutorial_container, 12);
        sparseIntArray.put(xb.o.F9, 13);
    }

    public t(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 14, R, S));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ac.s
    public void V(yb.a aVar) {
        this.O = aVar;
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
        synchronized (this) {
            j10 = this.Q;
            this.Q = 0L;
        }
        yb.a aVar = this.O;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str2 = null;
        if (i10 == 0 || aVar == null) {
            str = null;
        } else {
            str = aVar.a();
            str2 = aVar.b();
        }
        if (i10 != 0) {
            x3.e.c(this.P, str2);
            td.a.c(this.J, str);
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

    public t(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[8], (RoundedButtonView) objArr[11], (Space) objArr[4], (ConstraintLayout) objArr[5], (AppCompatTextView) objArr[10], (LottieAnimationView) objArr[6], (AppCompatImageView) objArr[3], (View) objArr[7], (AppCompatImageView) objArr[1], (LinearLayout) objArr[9], (ConstraintLayout) objArr[0], (LinearLayout) objArr[12], (LottieAnimationView) objArr[13]);
        this.Q = -1L;
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[2];
        this.P = appCompatTextView;
        appCompatTextView.setTag(null);
        this.J.setTag(null);
        this.L.setTag(null);
        N(view);
        y();
    }
}
