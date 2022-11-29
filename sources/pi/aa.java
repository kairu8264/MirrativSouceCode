package pi;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public hi.s4 f47596a;

    /* renamed from: b  reason: collision with root package name */
    public List<Long> f47597b;

    /* renamed from: c  reason: collision with root package name */
    public List<hi.i4> f47598c;

    /* renamed from: d  reason: collision with root package name */
    public long f47599d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ba f47600e;

    public /* synthetic */ aa(ba baVar, z9 z9Var) {
        this.f47600e = baVar;
    }

    public static final long b(hi.i4 i4Var) {
        return ((i4Var.u() / 1000) / 60) / 60;
    }

    public final boolean a(long j10, hi.i4 i4Var) {
        rh.p.i(i4Var);
        if (this.f47598c == null) {
            this.f47598c = new ArrayList();
        }
        if (this.f47597b == null) {
            this.f47597b = new ArrayList();
        }
        if (this.f47598c.size() <= 0 || b(this.f47598c.get(0)) == b(i4Var)) {
            long z02 = this.f47599d + i4Var.z0();
            this.f47600e.T();
            if (z02 >= Math.max(0, c3.f47706j.a(null).intValue())) {
                return false;
            }
            this.f47599d = z02;
            this.f47598c.add(i4Var);
            this.f47597b.add(Long.valueOf(j10));
            int size = this.f47598c.size();
            this.f47600e.T();
            return size < Math.max(1, c3.f47708k.a(null).intValue());
        }
        return false;
    }
}
