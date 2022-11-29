package t8;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.widget.LeftRoundedWebView;

/* loaded from: classes.dex */
public class d1 extends c1 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final CardView E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(r8.e1.ad_content_web_view, 1);
        sparseIntArray.put(r8.e1.main_text_view, 2);
        sparseIntArray.put(r8.e1.term_text_view, 3);
    }

    public d1(androidx.databinding.e eVar, View view) {
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

    public d1(androidx.databinding.e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, (LeftRoundedWebView) objArr[1], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[3]);
        this.F = -1L;
        CardView cardView = (CardView) objArr[0];
        this.E = cardView;
        cardView.setTag(null);
        N(view);
        y();
    }
}
