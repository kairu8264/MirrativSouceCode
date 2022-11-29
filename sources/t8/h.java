package t8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;

/* loaded from: classes.dex */
public class h extends g {

    /* renamed from: a0  reason: collision with root package name */
    public static final ViewDataBinding.i f53264a0 = null;

    /* renamed from: b0  reason: collision with root package name */
    public static final SparseIntArray f53265b0;
    public long Z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f53265b0 = sparseIntArray;
        sparseIntArray.put(r8.e1.N, 2);
        sparseIntArray.put(r8.e1.f49894z0, 3);
        sparseIntArray.put(r8.e1.f49891y0, 4);
        sparseIntArray.put(r8.e1.A0, 5);
        sparseIntArray.put(r8.e1.B0, 6);
        sparseIntArray.put(r8.e1.G, 7);
        sparseIntArray.put(r8.e1.photo_container, 8);
        sparseIntArray.put(r8.e1.photo_image_view, 9);
        sparseIntArray.put(r8.e1.comment_title_text_view, 10);
        sparseIntArray.put(r8.e1.comment_remaining_length_text_view, 11);
        sparseIntArray.put(r8.e1.f49890x2, 12);
        sparseIntArray.put(r8.e1.V2, 13);
        sparseIntArray.put(r8.e1.f49895z2, 14);
        sparseIntArray.put(r8.e1.f49892y2, 15);
        sparseIntArray.put(r8.e1.f49884u, 16);
        sparseIntArray.put(r8.e1.agree_to_terms_checkbox, 17);
        sparseIntArray.put(r8.e1.terms_of_service_text_view, 18);
        sparseIntArray.put(r8.e1.f49889x, 19);
        sparseIntArray.put(r8.e1.upload_button_space, 20);
        sparseIntArray.put(r8.e1.upload_button_view, 21);
        sparseIntArray.put(r8.e1.disabled_upload_button_view, 22);
        sparseIntArray.put(r8.e1.G2, 23);
    }

    public h(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 24, f53264a0, f53265b0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.Z;
            this.Z = 0L;
        }
        if ((j10 & 1) != 0) {
            td.c.b(this.F, 8, Integer.valueOf(ViewDataBinding.t(this.F, r8.b1.f49836f)));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.Z != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.Z = 1L;
        }
        H();
    }

    public h(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatCheckBox) objArr[17], (ConstraintLayout) objArr[16], (AppCompatTextView) objArr[19], (AppCompatImageView) objArr[7], (EditTextWithOnKeyPreImeListener) objArr[1], (AppCompatTextView) objArr[11], (AppCompatTextView) objArr[10], (ConstraintLayout) objArr[2], (RoundedButtonView) objArr[22], (Guideline) objArr[4], (Guideline) objArr[3], (Guideline) objArr[5], (Guideline) objArr[6], (ConstraintLayout) objArr[8], (AppCompatImageView) objArr[9], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[12], (SwitchCompat) objArr[15], (AppCompatTextView) objArr[14], (StatusView) objArr[23], (AppCompatTextView) objArr[18], (AppCompatImageView) objArr[13], (Space) objArr[20], (RoundedButtonView) objArr[21]);
        this.Z = -1L;
        this.F.setTag(null);
        this.Q.setTag(null);
        N(view);
        y();
    }
}
