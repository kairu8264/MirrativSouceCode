package androidx.compose.ui.platform;

import android.view.RenderNode;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    public static final q1 f14587a = new q1();

    public final void a(RenderNode renderNode) {
        jo.p.h(renderNode, "renderNode");
        renderNode.destroyDisplayListData();
    }
}
