package f7;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public float f31817a;

    /* renamed from: b  reason: collision with root package name */
    public int f31818b;

    public void a(float f10) {
        float f11 = this.f31817a + f10;
        this.f31817a = f11;
        int i10 = this.f31818b + 1;
        this.f31818b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f31817a = f11 / 2.0f;
            this.f31818b = i10 / 2;
        }
    }
}
