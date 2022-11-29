package we;

import ae.b1;
import android.app.Dialog;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Window;
import com.dena.mirrorman.customview.MyPageEmomoTutorialView;
import jo.h;
import jo.p;
import jo.q;
import wn.v;

/* loaded from: classes2.dex */
public final class a extends androidx.fragment.app.e {
    public static final C0980a Q0 = new C0980a(null);
    public static final int R0 = 8;
    public b1 N0;
    public io.a<v> O0;
    public io.a<v> P0;

    /* renamed from: we.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0980a {
        public C0980a() {
        }

        public /* synthetic */ C0980a(h hVar) {
            this();
        }

        public final a a(RectF rectF) {
            p.h(rectF, "spotlightRect");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_SPOTLIGHT_RECT", rectF);
            aVar.V2(bundle);
            return aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<v> {
        public b() {
            super(0);
        }

        public final void a() {
            io.a<v> D3 = a.this.D3();
            if (D3 != null) {
                D3.invoke();
            }
            a.this.m3();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<v> {
        public c() {
            super(0);
        }

        public final void a() {
            io.a<v> C3 = a.this.C3();
            if (C3 != null) {
                C3.invoke();
            }
            a.this.m3();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    public final b1 B3() {
        b1 b1Var = this.N0;
        if (b1Var != null) {
            return b1Var;
        }
        p.v("binding");
        return null;
    }

    public final io.a<v> C3() {
        return this.P0;
    }

    public final io.a<v> D3() {
        return this.O0;
    }

    public final void E3(b1 b1Var) {
        p.h(b1Var, "<set-?>");
        this.N0 = b1Var;
    }

    public final void F3(io.a<v> aVar) {
        this.P0 = aVar;
    }

    public final void G3(io.a<v> aVar) {
        this.O0 = aVar;
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        b1 T = b1.T(LayoutInflater.from(N2()), null, false);
        p.g(T, "inflate(LayoutInflater.f…eContext()), null, false)");
        E3(T);
        Parcelable parcelable = M2().getParcelable("EXTRA_SPOTLIGHT_RECT");
        p.e(parcelable);
        MyPageEmomoTutorialView myPageEmomoTutorialView = B3().B;
        myPageEmomoTutorialView.b((RectF) parcelable);
        myPageEmomoTutorialView.setOnClickSpotlightListener(new b());
        myPageEmomoTutorialView.setOnClickAfterListener(new c());
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(B3().u());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(false);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }
}
