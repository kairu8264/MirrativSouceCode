package ai;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class sq2 {

    /* renamed from: a  reason: collision with root package name */
    public final vh.f f9913a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<String>> f9914b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Long> f9915c = new HashMap();

    public sq2(vh.f fVar) {
        this.f9913a = fVar;
    }

    public final void a(String str) {
        if (this.f9915c.containsKey(str)) {
            long elapsedRealtime = this.f9913a.elapsedRealtime();
            long longValue = this.f9915c.remove(str).longValue();
            StringBuilder sb2 = new StringBuilder(20);
            sb2.append(elapsedRealtime - longValue);
            d(str, sb2.toString());
            return;
        }
        this.f9915c.put(str, Long.valueOf(this.f9913a.elapsedRealtime()));
    }

    public final void b(String str, String str2) {
        if (this.f9915c.containsKey(str)) {
            long elapsedRealtime = this.f9913a.elapsedRealtime();
            long longValue = this.f9915c.remove(str).longValue();
            StringBuilder sb2 = new StringBuilder(str2.length() + 20);
            sb2.append(str2);
            sb2.append(elapsedRealtime - longValue);
            d(str, sb2.toString());
            return;
        }
        this.f9915c.put(str, Long.valueOf(this.f9913a.elapsedRealtime()));
    }

    public final List<rq2> c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.f9914b.entrySet()) {
            int i10 = 0;
            if (entry.getValue().size() > 1) {
                for (String str : entry.getValue()) {
                    String key = entry.getKey();
                    i10++;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(key).length() + 12);
                    sb2.append(key);
                    sb2.append(TopicConstant.SEPARATOR);
                    sb2.append(i10);
                    arrayList.add(new rq2(sb2.toString(), str));
                }
            } else {
                arrayList.add(new rq2(entry.getKey(), entry.getValue().get(0)));
            }
        }
        return arrayList;
    }

    public final void d(String str, String str2) {
        if (!this.f9914b.containsKey(str)) {
            this.f9914b.put(str, new ArrayList());
        }
        this.f9914b.get(str).add(str2);
    }
}
