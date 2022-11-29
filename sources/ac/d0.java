package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.feature.comment.GiftEffectView;
import com.dena.mirrorman.feature.emomo.EmomoMotionView;
import com.dena.mirrorman.widget.KaraokeView;

/* loaded from: classes2.dex */
public class d0 extends c0 {
    public static final ViewDataBinding.i Z = null;

    /* renamed from: a0  reason: collision with root package name */
    public static final SparseIntArray f854a0;
    public final ConstraintLayout X;
    public long Y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f854a0 = sparseIntArray;
        sparseIntArray.put(xb.o.f60025q5, 1);
        sparseIntArray.put(xb.o.N2, 2);
        sparseIntArray.put(xb.o.P1, 3);
        sparseIntArray.put(xb.o.f60027q7, 4);
        sparseIntArray.put(xb.o.ranking_top_user, 5);
        sparseIntArray.put(xb.o.ranking_frame_image, 6);
        sparseIntArray.put(xb.o.comment_button, 7);
        sparseIntArray.put(xb.o.f60006m1, 8);
        sparseIntArray.put(xb.o.M1, 9);
        sparseIntArray.put(xb.o.icon_balloon, 10);
        sparseIntArray.put(xb.o.comment_box, 11);
        sparseIntArray.put(xb.o.f59978d8, 12);
        sparseIntArray.put(xb.o.gift_effect_view, 13);
        sparseIntArray.put(xb.o.karaoke_container, 14);
        sparseIntArray.put(xb.o.karaoke_background_view, 15);
        sparseIntArray.put(xb.o.karaoke_view, 16);
        sparseIntArray.put(xb.o.G9, 17);
        sparseIntArray.put(xb.o.singer_name_text_view, 18);
        sparseIntArray.put(xb.o.f60040u9, 19);
        sparseIntArray.put(xb.o.setting_button, 20);
        sparseIntArray.put(xb.o.karaoke_list_container, 21);
        sparseIntArray.put(xb.o.overlay_view, 22);
    }

    public d0(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 23, Z, f854a0));
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

    public d0(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatButton) objArr[8], (EditText) objArr[11], (AppCompatButton) objArr[7], (LinearLayout) objArr[9], (FrameLayout) objArr[3], (EmomoMotionView) objArr[2], (GiftEffectView) objArr[13], (AppCompatImageView) objArr[10], (View) objArr[15], (ConstraintLayout) objArr[14], (FrameLayout) objArr[21], (KaraokeView) objArr[16], (ConstraintLayout) objArr[1], (View) objArr[22], (ConstraintLayout) objArr[4], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[5], (AppCompatButton) objArr[12], (AppCompatButton) objArr[20], (AppCompatTextView) objArr[18], (AppCompatTextView) objArr[19], (AppCompatTextView) objArr[17]);
        this.Y = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.X = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
