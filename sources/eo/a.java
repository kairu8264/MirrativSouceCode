package eo;

import jo.p;

/* loaded from: classes4.dex */
public class a extends p000do.a {

    /* renamed from: eo.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0308a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0308a f30771a = new C0308a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f30772b;

        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        static {
            /*
                eo.a$a r0 = new eo.a$a
                r0.<init>()
                eo.a.C0308a.f30771a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L2e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r2 = 1
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L2e
                r0 = r1
            L2e:
                eo.a.C0308a.f30772b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: eo.a.C0308a.<clinit>():void");
        }
    }

    @Override // p000do.a
    public void a(Throwable th2, Throwable th3) {
        p.h(th2, "cause");
        p.h(th3, "exception");
        if (c(19)) {
            th2.addSuppressed(th3);
        } else {
            super.a(th2, th3);
        }
    }

    public final boolean c(int i10) {
        Integer num = C0308a.f30772b;
        return num == null || num.intValue() >= i10;
    }
}
