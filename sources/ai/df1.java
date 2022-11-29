package ai;

import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class df1 implements rn3<Set<String>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<zg1> f3261a;

    public df1(eo3<zg1> eo3Var) {
        this.f3261a = eo3Var;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        if (((ze1) this.f3261a).a().d() != null) {
            emptySet = Collections.singleton(MRLog.TARGET_TYPE_BANNER);
        } else {
            emptySet = Collections.emptySet();
        }
        zn3.b(emptySet);
        return emptySet;
    }
}
