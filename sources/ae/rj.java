package ae;

import android.text.SpannableString;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.LiveCatalogStreamerView;
import com.dena.mirrorman.customview.LiveTimeView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class rj extends qj {

    /* renamed from: d0  reason: collision with root package name */
    public static final ViewDataBinding.i f1487d0 = null;

    /* renamed from: e0  reason: collision with root package name */
    public static final SparseIntArray f1488e0;

    /* renamed from: b0  reason: collision with root package name */
    public final ConstraintLayout f1489b0;

    /* renamed from: c0  reason: collision with root package name */
    public long f1490c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1488e0 = sparseIntArray;
        sparseIntArray.put(nd.z0.collab_live_image_view, 18);
        sparseIntArray.put(nd.z0.collab_text_view, 19);
        sparseIntArray.put(nd.z0.M7, 20);
        sparseIntArray.put(nd.z0.live_streamer_view, 21);
        sparseIntArray.put(nd.z0.follow_button_tap_area_view, 22);
        sparseIntArray.put(nd.z0.Y4, 23);
        sparseIntArray.put(nd.z0.sent_gift_point_image_view, 24);
        sparseIntArray.put(nd.z0.sent_gift_point_label_view, 25);
    }

    public rj(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 26, f1487d0, f1488e0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.qj
    public void T(ud.b5 b5Var) {
        this.f1471a0 = b5Var;
        synchronized (this) {
            this.f1490c0 |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        long j11;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        boolean z13;
        int i13;
        String str;
        String str2;
        SpannableString spannableString;
        String str3;
        String str4;
        String str5;
        String str6;
        synchronized (this) {
            j10 = this.f1490c0;
            j11 = 0;
            this.f1490c0 = 0L;
        }
        ud.b5 b5Var = this.f1471a0;
        int i14 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        boolean z14 = false;
        if (i14 == 0 || b5Var == null) {
            z10 = false;
            i10 = 0;
            z11 = false;
            z12 = false;
            i11 = 0;
            i12 = 0;
            z13 = false;
            i13 = 0;
            str = null;
            str2 = null;
            spannableString = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        } else {
            boolean E = b5Var.E();
            boolean B = b5Var.B();
            String s10 = b5Var.s();
            int i15 = b5Var.i();
            long x10 = b5Var.x();
            spannableString = b5Var.m();
            str3 = b5Var.o();
            str4 = b5Var.t();
            str5 = b5Var.a();
            z12 = b5Var.C();
            i11 = b5Var.q();
            boolean A = b5Var.A();
            i12 = b5Var.n();
            z13 = b5Var.D();
            String k10 = b5Var.k();
            i13 = b5Var.u();
            str6 = b5Var.r();
            str = s10;
            str2 = k10;
            z10 = B;
            j11 = x10;
            z11 = E;
            i10 = i15;
            z14 = A;
        }
        if (i14 != 0) {
            td.a.d(this.B, str5);
            td.c.e(this.C, Boolean.valueOf(z14));
            td.c.e(this.F, Boolean.valueOf(z10));
            AppCompatImageView appCompatImageView = this.I;
            Boolean bool = Boolean.TRUE;
            td.a.r(appCompatImageView, str6, 4, null, bool, null, null, null);
            td.b.a(this.J, Integer.valueOf(i10));
            td.c.e(this.K, Boolean.valueOf(z12));
            x3.e.c(this.L, str2);
            td.c.e(this.O, Boolean.valueOf(z13));
            td.b.g(this.P, Integer.valueOf(i12));
            td.b.f(this.P, spannableString);
            td.a.h(this.Q, str3);
            td.a.v(this.R, str);
            td.a.r(this.S, str4, 4, null, null, null, null, bool);
            td.b.d(this.V, Integer.valueOf(i11), null);
            td.b.l(this.W, Integer.valueOf(i13));
            td.c.e(this.X, Boolean.valueOf(z11));
            td.c.e(this.Y, Boolean.valueOf(z11));
            td.b.m(this.Z, Long.valueOf(j11));
            td.c.e(this.Z, Boolean.valueOf(z11));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.f1490c0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.f1490c0 = 2L;
        }
        H();
    }

    public rj(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[5], (ConstraintLayout) objArr[8], (AppCompatImageView) objArr[18], (AppCompatTextView) objArr[19], (View) objArr[10], (RoundedButtonView) objArr[23], (ConstraintLayout) objArr[22], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[7], (AppCompatTextView) objArr[12], (LiveCatalogStreamerView) objArr[21], (Barrier) objArr[20], (LiveTimeView) objArr[9], (AppCompatTextView) objArr[11], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[4], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[24], (AppCompatTextView) objArr[25], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[13], (AppCompatImageView) objArr[15], (AppCompatTextView) objArr[16], (AppCompatTextView) objArr[17]);
        this.f1490c0 = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.F.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.O.setTag(null);
        this.P.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f1489b0 = constraintLayout;
        constraintLayout.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        this.V.setTag(null);
        this.W.setTag(null);
        this.X.setTag(null);
        this.Y.setTag(null);
        this.Z.setTag(null);
        N(view);
        y();
    }
}
