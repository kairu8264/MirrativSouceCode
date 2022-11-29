package ai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class co3<T> implements rn3<Set<T>> {

    /* renamed from: c  reason: collision with root package name */
    public static final rn3<Set<Object>> f2891c = sn3.a(Collections.emptySet());

    /* renamed from: a  reason: collision with root package name */
    public final List<eo3<T>> f2892a;

    /* renamed from: b  reason: collision with root package name */
    public final List<eo3<Collection<T>>> f2893b;

    public /* synthetic */ co3(List list, List list2, ao3 ao3Var) {
        this.f2892a = list;
        this.f2893b = list2;
    }

    public static <T> bo3<T> a(int i10, int i11) {
        return new bo3<>(i10, i11, null);
    }

    @Override // ai.eo3
    /* renamed from: b */
    public final Set<T> zzb() {
        int size = this.f2892a.size();
        ArrayList arrayList = new ArrayList(this.f2893b.size());
        int size2 = this.f2893b.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection<T> zzb = this.f2893b.get(i10).zzb();
            size += zzb.size();
            arrayList.add(zzb);
        }
        HashSet b10 = nn3.b(size);
        int size3 = this.f2892a.size();
        for (int i11 = 0; i11 < size3; i11++) {
            T zzb2 = this.f2892a.get(i11).zzb();
            Objects.requireNonNull(zzb2);
            b10.add(zzb2);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj : (Collection) arrayList.get(i12)) {
                Objects.requireNonNull(obj);
                b10.add(obj);
            }
        }
        return Collections.unmodifiableSet(b10);
    }
}
