package db;

import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class x extends w {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(wa.e.f58533i, 9);
        sparseIntArray.put(wa.e.footer_border_view, 10);
        sparseIntArray.put(wa.e.L, 11);
        sparseIntArray.put(wa.e.note_recycler_view, 12);
        sparseIntArray.put(wa.e.disclaimer_text_view, 13);
        sparseIntArray.put(wa.e.disclaimer_recycler_view, 14);
        sparseIntArray.put(wa.e.copyright_recycler_view, 15);
    }

    public x(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 16, T, U));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // db.w
    public void T(ya.m mVar) {
        this.R = mVar;
        synchronized (this) {
            this.S |= 1;
        }
        c(wa.a.f58500a);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        String str3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String str4;
        synchronized (this) {
            j10 = this.S;
            this.S = 0L;
        }
        ya.m mVar = this.R;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str5 = null;
        if (i10 == 0 || mVar == null) {
            str = null;
            str2 = null;
            str3 = null;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
            str4 = null;
        } else {
            String b10 = mVar.b();
            String f10 = mVar.f();
            String h10 = mVar.h();
            z11 = mVar.p();
            z12 = mVar.o();
            str2 = mVar.i();
            z13 = mVar.l();
            z14 = mVar.m();
            z15 = mVar.k();
            str3 = mVar.c();
            z10 = mVar.n();
            str4 = b10;
            str5 = h10;
            str = f10;
        }
        if (i10 != 0) {
            this.B.setTitle(str5);
            td.c.e(this.B, Boolean.valueOf(z15));
            this.C.setTitle(str2);
            td.c.e(this.C, Boolean.valueOf(z13));
            td.a.B(this.D, str4);
            x3.e.c(this.E, str3);
            this.J.setTitle(str);
            td.c.e(this.J, Boolean.valueOf(z14));
            td.c.e(this.O, Boolean.valueOf(z10));
            td.c.e(this.P, Boolean.valueOf(z12));
            td.c.e(this.Q, Boolean.valueOf(z11));
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

    public x(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (RoundedButtonView) objArr[5], (RoundedButtonView) objArr[6], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[1], (Barrier) objArr[9], (RecyclerView) objArr[15], (RecyclerView) objArr[14], (AppCompatTextView) objArr[13], (RoundedButtonView) objArr[4], (View) objArr[10], (ConstraintLayout) objArr[0], (RecyclerView) objArr[12], (AppCompatTextView) objArr[11], (RoundedButtonView) objArr[8], (RoundedButtonView) objArr[7], (WebView) objArr[3]);
        this.S = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.J.setTag(null);
        this.L.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
        N(view);
        y();
    }
}
