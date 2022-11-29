package oa;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import nd.w0;

/* loaded from: classes.dex */
public final class k extends androidx.fragment.app.e {
    public static final a P0 = new a(null);
    public static final int Q0 = 8;
    public final wn.f N0 = wn.g.a(new c());
    public final wn.f O0 = wn.g.a(new d());

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k a(String str, String str2) {
            jo.p.h(str, "referer");
            jo.p.h(str2, "ruleContentsImageUrl");
            k kVar = new k();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            bundle.putString("EXTRA_KEY_RULE_POPOVER_IMAGE_URL", str2);
            kVar.V2(bundle);
            return kVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* loaded from: classes.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ k f44406w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar) {
                super(0);
                this.f44406w = kVar;
            }

            public final void a() {
                this.f44406w.n3();
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
                l.a(k.this.C3(), new a(k.this), iVar, 0);
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
            String string = k.this.M2().getString("EXTRA_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends jo.q implements io.a<String> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = k.this.M2().getString("EXTRA_KEY_RULE_POPOVER_IMAGE_URL");
            jo.p.e(string);
            return string;
        }
    }

    public final String C3() {
        return (String) this.O0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setContent(s0.c.c(181467691, true, new b()));
        return composeView;
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
