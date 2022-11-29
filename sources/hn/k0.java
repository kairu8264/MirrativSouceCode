package hn;

/* loaded from: classes4.dex */
public class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f36200a;

    /* renamed from: b  reason: collision with root package name */
    public final int f36201b;

    /* renamed from: c  reason: collision with root package name */
    public final String f36202c;

    /* renamed from: d  reason: collision with root package name */
    public final String f36203d;

    public k0(String str) {
        String[] split = str.split(" +", 3);
        if (split.length >= 2) {
            this.f36200a = split[0];
            this.f36201b = Integer.parseInt(split[1]);
            this.f36202c = split.length == 3 ? split[2] : null;
            this.f36203d = str;
            return;
        }
        throw new IllegalArgumentException();
    }

    public int a() {
        return this.f36201b;
    }

    public String toString() {
        return this.f36203d;
    }
}
