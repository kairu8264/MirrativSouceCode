package xb;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes2.dex */
public final class u extends androidx.fragment.app.e {
    public static final a N0 = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u a() {
            return new u();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ u f60107w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(u uVar) {
                super(0);
                this.f60107w = uVar;
            }

            public final void a() {
                this.f60107w.n3();
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
                return;
            }
            u uVar = u.this;
            iVar.x(1157296644);
            boolean P = iVar.P(uVar);
            Object y10 = iVar.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new a(uVar);
                iVar.q(y10);
            }
            iVar.O();
            v.a((io.a) y10, iVar, 0);
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
        composeView.setContent(s0.c.c(-1943412299, true, new b()));
        return composeView;
    }
}
