package pc;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.RoundedMultipleImagesView;

/* loaded from: classes2.dex */
public class d3 extends c3 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(nc.e.rounded_multiple_images_view, 6);
    }

    public d3(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 7, K, L));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // pc.c3
    public void T(uc.b bVar) {
        this.H = bVar;
        synchronized (this) {
            this.J |= 1;
        }
        c(nc.a.f41788b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            j10 = this.J;
            this.J = 0L;
        }
        uc.b bVar = this.H;
        int i11 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        int i12 = 0;
        String str5 = null;
        if (i11 == 0 || bVar == null) {
            z10 = false;
            i10 = 0;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        } else {
            String c10 = bVar.c();
            String e10 = bVar.e();
            z10 = bVar.i();
            i10 = bVar.g();
            str2 = bVar.d();
            String a10 = bVar.a();
            str4 = bVar.h();
            str3 = e10;
            i12 = bVar.f();
            str = c10;
            str5 = a10;
        }
        if (i11 != 0) {
            x3.e.c(this.B, str5);
            x3.e.c(this.C, str);
            x3.e.c(this.D, str2);
            x3.e.c(this.F, str3);
            td.b.i(this.F, Integer.valueOf(i12));
            x3.e.c(this.G, str4);
            this.G.setBackgroundResource(i10);
            td.c.e(this.G, Boolean.valueOf(z10));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.J != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.J = 2L;
        }
        H();
    }

    public d3(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[3], (RoundedMultipleImagesView) objArr[6], (AppCompatTextView) objArr[1], (AppCompatTextView) objArr[5]);
        this.J = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        N(view);
        y();
    }
}
