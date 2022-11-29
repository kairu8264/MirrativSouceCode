package pc;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class t0 extends s0 {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(nc.e.f41818a7, 7);
        sparseIntArray.put(nc.e.R0, 8);
        sparseIntArray.put(nc.e.button_image_view, 9);
        sparseIntArray.put(nc.e.holiday_how_text_view, 10);
        sparseIntArray.put(nc.e.holiday_how_description_text_view, 11);
        sparseIntArray.put(nc.e.f41836o3, 12);
        sparseIntArray.put(nc.e.link_text_view, 13);
        sparseIntArray.put(nc.e.link_image_view, 14);
    }

    public t0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 15, S, T));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // pc.s0
    public void V(fd.a aVar) {
        this.Q = aVar;
        synchronized (this) {
            this.R |= 1;
        }
        c(nc.a.f41788b);
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
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilder2;
        Drawable drawable;
        synchronized (this) {
            j10 = this.R;
            this.R = 0L;
        }
        fd.a aVar = this.Q;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        boolean z11 = false;
        Drawable drawable2 = null;
        String str5 = null;
        if (i10 != 0) {
            if (aVar != null) {
                str5 = aVar.b();
                z11 = aVar.g();
                spannableStringBuilder2 = aVar.f();
                str3 = aVar.d();
                str4 = aVar.c();
                drawable = aVar.a();
                str2 = aVar.e();
            } else {
                spannableStringBuilder2 = null;
                str2 = null;
                str3 = null;
                str4 = null;
                drawable = null;
            }
            z10 = !z11;
            SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
            str = str5;
            drawable2 = drawable;
            spannableStringBuilder = spannableStringBuilder3;
        } else {
            z10 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            spannableStringBuilder = null;
        }
        if (i10 != 0) {
            x3.f.a(this.C, drawable2);
            this.C.setEnabled(z11);
            x3.e.c(this.C, str2);
            x3.e.c(this.F, str);
            x3.e.c(this.G, str4);
            x3.e.c(this.H, str3);
            td.c.e(this.H, Boolean.valueOf(z10));
            td.c.e(this.K, Boolean.valueOf(z11));
            x3.e.c(this.O, spannableStringBuilder);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.R != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.R = 2L;
        }
        H();
    }

    public t0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[9], (AppCompatTextView) objArr[6], (View) objArr[8], (ConstraintLayout) objArr[0], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[11], (AppCompatTextView) objArr[10], (AppCompatImageView) objArr[1], (LinearLayout) objArr[12], (AppCompatImageView) objArr[14], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[2], (View) objArr[7]);
        this.R = -1L;
        this.C.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.K.setTag(null);
        this.O.setTag(null);
        N(view);
        y();
    }
}
