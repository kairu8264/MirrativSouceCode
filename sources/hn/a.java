package hn;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f36130a;

    /* renamed from: b  reason: collision with root package name */
    public final int f36131b;

    /* renamed from: c  reason: collision with root package name */
    public transient String f36132c;

    public a(String str, int i10) {
        this.f36130a = str;
        this.f36131b = i10;
    }

    public String a() {
        return this.f36130a;
    }

    public int b() {
        return this.f36131b;
    }

    public String toString() {
        if (this.f36132c == null) {
            this.f36132c = String.format("%s:%d", this.f36130a, Integer.valueOf(this.f36131b));
        }
        return this.f36132c;
    }
}
