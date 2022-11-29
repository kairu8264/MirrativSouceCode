package ad;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
public final class p0 extends androidx.fragment.app.e {
    public static final a O0 = new a(null);
    public static final int P0 = 8;
    public q0 N0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p0 a() {
            return new p0();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ p0 f1265w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p0 p0Var) {
                super(0);
                this.f1265w = p0Var;
            }

            public final void a() {
                this.f1265w.n3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* renamed from: ad.p0$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0027b extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ p0 f1266w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0027b(p0 p0Var) {
                super(0);
                this.f1266w = p0Var;
            }

            public final void a() {
                q0 q0Var = this.f1266w.N0;
                if (q0Var != null) {
                    q0Var.M();
                }
                this.f1266w.n3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ p0 f1267w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(p0 p0Var) {
                super(0);
                this.f1267w = p0Var;
            }

            public final void a() {
                q0 q0Var = this.f1267w.N0;
                if (q0Var != null) {
                    q0Var.Z();
                }
                this.f1267w.n3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public b() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                o0.a(new a(p0.this), new C0027b(p0.this), new c(p0.this), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setContent(s0.c.c(-1706465279, true, new b()));
        return composeView;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        this.N0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nc.j.f41900a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        Fragment H0 = H0();
        this.N0 = H0 instanceof q0 ? (q0) H0 : null;
    }
}
