package jf;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class b0 implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final String f37832w;

    /* loaded from: classes2.dex */
    public static final class a extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37833x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37834y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "appId");
            this.f37833x = str;
            this.f37834y = str2;
        }

        public final String b() {
            return this.f37834y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(this.f37833x, aVar.f37833x) && jo.p.c(this.f37834y, aVar.f37834y);
            }
            return false;
        }

        public int hashCode() {
            return (this.f37833x.hashCode() * 31) + this.f37834y.hashCode();
        }

        public String toString() {
            return "MatchApp(url=" + this.f37833x + ", appId=" + this.f37834y + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37835x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37836y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String str, String str2) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "noticeId");
            this.f37835x = str;
            this.f37836y = str2;
        }

        public final String b() {
            return this.f37836y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                return jo.p.c(this.f37835x, a0Var.f37835x) && jo.p.c(this.f37836y, a0Var.f37836y);
            }
            return false;
        }

        public int hashCode() {
            return (this.f37835x.hashCode() * 31) + this.f37836y.hashCode();
        }

        public String toString() {
            return "MatchLiveRequest(url=" + this.f37835x + ", noticeId=" + this.f37836y + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37837x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37838y;

        /* renamed from: z  reason: collision with root package name */
        public final String f37839z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37837x = str;
            this.f37838y = str2;
            this.f37839z = str3;
        }

        public final String b() {
            return this.f37839z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(this.f37837x, bVar.f37837x) && jo.p.c(this.f37838y, bVar.f37838y) && jo.p.c(this.f37839z, bVar.f37839z);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f37837x.hashCode() * 31;
            String str = this.f37838y;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f37839z;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "MatchBroadCastLive(url=" + this.f37837x + ", title=" + this.f37838y + ", appId=" + this.f37839z + ')';
        }
    }

    /* renamed from: jf.b0$b0  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0526b0 extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37840x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37841y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0526b0(String str, String str2) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "noticeId");
            this.f37840x = str;
            this.f37841y = str2;
        }

        public final String b() {
            return this.f37841y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0526b0) {
                C0526b0 c0526b0 = (C0526b0) obj;
                return jo.p.c(this.f37840x, c0526b0.f37840x) && jo.p.c(this.f37841y, c0526b0.f37841y);
            }
            return false;
        }

        public int hashCode() {
            return (this.f37840x.hashCode() * 31) + this.f37841y.hashCode();
        }

        public String toString() {
            return "MatchNewFollowers(url=" + this.f37840x + ", noticeId=" + this.f37841y + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37842x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37843y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "campaignId");
            this.f37842x = str;
            this.f37843y = str2;
        }

        public final String b() {
            return this.f37843y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return jo.p.c(this.f37842x, cVar.f37842x) && jo.p.c(this.f37843y, cVar.f37843y);
            }
            return false;
        }

        public int hashCode() {
            return (this.f37842x.hashCode() * 31) + this.f37843y.hashCode();
        }

        public String toString() {
            return "MatchCampaignDetail(url=" + this.f37842x + ", campaignId=" + this.f37843y + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37844x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37845y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(String str, String str2) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "webUrl");
            this.f37844x = str;
            this.f37845y = str2;
        }

        public final String b() {
            return this.f37845y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                return jo.p.c(this.f37844x, c0Var.f37844x) && jo.p.c(this.f37845y, c0Var.f37845y);
            }
            return false;
        }

        public int hashCode() {
            return (this.f37844x.hashCode() * 31) + this.f37845y.hashCode();
        }

        public String toString() {
            return "MatchNotice(url=" + this.f37844x + ", webUrl=" + this.f37845y + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37846x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37847y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "hash");
            this.f37846x = str;
            this.f37847y = str2;
        }

        public final String b() {
            return this.f37847y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return jo.p.c(this.f37846x, dVar.f37846x) && jo.p.c(this.f37847y, dVar.f37847y);
            }
            return false;
        }

        public int hashCode() {
            return (this.f37846x.hashCode() * 31) + this.f37847y.hashCode();
        }

        public String toString() {
            return "MatchChatMessage(url=" + this.f37846x + ", hash=" + this.f37847y + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37848x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(String str) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37848x = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && jo.p.c(this.f37848x, ((d0) obj).f37848x);
        }

        public int hashCode() {
            return this.f37848x.hashCode();
        }

        public String toString() {
            return "MatchNoticePresentBox(url=" + this.f37848x + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37849x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37849x = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f37849x, ((e) obj).f37849x);
        }

        public int hashCode() {
            return this.f37849x.hashCode();
        }

        public String toString() {
            return "MatchCoinChallenge(url=" + this.f37849x + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37850x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(String str) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37850x = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && jo.p.c(this.f37850x, ((e0) obj).f37850x);
        }

        public int hashCode() {
            return this.f37850x.hashCode();
        }

        public String toString() {
            return "MatchPhotoCampaignPost(url=" + this.f37850x + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37851x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37851x = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f37851x, ((f) obj).f37851x);
        }

        public int hashCode() {
            return this.f37851x.hashCode();
        }

        public String toString() {
            return "MatchCoinPassbook(url=" + this.f37851x + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37852x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37853y;

        /* renamed from: z  reason: collision with root package name */
        public final String f37854z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(String str, String str2, String str3) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "query");
            this.f37852x = str;
            this.f37853y = str2;
            this.f37854z = str3;
        }

        public final String b() {
            return this.f37854z;
        }

        public final String c() {
            return this.f37853y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f0) {
                f0 f0Var = (f0) obj;
                return jo.p.c(this.f37852x, f0Var.f37852x) && jo.p.c(this.f37853y, f0Var.f37853y) && jo.p.c(this.f37854z, f0Var.f37854z);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((this.f37852x.hashCode() * 31) + this.f37853y.hashCode()) * 31;
            String str = this.f37854z;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "MatchSearchLive(url=" + this.f37852x + ", query=" + this.f37853y + ", appId=" + this.f37854z + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends b0 {
        public final String A;
        public final String B;
        public final String C;
        public final String D;
        public final String E;

        /* renamed from: x  reason: collision with root package name */
        public final String f37855x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37856y;

        /* renamed from: z  reason: collision with root package name */
        public final String f37857z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "clientId");
            jo.p.h(str3, "redirectUri");
            this.f37855x = str;
            this.f37856y = str2;
            this.f37857z = str3;
            this.A = str4;
            this.B = str5;
            this.C = str6;
            this.D = str7;
            this.E = str8;
        }

        public final String b() {
            return this.E;
        }

        public final String c() {
            return this.f37856y;
        }

        public final String d() {
            return this.C;
        }

        public final String e() {
            return this.f37857z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return jo.p.c(this.f37855x, gVar.f37855x) && jo.p.c(this.f37856y, gVar.f37856y) && jo.p.c(this.f37857z, gVar.f37857z) && jo.p.c(this.A, gVar.A) && jo.p.c(this.B, gVar.B) && jo.p.c(this.C, gVar.C) && jo.p.c(this.D, gVar.D) && jo.p.c(this.E, gVar.E);
            }
            return false;
        }

        public final String f() {
            return this.A;
        }

        public final String g() {
            return this.B;
        }

        public final String h() {
            return this.D;
        }

        public int hashCode() {
            int hashCode = ((((this.f37855x.hashCode() * 31) + this.f37856y.hashCode()) * 31) + this.f37857z.hashCode()) * 31;
            String str = this.A;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.B;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.C;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.D;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.E;
            return hashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "MatchConnectConfirm(url=" + this.f37855x + ", clientId=" + this.f37856y + ", redirectUri=" + this.f37857z + ", responseType=" + this.A + ", scope=" + this.B + ", nonce=" + this.C + ", state=" + this.D + ", callback=" + this.E + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g0 extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37858x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37859y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(String str, String str2) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "campaignId");
            this.f37858x = str;
            this.f37859y = str2;
        }

        public final String b() {
            return this.f37859y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                return jo.p.c(this.f37858x, g0Var.f37858x) && jo.p.c(this.f37859y, g0Var.f37859y);
            }
            return false;
        }

        public int hashCode() {
            return (this.f37858x.hashCode() * 31) + this.f37859y.hashCode();
        }

        public String toString() {
            return "MatchShareInviteCampaign(url=" + this.f37858x + ", campaignId=" + this.f37859y + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37860x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37860x = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && jo.p.c(this.f37860x, ((h) obj).f37860x);
        }

        public int hashCode() {
            return this.f37860x.hashCode();
        }

        public String toString() {
            return "MatchContract(url=" + this.f37860x + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h0 extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37861x;

        /* renamed from: y  reason: collision with root package name */
        public final int f37862y;

        /* renamed from: z  reason: collision with root package name */
        public final Integer f37863z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(String str, int i10, Integer num) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37861x = str;
            this.f37862y = i10;
            this.f37863z = num;
        }

        public final Integer b() {
            return this.f37863z;
        }

        public final int c() {
            return this.f37862y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h0) {
                h0 h0Var = (h0) obj;
                return jo.p.c(this.f37861x, h0Var.f37861x) && this.f37862y == h0Var.f37862y && jo.p.c(this.f37863z, h0Var.f37863z);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((this.f37861x.hashCode() * 31) + Integer.hashCode(this.f37862y)) * 31;
            Integer num = this.f37863z;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "MatchShooter(url=" + this.f37861x + ", seasonId=" + this.f37862y + ", broadcasterId=" + this.f37863z + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37864x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37864x = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && jo.p.c(this.f37864x, ((i) obj).f37864x);
        }

        public int hashCode() {
            return this.f37864x.hashCode();
        }

        public String toString() {
            return "MatchContractCash(url=" + this.f37864x + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i0 extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37865x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37866y;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f37867z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(String str, String str2, boolean z10) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "userId");
            this.f37865x = str;
            this.f37866y = str2;
            this.f37867z = z10;
        }

        public final String b() {
            return this.f37866y;
        }

        public final boolean c() {
            return this.f37867z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i0) {
                i0 i0Var = (i0) obj;
                return jo.p.c(this.f37865x, i0Var.f37865x) && jo.p.c(this.f37866y, i0Var.f37866y) && this.f37867z == i0Var.f37867z;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f37865x.hashCode() * 31) + this.f37866y.hashCode()) * 31;
            boolean z10 = this.f37867z;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "MatchUser(url=" + this.f37865x + ", userId=" + this.f37866y + ", isPopup=" + this.f37867z + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37868x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37868x = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && jo.p.c(this.f37868x, ((j) obj).f37868x);
        }

        public int hashCode() {
            return this.f37868x.hashCode();
        }

        public String toString() {
            return "MatchContractCoin(url=" + this.f37868x + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j0 extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37869x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(String str) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37869x = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j0) && jo.p.c(this.f37869x, ((j0) obj).f37869x);
        }

        public int hashCode() {
            return this.f37869x.hashCode();
        }

        public String toString() {
            return "MatchWebViewClose(url=" + this.f37869x + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37870x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37871y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "liveId");
            this.f37870x = str;
            this.f37871y = str2;
        }

        public final String b() {
            return this.f37871y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return jo.p.c(this.f37870x, kVar.f37870x) && jo.p.c(this.f37871y, kVar.f37871y);
            }
            return false;
        }

        public int hashCode() {
            return (this.f37870x.hashCode() * 31) + this.f37871y.hashCode();
        }

        public String toString() {
            return "MatchDownloadArchive(url=" + this.f37870x + ", liveId=" + this.f37871y + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k0 extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37872x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37873y;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f37874z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(String str, String str2, boolean z10) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "webViewUrl");
            this.f37872x = str;
            this.f37873y = str2;
            this.f37874z = z10;
        }

        public final boolean b() {
            return this.f37874z;
        }

        public final String c() {
            return this.f37873y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                return jo.p.c(this.f37872x, k0Var.f37872x) && jo.p.c(this.f37873y, k0Var.f37873y) && this.f37874z == k0Var.f37874z;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f37872x.hashCode() * 31) + this.f37873y.hashCode()) * 31;
            boolean z10 = this.f37874z;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "MatchWebViewOpen(url=" + this.f37872x + ", webViewUrl=" + this.f37873y + ", openExternal=" + this.f37874z + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37875x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37875x = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && jo.p.c(this.f37875x, ((l) obj).f37875x);
        }

        public int hashCode() {
            return this.f37875x.hashCode();
        }

        public String toString() {
            return "MatchEmomoQuest(url=" + this.f37875x + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l0 extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37876x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(String str) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37876x = str;
        }

        public final String b() {
            return this.f37876x;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l0) && jo.p.c(this.f37876x, ((l0) obj).f37876x);
        }

        public int hashCode() {
            return this.f37876x.hashCode();
        }

        public String toString() {
            return "NoMatch(url=" + this.f37876x + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37877x;

        /* renamed from: y  reason: collision with root package name */
        public final int f37878y;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f37879z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, int i10, boolean z10) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37877x = str;
            this.f37878y = i10;
            this.f37879z = z10;
        }

        public final int b() {
            return this.f37878y;
        }

        public final boolean c() {
            return this.f37879z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return jo.p.c(this.f37877x, mVar.f37877x) && this.f37878y == mVar.f37878y && this.f37879z == mVar.f37879z;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f37877x.hashCode() * 31) + Integer.hashCode(this.f37878y)) * 31;
            boolean z10 = this.f37879z;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "MatchEmomoQuestRanking(url=" + this.f37877x + ", giftEventId=" + this.f37878y + ", hideListing=" + this.f37879z + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37880x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37881y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, String str2) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "giftEventId");
            this.f37880x = str;
            this.f37881y = str2;
        }

        public final String b() {
            return this.f37881y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return jo.p.c(this.f37880x, nVar.f37880x) && jo.p.c(this.f37881y, nVar.f37881y);
            }
            return false;
        }

        public int hashCode() {
            return (this.f37880x.hashCode() * 31) + this.f37881y.hashCode();
        }

        public String toString() {
            return "MatchEmomoRun(url=" + this.f37880x + ", giftEventId=" + this.f37881y + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37882x;

        /* renamed from: y  reason: collision with root package name */
        public final boolean f37883y;

        /* renamed from: z  reason: collision with root package name */
        public final String f37884z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, boolean z10, String str2) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37882x = str;
            this.f37883y = z10;
            this.f37884z = str2;
        }

        public final boolean b() {
            return this.f37883y;
        }

        public final String c() {
            return this.f37884z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return jo.p.c(this.f37882x, oVar.f37882x) && this.f37883y == oVar.f37883y && jo.p.c(this.f37884z, oVar.f37884z);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f37882x.hashCode() * 31;
            boolean z10 = this.f37883y;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (hashCode + i10) * 31;
            String str = this.f37884z;
            return i11 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "MatchEmomoViewMypage(url=" + this.f37882x + ", openCloset=" + this.f37883y + ", partTypeId=" + this.f37884z + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37885x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37885x = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && jo.p.c(this.f37885x, ((p) obj).f37885x);
        }

        public int hashCode() {
            return this.f37885x.hashCode();
        }

        public String toString() {
            return "MatchFaq(url=" + this.f37885x + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37886x;

        /* renamed from: y  reason: collision with root package name */
        public final int f37887y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, int i10) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37886x = str;
            this.f37887y = i10;
        }

        public final int b() {
            return this.f37887y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                q qVar = (q) obj;
                return jo.p.c(this.f37886x, qVar.f37886x) && this.f37887y == qVar.f37887y;
            }
            return false;
        }

        public int hashCode() {
            return (this.f37886x.hashCode() * 31) + Integer.hashCode(this.f37887y);
        }

        public String toString() {
            return "MatchGiftCode(url=" + this.f37886x + ", giftCodePresentId=" + this.f37887y + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37888x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37889y;

        /* renamed from: z  reason: collision with root package name */
        public final String f37890z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, String str2, String str3) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "giftEventId");
            jo.p.h(str3, "broadcasterId");
            this.f37888x = str;
            this.f37889y = str2;
            this.f37890z = str3;
        }

        public final String b() {
            return this.f37890z;
        }

        public final String c() {
            return this.f37889y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof r) {
                r rVar = (r) obj;
                return jo.p.c(this.f37888x, rVar.f37888x) && jo.p.c(this.f37889y, rVar.f37889y) && jo.p.c(this.f37890z, rVar.f37890z);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f37888x.hashCode() * 31) + this.f37889y.hashCode()) * 31) + this.f37890z.hashCode();
        }

        public String toString() {
            return "MatchGiftRanking(url=" + this.f37888x + ", giftEventId=" + this.f37889y + ", broadcasterId=" + this.f37890z + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37891x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37892y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, String str2) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "userGiftboxGachaId");
            this.f37891x = str;
            this.f37892y = str2;
        }

        public final String b() {
            return this.f37892y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s) {
                s sVar = (s) obj;
                return jo.p.c(this.f37891x, sVar.f37891x) && jo.p.c(this.f37892y, sVar.f37892y);
            }
            return false;
        }

        public int hashCode() {
            return (this.f37891x.hashCode() * 31) + this.f37892y.hashCode();
        }

        public String toString() {
            return "MatchGiftboxGacha(url=" + this.f37891x + ", userGiftboxGachaId=" + this.f37892y + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37893x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37894y;

        /* renamed from: z  reason: collision with root package name */
        public final String f37895z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str, String str2, String str3) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37893x = str;
            this.f37894y = str2;
            this.f37895z = str3;
        }

        public final String b() {
            return this.f37894y;
        }

        public final String c() {
            return this.f37895z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof t) {
                t tVar = (t) obj;
                return jo.p.c(this.f37893x, tVar.f37893x) && jo.p.c(this.f37894y, tVar.f37894y) && jo.p.c(this.f37895z, tVar.f37895z);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f37893x.hashCode() * 31;
            String str = this.f37894y;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f37895z;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "MatchGroupShotCampaign(url=" + this.f37893x + ", campaignId=" + this.f37894y + ", userId=" + this.f37895z + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37896x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37897y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, String str2) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "noticeId");
            this.f37896x = str;
            this.f37897y = str2;
        }

        public final String b() {
            return this.f37897y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof u) {
                u uVar = (u) obj;
                return jo.p.c(this.f37896x, uVar.f37896x) && jo.p.c(this.f37897y, uVar.f37897y);
            }
            return false;
        }

        public int hashCode() {
            return (this.f37896x.hashCode() * 31) + this.f37897y.hashCode();
        }

        public String toString() {
            return "MatchKickedUsers(url=" + this.f37896x + ", noticeId=" + this.f37897y + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37898x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37899y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, String str2) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "liveId");
            this.f37898x = str;
            this.f37899y = str2;
        }

        public final String b() {
            return this.f37899y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof v) {
                v vVar = (v) obj;
                return jo.p.c(this.f37898x, vVar.f37898x) && jo.p.c(this.f37899y, vVar.f37899y);
            }
            return false;
        }

        public int hashCode() {
            return (this.f37898x.hashCode() * 31) + this.f37899y.hashCode();
        }

        public String toString() {
            return "MatchLive(url=" + this.f37898x + ", liveId=" + this.f37899y + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37900x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37901y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str, String str2) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "liveGameId");
            this.f37900x = str;
            this.f37901y = str2;
        }

        public final String b() {
            return this.f37901y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof w) {
                w wVar = (w) obj;
                return jo.p.c(this.f37900x, wVar.f37900x) && jo.p.c(this.f37901y, wVar.f37901y);
            }
            return false;
        }

        public int hashCode() {
            return (this.f37900x.hashCode() * 31) + this.f37901y.hashCode();
        }

        public String toString() {
            return "MatchLiveGameAppRanking(url=" + this.f37900x + ", liveGameId=" + this.f37901y + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37902x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37902x = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && jo.p.c(this.f37902x, ((x) obj).f37902x);
        }

        public int hashCode() {
            return this.f37902x.hashCode();
        }

        public String toString() {
            return "MatchLiveGameDailyRanking(url=" + this.f37902x + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37903x;

        /* renamed from: y  reason: collision with root package name */
        public final String f37904y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str, String str2) {
            super(str, null);
            jo.p.h(str, "url");
            jo.p.h(str2, "liveGameId");
            this.f37903x = str;
            this.f37904y = str2;
        }

        public final String b() {
            return this.f37904y;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof y) {
                y yVar = (y) obj;
                return jo.p.c(this.f37903x, yVar.f37903x) && jo.p.c(this.f37904y, yVar.f37904y);
            }
            return false;
        }

        public int hashCode() {
            return (this.f37903x.hashCode() * 31) + this.f37904y.hashCode();
        }

        public String toString() {
            return "MatchLiveGameDetail(url=" + this.f37903x + ", liveGameId=" + this.f37904y + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends b0 {

        /* renamed from: x  reason: collision with root package name */
        public final String f37905x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(String str) {
            super(str, null);
            jo.p.h(str, "url");
            this.f37905x = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && jo.p.c(this.f37905x, ((z) obj).f37905x);
        }

        public int hashCode() {
            return this.f37905x.hashCode();
        }

        public String toString() {
            return "MatchLiveGameListing(url=" + this.f37905x + ')';
        }
    }

    public b0(String str) {
        this.f37832w = str;
    }

    public /* synthetic */ b0(String str, jo.h hVar) {
        this(str);
    }

    public final String a() {
        return this.f37832w;
    }
}
