package aa;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import jo.q;
import q9.j;
import wn.v;

/* loaded from: classes.dex */
public final class f extends androidx.fragment.app.e {
    public static final a P0 = new a(null);
    public static final int Q0 = 8;
    public final wn.f N0 = wn.g.a(new b());
    public final wn.f O0 = wn.g.a(new d());

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f a(List<? extends e> list, int i10) {
            p.h(list, "listItems");
            f fVar = new f();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("EXTRA_KEY_LIST_ITEMS", new ArrayList<>(list));
            bundle.putInt("EXTRA_KEY_SELECTED_INDEX", i10);
            fVar.V2(bundle);
            return fVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<ArrayList<e>> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final ArrayList<e> invoke() {
            ArrayList<e> parcelableArrayList = f.this.M2().getParcelableArrayList("EXTRA_KEY_LIST_ITEMS");
            p.e(parcelableArrayList);
            return parcelableArrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q implements io.p<l0.i, Integer, v> {

        /* loaded from: classes.dex */
        public static final class a extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ f f683w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar) {
                super(0);
                this.f683w = fVar;
            }

            public final void a() {
                this.f683w.n3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        public c() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                h.a(f.this.D3(), f.this.E3(), new a(f.this), iVar, 8);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.a<Integer> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(f.this.M2().getInt("EXTRA_KEY_SELECTED_INDEX"));
        }
    }

    public final List<e> D3() {
        Object value = this.N0.getValue();
        p.g(value, "<get-listItems>(...)");
        return (List) value;
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        Context N2 = N2();
        p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setViewCompositionStrategy(d2.c.f14419b);
        composeView.setContent(s0.c.c(-1037861900, true, new c()));
        return composeView;
    }

    public final int E3() {
        return ((Number) this.O0.getValue()).intValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        p.h(view, "view");
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
