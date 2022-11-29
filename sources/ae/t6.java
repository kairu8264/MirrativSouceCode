package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class t6 extends s6 {
    public static final ViewDataBinding.i Z = null;

    /* renamed from: a0  reason: collision with root package name */
    public static final SparseIntArray f1503a0;
    public final ConstraintLayout X;
    public long Y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1503a0 = sparseIntArray;
        sparseIntArray.put(nd.z0.frame_image_view, 1);
        sparseIntArray.put(nd.z0.A1, 2);
        sparseIntArray.put(nd.z0.effect_image_view, 3);
        sparseIntArray.put(nd.z0.present_image_bg_view, 4);
        sparseIntArray.put(nd.z0.present_image_view, 5);
        sparseIntArray.put(nd.z0.present_name_text_view, 6);
        sparseIntArray.put(nd.z0.notice_sent_text_view, 7);
        sparseIntArray.put(nd.z0.catch_copy_image_view, 8);
        sparseIntArray.put(nd.z0.content_switch_container, 9);
        sparseIntArray.put(nd.z0.more_gacha_container, 10);
        sparseIntArray.put(nd.z0.more_gacha_promote1_text_view, 11);
        sparseIntArray.put(nd.z0.more_gacha_promote2_text_view, 12);
        sparseIntArray.put(nd.z0.special_gacha_container, 13);
        sparseIntArray.put(nd.z0.special_promote1_text_view, 14);
        sparseIntArray.put(nd.z0.special_promote_text_image_view, 15);
        sparseIntArray.put(nd.z0.special_promote2_text_view, 16);
        sparseIntArray.put(nd.z0.special_item_recycler_view, 17);
        sparseIntArray.put(nd.z0.share_container, 18);
        sparseIntArray.put(nd.z0.share_line_image_view, 19);
        sparseIntArray.put(nd.z0.share_twitter_image_view, 20);
        sparseIntArray.put(nd.z0.share_others_image_view, 21);
        sparseIntArray.put(nd.z0.notes_text_view, 22);
    }

    public t6(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 23, Z, f1503a0));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.Y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.Y != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.Y = 1L;
        }
        H();
    }

    public t6(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[8], (AppCompatImageView) objArr[2], (ConstraintLayout) objArr[9], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[1], (ConstraintLayout) objArr[10], (AppCompatTextView) objArr[11], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[22], (AppCompatTextView) objArr[7], (View) objArr[4], (AppCompatImageView) objArr[5], (AppCompatTextView) objArr[6], (ConstraintLayout) objArr[18], (AppCompatImageView) objArr[19], (AppCompatImageView) objArr[21], (AppCompatImageView) objArr[20], (ConstraintLayout) objArr[13], (RecyclerView) objArr[17], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[16], (AppCompatImageView) objArr[15]);
        this.Y = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.X = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
