package in;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public class x extends m<r> {
    @ym.c("user_name")

    /* renamed from: c  reason: collision with root package name */
    private final String f36960c;

    /* loaded from: classes4.dex */
    public static class a implements mn.d<x> {

        /* renamed from: a  reason: collision with root package name */
        public final xm.e f36961a = new xm.e();

        @Override // mn.d
        /* renamed from: c */
        public x b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return (x) this.f36961a.i(str, x.class);
            } catch (Exception e10) {
                o.g().b("Twitter", e10.getMessage());
                return null;
            }
        }

        @Override // mn.d
        /* renamed from: d */
        public String a(x xVar) {
            if (xVar == null || xVar.a() == null) {
                return "";
            }
            try {
                return this.f36961a.s(xVar);
            } catch (Exception e10) {
                o.g().b("Twitter", e10.getMessage());
                return "";
            }
        }
    }

    public x(r rVar, long j10, String str) {
        super(rVar, j10);
        this.f36960c = str;
    }

    public String c() {
        return this.f36960c;
    }

    @Override // in.m
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            String str = this.f36960c;
            String str2 = ((x) obj).f36960c;
            return str != null ? str.equals(str2) : str2 == null;
        }
        return false;
    }

    @Override // in.m
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f36960c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
