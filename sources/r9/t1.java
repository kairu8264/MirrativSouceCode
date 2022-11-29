package r9;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public final class t1 extends ConstraintLayout {
    public final s9.m1 U;

    public /* synthetic */ t1(Context context, AttributeSet attributeSet, int i10, int i11, jo.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public final void w(jf.n0 n0Var, boolean z10) {
        int i10;
        jo.p.h(n0Var, "tabItem");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        this.U.C.setImageResource(n0Var.b());
        this.U.D.setText(getResources().getText(n0Var.d()));
        if (z10) {
            i10 = q9.d.A;
        } else {
            i10 = q9.d.f48821y;
        }
        int d10 = c3.a.d(getContext(), i10);
        this.U.C.setColorFilter(d10, PorterDuff.Mode.SRC_IN);
        this.U.D.setTextColor(d10);
        if (n0Var.a()) {
            this.U.E.setVisibility(0);
        } else {
            this.U.E.setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        jo.p.h(context, "context");
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(context), q9.h.view_parts_large_category_tab_item, this, true);
        jo.p.g(e10, "inflate(inflater, R.layo…ory_tab_item, this, true)");
        this.U = (s9.m1) e10;
    }
}
