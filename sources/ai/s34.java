package ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class s34 {

    /* renamed from: a  reason: collision with root package name */
    public final int f9704a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f9705b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f9706c;

    /* renamed from: d  reason: collision with root package name */
    public final List<p34> f9707d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9708e;

    public s34(int i10, byte[] bArr, Map<String, String> map, List<p34> list, boolean z10, long j10) {
        this.f9704a = i10;
        this.f9705b = bArr;
        this.f9706c = map;
        this.f9707d = list == null ? null : Collections.unmodifiableList(list);
        this.f9708e = z10;
    }

    public static List<p34> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new p34(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public s34(int i10, byte[] bArr, Map<String, String> map, boolean z10, long j10) {
        this(i10, bArr, map, a(map), z10, j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s34(int r9, byte[] r10, boolean r11, long r12, java.util.List<ai.p34> r14) {
        /*
            r8 = this;
            if (r14 != 0) goto L5
            r0 = 0
        L3:
            r3 = r0
            goto L33
        L5:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L10
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L3
        L10:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.util.Iterator r1 = r14.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3
            java.lang.Object r2 = r1.next()
            ai.p34 r2 = (ai.p34) r2
            java.lang.String r3 = r2.a()
            java.lang.String r2 = r2.b()
            r0.put(r3, r2)
            goto L1b
        L33:
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r14
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.s34.<init>(int, byte[], boolean, long, java.util.List):void");
    }

    @Deprecated
    public s34(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, a(map), false, 0L);
    }
}
