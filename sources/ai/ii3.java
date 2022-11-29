package ai;

import ai.hi3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ii3<T extends hi3<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final ii3 f5246d = new ii3(true);

    /* renamed from: a  reason: collision with root package name */
    public final al3<T, Object> f5247a = new sk3(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f5248b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5249c;

    public ii3() {
    }

    public static <T extends hi3<T>> ii3<T> a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(T r4, java.lang.Object r5) {
        /*
            ai.tl3 r0 = r4.zzb()
            ai.bj3.a(r5)
            ai.tl3 r1 = ai.tl3.zza
            ai.ul3 r1 = ai.ul3.INT
            ai.ul3 r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L42
        L17:
            boolean r0 = r5 instanceof ai.xj3
            if (r0 == 0) goto L42
            goto L41
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof ai.ti3
            if (r0 == 0) goto L42
            goto L41
        L25:
            boolean r0 = r5 instanceof ai.oh3
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L42
            goto L41
        L2e:
            boolean r0 = r5 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r5 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L42
        L41:
            return
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            ai.tl3 r4 = r4.zzb()
            ai.ul3 r4 = r4.a()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.ii3.d(ai.hi3, java.lang.Object):void");
    }

    public final void b() {
        if (this.f5248b) {
            return;
        }
        this.f5247a.d();
        this.f5248b = true;
    }

    public final void c(T t10, Object obj) {
        if (t10.b()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    d(t10, arrayList.get(i10));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            d(t10, obj);
        }
        this.f5247a.put(t10, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        ii3 ii3Var = new ii3();
        for (int i10 = 0; i10 < this.f5247a.h(); i10++) {
            Map.Entry<T, Object> i11 = this.f5247a.i(i10);
            ii3Var.c(i11.getKey(), i11.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f5247a.j()) {
            ii3Var.c(entry.getKey(), entry.getValue());
        }
        ii3Var.f5249c = this.f5249c;
        return ii3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ii3) {
            return this.f5247a.equals(((ii3) obj).f5247a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5247a.hashCode();
    }

    public ii3(boolean z10) {
        b();
        b();
    }
}
