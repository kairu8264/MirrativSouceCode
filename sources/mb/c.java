package mb;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import hb.c2;
import hb.t1;
import io.l;
import jo.h;
import jo.p;
import jo.q;
import l0.i;
import wn.f;
import wn.g;
import wn.v;

/* loaded from: classes2.dex */
public final class c extends androidx.fragment.app.e {
    public static final a P0 = new a(null);
    public static final int Q0 = 8;
    public d N0;
    public final f O0 = g.a(new b());

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(mb.b bVar) {
            p.h(bVar, "bindModel");
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_KEY_BIND_MODEL", bVar);
            cVar.V2(bundle);
            return cVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<mb.b> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final mb.b invoke() {
            Parcelable parcelable = c.this.M2().getParcelable("EXTRA_KEY_BIND_MODEL");
            mb.b bVar = parcelable instanceof mb.b ? (mb.b) parcelable : null;
            p.e(bVar);
            return bVar;
        }
    }

    /* renamed from: mb.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0599c extends q implements io.p<i, Integer, v> {

        /* renamed from: mb.c$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends q implements l<Integer, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c f40714w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar) {
                super(1);
                this.f40714w = cVar;
            }

            public final void a(int i10) {
                d dVar = this.f40714w.N0;
                if (dVar != null) {
                    dVar.S1(this.f40714w.D3().c(), i10, this.f40714w.D3().b());
                }
                this.f40714w.n3();
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(Integer num) {
                a(num.intValue());
                return v.f59242a;
            }
        }

        /* renamed from: mb.c$c$b */
        /* loaded from: classes2.dex */
        public static final class b extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c f40715w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar) {
                super(0);
                this.f40715w = cVar;
            }

            public final void a() {
                this.f40715w.n3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        public C0599c() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                e.b(c.this.D3(), new a(c.this), new b(c.this), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final mb.b D3() {
        return (mb.b) this.O0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        Context N2 = N2();
        p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setContent(s0.c.c(-1103529842, true, new C0599c()));
        return composeView;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.N0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        Window window2;
        p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window2 = p32.getWindow()) != null) {
            window2.setLayout(-1, -1);
        }
        Dialog p33 = p3();
        if (p33 == null || (window = p33.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(t1.f34975p);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), c2.f34740c);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        this.N0 = context instanceof d ? (d) context : null;
    }
}
