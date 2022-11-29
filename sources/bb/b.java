package bb;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import io.p;
import jo.h;
import l0.i;
import vb.m;
import wa.k;
import wn.q;
import wn.v;

/* loaded from: classes2.dex */
public final class b extends e {
    public static final a O0 = new a(null);
    public static final int P0 = 8;
    public m N0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final b a(String str, Integer num, String str2, String str3, String str4, k9.a aVar, String str5, k9.a aVar2, boolean z10) {
            b bVar = new b();
            bVar.V2(k3.b.a(q.a("EXTRA_HEADER_IMAGE_URL", str), q.a("EXTRA_HEADER_IMAGE_DRAWABLE_RES_INT", num), q.a("EXTRA_TITLE_TEXT", str2), q.a("EXTRA_DESCRIPTION_TEXT", str3), q.a("EXTRA_TOP_BUTTON_LABEL_TEXT", str4), q.a("EXTRA_TOP_BUTTON_COLOR", aVar), q.a("EXTRA_BOTTOM_BUTTON_LABEL_TEXT", str5), q.a("EXTRA_BOTTOM_BUTTON_COLOR", aVar2), q.a("EXTRA_VISIBLE_CLOSE_BUTTON", Boolean.valueOf(z10))));
            return bVar;
        }
    }

    /* renamed from: bb.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0107b extends jo.q implements p<i, Integer, v> {

        /* renamed from: bb.b$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b f17234w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(0);
                this.f17234w = bVar;
            }

            public final void a() {
                this.f17234w.n3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* renamed from: bb.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0108b extends jo.q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b f17235w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0108b(b bVar) {
                super(0);
                this.f17235w = bVar;
            }

            public final void a() {
                m mVar = this.f17235w.N0;
                if (mVar != null) {
                    mVar.J();
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* renamed from: bb.b$b$c */
        /* loaded from: classes2.dex */
        public static final class c extends jo.q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ b f17236w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar) {
                super(0);
                this.f17236w = bVar;
            }

            public final void a() {
                m mVar = this.f17236w.N0;
                if (mVar != null) {
                    mVar.d();
                }
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        public C0107b() {
            super(2);
        }

        public final void a(i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
                return;
            }
            String string = b.this.M2().getString("EXTRA_HEADER_IMAGE_URL");
            int i11 = b.this.M2().getInt("EXTRA_HEADER_IMAGE_DRAWABLE_RES_INT", 0);
            bb.a aVar = new bb.a(string, i11 == 0 ? null : Integer.valueOf(i11), b.this.M2().getString("EXTRA_TITLE_TEXT"), b.this.M2().getString("EXTRA_DESCRIPTION_TEXT"), b.this.M2().getString("EXTRA_TOP_BUTTON_LABEL_TEXT"), (k9.a) b.this.M2().getParcelable("EXTRA_TOP_BUTTON_COLOR"), b.this.M2().getString("EXTRA_BOTTOM_BUTTON_LABEL_TEXT"), (k9.a) b.this.M2().getParcelable("EXTRA_BOTTOM_BUTTON_COLOR"), b.this.M2().getBoolean("EXTRA_VISIBLE_CLOSE_BUTTON"));
            a aVar2 = new a(b.this);
            C0108b c0108b = new C0108b(b.this);
            c cVar = new c(b.this);
            int i12 = k9.a.C;
            bb.c.a(aVar, aVar2, c0108b, cVar, iVar, i12 | i12, 0);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setContent(s0.c.c(-1722277178, true, new C0107b()));
        return composeView;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.N0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        jo.p.h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        m mVar = this.N0;
        if (mVar != null) {
            mVar.o();
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), k.f58559a);
        w3(M2().getBoolean("EXTRA_VISIBLE_CLOSE_BUTTON"));
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        Fragment H0 = H0();
        m mVar = null;
        m mVar2 = H0 instanceof m ? (m) H0 : null;
        if (mVar2 != null) {
            mVar = mVar2;
        } else if (context instanceof m) {
            mVar = (m) context;
        }
        this.N0 = mVar;
    }
}
