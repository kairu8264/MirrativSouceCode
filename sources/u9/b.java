package u9;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import io.p;
import jo.f0;
import jo.h;
import jo.q;
import kq.a;
import l0.i;
import wn.v;

/* loaded from: classes.dex */
public final class b extends Fragment {

    /* renamed from: y0  reason: collision with root package name */
    public static final a f54635y0 = new a(null);

    /* renamed from: z0  reason: collision with root package name */
    public static final int f54636z0 = 8;

    /* renamed from: x0  reason: collision with root package name */
    public final wn.f f54637x0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final b a() {
            return new b();
        }
    }

    /* renamed from: u9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0860b extends q implements p<i, Integer, v> {
        public C0860b() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                u9.c.a(b.this.k3().o().getValue(), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f54639w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f54639w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f54639w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f54639w.L2());
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f54640w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar) {
            super(0);
            this.f54640w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f54640w.invoke()).b();
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f54641w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f54642x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f54643y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f54644z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f54641w = aVar;
            this.f54642x = aVar2;
            this.f54643y = aVar3;
            this.f54644z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f54641w;
            vq.a aVar2 = this.f54642x;
            io.a aVar3 = this.f54643y;
            xq.a aVar4 = this.f54644z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(t9.d.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f54645w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar) {
            super(0);
            this.f54645w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f54645w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public b() {
        c cVar = new c(this);
        xq.a a10 = gq.a.a(this);
        d dVar = new d(cVar);
        this.f54637x0 = e0.a(this, f0.b(t9.d.class), new f(dVar), new e(cVar, null, null, a10));
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setContent(s0.c.c(703035042, true, new C0860b()));
        return composeView;
    }

    public final t9.d k3() {
        return (t9.d) this.f54637x0.getValue();
    }
}
