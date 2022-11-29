package ai;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes3.dex */
public final class ha0 {
    public static int a(vf.a aVar) {
        vf.a aVar2 = vf.a.INVALID_REQUEST;
        vf.b bVar = vf.b.UNKNOWN;
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return ordinal != 2 ? 0 : 2;
            }
            return 3;
        }
        return 1;
    }

    public static wf.a b(as asVar, boolean z10) {
        vf.b bVar;
        List<String> list = asVar.A;
        HashSet hashSet = list != null ? new HashSet(list) : null;
        Date date = new Date(asVar.f1984x);
        int i10 = asVar.f1986z;
        if (i10 == 1) {
            bVar = vf.b.MALE;
        } else if (i10 != 2) {
            bVar = vf.b.UNKNOWN;
        } else {
            bVar = vf.b.FEMALE;
        }
        return new wf.a(date, bVar, hashSet, z10, asVar.G);
    }
}
