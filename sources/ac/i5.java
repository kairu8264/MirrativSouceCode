package ac;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;

/* loaded from: classes2.dex */
public class i5 extends h5 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(xb.o.f60010m8, 4);
        sparseIntArray.put(xb.o.Z, 5);
    }

    public i5(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 6, J, K));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        return false;
    }

    @Override // ac.h5
    public void T(GiftItem giftItem) {
        this.G = giftItem;
        synchronized (this) {
            this.I |= 1;
        }
        c(xb.b.f59849l);
        super.H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        long j10;
        String str;
        String str2;
        synchronized (this) {
            j10 = this.I;
            this.I = 0L;
        }
        GiftItem giftItem = this.G;
        int i10 = ((j10 & 3) > 0L ? 1 : ((j10 & 3) == 0L ? 0 : -1));
        String str3 = null;
        if (i10 == 0 || giftItem == null) {
            str = null;
            str2 = null;
        } else {
            String profileImageUrl = giftItem.getProfileImageUrl();
            String giftSmallImageUrl = giftItem.getGiftSmallImageUrl();
            str2 = giftItem.getUserName();
            str = profileImageUrl;
            str3 = giftSmallImageUrl;
        }
        if (i10 != 0) {
            td.a.f(this.C, str3);
            td.a.i(this.D, str);
            x3.e.c(this.F, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            return this.I != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.I = 2L;
        }
        H();
    }

    public i5(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (AppCompatImageView) objArr[5], (AppCompatImageView) objArr[3], (AppCompatImageView) objArr[1], (View) objArr[4], (AppCompatTextView) objArr[2]);
        this.I = -1L;
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        this.D.setTag(null);
        this.F.setTag(null);
        N(view);
        y();
    }
}
