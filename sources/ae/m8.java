package ae;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.customview.AnniversaryMypageMonthlyStreamBalloonView;
import com.dena.mirrorman.customview.AnniversaryProfileMonthlyStreamBalloonView;

/* loaded from: classes2.dex */
public abstract class m8 extends ViewDataBinding {
    public final AnniversaryMypageMonthlyStreamBalloonView B;
    public final AnniversaryProfileMonthlyStreamBalloonView C;
    public final AppCompatImageView D;

    public m8(Object obj, View view, int i10, AnniversaryMypageMonthlyStreamBalloonView anniversaryMypageMonthlyStreamBalloonView, AnniversaryProfileMonthlyStreamBalloonView anniversaryProfileMonthlyStreamBalloonView, AppCompatImageView appCompatImageView) {
        super(obj, view, i10);
        this.B = anniversaryMypageMonthlyStreamBalloonView;
        this.C = anniversaryProfileMonthlyStreamBalloonView;
        this.D = appCompatImageView;
    }
}
