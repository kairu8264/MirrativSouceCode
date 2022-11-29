package ai;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xk3 implements Iterator<Map.Entry> {

    /* renamed from: w  reason: collision with root package name */
    public int f11979w = -1;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11980x;

    /* renamed from: y  reason: collision with root package name */
    public Iterator<Map.Entry> f11981y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ al3 f11982z;

    public /* synthetic */ xk3(al3 al3Var, zk3 zk3Var) {
        this.f11982z = al3Var;
    }

    public final Iterator<Map.Entry> a() {
        Map map;
        if (this.f11981y == null) {
            map = this.f11982z.f1916y;
            this.f11981y = map.entrySet().iterator();
        }
        return this.f11981y;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i10 = this.f11979w + 1;
        list = this.f11982z.f1915x;
        if (i10 >= list.size()) {
            map = this.f11982z.f1916y;
            return !map.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        List list;
        List list2;
        this.f11980x = true;
        int i10 = this.f11979w + 1;
        this.f11979w = i10;
        list = this.f11982z.f1915x;
        if (i10 < list.size()) {
            list2 = this.f11982z.f1915x;
            return (Map.Entry) list2.get(this.f11979w);
        }
        return a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f11980x) {
            this.f11980x = false;
            this.f11982z.r();
            int i10 = this.f11979w;
            list = this.f11982z.f1915x;
            if (i10 < list.size()) {
                al3 al3Var = this.f11982z;
                int i11 = this.f11979w;
                this.f11979w = i11 - 1;
                al3Var.p(i11);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
