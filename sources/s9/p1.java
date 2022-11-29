package s9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.GaugeView;
import com.dena.mirrorman.customview.MultipleStarView;
import com.google.android.material.card.MaterialCardView;
import r9.w1;

/* loaded from: classes.dex */
public class p1 extends o1 {
    public static final ViewDataBinding.i G0 = null;
    public static final SparseIntArray H0;
    public final FrameLayout A0;
    public final FrameLayout B0;
    public final FrameLayout C0;
    public final FrameLayout D0;
    public final AppCompatTextView E0;
    public long F0;

    /* renamed from: y0  reason: collision with root package name */
    public final ConstraintLayout f52550y0;

    /* renamed from: z0  reason: collision with root package name */
    public final FrameLayout f52551z0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H0 = sparseIntArray;
        sparseIntArray.put(q9.g.f48839z1, 29);
        sparseIntArray.put(q9.g.f48838y1, 30);
        sparseIntArray.put(q9.g.A1, 31);
        sparseIntArray.put(q9.g.B1, 32);
        sparseIntArray.put(q9.g.weapon_label_text_view, 33);
        sparseIntArray.put(q9.g.spec_background_view, 34);
        sparseIntArray.put(q9.g.spec_label_text_view, 35);
        sparseIntArray.put(q9.g.spec_background_bottom_anchor_space, 36);
        sparseIntArray.put(q9.g.center_anchor_view, 37);
        sparseIntArray.put(q9.g.left_gauge_barrier, 38);
        sparseIntArray.put(q9.g.right_gauge_barrier, 39);
        sparseIntArray.put(q9.g.power_label_text_view, 40);
        sparseIntArray.put(q9.g.left_attributes_barrier, 41);
        sparseIntArray.put(q9.g.weight_label_text_view, 42);
        sparseIntArray.put(q9.g.speed_label_text_view, 43);
        sparseIntArray.put(q9.g.right_attributes_barrier, 44);
        sparseIntArray.put(q9.g.accel_label_text_view, 45);
        sparseIntArray.put(q9.g.attributes_bottom_divider_view, 46);
        sparseIntArray.put(q9.g.item_label_text_view, 47);
        sparseIntArray.put(q9.g.costume_label_text_view, 48);
        sparseIntArray.put(q9.g.costume_effect_text_container, 49);
        sparseIntArray.put(q9.g.power_value_change_popup_card_view, 50);
        sparseIntArray.put(q9.g.speed_value_change_popup_card_view, 51);
        sparseIntArray.put(q9.g.weight_value_change_popup_card_view, 52);
        sparseIntArray.put(q9.g.accel_value_change_popup_card_view, 53);
        sparseIntArray.put(q9.g.costume_bonus_change_popup_card_view, 54);
    }

    public p1(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 55, G0, H0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // s9.o1
    public void T(w1 w1Var) {
        this.f52549x0 = w1Var;
        synchronized (this) {
            this.F0 |= 1;
        }
        c(q9.a.f48787b);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        boolean z15;
        int i15;
        int i16;
        boolean z16;
        int i17;
        boolean z17;
        boolean z18;
        int i18;
        int[] iArr;
        String str;
        String str2;
        int[] iArr2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int[] iArr3;
        String str11;
        String str12;
        String str13;
        int[] iArr4;
        String str14;
        String str15;
        String str16;
        String str17;
        w1.b bVar;
        String str18;
        String str19;
        w1.b bVar2;
        String str20;
        String str21;
        w1.b bVar3;
        String str22;
        String str23;
        w1.b bVar4;
        int i19;
        String str24;
        int[] iArr5;
        String str25;
        int i20;
        String str26;
        String str27;
        int[] iArr6;
        int i21;
        int i22;
        String str28;
        int[] iArr7;
        String str29;
        synchronized (this) {
            j10 = this.F0;
            this.F0 = 0L;
        }
        w1 w1Var = this.f52549x0;
        int i23 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        int i24 = 0;
        String str30 = null;
        if (i23 != 0) {
            if (w1Var != null) {
                str16 = w1Var.f();
                str17 = w1Var.n();
                z11 = w1Var.r();
                bVar = w1Var.a();
                i10 = w1Var.d();
                str18 = w1Var.b();
                str19 = w1Var.c();
                bVar2 = w1Var.i();
                str20 = w1Var.k();
                str21 = w1Var.h();
                bVar3 = w1Var.o();
                str22 = w1Var.g();
                z12 = w1Var.p();
                str23 = w1Var.l();
                bVar4 = w1Var.m();
                i14 = w1Var.j();
                z10 = w1Var.q();
            } else {
                z10 = false;
                z11 = false;
                i10 = 0;
                z12 = false;
                i14 = 0;
                str16 = null;
                str17 = null;
                bVar = null;
                str18 = null;
                str19 = null;
                bVar2 = null;
                str20 = null;
                str21 = null;
                bVar3 = null;
                str22 = null;
                str23 = null;
                bVar4 = null;
            }
            z13 = !z11;
            z14 = !z12;
            if (bVar != null) {
                z15 = bVar.h();
                iArr5 = bVar.b();
                str25 = bVar.e();
                i16 = bVar.g();
                i19 = bVar.f();
                str24 = bVar.a();
            } else {
                z15 = false;
                i16 = 0;
                i19 = 0;
                str24 = null;
                iArr5 = null;
                str25 = null;
            }
            if (bVar2 != null) {
                z16 = bVar2.h();
                i17 = bVar2.g();
                str27 = bVar2.a();
                i20 = bVar2.f();
                iArr6 = bVar2.b();
                str26 = bVar2.e();
            } else {
                z16 = false;
                i17 = 0;
                i20 = 0;
                str26 = null;
                str27 = null;
                iArr6 = null;
            }
            if (bVar3 != null) {
                i22 = bVar3.f();
                str28 = bVar3.e();
                z17 = bVar3.h();
                iArr7 = bVar3.b();
                str29 = bVar3.a();
                i21 = bVar3.g();
            } else {
                i21 = 0;
                i22 = 0;
                z17 = false;
                str28 = null;
                iArr7 = null;
                str29 = null;
            }
            if (bVar4 != null) {
                int f10 = bVar4.f();
                int[] b10 = bVar4.b();
                z18 = bVar4.h();
                i18 = bVar4.g();
                String e10 = bVar4.e();
                iArr3 = b10;
                str13 = str17;
                str = str18;
                str8 = str26;
                str9 = str20;
                str10 = str23;
                str11 = bVar4.a();
                iArr2 = iArr5;
                str4 = str25;
                str30 = str27;
                i15 = i20;
                i12 = i22;
                str15 = str28;
                iArr4 = iArr7;
                str14 = str29;
                str12 = e10;
                i13 = f10;
                str5 = str19;
                i24 = i19;
            } else {
                i13 = 0;
                z18 = false;
                i18 = 0;
                iArr3 = null;
                str11 = null;
                str12 = null;
                str13 = str17;
                str = str18;
                str8 = str26;
                str9 = str20;
                str10 = str23;
                iArr2 = iArr5;
                str4 = str25;
                i24 = i19;
                str30 = str27;
                i15 = i20;
                i12 = i22;
                str15 = str28;
                iArr4 = iArr7;
                str14 = str29;
                str5 = str19;
            }
            str3 = str24;
            str2 = str21;
            str6 = str16;
            iArr = iArr6;
            String str31 = str22;
            i11 = i21;
            str7 = str31;
        } else {
            z10 = false;
            z11 = false;
            i10 = 0;
            i11 = 0;
            z12 = false;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            z13 = false;
            z14 = false;
            z15 = false;
            i15 = 0;
            i16 = 0;
            z16 = false;
            i17 = 0;
            z17 = false;
            z18 = false;
            i18 = 0;
            iArr = null;
            str = null;
            str2 = null;
            iArr2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            iArr3 = null;
            str11 = null;
            str12 = null;
            str13 = null;
            iArr4 = null;
            str14 = null;
            str15 = null;
        }
        if (i23 != 0) {
            GaugeView.h(this.B, iArr2, true);
            x3.e.c(this.E, str3);
            x3.e.c(this.F, str4);
            this.F.setTextColor(i24);
            td.b.i(this.F, Integer.valueOf(i16));
            x3.e.c(this.K, str5);
            this.K.setTextColor(i10);
            td.c.e(this.K, Boolean.valueOf(z12));
            x3.e.c(this.Q, str6);
            td.c.e(this.Q, Boolean.valueOf(z11));
            x3.e.c(this.S, str7);
            td.c.e(this.S, Boolean.valueOf(z11));
            x3.e.c(this.V, str2);
            td.c.e(this.f52551z0, Boolean.valueOf(z16));
            td.c.e(this.A0, Boolean.valueOf(z18));
            td.c.e(this.B0, Boolean.valueOf(z17));
            td.c.e(this.C0, Boolean.valueOf(z15));
            td.c.e(this.D0, Boolean.valueOf(z10));
            x3.e.c(this.E0, str);
            td.c.e(this.W, Boolean.valueOf(z14));
            td.c.e(this.X, Boolean.valueOf(z13));
            GaugeView.h(this.Y, iArr, true);
            x3.e.c(this.f52527b0, str30);
            x3.e.c(this.f52528c0, str8);
            this.f52528c0.setTextColor(i15);
            td.b.i(this.f52528c0, Integer.valueOf(i17));
            this.f52529d0.setStarCountAndApply(i14);
            x3.e.c(this.f52534i0, str9);
            x3.e.c(this.f52536k0, str10);
            GaugeView.h(this.f52537l0, iArr3, true);
            x3.e.c(this.f52540o0, str11);
            x3.e.c(this.f52541p0, str12);
            this.f52541p0.setTextColor(i13);
            td.b.i(this.f52541p0, Integer.valueOf(i18));
            x3.e.c(this.f52543r0, str13);
            GaugeView.h(this.f52544s0, iArr4, true);
            x3.e.c(this.f52547v0, str14);
            x3.e.c(this.f52548w0, str15);
            this.f52548w0.setTextColor(i12);
            td.b.i(this.f52548w0, Integer.valueOf(i11));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.F0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.F0 = 2L;
        }
        H();
    }

    public p1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (GaugeView) objArr[12], (AppCompatTextView) objArr[45], (MaterialCardView) objArr[53], (AppCompatTextView) objArr[26], (AppCompatTextView) objArr[13], (View) objArr[46], (View) objArr[37], (MaterialCardView) objArr[54], (ConstraintLayout) objArr[49], (AppCompatTextView) objArr[17], (AppCompatTextView) objArr[48], (Guideline) objArr[30], (Guideline) objArr[29], (Guideline) objArr[31], (Guideline) objArr[32], (AppCompatTextView) objArr[16], (AppCompatTextView) objArr[47], (AppCompatTextView) objArr[14], (Barrier) objArr[41], (Barrier) objArr[38], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[18], (AppCompatTextView) objArr[15], (GaugeView) objArr[6], (AppCompatTextView) objArr[40], (MaterialCardView) objArr[50], (AppCompatTextView) objArr[20], (AppCompatTextView) objArr[7], (MultipleStarView) objArr[1], (Barrier) objArr[44], (Barrier) objArr[39], (View) objArr[36], (View) objArr[34], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[35], (AppCompatTextView) objArr[4], (GaugeView) objArr[10], (AppCompatTextView) objArr[43], (MaterialCardView) objArr[51], (AppCompatTextView) objArr[22], (AppCompatTextView) objArr[11], (AppCompatTextView) objArr[33], (AppCompatTextView) objArr[3], (GaugeView) objArr[8], (AppCompatTextView) objArr[42], (MaterialCardView) objArr[52], (AppCompatTextView) objArr[24], (AppCompatTextView) objArr[9]);
        this.F0 = -1L;
        this.B.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.K.setTag(null);
        this.Q.setTag(null);
        this.S.setTag(null);
        this.V.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f52550y0 = constraintLayout;
        constraintLayout.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[19];
        this.f52551z0 = frameLayout;
        frameLayout.setTag(null);
        FrameLayout frameLayout2 = (FrameLayout) objArr[21];
        this.A0 = frameLayout2;
        frameLayout2.setTag(null);
        FrameLayout frameLayout3 = (FrameLayout) objArr[23];
        this.B0 = frameLayout3;
        frameLayout3.setTag(null);
        FrameLayout frameLayout4 = (FrameLayout) objArr[25];
        this.C0 = frameLayout4;
        frameLayout4.setTag(null);
        FrameLayout frameLayout5 = (FrameLayout) objArr[27];
        this.D0 = frameLayout5;
        frameLayout5.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[28];
        this.E0 = appCompatTextView;
        appCompatTextView.setTag(null);
        this.W.setTag(null);
        this.X.setTag(null);
        this.Y.setTag(null);
        this.f52527b0.setTag(null);
        this.f52528c0.setTag(null);
        this.f52529d0.setTag(null);
        this.f52534i0.setTag(null);
        this.f52536k0.setTag(null);
        this.f52537l0.setTag(null);
        this.f52540o0.setTag(null);
        this.f52541p0.setTag(null);
        this.f52543r0.setTag(null);
        this.f52544s0.setTag(null);
        this.f52547v0.setTag(null);
        this.f52548w0.setTag(null);
        N(view);
        y();
    }
}
