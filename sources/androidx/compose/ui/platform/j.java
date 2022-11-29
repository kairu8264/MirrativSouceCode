package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f14473a = new j();

    public final void a(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        jo.p.h(accessibilityNodeInfo, "node");
        jo.p.h(list, "data");
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
