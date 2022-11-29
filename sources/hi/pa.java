package hi;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class pa implements Iterator<Map.Entry> {

    /* renamed from: w  reason: collision with root package name */
    public int f35908w = -1;

    /* renamed from: x  reason: collision with root package name */
    public boolean f35909x;

    /* renamed from: y  reason: collision with root package name */
    public Iterator<Map.Entry> f35910y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ra f35911z;

    public /* synthetic */ pa(ra raVar, ka kaVar) {
        this.f35911z = raVar;
    }

    public final Iterator<Map.Entry> a() {
        Map map;
        if (this.f35910y == null) {
            map = this.f35911z.f35977y;
            this.f35910y = map.entrySet().iterator();
        }
        return this.f35910y;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i10 = this.f35908w + 1;
        list = this.f35911z.f35976x;
        if (i10 >= list.size()) {
            map = this.f35911z.f35977y;
            return !map.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        List list;
        List list2;
        this.f35909x = true;
        int i10 = this.f35908w + 1;
        this.f35908w = i10;
        list = this.f35911z.f35976x;
        if (i10 < list.size()) {
            list2 = this.f35911z.f35976x;
            return (Map.Entry) list2.get(this.f35908w);
        }
        return a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f35909x) {
            this.f35909x = false;
            this.f35911z.s();
            int i10 = this.f35908w;
            list = this.f35911z.f35976x;
            if (i10 < list.size()) {
                ra raVar = this.f35911z;
                int i11 = this.f35908w;
                this.f35908w = i11 - 1;
                raVar.q(i11);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
