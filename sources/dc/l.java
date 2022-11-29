package dc;

import ac.f5;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.dena.mirrorman.customview.RoundedButtonView;
import fa.b;
import jo.f0;
import oq.a;
import yd.g1;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class l extends FrameLayout implements fa.b, oq.a {
    public static final d A = new d(null);
    public static final int B = 8;

    /* renamed from: w  reason: collision with root package name */
    public final String f29436w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f29437x;

    /* renamed from: y  reason: collision with root package name */
    public final f5 f29438y;

    /* renamed from: z  reason: collision with root package name */
    public e f29439z;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            l.this.getFloatViewManager().c(l.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            e eVar = l.this.f29439z;
            if (eVar != null) {
                String str = l.this.f29436w;
                if (str == null) {
                    str = "FloatYesNoWithImageView";
                }
                eVar.k(str);
            }
            l.this.getFloatViewManager().c(l.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            e eVar = l.this.f29439z;
            if (eVar != null) {
                String str = l.this.f29436w;
                if (str == null) {
                    str = "FloatYesNoWithImageView";
                }
                eVar.o(str);
            }
            l.this.getFloatViewManager().c(l.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        void k(String str);

        void o(String str);
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29443w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29444x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29445y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29443w = aVar;
            this.f29444x = aVar2;
            this.f29445y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f29443w;
            vq.a aVar2 = this.f29444x;
            io.a<? extends uq.a> aVar3 = this.f29445y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, String str, Integer num, String str2, String str3, String str4) {
        super(context);
        jo.p.h(context, "context");
        jo.p.h(str, "message");
        jo.p.h(str2, "yesLabel");
        jo.p.h(str3, "noLabel");
        this.f29436w = str4;
        this.f29437x = wn.g.b(cr.a.f28611a.b(), new f(this, null, null));
        f5 T = f5.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f29438y = T;
        g1.a(this, new a());
        RoundedButtonView roundedButtonView = T.E;
        jo.p.g(roundedButtonView, "binding.positiveButton");
        g1.a(roundedButtonView, new b());
        RoundedButtonView roundedButtonView2 = T.D;
        jo.p.g(roundedButtonView2, "binding.negativeButton");
        g1.a(roundedButtonView2, new c());
        T.C.setText(str);
        if (num == null) {
            T.F.setVisibility(8);
        } else {
            T.F.setImageResource(num.intValue());
            T.F.setVisibility(0);
        }
        T.E.setTitle(str2);
        T.D.setTitle(str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f29437x.getValue();
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
        return b.a.b(this);
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
        String str = this.f29436w;
        return str == null ? "FloatYesNoWithImageView" : str;
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        this.f29439z = context instanceof e ? (e) context : null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f29439z = null;
        super.onDetachedFromWindow();
    }
}
