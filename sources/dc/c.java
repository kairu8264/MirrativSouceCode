package dc;

import ac.x4;
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
public final class c extends FrameLayout implements fa.b, oq.a {

    /* renamed from: y  reason: collision with root package name */
    public static final C0280c f29361y = new C0280c(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f29362z = 8;

    /* renamed from: w  reason: collision with root package name */
    public x4 f29363w;

    /* renamed from: x  reason: collision with root package name */
    public final wn.f f29364x;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            c.this.getFloatViewManager().c(c.this);
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
            c.this.getFloatViewManager().c(c.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* renamed from: dc.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0280c {
        public C0280c() {
        }

        public /* synthetic */ C0280c(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29367w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29368x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29369y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29367w = aVar;
            this.f29368x = aVar2;
            this.f29369y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f29367w;
            vq.a aVar2 = this.f29368x;
            io.a<? extends uq.a> aVar3 = this.f29369y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, String str, String str2) {
        super(context);
        jo.p.h(context, "context");
        jo.p.h(str, "message");
        jo.p.h(str2, "yesLabel");
        x4 T = x4.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f29363w = T;
        this.f29364x = wn.g.b(cr.a.f28611a.b(), new d(this, null, null));
        g1.a(this, new a());
        AppCompatButton appCompatButton = this.f29363w.C;
        jo.p.g(appCompatButton, "binding.yesButton");
        g1.a(appCompatButton, new b());
        this.f29363w.B.setText(str);
        this.f29363w.C.setText(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f29364x.getValue();
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
        return "FloatCustomMessageView";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
