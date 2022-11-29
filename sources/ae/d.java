package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class d extends c {
    public static final ViewDataBinding.i K;
    public static final SparseIntArray L;
    public long J;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(8);
        K = iVar;
        iVar.a(0, new String[]{"toolbar"}, new int[]{1}, new int[]{nd.b1.toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nd.z0.header, 2);
        sparseIntArray.put(nd.z0.I6, 3);
        sparseIntArray.put(nd.z0.f42266b9, 4);
        sparseIntArray.put(nd.z0.register, 5);
        sparseIntArray.put(nd.z0.install, 6);
        sparseIntArray.put(nd.z0.f42360w2, 7);
    }

    public d(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return T((e8) obj, i11);
    }

    public final boolean T(e8 e8Var, int i10) {
        if (i10 == nd.b.f41905a) {
            synchronized (this) {
                this.J |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.J = 0L;
        }
        ViewDataBinding.n(this.I);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.J != 0) {
                return true;
            }
            return this.I.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.J = 2L;
        }
        this.I.y();
        H();
    }

    public d(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (FrameLayout) objArr[7], (RelativeLayout) objArr[2], (AppCompatImageView) objArr[3], (ImageButton) objArr[6], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[5], (RelativeLayout) objArr[0], (e8) objArr[1]);
        this.J = -1L;
        this.H.setTag(null);
        L(this.I);
        N(view);
        y();
    }
}
