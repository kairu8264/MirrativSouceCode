package ac;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.feature.main.ReportDialogView;

/* loaded from: classes2.dex */
public abstract class z1 extends ViewDataBinding {
    public final ReportDialogView B;
    public final RelativeLayout C;

    public z1(Object obj, View view, int i10, ReportDialogView reportDialogView, RelativeLayout relativeLayout) {
        super(obj, view, i10);
        this.B = reportDialogView;
        this.C = relativeLayout;
    }
}
