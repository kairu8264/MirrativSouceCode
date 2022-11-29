package ae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.OutlineTextView;

/* loaded from: classes2.dex */
public abstract class qn extends ViewDataBinding {
    public final OutlineTextView B;
    public final OutlineTextView C;
    public final AppCompatImageView D;
    public final ProgressBar E;
    public final OutlineTextView F;
    public final AppCompatTextView G;

    public qn(Object obj, View view, int i10, OutlineTextView outlineTextView, OutlineTextView outlineTextView2, AppCompatImageView appCompatImageView, ProgressBar progressBar, OutlineTextView outlineTextView3, AppCompatTextView appCompatTextView) {
        super(obj, view, i10);
        this.B = outlineTextView;
        this.C = outlineTextView2;
        this.D = appCompatImageView;
        this.E = progressBar;
        this.F = outlineTextView3;
        this.G = appCompatTextView;
    }

    public static qn T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static qn U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (qn) ViewDataBinding.x(layoutInflater, nd.b1.view_user_profile_yell_status_condition_progress, viewGroup, z10, obj);
    }
}
