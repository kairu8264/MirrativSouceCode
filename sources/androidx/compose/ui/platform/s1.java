package androidx.compose.ui.platform;

import android.view.RenderNode;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a  reason: collision with root package name */
    public static final s1 f14604a = new s1();

    public final int a(RenderNode renderNode) {
        jo.p.h(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        jo.p.h(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i10) {
        jo.p.h(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i10);
    }

    public final void d(RenderNode renderNode, int i10) {
        jo.p.h(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i10);
    }
}
