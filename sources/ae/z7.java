package ae;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public class z7 extends y7 {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final FrameLayout P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(nd.z0.one_image, 1);
        sparseIntArray.put(nd.z0.two_images, 2);
        sparseIntArray.put(nd.z0.two_images_left, 3);
        sparseIntArray.put(nd.z0.two_images_right, 4);
        sparseIntArray.put(nd.z0.three_images, 5);
        sparseIntArray.put(nd.z0.three_images_left, 6);
        sparseIntArray.put(nd.z0.three_images_upper_right, 7);
        sparseIntArray.put(nd.z0.three_images_bottom_right, 8);
        sparseIntArray.put(nd.z0.three_images_horizontal_border, 9);
        sparseIntArray.put(nd.z0.four_images, 10);
        sparseIntArray.put(nd.z0.four_images_upper_left, 11);
        sparseIntArray.put(nd.z0.four_images_upper_right, 12);
        sparseIntArray.put(nd.z0.four_images_bottom_right, 13);
        sparseIntArray.put(nd.z0.four_images_bottom_left, 14);
    }

    public z7(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 15, R, S));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.Q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.Q != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.Q = 1L;
        }
        H();
    }

    public z7(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (RelativeLayout) objArr[10], (AppCompatImageView) objArr[14], (AppCompatImageView) objArr[13], (AppCompatImageView) objArr[11], (AppCompatImageView) objArr[12], (AppCompatImageView) objArr[1], (RelativeLayout) objArr[5], (AppCompatImageView) objArr[8], (View) objArr[9], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[7], (RelativeLayout) objArr[2], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[4]);
        this.Q = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.P = frameLayout;
        frameLayout.setTag(null);
        N(view);
        y();
    }
}
