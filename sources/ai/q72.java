package ai;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes3.dex */
public final class q72 implements xc2<wc2<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f8845a;

    public q72(Set<String> set) {
        this.f8845a = set;
    }

    @Override // ai.xc2
    public final s43<wc2<Bundle>> zza() {
        final ArrayList arrayList = new ArrayList();
        for (String str : this.f8845a) {
            arrayList.add(str);
        }
        return j43.a(new wc2(arrayList) { // from class: ai.p72

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList f8340a;

            {
                this.f8340a = arrayList;
            }

            @Override // ai.wc2
            public final void d(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", this.f8340a);
            }
        });
    }
}
