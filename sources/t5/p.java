package t5;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import k5.s;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: s  reason: collision with root package name */
    public static final String f53190s = k5.j.f("WorkSpec");

    /* renamed from: t  reason: collision with root package name */
    public static final n.a<List<c>, List<k5.s>> f53191t = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f53192a;

    /* renamed from: b  reason: collision with root package name */
    public s.a f53193b;

    /* renamed from: c  reason: collision with root package name */
    public String f53194c;

    /* renamed from: d  reason: collision with root package name */
    public String f53195d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.work.b f53196e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.work.b f53197f;

    /* renamed from: g  reason: collision with root package name */
    public long f53198g;

    /* renamed from: h  reason: collision with root package name */
    public long f53199h;

    /* renamed from: i  reason: collision with root package name */
    public long f53200i;

    /* renamed from: j  reason: collision with root package name */
    public k5.b f53201j;

    /* renamed from: k  reason: collision with root package name */
    public int f53202k;

    /* renamed from: l  reason: collision with root package name */
    public k5.a f53203l;

    /* renamed from: m  reason: collision with root package name */
    public long f53204m;

    /* renamed from: n  reason: collision with root package name */
    public long f53205n;

    /* renamed from: o  reason: collision with root package name */
    public long f53206o;

    /* renamed from: p  reason: collision with root package name */
    public long f53207p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f53208q;

    /* renamed from: r  reason: collision with root package name */
    public k5.n f53209r;

    /* loaded from: classes.dex */
    public class a implements n.a<List<c>, List<k5.s>> {
        @Override // n.a
        /* renamed from: a */
        public List<k5.s> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (c cVar : list) {
                arrayList.add(cVar.a());
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f53210a;

        /* renamed from: b  reason: collision with root package name */
        public s.a f53211b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f53211b != bVar.f53211b) {
                    return false;
                }
                return this.f53210a.equals(bVar.f53210a);
            }
            return false;
        }

        public int hashCode() {
            return (this.f53210a.hashCode() * 31) + this.f53211b.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f53212a;

        /* renamed from: b  reason: collision with root package name */
        public s.a f53213b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.work.b f53214c;

        /* renamed from: d  reason: collision with root package name */
        public int f53215d;

        /* renamed from: e  reason: collision with root package name */
        public List<String> f53216e;

        /* renamed from: f  reason: collision with root package name */
        public List<androidx.work.b> f53217f;

        public k5.s a() {
            androidx.work.b bVar;
            List<androidx.work.b> list = this.f53217f;
            if (list != null && !list.isEmpty()) {
                bVar = this.f53217f.get(0);
            } else {
                bVar = androidx.work.b.f16558c;
            }
            return new k5.s(UUID.fromString(this.f53212a), this.f53213b, this.f53214c, this.f53216e, bVar, this.f53215d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f53215d != cVar.f53215d) {
                    return false;
                }
                String str = this.f53212a;
                if (str == null ? cVar.f53212a == null : str.equals(cVar.f53212a)) {
                    if (this.f53213b != cVar.f53213b) {
                        return false;
                    }
                    androidx.work.b bVar = this.f53214c;
                    if (bVar == null ? cVar.f53214c == null : bVar.equals(cVar.f53214c)) {
                        List<String> list = this.f53216e;
                        if (list == null ? cVar.f53216e == null : list.equals(cVar.f53216e)) {
                            List<androidx.work.b> list2 = this.f53217f;
                            List<androidx.work.b> list3 = cVar.f53217f;
                            return list2 != null ? list2.equals(list3) : list3 == null;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f53212a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            s.a aVar = this.f53213b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            androidx.work.b bVar = this.f53214c;
            int hashCode3 = (((hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f53215d) * 31;
            List<String> list = this.f53216e;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<androidx.work.b> list2 = this.f53217f;
            return hashCode4 + (list2 != null ? list2.hashCode() : 0);
        }
    }

    public p(String str, String str2) {
        this.f53193b = s.a.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f16558c;
        this.f53196e = bVar;
        this.f53197f = bVar;
        this.f53201j = k5.b.f38391i;
        this.f53203l = k5.a.EXPONENTIAL;
        this.f53204m = 30000L;
        this.f53207p = -1L;
        this.f53209r = k5.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f53192a = str;
        this.f53194c = str2;
    }

    public long a() {
        long scalb;
        if (c()) {
            if (this.f53203l == k5.a.LINEAR) {
                scalb = this.f53204m * this.f53202k;
            } else {
                scalb = Math.scalb((float) this.f53204m, this.f53202k - 1);
            }
            return this.f53205n + Math.min(18000000L, scalb);
        }
        if (d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.f53205n;
            long j11 = j10 == 0 ? currentTimeMillis + this.f53198g : j10;
            long j12 = this.f53200i;
            long j13 = this.f53199h;
            if (j12 != j13) {
                return j11 + j13 + (j10 == 0 ? j12 * (-1) : 0L);
            }
            return j11 + (j10 != 0 ? j13 : 0L);
        }
        long j14 = this.f53205n;
        if (j14 == 0) {
            j14 = System.currentTimeMillis();
        }
        return j14 + this.f53198g;
    }

    public boolean b() {
        return !k5.b.f38391i.equals(this.f53201j);
    }

    public boolean c() {
        return this.f53193b == s.a.ENQUEUED && this.f53202k > 0;
    }

    public boolean d() {
        return this.f53199h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f53198g == pVar.f53198g && this.f53199h == pVar.f53199h && this.f53200i == pVar.f53200i && this.f53202k == pVar.f53202k && this.f53204m == pVar.f53204m && this.f53205n == pVar.f53205n && this.f53206o == pVar.f53206o && this.f53207p == pVar.f53207p && this.f53208q == pVar.f53208q && this.f53192a.equals(pVar.f53192a) && this.f53193b == pVar.f53193b && this.f53194c.equals(pVar.f53194c)) {
            String str = this.f53195d;
            if (str == null ? pVar.f53195d == null : str.equals(pVar.f53195d)) {
                return this.f53196e.equals(pVar.f53196e) && this.f53197f.equals(pVar.f53197f) && this.f53201j.equals(pVar.f53201j) && this.f53203l == pVar.f53203l && this.f53209r == pVar.f53209r;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f53192a.hashCode() * 31) + this.f53193b.hashCode()) * 31) + this.f53194c.hashCode()) * 31;
        String str = this.f53195d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j10 = this.f53198g;
        long j11 = this.f53199h;
        long j12 = this.f53200i;
        long j13 = this.f53204m;
        long j14 = this.f53205n;
        long j15 = this.f53206o;
        long j16 = this.f53207p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f53196e.hashCode()) * 31) + this.f53197f.hashCode()) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f53201j.hashCode()) * 31) + this.f53202k) * 31) + this.f53203l.hashCode()) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f53208q ? 1 : 0)) * 31) + this.f53209r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f53192a + "}";
    }

    public p(p pVar) {
        this.f53193b = s.a.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.f16558c;
        this.f53196e = bVar;
        this.f53197f = bVar;
        this.f53201j = k5.b.f38391i;
        this.f53203l = k5.a.EXPONENTIAL;
        this.f53204m = 30000L;
        this.f53207p = -1L;
        this.f53209r = k5.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f53192a = pVar.f53192a;
        this.f53194c = pVar.f53194c;
        this.f53193b = pVar.f53193b;
        this.f53195d = pVar.f53195d;
        this.f53196e = new androidx.work.b(pVar.f53196e);
        this.f53197f = new androidx.work.b(pVar.f53197f);
        this.f53198g = pVar.f53198g;
        this.f53199h = pVar.f53199h;
        this.f53200i = pVar.f53200i;
        this.f53201j = new k5.b(pVar.f53201j);
        this.f53202k = pVar.f53202k;
        this.f53203l = pVar.f53203l;
        this.f53204m = pVar.f53204m;
        this.f53205n = pVar.f53205n;
        this.f53206o = pVar.f53206o;
        this.f53207p = pVar.f53207p;
        this.f53208q = pVar.f53208q;
        this.f53209r = pVar.f53209r;
    }
}
