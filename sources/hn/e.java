package hn;

/* loaded from: classes4.dex */
public class e implements w {

    /* renamed from: a  reason: collision with root package name */
    public long f36148a;

    @Override // hn.w
    public byte[] a() {
        return t.d(String.valueOf(b()));
    }

    public final long b() {
        long max = Math.max(this.f36148a + 1, 1L);
        this.f36148a = max;
        return max;
    }
}
