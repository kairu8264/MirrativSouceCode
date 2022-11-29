package oa;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import hf.v0;
import jo.f0;
import nd.w0;
import tb.c;
import uo.q0;

/* loaded from: classes.dex */
public final class u extends androidx.fragment.app.e implements q0 {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public final /* synthetic */ da.j N0 = new da.j();
    public final wn.f O0 = wn.g.a(new c());
    public final wn.f P0;
    public final wn.f Q0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u a(String str) {
            jo.p.h(str, "referer");
            u uVar = new u();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            uVar.V2(bundle);
            return uVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ComposeView f44513x;

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.l<String, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ u f44514w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(u uVar) {
                super(1);
                this.f44514w = uVar;
            }

            public final void a(String str) {
                jo.p.h(str, "userId");
                if (jo.p.c(this.f44514w.G3().x(), str)) {
                    u uVar = this.f44514w;
                    tb.c E3 = uVar.E3();
                    Context N2 = this.f44514w.N2();
                    jo.p.g(N2, "requireContext()");
                    uVar.f3(E3.z0(N2));
                    return;
                }
                u uVar2 = this.f44514w;
                tb.c E32 = uVar2.E3();
                Context N22 = this.f44514w.N2();
                jo.p.g(N22, "requireContext()");
                uVar2.f3(E32.s(N22, str, this.f44514w.F3()));
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(String str) {
                a(str);
                return wn.v.f59242a;
            }
        }

        /* renamed from: oa.u$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0669b extends jo.q implements io.l<String, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ u f44515w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ ComposeView f44516x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0669b(u uVar, ComposeView composeView) {
                super(1);
                this.f44515w = uVar;
                this.f44516x = composeView;
            }

            public final void a(String str) {
                jo.p.h(str, "liveId");
                str.length();
                tb.c E3 = this.f44515w.E3();
                Context context = this.f44516x.getContext();
                jo.p.g(context, "context");
                Intent f10 = c.a.f(E3, context, str, this.f44515w.F3(), null, null, false, false, false, false, null, 960, null);
                u uVar = this.f44515w;
                f10.addFlags(67108864);
                uVar.f3(f10);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ wn.v invoke(String str) {
                a(str);
                return wn.v.f59242a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ u f44517w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(u uVar) {
                super(0);
                this.f44517w = uVar;
            }

            public final void a() {
                this.f44517w.n3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComposeView composeView) {
            super(2);
            this.f44513x = composeView;
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                v.a(new a(u.this), new C0669b(u.this, this.f44513x), new c(u.this), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = u.this.M2().getString("EXTRA_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f44519w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f44520x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f44521y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f44519w = componentCallbacks;
            this.f44520x = aVar;
            this.f44521y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f44519w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f44520x, this.f44521y);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f44522w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f44523x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f44524y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f44522w = componentCallbacks;
            this.f44523x = aVar;
            this.f44524y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f44522w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f44523x, this.f44524y);
        }
    }

    public u() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P0 = wn.g.b(iVar, new d(this, null, null));
        this.Q0 = wn.g.b(iVar, new e(this, null, null));
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setContent(s0.c.c(-37884377, true, new b(composeView)));
        return composeView;
    }

    public final tb.c E3() {
        return (tb.c) this.P0.getValue();
    }

    public final String F3() {
        return (String) this.O0.getValue();
    }

    public final v0 G3() {
        return (v0) this.Q0.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog r32 = super.r3(bundle);
        jo.p.g(r32, "super.onCreateDialog(savedInstanceState)");
        Window window = r32.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(w0.Q0);
        }
        return r32;
    }
}
