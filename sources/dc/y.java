package dc;

import ac.n2;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ce.y;
import fa.b;
import jo.f0;
import o3.c0;
import oq.a;
import yd.g1;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class y extends FrameLayout implements fa.b, oq.a {

    /* renamed from: y  reason: collision with root package name */
    public static final e f29529y = new e(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f29530z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final wn.f f29531w;

    /* renamed from: x  reason: collision with root package name */
    public final n2 f29532x;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            y.this.getFloatViewManager().c(y.this);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ od.a f29534w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f29535x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f29536y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ y f29537z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(od.a aVar, String str, String str2, y yVar) {
            super(1);
            this.f29534w = aVar;
            this.f29535x = str;
            this.f29536y = str2;
            this.f29537z = yVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f29534w.f(this.f29535x, this.f29536y);
            this.f29537z.getFloatViewManager().c(this.f29537z);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f29538w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f29539x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y f29540y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z10, y yVar) {
            super(1);
            this.f29538w = str;
            this.f29539x = z10;
            this.f29540y = yVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            dq.c.c().l(new nd.f(0, this.f29538w, !this.f29539x));
            this.f29540y.getFloatViewManager().c(this.f29540y);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f29541w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f29542x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ y f29543y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, y yVar) {
            super(1);
            this.f29541w = str;
            this.f29542x = str2;
            this.f29543y = yVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            dq.c.c().l(new y.d(this.f29541w, this.f29542x));
            this.f29543y.getFloatViewManager().c(this.f29543y);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {
        public e() {
        }

        public /* synthetic */ e(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements View.OnLayoutChangeListener {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int[] f29545x;

        public f(int[] iArr) {
            this.f29545x = iArr;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            jo.p.h(view, "view");
            view.removeOnLayoutChangeListener(this);
            y.this.f29532x.D.setX((this.f29545x[0] - y.this.f29532x.D.getWidth()) + de.n.b(y.this, 28));
            y.this.f29532x.D.setY(this.f29545x[1]);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f29546w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f29547x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f29548y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f29546w = aVar;
            this.f29547x = aVar2;
            this.f29548y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f29546w;
            vq.a aVar2 = this.f29547x;
            io.a<? extends uq.a> aVar3 = this.f29548y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, int[] iArr, boolean z10, od.a aVar, String str, String str2) {
        super(context);
        String string;
        jo.p.h(context, "context");
        jo.p.h(iArr, "menuLocation");
        jo.p.h(aVar, "broadcastActionCreator");
        jo.p.h(str, "userId");
        jo.p.h(str2, "referer");
        this.f29531w = wn.g.b(cr.a.f28611a.b(), new g(this, null, null));
        n2 T = n2.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f29532x = T;
        ConstraintLayout constraintLayout = T.D;
        jo.p.g(constraintLayout, "binding.menuContainer");
        if (c0.V(constraintLayout) && !constraintLayout.isLayoutRequested()) {
            this.f29532x.D.setX((iArr[0] - this.f29532x.D.getWidth()) + de.n.b(this, 28));
            this.f29532x.D.setY(iArr[1]);
        } else {
            constraintLayout.addOnLayoutChangeListener(new f(iArr));
        }
        ConstraintLayout constraintLayout2 = T.F;
        jo.p.g(constraintLayout2, "binding.rootContainer");
        g1.a(constraintLayout2, new a());
        AppCompatTextView appCompatTextView = T.B;
        if (z10) {
            string = context.getResources().getString(xb.r.F2);
        } else {
            string = context.getResources().getString(xb.r.f60093z);
        }
        appCompatTextView.setText(string);
        AppCompatTextView appCompatTextView2 = T.C;
        jo.p.g(appCompatTextView2, "binding.kickTextView");
        g1.a(appCompatTextView2, new b(aVar, str, str2, this));
        AppCompatTextView appCompatTextView3 = T.B;
        jo.p.g(appCompatTextView3, "binding.blockTextView");
        g1.a(appCompatTextView3, new c(str, z10, this));
        AppCompatTextView appCompatTextView4 = T.E;
        jo.p.g(appCompatTextView4, "binding.reportTextView");
        g1.a(appCompatTextView4, new d(str, str2, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f29531w.getValue();
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
        return "UserProfileMenuFloatView";
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
