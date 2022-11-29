package in;

/* loaded from: classes4.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    public int f36957a;

    /* renamed from: b  reason: collision with root package name */
    public int f36958b;

    /* renamed from: c  reason: collision with root package name */
    public long f36959c;

    public w(ep.u uVar) {
        if (uVar != null) {
            for (int i10 = 0; i10 < uVar.size(); i10++) {
                if ("x-rate-limit-limit".equals(uVar.g(i10))) {
                    this.f36957a = Integer.valueOf(uVar.m(i10)).intValue();
                } else if ("x-rate-limit-remaining".equals(uVar.g(i10))) {
                    this.f36958b = Integer.valueOf(uVar.m(i10)).intValue();
                } else if ("x-rate-limit-reset".equals(uVar.g(i10))) {
                    this.f36959c = Long.valueOf(uVar.m(i10)).longValue();
                }
            }
            return;
        }
        throw new IllegalArgumentException("headers must not be null");
    }
}
