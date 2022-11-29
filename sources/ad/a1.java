package ad;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import pc.y2;

/* loaded from: classes2.dex */
public final class a1 extends Fragment {

    /* renamed from: x0 */
    public pc.q1 f952x0;

    /* renamed from: y0 */
    public final wn.f f953y0;

    /* renamed from: z0 */
    public static final a f951z0 = new a(null);
    public static final int A0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ a1 b(a aVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return aVar.a(z10);
        }

        public final a1 a(boolean z10) {
            a1 a1Var = new a1();
            a1Var.V2(k3.b.a(wn.q.a("EXTRA_IS_VISIBLE_STEP", Boolean.valueOf(z10))));
            return a1Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            a1.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(a1.this.M2().getBoolean("EXTRA_IS_VISIBLE_STEP"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends androidx.activity.e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(true);
            a1.this = r1;
        }

        @Override // androidx.activity.e
        public void b() {
            a1.this.L2().finish();
        }
    }

    public a1() {
        super(nc.f.fragment_contract_complete);
        this.f953y0 = wn.g.a(new b());
    }

    public static final boolean n3(a1 a1Var, MenuItem menuItem) {
        jo.p.h(a1Var, "this$0");
        if (menuItem.getItemId() == nc.e.menu_item_close) {
            a1Var.L2().finish();
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        pc.q1 T = pc.q1.T(view);
        jo.p.g(T, "bind(view)");
        this.f952x0 = T;
        L2().c1().a(a1(), new c());
        pc.q1 q1Var = this.f952x0;
        if (q1Var == null) {
            jo.p.v("binding");
            q1Var = null;
        }
        q1Var.B.u().setVisibility(k3() ? 0 : 8);
        m3();
        l3();
    }

    public final boolean k3() {
        return ((Boolean) this.f953y0.getValue()).booleanValue();
    }

    public final void l3() {
        pc.q1 q1Var = this.f952x0;
        if (q1Var == null) {
            jo.p.v("binding");
            q1Var = null;
        }
        y2 y2Var = q1Var.B;
        y2Var.P.setVisibility(8);
        y2Var.Q.setVisibility(8);
        y2Var.F.setVisibility(8);
        y2Var.F.setVisibility(8);
    }

    public final void m3() {
        pc.q1 q1Var = this.f952x0;
        if (q1Var == null) {
            jo.p.v("binding");
            q1Var = null;
        }
        Toolbar toolbar = q1Var.C.B;
        toolbar.inflateMenu(nc.g.contract_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: ad.z0
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean n32;
                n32 = a1.n3(a1.this, menuItem);
                return n32;
            }
        });
        TextView textView = (TextView) toolbar.findViewById(nc.e.B6);
        if (textView == null) {
            return;
        }
        jo.p.g(textView, "findViewById<TextView>(R….toolbar_title) ?: return");
        toolbar.setBackgroundResource(nc.h.f41869c);
        textView.setVisibility(0);
        textView.setText(toolbar.getResources().getString(nc.i.text_contract_step_complete_title));
    }
}
