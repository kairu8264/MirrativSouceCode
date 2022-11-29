package pc;

import ae.e8;
import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrativ.customview.StatusView;

/* loaded from: classes2.dex */
public class b2 extends a2 {
    public static final ViewDataBinding.i H;
    public static final SparseIntArray I;
    public final LinearLayout F;
    public long G;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(5);
        H = iVar;
        iVar.a(0, new String[]{"toolbar"}, new int[]{1}, new int[]{nd.b1.toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(nc.e.Q5, 2);
        sparseIntArray.put(nc.e.terms_webview, 3);
        sparseIntArray.put(nc.e.start_button, 4);
    }

    public b2(androidx.databinding.e eVar, View view) {
        this(eVar, view, ViewDataBinding.B(eVar, view, 5, H, I));
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean D(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return V((e8) obj, i11);
    }

    public final boolean V(e8 e8Var, int i10) {
        if (i10 == nc.a.f41787a) {
            synchronized (this) {
                this.G |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l() {
        synchronized (this) {
            this.G = 0L;
        }
        ViewDataBinding.n(this.E);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean w() {
        synchronized (this) {
            if (this.G != 0) {
                return true;
            }
            return this.E.w();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void y() {
        synchronized (this) {
            this.G = 2L;
        }
        this.E.y();
        H();
    }

    public b2(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, (AppCompatButton) objArr[4], (StatusView) objArr[2], (WebView) objArr[3], (e8) objArr[1]);
        this.G = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.F = linearLayout;
        linearLayout.setTag(null);
        L(this.E);
        N(view);
        y();
    }
}
