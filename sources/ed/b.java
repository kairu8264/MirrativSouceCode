package ed;

import ad.l2;
import com.dena.mirrativ.mirrativapi.user.PaidCoinChangeRate;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public abstract class b {

    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f30534a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: ed.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0303b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final l2 f30535a;

        /* renamed from: b  reason: collision with root package name */
        public final PaidCoinChangeRate f30536b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0303b(l2 l2Var, PaidCoinChangeRate paidCoinChangeRate) {
            super(null);
            p.h(l2Var, "grade");
            p.h(paidCoinChangeRate, "paidCoinChangeRate");
            this.f30535a = l2Var;
            this.f30536b = paidCoinChangeRate;
        }

        public final String a() {
            if (this.f30535a != l2.NOT_RANK) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f30536b.getCashRate());
                sb2.append((char) 65285);
                return sb2.toString();
            }
            return "--";
        }

        public final String b() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f30536b.getCoinRate());
            sb2.append((char) 65285);
            return sb2.toString();
        }

        public final l2 c() {
            return this.f30535a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0303b) {
                C0303b c0303b = (C0303b) obj;
                return this.f30535a == c0303b.f30535a && p.c(this.f30536b, c0303b.f30536b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f30535a.hashCode() * 31) + this.f30536b.hashCode();
        }

        public String toString() {
            return "RankTableItem(grade=" + this.f30535a + ", paidCoinChangeRate=" + this.f30536b + ')';
        }
    }

    public b() {
    }

    public /* synthetic */ b(h hVar) {
        this();
    }
}
