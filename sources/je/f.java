package je;

import jo.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f37793a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f37794b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f37795c;

    public f(int i10, String[] strArr, int[] iArr) {
        p.h(strArr, "permissions");
        p.h(iArr, "grantResults");
        this.f37793a = i10;
        this.f37794b = strArr;
        this.f37795c = iArr;
    }

    public final int[] a() {
        return this.f37795c;
    }

    public final String[] b() {
        return this.f37794b;
    }

    public final int c() {
        return this.f37793a;
    }
}
