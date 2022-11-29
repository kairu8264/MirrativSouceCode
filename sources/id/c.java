package id;

import ad.v0;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import java.util.Arrays;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f36750f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f36751a;

    /* renamed from: b  reason: collision with root package name */
    public final v0 f36752b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f36753c;

    /* renamed from: d  reason: collision with root package name */
    public final int f36754d;

    /* renamed from: e  reason: collision with root package name */
    public final String f36755e;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: id.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0485a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f36756a;

            static {
                int[] iArr = new int[v0.values().length];
                iArr[v0.NG_CONFIRM.ordinal()] = 1;
                f36756a = iArr;
            }
        }

        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        @SuppressLint({"SimpleDateFormat"})
        public final c a(ContractSummaryResponse contractSummaryResponse, Resources resources) {
            v0 v0Var;
            int i10;
            p.h(contractSummaryResponse, "contractSummaryResponse");
            p.h(resources, "resources");
            v0[] values = v0.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    v0Var = null;
                    break;
                }
                v0Var = values[i11];
                if (v0Var.c() == contractSummaryResponse.getAccountStatus()) {
                    break;
                }
                i11++;
            }
            if (v0Var == null) {
                v0Var = v0.UNCONFIRMED;
            }
            v0 v0Var2 = v0Var;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((char) 65509);
            String format = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(contractSummaryResponse.getPaidCash())}, 1));
            p.g(format, "format(this, *args)");
            sb2.append(format);
            String sb3 = sb2.toString();
            boolean z10 = v0Var2 == v0.NG_CONFIRM;
            if (C0485a.f36756a[v0Var2.ordinal()] == 1) {
                i10 = nc.b.f41798r;
            } else {
                i10 = nc.b.f41804x;
            }
            return new c(sb3, v0Var2, z10, i10, of.c.f45387a.a(String.valueOf(contractSummaryResponse.getCurrentNextPayDate()), "yyyyMMdd", "yyyy/M/d", resources));
        }
    }

    public c(String str, v0 v0Var, boolean z10, int i10, String str2) {
        p.h(str, "payment");
        p.h(v0Var, "accountStatus");
        p.h(str2, "payDate");
        this.f36751a = str;
        this.f36752b = v0Var;
        this.f36753c = z10;
        this.f36754d = i10;
        this.f36755e = str2;
    }

    public final v0 a() {
        return this.f36752b;
    }

    public final int b() {
        return this.f36754d;
    }

    public final String c() {
        return this.f36755e;
    }

    public final String d() {
        return this.f36751a;
    }

    public final boolean e() {
        return this.f36753c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return p.c(this.f36751a, cVar.f36751a) && this.f36752b == cVar.f36752b && this.f36753c == cVar.f36753c && this.f36754d == cVar.f36754d && p.c(this.f36755e, cVar.f36755e);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f36751a.hashCode() * 31) + this.f36752b.hashCode()) * 31;
        boolean z10 = this.f36753c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((hashCode + i10) * 31) + Integer.hashCode(this.f36754d)) * 31) + this.f36755e.hashCode();
    }

    public String toString() {
        return "ContractMemberPassBookNotReceivedRewardBindModel(payment=" + this.f36751a + ", accountStatus=" + this.f36752b + ", isVisibleSubMessage=" + this.f36753c + ", messageColorRes=" + this.f36754d + ", payDate=" + this.f36755e + ')';
    }
}
