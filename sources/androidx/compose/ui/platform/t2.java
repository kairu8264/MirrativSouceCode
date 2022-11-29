package androidx.compose.ui.platform;

import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: a  reason: collision with root package name */
    public static final t2 f14662a = new t2();

    public final Map<Integer, Integer> a(View view) {
        jo.p.h(view, "view");
        Map<Integer, Integer> attributeSourceResourceMap = view.getAttributeSourceResourceMap();
        jo.p.g(attributeSourceResourceMap, "view.attributeSourceResourceMap");
        return attributeSourceResourceMap;
    }
}
