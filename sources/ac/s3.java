package ac;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class s3 extends r3 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(xb.o.play_song_icon_image_view, 1);
        sparseIntArray.put(xb.o.song_title_text_view, 2);
        sparseIntArray.put(xb.o.singer_name_text_view, 3);
        sparseIntArray.put(xb.o.setting_container, 4);
        sparseIntArray.put(xb.o.pitch_value_container, 5);
        sparseIntArray.put(xb.o.pitch_value_text_view, 6);
        sparseIntArray.put(xb.o.speed_value_container, 7);
        sparseIntArray.put(xb.o.speed_value_text_view, 8);
        sparseIntArray.put(xb.o.emokara_setting_button, 9);
    }

    public s3(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 10, M, N));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.L != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.L = 1L;
        }
        H();
    }

    public s3(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (View) objArr[9], (LinearLayout) objArr[5], (AppCompatTextView) objArr[6], (AppCompatImageView) objArr[1], (LinearLayout) objArr[4], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[2], (LinearLayout) objArr[7], (AppCompatTextView) objArr[8]);
        this.L = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
