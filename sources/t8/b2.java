package t8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.catalog.mission.MissionItemView;
import com.google.android.exoplayer2.ui.PlayerView;

/* loaded from: classes.dex */
public class b2 extends a2 {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final ConstraintLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(r8.e1.J0, 2);
        sparseIntArray.put(r8.e1.app_title_text_view, 3);
        sparseIntArray.put(r8.e1.I1, 4);
        sparseIntArray.put(r8.e1.J1, 5);
        sparseIntArray.put(r8.e1.overlay_banner_image_view, 6);
        sparseIntArray.put(r8.e1.place_holder_view, 7);
        sparseIntArray.put(r8.e1.video_loading_progress_bar, 8);
        sparseIntArray.put(r8.e1.overlay_icon_image_view, 9);
        sparseIntArray.put(r8.e1.special_daily_mission_item_view, 10);
    }

    public b2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 11, N, O));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        synchronized (this) {
            j10 = this.M;
            this.M = 0L;
        }
        if ((j10 & 1) != 0) {
            td.c.b(this.D, 12, Integer.valueOf(ViewDataBinding.t(this.D, r8.b1.f49834d)));
            td.c.b(this.L, 12, Integer.valueOf(ViewDataBinding.t(this.L, r8.b1.f49836f)));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.M != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.M = 1L;
        }
        H();
    }

    public b2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatTextView) objArr[3], (AppCompatImageView) objArr[2], (AppCompatTextView) objArr[1], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[9], (View) objArr[7], (ConstraintLayout) objArr[4], (PlayerView) objArr[5], (MissionItemView) objArr[10], (ProgressBar) objArr[8]);
        this.M = -1L;
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
