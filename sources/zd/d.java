package zd;

import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f63086a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f63087b;

    /* renamed from: c  reason: collision with root package name */
    public final String f63088c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f63089d;

    /* renamed from: e  reason: collision with root package name */
    public final String f63090e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f63091f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f63092g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f63093h;

    /* renamed from: i  reason: collision with root package name */
    public final String f63094i;

    public d() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public d(String str, Integer num, String str2, Integer num2, String str3, Integer num3, Integer num4, Integer num5, String str4) {
        this.f63086a = str;
        this.f63087b = num;
        this.f63088c = str2;
        this.f63089d = num2;
        this.f63090e = str3;
        this.f63091f = num3;
        this.f63092g = num4;
        this.f63093h = num5;
        this.f63094i = str4;
    }

    public final String a() {
        return this.f63088c;
    }

    public final Integer b() {
        return this.f63087b;
    }

    public final Integer c() {
        return this.f63091f;
    }

    public final Integer d() {
        return this.f63089d;
    }

    public final Integer e() {
        return this.f63093h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return p.c(this.f63086a, dVar.f63086a) && p.c(this.f63087b, dVar.f63087b) && p.c(this.f63088c, dVar.f63088c) && p.c(this.f63089d, dVar.f63089d) && p.c(this.f63090e, dVar.f63090e) && p.c(this.f63091f, dVar.f63091f) && p.c(this.f63092g, dVar.f63092g) && p.c(this.f63093h, dVar.f63093h) && p.c(this.f63094i, dVar.f63094i);
        }
        return false;
    }

    public final String f() {
        return this.f63094i;
    }

    public final Integer g() {
        return this.f63092g;
    }

    public final String h() {
        return this.f63090e;
    }

    public int hashCode() {
        String str = this.f63086a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f63087b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f63088c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f63089d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f63090e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f63091f;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f63092g;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f63093h;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str4 = this.f63094i;
        return hashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String i() {
        return this.f63086a;
    }

    public String toString() {
        return "LiveSettingHistory(title=" + this.f63086a + ", closedLive=" + this.f63087b + ", appId=" + this.f63088c + ", id=" + this.f63089d + ", tags=" + this.f63090e + ", contentHash=" + this.f63091f + ", stickerEnabled=" + this.f63092g + ", shareAll=" + this.f63093h + ", shareUserIDs=" + this.f63094i + ')';
    }

    public /* synthetic */ d(String str, Integer num, String str2, Integer num2, String str3, Integer num3, Integer num4, Integer num5, String str4, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : num3, (i10 & 64) != 0 ? null : num4, (i10 & 128) != 0 ? null : num5, (i10 & 256) == 0 ? str4 : null);
    }
}
