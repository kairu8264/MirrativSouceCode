package androidx.compose.ui.platform;

import android.view.RenderNode;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a  reason: collision with root package name */
    public static final r1 f14593a = new r1();

    public final void a(RenderNode renderNode) {
        jo.p.h(renderNode, "renderNode");
        renderNode.discardDisplayList();
    }
}
