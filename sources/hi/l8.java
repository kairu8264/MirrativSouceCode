package hi;

import hi.k8;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class l8<T extends k8<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final l8 f35844d = new l8(true);

    /* renamed from: a  reason: collision with root package name */
    public final ra<T, Object> f35845a = new ka(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f35846b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f35847c;

    public l8() {
    }

    public static <T extends k8<T>> l8<T> a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(T r4, java.lang.Object r5) {
        /*
            hi.lb r0 = r4.zzb()
            hi.b9.e(r5)
            hi.lb r1 = hi.lb.zza
            hi.mb r1 = hi.mb.INT
            hi.mb r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L39;
                case 1: goto L36;
                case 2: goto L33;
                case 3: goto L30;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L21;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L3e
        L17:
            boolean r0 = r5 instanceof hi.w9
            if (r0 == 0) goto L3e
            goto L3d
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L3e
            goto L3d
        L21:
            boolean r0 = r5 instanceof hi.u7
            if (r0 != 0) goto L3d
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L3e
            goto L3d
        L2a:
            boolean r0 = r5 instanceof java.lang.String
            goto L3b
        L2d:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3b
        L30:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3b
        L33:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3b
        L36:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3b
        L39:
            boolean r0 = r5 instanceof java.lang.Integer
        L3b:
            if (r0 == 0) goto L3e
        L3d:
            return
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            hi.lb r4 = r4.zzb()
            hi.mb r4 = r4.a()
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
        throw new UnsupportedOperationException("Method not decompiled: hi.l8.d(hi.k8, java.lang.Object):void");
    }

    public final void b() {
        if (this.f35846b) {
            return;
        }
        this.f35845a.d();
        this.f35846b = true;
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
        this.f35845a.put(t10, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        l8 l8Var = new l8();
        for (int i10 = 0; i10 < this.f35845a.e(); i10++) {
            Map.Entry<T, Object> j10 = this.f35845a.j(i10);
            l8Var.c(j10.getKey(), j10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f35845a.f()) {
            l8Var.c(entry.getKey(), entry.getValue());
        }
        l8Var.f35847c = this.f35847c;
        return l8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l8) {
            return this.f35845a.equals(((l8) obj).f35845a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35845a.hashCode();
    }

    public l8(boolean z10) {
        b();
        b();
    }
}
