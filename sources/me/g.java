package me;

import ae.e5;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftCreationActivity;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftPreset;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import jf.u0;
import nd.b1;
import ud.w4;
import yd.g1;

/* loaded from: classes2.dex */
public final class g extends androidx.fragment.app.e {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public final wn.f N0;
    public final wn.f O0;
    public h P0;
    public final androidx.activity.result.c<Intent> Q0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(String str, u0 u0Var) {
            jo.p.h(str, "referer");
            jo.p.h(u0Var, "uniqueEmomoGiftCreationInfo");
            g gVar = new g();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            bundle.putSerializable("EXTRA_KEY_UNIQUE_EMOMO_GIFT_CREATION_INFO", u0Var);
            gVar.V2(bundle);
            return gVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            g.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements me.e {
        public c() {
        }

        @Override // me.e
        public void a(String str) {
            jo.p.h(str, TtmlNode.ATTR_ID);
            for (UniqueEmomoGiftPreset uniqueEmomoGiftPreset : g.this.G3().a()) {
                if (jo.p.c(uniqueEmomoGiftPreset.getId(), str)) {
                    androidx.activity.result.c cVar = g.this.Q0;
                    UniqueEmomoRichGiftCreationActivity.a aVar = UniqueEmomoRichGiftCreationActivity.f25730a0;
                    Context N2 = g.this.N2();
                    jo.p.g(N2, "requireContext()");
                    cVar.a(aVar.a(N2, g.this.F3(), uniqueEmomoGiftPreset));
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<String> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = g.this.M2().getString("EXTRA_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<u0> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            Serializable serializable = g.this.M2().getSerializable("EXTRA_KEY_UNIQUE_EMOMO_GIFT_CREATION_INFO");
            jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.model.UniqueEmomoRichGiftCreationInfo");
            return (u0) serializable;
        }
    }

    public g() {
        super(b1.dialog_fragment_unique_emomo_rich_gift_preset_select);
        this.N0 = wn.g.a(new d());
        this.O0 = wn.g.a(new e());
        androidx.activity.result.c<Intent> I2 = I2(new c.c(), new androidx.activity.result.b() { // from class: me.f
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                g.H3(g.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(I2, "registerForActivityResul…ateLoss()\n        }\n    }");
        this.Q0 = I2;
    }

    public static final void H3(g gVar, androidx.activity.result.a aVar) {
        jo.p.h(gVar, "this$0");
        if (aVar.b() == -1) {
            h hVar = gVar.P0;
            if (hVar != null) {
                hVar.c0();
            }
            gVar.n3();
        }
    }

    public final String F3() {
        return (String) this.N0.getValue();
    }

    public final u0 G3() {
        return (u0) this.O0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.P0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        e5 T = e5.T(view);
        AppCompatImageView appCompatImageView = T.B;
        jo.p.g(appCompatImageView, "binding.backImageView");
        g1.a(appCompatImageView, new b());
        RecyclerView recyclerView = T.C;
        me.d dVar = new me.d();
        dVar.h(new c());
        recyclerView.setAdapter(dVar);
        List<UniqueEmomoGiftPreset> a10 = G3().a();
        ArrayList arrayList = new ArrayList(xn.t.u(a10, 10));
        for (UniqueEmomoGiftPreset uniqueEmomoGiftPreset : a10) {
            arrayList.add(w4.f55655z.a(uniqueEmomoGiftPreset));
        }
        RecyclerView.h adapter = T.C.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.feature.emomo.uniquegift.UniqueEmomoRichGiftPresetAdapter");
        ((me.d) adapter).d(arrayList);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.BlackThreeDialog);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        Fragment H0 = H0();
        this.P0 = H0 instanceof h ? (h) H0 : null;
    }
}
