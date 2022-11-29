package dc;

import ac.z4;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import fa.b;
import jo.f0;
import oq.a;
import yd.g1;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class d extends FrameLayout implements fa.b, oq.a {

    /* renamed from: w  reason: collision with root package name */
    public final wn.f f29371w;

    /* renamed from: x  reason: collision with root package name */
    public final z4 f29372x;

    /* renamed from: y  reason: collision with root package name */
    public e f29373y;

    /* renamed from: z  reason: collision with root package name */
    public static final C0281d f29370z = new C0281d(null);
    public static final int A = 8;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            d.this.getFloatViewManager().c(d.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f29376x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f29376x = str;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            e eVar = d.this.f29373y;
            if (eVar != null) {
                String str = this.f29376x;
                if (str == null) {
                    str = "FloatCustomYesNoView";
                }
                eVar.b(str);
            }
            d.this.getFloatViewManager().c(d.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f29378x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f29378x = str;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            e eVar = d.this.f29373y;
            if (eVar != null) {
                String str = this.f29378x;
                if (str == null) {
                    str = "FloatCustomYesNoView";
                }
                eVar.c(str);
            }
            d.this.getFloatViewManager().c(d.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* renamed from: dc.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0281d {
        public C0281d() {
        }

        public /* synthetic */ C0281d(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        void b(String str);

        void c(String str);
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29379w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29380x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29381y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29379w = aVar;
            this.f29380x = aVar2;
            this.f29381y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f29379w;
            vq.a aVar2 = this.f29380x;
            io.a<? extends uq.a> aVar3 = this.f29381y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ d(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, jo.h r15) {
        /*
            r7 = this;
            r0 = r14 & 2
            r2 = 0
            if (r0 == 0) goto L7
            r3 = r2
            goto L8
        L7:
            r3 = r9
        L8:
            r0 = r14 & 4
            if (r0 == 0) goto Le
            r4 = r2
            goto Lf
        Le:
            r4 = r10
        Lf:
            r0 = r14 & 8
            if (r0 == 0) goto L20
            int r0 = xb.r.S1
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r2 = "context.getString(R.string.text_ok)"
            jo.p.g(r0, r2)
            r5 = r0
            goto L21
        L20:
            r5 = r11
        L21:
            r0 = r14 & 16
            if (r0 == 0) goto L32
            int r0 = xb.r.H
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r2 = "context.getString(R.string.text_cancel)"
            jo.p.g(r0, r2)
            r6 = r0
            goto L33
        L32:
            r6 = r12
        L33:
            r0 = r7
            r1 = r8
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.d.<init>(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, jo.h):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f29371w.getValue();
    }

    @Override // fa.b
    public View getFloatViewContentView() {
        return this;
    }

    @Override // fa.b
    public int getFloatViewGravity() {
        return b.a.a(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutFlags() {
        return 512;
    }

    @Override // fa.b
    public int getFloatViewLayoutHeight() {
        return b.a.c(this);
    }

    @Override // fa.b
    public int getFloatViewLayoutWidth() {
        return b.a.d(this);
    }

    @Override // fa.b
    public String getFloatViewTag() {
        return "FloatCustomYesNoView";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        this.f29373y = context instanceof e ? (e) context : null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f29373y = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, String str2, String str3, String str4, String str5) {
        super(context);
        jo.p.h(context, "context");
        jo.p.h(str3, "yesLabel");
        jo.p.h(str4, "noLabel");
        this.f29371w = wn.g.b(cr.a.f28611a.b(), new f(this, null, null));
        z4 T = z4.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f29372x = T;
        g1.a(this, new a());
        AppCompatButton appCompatButton = T.E;
        jo.p.g(appCompatButton, "binding.yesButton");
        g1.a(appCompatButton, new b(str5));
        AppCompatButton appCompatButton2 = T.C;
        jo.p.g(appCompatButton2, "binding.noButton");
        g1.a(appCompatButton2, new c(str5));
        T.D.setText(str);
        T.B.setText(str2);
        T.B.setVisibility(str2 == null ? 8 : 0);
        T.E.setText(str3);
        T.C.setText(str4);
    }
}
