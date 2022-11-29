package m8;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f40618a;

    /* renamed from: b  reason: collision with root package name */
    public final int f40619b;

    /* renamed from: c  reason: collision with root package name */
    public int f40620c = 0;

    public a(int i10, int i11) {
        this.f40618a = i10;
        this.f40619b = i11;
    }

    public void a() {
        this.f40620c++;
    }

    public boolean b() {
        return this.f40619b - this.f40620c > 0;
    }

    public void c() {
        this.f40620c = 0;
    }

    public long d() {
        int i10 = this.f40620c;
        if (i10 == 0) {
            return this.f40618a;
        }
        return this.f40618a * (i10 + 1);
    }
}
