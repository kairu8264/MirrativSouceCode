package ai;

/* loaded from: classes3.dex */
public final class nb2 implements xc2<ob2> {

    /* renamed from: a  reason: collision with root package name */
    public final String f7253a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7254b;

    public nb2(String str, String str2) {
        this.f7253a = str;
        this.f7254b = str2;
    }

    @Override // ai.xc2
    public final s43<ob2> zza() {
        return j43.a(new ob2(this.f7253a, this.f7254b));
    }
}
