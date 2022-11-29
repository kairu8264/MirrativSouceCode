package db;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class z extends y {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final ConstraintLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(wa.e.f58540o, 9);
        sparseIntArray.put(wa.e.share_mission_text_view, 10);
        sparseIntArray.put(wa.e.twitter_share_button, 11);
    }

    public z(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 12, P, Q));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // db.y
    public void T(ya.v vVar) {
        this.M = vVar;
        synchronized (this) {
            this.O |= 1;
        }
        c(wa.a.f58500a);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        synchronized (this) {
            j10 = this.O;
            this.O = 0L;
        }
        ya.v vVar = this.M;
        int i10 = ((3 & j10) > 0L ? 1 : ((3 & j10) == 0L ? 0 : -1));
        boolean z11 = false;
        String str7 = null;
        if (i10 == 0 || vVar == null) {
            z10 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        } else {
            z11 = vVar.j();
            String e10 = vVar.e();
            String h10 = vVar.h();
            z10 = vVar.k();
            str3 = vVar.c();
            String i11 = vVar.i();
            String b10 = vVar.b();
            str6 = vVar.d();
            str2 = vVar.g();
            str = e10;
            str7 = b10;
            str5 = i11;
            str4 = h10;
        }
        if (i10 != 0) {
            td.a.f(this.C, str7);
            this.D.setTitle(str6);
            td.c.e(this.E, Boolean.valueOf(z11));
            x3.e.c(this.F, str3);
            x3.e.c(this.G, str);
            td.c.e(this.G, Boolean.valueOf(z10));
            x3.e.c(this.H, str2);
            x3.e.c(this.I, str4);
            x3.e.c(this.K, str5);
        }
        if ((j10 & 2) != 0) {
            td.c.c(this.E, 8, 1, Integer.valueOf(ViewDataBinding.t(this.E, wa.c.f58514f)), Integer.valueOf(ViewDataBinding.t(this.E, wa.c.f58509a)));
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

    public z(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[9], (AppCompatImageView) objArr[1], (RoundedButtonView) objArr[8], (ConstraintLayout) objArr[5], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[2], (RoundedButtonView) objArr[11]);
        this.O = -1L;
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.N = constraintLayout;
        constraintLayout.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.K.setTag(null);
        N(view);
        y();
    }
}
