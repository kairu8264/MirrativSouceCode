package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.MultipleUserView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public class l0 extends k0 {
    public static final ViewDataBinding.i W = null;
    public static final SparseIntArray X;
    public final FrameLayout U;
    public long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(nd.z0.f42374z2, 3);
        sparseIntArray.put(nd.z0.L, 4);
        sparseIntArray.put(nd.z0.title_icon_image_view, 5);
        sparseIntArray.put(nd.z0.A1, 6);
        sparseIntArray.put(nd.z0.Ue, 7);
        sparseIntArray.put(nd.z0.shooter_settings_info_container, 8);
        sparseIntArray.put(nd.z0.shooter_setting_description_text_view, 9);
        sparseIntArray.put(nd.z0.invited_rerycler_view, 10);
        sparseIntArray.put(nd.z0.f42333qg, 11);
        sparseIntArray.put(nd.z0.f42344sg, 12);
        sparseIntArray.put(nd.z0.f42338rg, 13);
        sparseIntArray.put(nd.z0.footer_container_shadow, 14);
        sparseIntArray.put(nd.z0.footer_container_view, 15);
        sparseIntArray.put(nd.z0.f42328pa, 16);
        sparseIntArray.put(nd.z0.play_button_text_view, 17);
        sparseIntArray.put(nd.z0.f42268be, 18);
    }

    public l0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 19, W, X));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ae.k0
    public void V(ud.o3 o3Var) {
        this.T = o3Var;
        synchronized (this) {
            this.V |= 1;
        }
        c(nd.b.f41908d);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        boolean z10;
        synchronized (this) {
            j10 = this.V;
            this.V = 0L;
        }
        ud.o3 o3Var = this.T;
        float f10 = 0.0f;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        boolean z11 = false;
        if (i10 != 0) {
            if (o3Var != null) {
                z10 = o3Var.b();
                f10 = o3Var.a();
            } else {
                z10 = false;
            }
            if (!z10) {
                z11 = true;
            }
        } else {
            z10 = false;
        }
        if (i10 != 0) {
            td.c.e(this.H, Boolean.valueOf(z11));
            this.I.setEnabled(z10);
            if (ViewDataBinding.s() >= 11) {
                this.I.setAlpha(f10);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.V != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.V = 2L;
        }
        H();
    }

    public l0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[4], (AppCompatImageView) objArr[6], (ConstraintLayout) objArr[3], (View) objArr[14], (ConstraintLayout) objArr[15], (RecyclerView) objArr[10], (View) objArr[2], (RoundedButtonView) objArr[1], (AppCompatTextView) objArr[17], (MultipleUserView) objArr[16], (AppCompatTextView) objArr[9], (ConstraintLayout) objArr[8], (StatusView) objArr[18], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[11], (RecyclerView) objArr[13], (View) objArr[12]);
        this.V = -1L;
        this.H.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.U = frameLayout;
        frameLayout.setTag(null);
        this.I.setTag(null);
        N(view);
        y();
    }
}
