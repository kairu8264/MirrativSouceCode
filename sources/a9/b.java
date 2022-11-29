package a9;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
import jo.h;
import jo.p;
import l0.i;
import r8.i1;
import wn.q;
import wn.v;

/* loaded from: classes.dex */
public final class b extends androidx.fragment.app.e implements e {
    public static final a N0 = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final b a(c cVar) {
            p.h(cVar, "bindModel");
            b bVar = new b();
            bVar.V2(k3.b.a(q.a("EXTRA_BIND_MODEL", cVar)));
            return bVar;
        }
    }

    /* renamed from: a9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0009b extends jo.q implements io.p<i, Integer, v> {
        public C0009b() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            c cVar = (c) b.this.M2().getParcelable("EXTRA_BIND_MODEL");
            if (cVar == null) {
                return;
            }
            d.a(null, cVar, b.this, iVar, 0, 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        Context N2 = N2();
        p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setViewCompositionStrategy(d2.c.f14419b);
        composeView.setContent(s0.c.c(-1917011285, true, new C0009b()));
        return composeView;
    }

    @Override // a9.e
    public void H() {
        n3();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), i1.f49926a);
        w3(false);
        return dialog;
    }
}
