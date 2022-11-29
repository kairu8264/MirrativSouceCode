package ai;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public final class by {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ay> f2581a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final ey f2582b;

    public by(ey eyVar) {
        this.f2582b = eyVar;
    }

    public final void a(String str, ay ayVar) {
        this.f2581a.put(str, ayVar);
    }

    public final void b(String str, String str2, long j10) {
        ey eyVar = this.f2582b;
        ay ayVar = this.f2581a.get(str2);
        String[] strArr = {str};
        if (ayVar != null) {
            eyVar.b(ayVar, j10, strArr);
        }
        this.f2581a.put(str, new ay(j10, null, null));
    }

    public final ey c() {
        return this.f2582b;
    }
}
