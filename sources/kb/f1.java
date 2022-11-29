package kb;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import hb.w1;

/* loaded from: classes2.dex */
public class f1 extends e1 {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(w1.T2, 7);
        sparseIntArray.put(w1.guideline_top, 8);
        sparseIntArray.put(w1.S2, 9);
        sparseIntArray.put(w1.text_container, 10);
    }

    public f1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 11, O, P));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // kb.e1
    public void T(ob.c cVar) {
        this.L = cVar;
        synchronized (this) {
            this.N |= 1;
        }
        c(hb.a.f34700b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        int i10;
        int i11;
        int i12;
        synchronized (this) {
            j10 = this.N;
            this.N = 0L;
        }
        ob.c cVar = this.L;
        int i13 = ((3 & j10) > 0L ? 1 : ((3 & j10) == 0L ? 0 : -1));
        boolean z10 = false;
        if (i13 == 0 || cVar == null) {
            str = null;
            str2 = null;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        } else {
            int a10 = cVar.a();
            String b10 = cVar.b();
            boolean j11 = cVar.j();
            i11 = cVar.g();
            i12 = cVar.f();
            str = cVar.e();
            i10 = a10;
            z10 = j11;
            str2 = b10;
        }
        if (i13 != 0) {
            td.a.f(this.B, str2);
            td.c.e(this.C, Boolean.valueOf(z10));
            td.b.d(this.D, Integer.valueOf(i11), null);
            this.G.setText(str);
            td.b.h(this.G, Integer.valueOf(i12));
            td.c.a(this.J, Integer.valueOf(i10));
        }
        if ((j10 & 2) != 0) {
            td.b.j(this.F, "MPLUSRounded1c-Black.ttf");
            td.b.j(this.G, "MPLUSRounded1c-Black.ttf");
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.N != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.N = 2L;
        }
        H();
    }

    public f1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[6], (Guideline) objArr[8], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (LottieAnimationView) objArr[9], (ConstraintLayout) objArr[7], (View) objArr[1], (ConstraintLayout) objArr[10]);
        this.N = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.J.setTag(null);
        N(view);
        y();
    }
}
