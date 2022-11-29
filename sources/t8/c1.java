package t8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.LeftRoundedWebView;

/* loaded from: classes.dex */
public abstract class c1 extends ViewDataBinding {
    public final LeftRoundedWebView B;
    public final AppCompatTextView C;
    public final AppCompatTextView D;

    public c1(Object obj, View view, int i10, LeftRoundedWebView leftRoundedWebView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i10);
        this.B = leftRoundedWebView;
        this.C = appCompatTextView;
        this.D = appCompatTextView2;
    }

    public static c1 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static c1 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (c1) ViewDataBinding.x(layoutInflater, r8.f1.view_holder_catalog_web_banner, viewGroup, z10, obj);
    }
}
