package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.LiveAnnounceAppView;

/* loaded from: classes2.dex */
public class bh extends ah {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(nd.z0.next_live_announcement_time_image_view, 4);
        sparseIntArray.put(nd.z0.time_view, 5);
        sparseIntArray.put(nd.z0.next_live_announcement_text_view, 6);
        sparseIntArray.put(nd.z0.f42376z7, 7);
    }

    public bh(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 8, L, M));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.ah
    public void T(ud.n2 n2Var) {
        this.I = n2Var;
        synchronized (this) {
            this.K |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        int i10;
        boolean z10;
        boolean z11;
        synchronized (this) {
            j10 = this.K;
            this.K = 0L;
        }
        ud.n2 n2Var = this.I;
        String str = null;
        int i11 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        boolean z12 = false;
        if (i11 != 0) {
            if (n2Var != null) {
                i10 = n2Var.c();
                z10 = n2Var.d();
                str = n2Var.a();
            } else {
                i10 = 0;
                z10 = false;
            }
            z11 = i10 != 0;
            if ((str != null ? str.length() : 0) != 0) {
                z12 = true;
            }
        } else {
            i10 = 0;
            z10 = false;
            z11 = false;
        }
        if (i11 != 0) {
            x3.e.c(this.C, str);
            td.c.e(this.C, Boolean.valueOf(z12));
            td.b.b(this.F, Integer.valueOf(i10));
            td.c.e(this.F, Boolean.valueOf(z11));
            td.c.e(this.G, Boolean.valueOf(z10));
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

    public bh(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (LiveAnnounceAppView) objArr[7], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[4], (AppCompatTextView) objArr[1], (AppCompatImageView) objArr[3], (LinearLayout) objArr[5]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        this.C.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        N(view);
        y();
    }
}
