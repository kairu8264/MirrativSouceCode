package t8;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class g2 extends ViewDataBinding {
    public final AppCompatImageView B;
    public final FrameLayout C;
    public final AppCompatImageView D;
    public final TextureView E;

    public g2(Object obj, View view, int i10, AppCompatImageView appCompatImageView, FrameLayout frameLayout, AppCompatImageView appCompatImageView2, TextureView textureView) {
        super(obj, view, i10);
        this.B = appCompatImageView;
        this.C = frameLayout;
        this.D = appCompatImageView2;
        this.E = textureView;
    }

    public static g2 T(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        return U(layoutInflater, viewGroup, z10, androidx.databinding.f.d());
    }

    @Deprecated
    public static g2 U(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (g2) ViewDataBinding.x(layoutInflater, r8.f1.view_live_preview, viewGroup, z10, obj);
    }
}
