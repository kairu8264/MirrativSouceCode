package nb;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.tabs.TabLayout;
import hb.t1;
import hb.v1;
import hb.x1;
import io.q;
import jf.s;
import jo.p;
import kb.l0;
import wn.v;

/* loaded from: classes2.dex */
public final class n extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public q<? super int[], ? super Integer, ? super Integer, v> f41782w;

    /* renamed from: x  reason: collision with root package name */
    public final l0 f41783x;

    /* renamed from: y  reason: collision with root package name */
    public final int[] f41784y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f41781z = new a(null);
    public static final int A = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final TabLayout.g a(TabLayout tabLayout, s sVar) {
            p.h(tabLayout, "<this>");
            p.h(sVar, "panel");
            TabLayout.g z10 = tabLayout.z();
            p.g(z10, "this.newTab()");
            Context context = z10.f27729i.getContext();
            p.g(context, "view.context");
            n nVar = new n(context);
            nVar.setGiftPanel(sVar);
            z10.p(nVar);
            return z10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        super(context);
        p.h(context, "context");
        this.f41783x = (l0) androidx.databinding.f.e(LayoutInflater.from(getContext()), x1.view_gift_panel_tab, this, true);
        this.f41784y = new int[2];
    }

    public final q<int[], Integer, Integer, v> getOnPanelTabViewLayout() {
        return this.f41782w;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        s T = this.f41783x.T();
        if (T != null && T.l()) {
            getLocationInWindow(this.f41784y);
            q<? super int[], ? super Integer, ? super Integer, v> qVar = this.f41782w;
            if (qVar != null) {
                qVar.s0(this.f41784y, Integer.valueOf(this.f41783x.u().getWidth()), Integer.valueOf(this.f41783x.u().getHeight()));
            }
        }
    }

    public final void setGiftPanel(s sVar) {
        p.h(sVar, "giftPanel");
        this.f41783x.U(sVar);
    }

    public final void setOnPanelTabViewLayout(q<? super int[], ? super Integer, ? super Integer, v> qVar) {
        this.f41782w = qVar;
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        super.setSelected(z10);
        s T = this.f41783x.T();
        if (T == null) {
            return;
        }
        if (z10) {
            if (T.l()) {
                this.f41783x.C.setBackground(getContext().getDrawable(v1.bg_gift_panel_focus_ranking_tab));
                this.f41783x.D.setTextColor(getContext().getColor(t1.btn_gift_panel_tab_text_focused));
            } else {
                this.f41783x.C.setBackgroundColor(getContext().getColor(t1.f34973n));
                this.f41783x.D.setTextColor(getContext().getColor(t1.btn_gift_panel_tab_text));
            }
            View view = this.f41783x.C;
            p.g(view, "binding.indicatorView");
            view.setVisibility(0);
            return;
        }
        this.f41783x.D.setTextColor(getContext().getColor(t1.f34974o));
        View view2 = this.f41783x.C;
        p.g(view2, "binding.indicatorView");
        view2.setVisibility(8);
    }

    public final void setTextTypeface(Typeface typeface) {
        p.h(typeface, "typeface");
        this.f41783x.D.setTypeface(typeface);
    }
}
