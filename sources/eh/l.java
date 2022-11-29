package eh;

import ai.ft;
import ai.ox;
import android.util.Pair;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f30602a = ((Integer) ft.c().c(ox.f8018j5)).intValue();

    /* renamed from: b  reason: collision with root package name */
    public final long f30603b = ((Long) ft.c().c(ox.f8026k5)).longValue();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Pair<Long, String>> f30604c = Collections.synchronizedMap(new b(this));

    public final synchronized void b(String str, String str2) {
        this.f30604c.put(str, new Pair<>(Long.valueOf(wg.t.k().currentTimeMillis()), str2));
        e();
    }

    public final synchronized String c(String str) {
        Pair<Long, String> pair = this.f30604c.get(str);
        if (pair != null) {
            String str2 = (String) pair.second;
            this.f30604c.remove(str);
            return str2;
        }
        return null;
    }

    public final synchronized void d(String str) {
        this.f30604c.remove(str);
    }

    public final void e() {
        long currentTimeMillis = wg.t.k().currentTimeMillis();
        try {
            Iterator<Map.Entry<String, Pair<Long, String>>> it = this.f30604c.entrySet().iterator();
            while (it.hasNext() && currentTimeMillis - ((Long) it.next().getValue().first).longValue() > this.f30603b) {
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            wg.t.h().k(e10, "QueryJsonMap.removeExpiredEntries");
        }
    }
}
