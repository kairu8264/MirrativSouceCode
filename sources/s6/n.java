package s6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public boolean f52173a = false;

    /* renamed from: b  reason: collision with root package name */
    public final Set<b> f52174b = new s.b();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, f7.f> f52175c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Comparator<n3.d<String, Float>> f52176d = new a();

    /* loaded from: classes.dex */
    public class a implements Comparator<n3.d<String, Float>> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(n3.d<String, Float> dVar, n3.d<String, Float> dVar2) {
            float floatValue = dVar.f41560b.floatValue();
            float floatValue2 = dVar2.f41560b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(float f10);
    }

    public void a(String str, float f10) {
        if (this.f52173a) {
            f7.f fVar = this.f52175c.get(str);
            if (fVar == null) {
                fVar = new f7.f();
                this.f52175c.put(str, fVar);
            }
            fVar.a(f10);
            if (str.equals("__container")) {
                for (b bVar : this.f52174b) {
                    bVar.a(f10);
                }
            }
        }
    }

    public void b(boolean z10) {
        this.f52173a = z10;
    }
}
