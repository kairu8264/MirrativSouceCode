package androidx.compose.ui.platform;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c2 implements ro.g<b2> {

    /* renamed from: a  reason: collision with root package name */
    public final List<b2> f14403a = new ArrayList();

    public final void b(String str, Object obj) {
        jo.p.h(str, "name");
        this.f14403a.add(new b2(str, obj));
    }

    @Override // ro.g
    public Iterator<b2> iterator() {
        return this.f14403a.iterator();
    }
}
