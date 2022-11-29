package ge;

import ae.g0;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;
import jo.q;
import nd.g1;

/* loaded from: classes2.dex */
public final class h extends com.google.android.material.bottomsheet.b {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public i O0;
    public final wn.f P0 = wn.g.a(new b());
    public final wn.f Q0 = wn.g.a(new c());

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h a(String str, String str2) {
            p.h(str, TtmlNode.ATTR_ID);
            p.h(str2, "message");
            h hVar = new h();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_ID", str);
            bundle.putString("EXTRA_MESSAGE", str2);
            hVar.V2(bundle);
            return hVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<String> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = h.this.M2().getString("EXTRA_KEY_ID");
            if (string != null) {
                return string;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = h.this.M2().getString("EXTRA_MESSAGE");
            if (string != null) {
                return string;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public static final void J3(h hVar, View view) {
        p.h(hVar, "this$0");
        i iVar = hVar.O0;
        if (iVar != null) {
            String I3 = hVar.I3();
            p.g(I3, "message");
            iVar.C0(I3);
        }
        hVar.n3();
    }

    public static final void K3(h hVar, View view) {
        p.h(hVar, "this$0");
        i iVar = hVar.O0;
        if (iVar != null) {
            String H3 = hVar.H3();
            p.g(H3, TtmlNode.ATTR_ID);
            iVar.K1(H3);
        }
        hVar.n3();
    }

    public final String H3() {
        return (String) this.P0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        super.I1();
    }

    public final String I3() {
        return (String) this.Q0.getValue();
    }

    @Override // androidx.fragment.app.e
    public int q3() {
        return g1.f42007f;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        i iVar = null;
        i iVar2 = context instanceof i ? (i) context : null;
        if (iVar2 == null) {
            Fragment H0 = H0();
            if (H0 instanceof i) {
                iVar = (i) H0;
            }
        } else {
            iVar = iVar2;
        }
        this.O0 = iVar;
    }

    @Override // e.g, androidx.fragment.app.e
    public void y3(Dialog dialog, int i10) {
        p.h(dialog, "dialog");
        g0 T = g0.T(LayoutInflater.from(q0()), null, false);
        p.g(T, "inflate(\n            Lay…          false\n        )");
        T.G.setText(I3());
        T.D.setOnClickListener(new View.OnClickListener() { // from class: ge.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.J3(h.this, view);
            }
        });
        T.F.setOnClickListener(new View.OnClickListener() { // from class: ge.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.K3(h.this, view);
            }
        });
        dialog.setContentView(T.u());
    }
}
