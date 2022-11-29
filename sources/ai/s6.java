package ai;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class s6 extends n2 {

    /* renamed from: e  reason: collision with root package name */
    public final int f9741e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9742f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f9743g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f9744h;

    /* renamed from: i  reason: collision with root package name */
    public final q7[] f9745i;

    /* renamed from: j  reason: collision with root package name */
    public final Object[] f9746j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap<Object, Integer> f9747k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s6(Collection collection, Collection<? extends t5> collection2, tq3 tq3Var) {
        super(false, collection2, null);
        int i10 = 0;
        int size = collection.size();
        this.f9743g = new int[size];
        this.f9744h = new int[size];
        this.f9745i = new q7[size];
        this.f9746j = new Object[size];
        this.f9747k = new HashMap<>();
        Iterator it = collection.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            t5 t5Var = (t5) it.next();
            this.f9745i[i12] = t5Var.b();
            this.f9744h[i12] = i10;
            this.f9743g[i12] = i11;
            i10 += this.f9745i[i12].a();
            i11 += this.f9745i[i12].g();
            this.f9746j[i12] = t5Var.zzb();
            this.f9747k.put(this.f9746j[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f9741e = i10;
        this.f9742f = i11;
    }

    @Override // ai.q7
    public final int a() {
        return this.f9741e;
    }

    @Override // ai.q7
    public final int g() {
        return this.f9742f;
    }

    @Override // ai.n2
    public final int p(int i10) {
        return sb.c(this.f9743g, i10 + 1, false, false);
    }

    @Override // ai.n2
    public final int q(int i10) {
        return sb.c(this.f9744h, i10 + 1, false, false);
    }

    @Override // ai.n2
    public final int r(Object obj) {
        Integer num = this.f9747k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // ai.n2
    public final q7 s(int i10) {
        return this.f9745i[i10];
    }

    @Override // ai.n2
    public final int t(int i10) {
        return this.f9743g[i10];
    }

    @Override // ai.n2
    public final int u(int i10) {
        return this.f9744h[i10];
    }

    @Override // ai.n2
    public final Object v(int i10) {
        return this.f9746j[i10];
    }

    public final List<q7> y() {
        return Arrays.asList(this.f9745i);
    }
}
