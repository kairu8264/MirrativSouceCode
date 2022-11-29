package ae;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.AnniversaryMypageMonthlyStreamBalloonView;
import com.dena.mirrorman.customview.AnniversaryProfileMonthlyStreamBalloonView;

/* loaded from: classes2.dex */
public class n8 extends m8 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final ConstraintLayout E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(nd.z0.popup_image_view, 1);
        sparseIntArray.put(nd.z0.anniversary_mypage_monthly_stream_balloon_view, 2);
        sparseIntArray.put(nd.z0.anniversary_profile_monthly_stream_balloon_view, 3);
    }

    public n8(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 4, G, H));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.F = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.F = 1L;
        }
        H();
    }

    public n8(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AnniversaryMypageMonthlyStreamBalloonView) objArr[2], (AnniversaryProfileMonthlyStreamBalloonView) objArr[3], (AppCompatImageView) objArr[1]);
        this.F = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        N(view);
        y();
    }
}
