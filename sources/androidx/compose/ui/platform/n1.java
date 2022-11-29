package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* loaded from: classes.dex */
public final class n1 implements r0 {

    /* renamed from: a  reason: collision with root package name */
    public final AndroidComposeView f14533a;

    /* renamed from: b  reason: collision with root package name */
    public final RenderNode f14534b;

    public n1(AndroidComposeView androidComposeView) {
        jo.p.h(androidComposeView, "ownerView");
        this.f14533a = androidComposeView;
        this.f14534b = new RenderNode("Compose");
    }

    @Override // androidx.compose.ui.platform.r0
    public void A(float f10) {
        this.f14534b.setElevation(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void B(int i10) {
        this.f14534b.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.ui.platform.r0
    public boolean C() {
        return this.f14534b.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.r0
    public boolean D() {
        return this.f14534b.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.r0
    public int E() {
        return this.f14534b.getTop();
    }

    @Override // androidx.compose.ui.platform.r0
    public boolean F() {
        return this.f14534b.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.r0
    public boolean G(boolean z10) {
        return this.f14534b.setHasOverlappingRendering(z10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void H(c1.x xVar, c1.u0 u0Var, io.l<? super c1.w, wn.v> lVar) {
        jo.p.h(xVar, "canvasHolder");
        jo.p.h(lVar, "drawBlock");
        RecordingCanvas beginRecording = this.f14534b.beginRecording();
        jo.p.g(beginRecording, "renderNode.beginRecording()");
        Canvas y10 = xVar.a().y();
        xVar.a().z(beginRecording);
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
        this.f14534b.endRecording();
    }

    @Override // androidx.compose.ui.platform.r0
    public void I(Matrix matrix) {
        jo.p.h(matrix, "matrix");
        this.f14534b.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.r0
    public void J(int i10) {
        this.f14534b.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.ui.platform.r0
    public int K() {
        return this.f14534b.getBottom();
    }

    @Override // androidx.compose.ui.platform.r0
    public void L(float f10) {
        this.f14534b.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void M(float f10) {
        this.f14534b.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void N(Outline outline) {
        this.f14534b.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.r0
    public void O(int i10) {
        this.f14534b.setAmbientShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void P(boolean z10) {
        this.f14534b.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void Q(int i10) {
        this.f14534b.setSpotShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.r0
    public float R() {
        return this.f14534b.getElevation();
    }

    @Override // androidx.compose.ui.platform.r0
    public int a() {
        return this.f14534b.getLeft();
    }

    @Override // androidx.compose.ui.platform.r0
    public void b(float f10) {
        this.f14534b.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public int f() {
        return this.f14534b.getRight();
    }

    @Override // androidx.compose.ui.platform.r0
    public void g(float f10) {
        this.f14534b.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public int getHeight() {
        return this.f14534b.getHeight();
    }

    @Override // androidx.compose.ui.platform.r0
    public int getWidth() {
        return this.f14534b.getWidth();
    }

    @Override // androidx.compose.ui.platform.r0
    public void i(c1.b1 b1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            o1.f14576a.a(this.f14534b, b1Var);
        }
    }

    @Override // androidx.compose.ui.platform.r0
    public void j(float f10) {
        this.f14534b.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public float k() {
        return this.f14534b.getAlpha();
    }

    @Override // androidx.compose.ui.platform.r0
    public void l(float f10) {
        this.f14534b.setCameraDistance(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void m(float f10) {
        this.f14534b.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void n(float f10) {
        this.f14534b.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void p(float f10) {
        this.f14534b.setRotationZ(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void r(float f10) {
        this.f14534b.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void v(float f10) {
        this.f14534b.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.r0
    public void w(Canvas canvas) {
        jo.p.h(canvas, "canvas");
        canvas.drawRenderNode(this.f14534b);
    }

    @Override // androidx.compose.ui.platform.r0
    public void x(boolean z10) {
        this.f14534b.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.r0
    public boolean y(int i10, int i11, int i12, int i13) {
        return this.f14534b.setPosition(i10, i11, i12, i13);
    }

    @Override // androidx.compose.ui.platform.r0
    public void z() {
        this.f14534b.discardDisplayList();
    }
}
