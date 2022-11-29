package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;

/* loaded from: classes.dex */
public final class m1 implements r0 {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f14517i;

    /* renamed from: a  reason: collision with root package name */
    public final AndroidComposeView f14519a;

    /* renamed from: b  reason: collision with root package name */
    public final RenderNode f14520b;

    /* renamed from: c  reason: collision with root package name */
    public int f14521c;

    /* renamed from: d  reason: collision with root package name */
    public int f14522d;

    /* renamed from: e  reason: collision with root package name */
    public int f14523e;

    /* renamed from: f  reason: collision with root package name */
    public int f14524f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14525g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f14516h = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public static boolean f14518j = true;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public m1(AndroidComposeView androidComposeView) {
        jo.p.h(androidComposeView, "ownerView");
        this.f14519a = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        jo.p.g(create, "create(\"Compose\", ownerView)");
        this.f14520b = create;
        if (f14518j) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            q(create);
            c();
            f14518j = false;
        }
        if (f14517i) {
            throw new NoClassDefFoundError();
        }
    }

    @Override // androidx.compose.ui.platform.r0
    public void A(float f10) {
        this.f14520b.setElevation(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void B(int i10) {
        o(E() + i10);
        d(K() + i10);
        this.f14520b.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.ui.platform.r0
    public boolean C() {
        return this.f14520b.isValid();
    }

    @Override // androidx.compose.ui.platform.r0
    public boolean D() {
        return this.f14525g;
    }

    @Override // androidx.compose.ui.platform.r0
    public int E() {
        return this.f14522d;
    }

    @Override // androidx.compose.ui.platform.r0
    public boolean F() {
        return this.f14520b.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.r0
    public boolean G(boolean z10) {
        return this.f14520b.setHasOverlappingRendering(z10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void H(c1.x xVar, c1.u0 u0Var, io.l<? super c1.w, wn.v> lVar) {
        jo.p.h(xVar, "canvasHolder");
        jo.p.h(lVar, "drawBlock");
        DisplayListCanvas start = this.f14520b.start(getWidth(), getHeight());
        jo.p.g(start, "renderNode.start(width, height)");
        Canvas y10 = xVar.a().y();
        xVar.a().z((Canvas) start);
        c1.b a10 = xVar.a();
        if (u0Var != null) {
            a10.p();
            c1.w.j(a10, u0Var, 0, 2, null);
        }
        lVar.invoke(a10);
        if (u0Var != null) {
            a10.k();
        }
        xVar.a().z(y10);
        this.f14520b.end(start);
    }

    @Override // androidx.compose.ui.platform.r0
    public void I(Matrix matrix) {
        jo.p.h(matrix, "matrix");
        this.f14520b.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.r0
    public void J(int i10) {
        e(a() + i10);
        h(f() + i10);
        this.f14520b.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.ui.platform.r0
    public int K() {
        return this.f14524f;
    }

    @Override // androidx.compose.ui.platform.r0
    public void L(float f10) {
        this.f14520b.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void M(float f10) {
        this.f14520b.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void N(Outline outline) {
        this.f14520b.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.r0
    public void O(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            s1.f14604a.c(this.f14520b, i10);
        }
    }

    @Override // androidx.compose.ui.platform.r0
    public void P(boolean z10) {
        this.f14520b.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void Q(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            s1.f14604a.d(this.f14520b, i10);
        }
    }

    @Override // androidx.compose.ui.platform.r0
    public float R() {
        return this.f14520b.getElevation();
    }

    @Override // androidx.compose.ui.platform.r0
    public int a() {
        return this.f14521c;
    }

    @Override // androidx.compose.ui.platform.r0
    public void b(float f10) {
        this.f14520b.setAlpha(f10);
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 24) {
            r1.f14593a.a(this.f14520b);
        } else {
            q1.f14587a.a(this.f14520b);
        }
    }

    public void d(int i10) {
        this.f14524f = i10;
    }

    public void e(int i10) {
        this.f14521c = i10;
    }

    @Override // androidx.compose.ui.platform.r0
    public int f() {
        return this.f14523e;
    }

    @Override // androidx.compose.ui.platform.r0
    public void g(float f10) {
        this.f14520b.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public int getHeight() {
        return K() - E();
    }

    @Override // androidx.compose.ui.platform.r0
    public int getWidth() {
        return f() - a();
    }

    public void h(int i10) {
        this.f14523e = i10;
    }

    @Override // androidx.compose.ui.platform.r0
    public void i(c1.b1 b1Var) {
    }

    @Override // androidx.compose.ui.platform.r0
    public void j(float f10) {
        this.f14520b.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public float k() {
        return this.f14520b.getAlpha();
    }

    @Override // androidx.compose.ui.platform.r0
    public void l(float f10) {
        this.f14520b.setCameraDistance(-f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void m(float f10) {
        this.f14520b.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void n(float f10) {
        this.f14520b.setRotationY(f10);
    }

    public void o(int i10) {
        this.f14522d = i10;
    }

    @Override // androidx.compose.ui.platform.r0
    public void p(float f10) {
        this.f14520b.setRotation(f10);
    }

    public final void q(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            s1 s1Var = s1.f14604a;
            s1Var.c(renderNode, s1Var.a(renderNode));
            s1Var.d(renderNode, s1Var.b(renderNode));
        }
    }

    @Override // androidx.compose.ui.platform.r0
    public void r(float f10) {
        this.f14520b.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void v(float f10) {
        this.f14520b.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void w(Canvas canvas) {
        jo.p.h(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f14520b);
    }

    @Override // androidx.compose.ui.platform.r0
    public void x(boolean z10) {
        this.f14525g = z10;
        this.f14520b.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.r0
    public boolean y(int i10, int i11, int i12, int i13) {
        e(i10);
        o(i11);
        h(i12);
        d(i13);
        return this.f14520b.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // androidx.compose.ui.platform.r0
    public void z() {
        c();
    }
}
