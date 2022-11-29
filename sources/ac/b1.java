package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.ProfileImageView;

/* loaded from: classes2.dex */
public class b1 extends a1 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final FrameLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(xb.o.f60024q1, 5);
        sparseIntArray.put(xb.o.f60037u1, 6);
        sparseIntArray.put(xb.o.Q8, 7);
    }

    public b1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ac.a1
    public void V(cc.o oVar) {
        this.I = oVar;
        synchronized (this) {
            this.K |= 1;
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
            j10 = this.K;
            this.K = 0L;
        }
        boolean z10 = false;
        cc.o oVar = this.I;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str3 = null;
        if (i10 == 0 || oVar == null) {
            str = null;
            str2 = null;
        } else {
            String c10 = oVar.c();
            String a10 = oVar.a();
            str2 = oVar.b();
            z10 = oVar.d();
            str = c10;
            str3 = a10;
        }
        if (i10 != 0) {
            td.c.e(this.D, Boolean.valueOf(z10));
            td.c.e(this.E, Boolean.valueOf(z10));
            this.F.setProfileContinuousBadgeImageUrl(str3);
            this.F.setProfileImageUrl(str2);
            x3.e.c(this.H, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.K = 2L;
        }
        H();
    }

    public b1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[3], (ProfileImageView) objArr[4], (StatusView) objArr[7], (AppCompatTextView) objArr[1]);
        this.K = -1L;
        this.D.setTag(null);
        this.E.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.J = frameLayout;
        frameLayout.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        N(view);
        y();
    }
}
