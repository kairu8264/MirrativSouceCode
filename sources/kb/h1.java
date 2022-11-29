package kb;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import hb.w1;

/* loaded from: classes2.dex */
public class h1 extends g1 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(w1.f34997d0, 6);
        sparseIntArray.put(w1.coin_container, 7);
        sparseIntArray.put(w1.coin_image, 8);
    }

    public h1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 9, M, N));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return false;
                        }
                        return U((LiveData) obj, i11);
                    }
                    return V((LiveData) obj, i11);
                }
                return X((LiveData) obj, i11);
            }
            return W((LiveData) obj, i11);
        }
        return Y((LiveData) obj, i11);
    }

    @Override // kb.g1
    public void T(rf.e eVar) {
        this.J = eVar;
        synchronized (this) {
            this.L |= 32;
        }
        c(hb.a.f34702d);
        super.H();
    }

    public final boolean U(LiveData<Integer> liveData, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.L |= 16;
            }
            return true;
        }
        return false;
    }

    public final boolean V(LiveData<String> liveData, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.L |= 8;
            }
            return true;
        }
        return false;
    }

    public final boolean W(LiveData<Boolean> liveData, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.L |= 2;
            }
            return true;
        }
        return false;
    }

    public final boolean X(LiveData<String> liveData, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.L |= 4;
            }
            return true;
        }
        return false;
    }

    public final boolean Y(LiveData<String> liveData, int i10) {
        if (i10 == hb.a.f34699a) {
            synchronized (this) {
                this.L |= 1;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.h1.l():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.L != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.L = 64L;
        }
        H();
    }

    public h1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 5, (LinearLayout) objArr[7], (AppCompatImageView) objArr[8], (AppCompatTextView) objArr[5], (LinearLayout) objArr[6], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[4], (EditText) objArr[3], (AppCompatTextView) objArr[1]);
        this.L = -1L;
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        N(view);
        y();
    }
}
