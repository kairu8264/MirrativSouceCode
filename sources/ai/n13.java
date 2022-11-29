package ai;

import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class n13 extends zz2<Map.Entry> {

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ o13 f7150y;

    public n13(o13 o13Var) {
        this.f7150y = o13Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.f7150y.A;
        lx2.e(i10, i11, "index");
        int i12 = i10 + i10;
        objArr = this.f7150y.f7609z;
        Object obj = objArr[i12];
        obj.getClass();
        objArr2 = this.f7150y.f7609z;
        Object obj2 = objArr2[i12 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // ai.uz2
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.f7150y.A;
        return i10;
    }
}
