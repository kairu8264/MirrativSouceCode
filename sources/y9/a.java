package y9;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
import io.p;
import jo.h;
import jo.q;
import l0.i;
import q9.j;
import wn.f;
import wn.g;
import wn.v;

/* loaded from: classes.dex */
public final class a extends androidx.fragment.app.e {
    public static final C1042a P0 = new C1042a(null);
    public static final int Q0 = 8;
    public final f N0 = g.a(new c());
    public final f O0 = g.a(new b());

    /* renamed from: y9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1042a {
        public C1042a() {
        }

        public /* synthetic */ C1042a(h hVar) {
            this();
        }

        public final a a(int i10, int i11) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_KEY_GIFT_EVENT_ID", i10);
            bundle.putInt("EXTRA_KEY_GAME_NO", i11);
            aVar.V2(bundle);
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<Integer> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(a.this.M2().getInt("EXTRA_KEY_GAME_NO"));
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.a<Integer> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(a.this.M2().getInt("EXTRA_KEY_GIFT_EVENT_ID"));
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements p<i, Integer, v> {

        /* renamed from: y9.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1043a extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a f61313w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1043a(a aVar) {
                super(0);
                this.f61313w = aVar;
            }

            public final void a() {
                this.f61313w.n3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        public d() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                y9.d.a("event.emomo_quest_ranking.popup", a.this.E3(), a.this.D3(), new C1043a(a.this), iVar, 6);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public final int D3() {
        return ((Number) this.O0.getValue()).intValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setViewCompositionStrategy(d2.c.f14419b);
        composeView.setContent(s0.c.c(-955661245, true, new d()));
        return composeView;
    }

    public final int E3() {
        return ((Number) this.N0.getValue()).intValue();
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
        window.setLayout(-1, -2);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), j.f48844a);
    }
}
