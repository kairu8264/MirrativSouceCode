package xb;

import com.dena.mirrorman.net.bcsvr.response.GiftItem;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: xb.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0995a extends a {

        /* renamed from: b  reason: collision with root package name */
        public static final int f59819b = GiftItem.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final GiftItem f59820a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0995a(GiftItem giftItem) {
            super(null);
            jo.p.h(giftItem, "giftItem");
            this.f59820a = giftItem;
        }

        public final GiftItem a() {
            return this.f59820a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0995a) && jo.p.c(this.f59820a, ((C0995a) obj).f59820a);
        }

        public int hashCode() {
            return this.f59820a.hashCode();
        }

        public String toString() {
            return "BecameCheerleader(giftItem=" + this.f59820a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: e  reason: collision with root package name */
        public static final int f59821e = GiftItem.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final int f59822a;

        /* renamed from: b  reason: collision with root package name */
        public final GiftItem f59823b;

        /* renamed from: c  reason: collision with root package name */
        public final String f59824c;

        /* renamed from: d  reason: collision with root package name */
        public final String f59825d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, GiftItem giftItem, String str, String str2) {
            super(null);
            jo.p.h(giftItem, "giftItem");
            jo.p.h(str, "liveId");
            jo.p.h(str2, "liveSentGiftId");
            this.f59822a = i10;
            this.f59823b = giftItem;
            this.f59824c = str;
            this.f59825d = str2;
        }

        public final int a() {
            return this.f59822a;
        }

        public final GiftItem b() {
            return this.f59823b;
        }

        public final String c() {
            return this.f59824c;
        }

        public final String d() {
            return this.f59825d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f59822a == bVar.f59822a && jo.p.c(this.f59823b, bVar.f59823b) && jo.p.c(this.f59824c, bVar.f59824c) && jo.p.c(this.f59825d, bVar.f59825d);
            }
            return false;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f59822a) * 31) + this.f59823b.hashCode()) * 31) + this.f59824c.hashCode()) * 31) + this.f59825d.hashCode();
        }

        public String toString() {
            return "GiftAppEventRankingRankUp(eventId=" + this.f59822a + ", giftItem=" + this.f59823b + ", liveId=" + this.f59824c + ", liveSentGiftId=" + this.f59825d + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends a {

        /* renamed from: e  reason: collision with root package name */
        public static final int f59826e = GiftItem.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final int f59827a;

        /* renamed from: b  reason: collision with root package name */
        public final GiftItem f59828b;

        /* renamed from: c  reason: collision with root package name */
        public final String f59829c;

        /* renamed from: d  reason: collision with root package name */
        public final String f59830d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, GiftItem giftItem, String str, String str2) {
            super(null);
            jo.p.h(giftItem, "giftItem");
            jo.p.h(str, "liveId");
            jo.p.h(str2, "liveSentGiftId");
            this.f59827a = i10;
            this.f59828b = giftItem;
            this.f59829c = str;
            this.f59830d = str2;
        }

        public final int a() {
            return this.f59827a;
        }

        public final GiftItem b() {
            return this.f59828b;
        }

        public final String c() {
            return this.f59829c;
        }

        public final String d() {
            return this.f59830d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f59827a == cVar.f59827a && jo.p.c(this.f59828b, cVar.f59828b) && jo.p.c(this.f59829c, cVar.f59829c) && jo.p.c(this.f59830d, cVar.f59830d);
            }
            return false;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f59827a) * 31) + this.f59828b.hashCode()) * 31) + this.f59829c.hashCode()) * 31) + this.f59830d.hashCode();
        }

        public String toString() {
            return "GiftRankingRankUpSender(eventId=" + this.f59827a + ", giftItem=" + this.f59828b + ", liveId=" + this.f59829c + ", liveSentGiftId=" + this.f59830d + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends a {

        /* renamed from: e  reason: collision with root package name */
        public static final int f59831e = GiftItem.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final int f59832a;

        /* renamed from: b  reason: collision with root package name */
        public final GiftItem f59833b;

        /* renamed from: c  reason: collision with root package name */
        public final String f59834c;

        /* renamed from: d  reason: collision with root package name */
        public final String f59835d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, GiftItem giftItem, String str, String str2) {
            super(null);
            jo.p.h(giftItem, "giftItem");
            jo.p.h(str, "liveId");
            jo.p.h(str2, "liveSentGiftId");
            this.f59832a = i10;
            this.f59833b = giftItem;
            this.f59834c = str;
            this.f59835d = str2;
        }

        public final int a() {
            return this.f59832a;
        }

        public final GiftItem b() {
            return this.f59833b;
        }

        public final String c() {
            return this.f59834c;
        }

        public final String d() {
            return this.f59835d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f59832a == dVar.f59832a && jo.p.c(this.f59833b, dVar.f59833b) && jo.p.c(this.f59834c, dVar.f59834c) && jo.p.c(this.f59835d, dVar.f59835d);
            }
            return false;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f59832a) * 31) + this.f59833b.hashCode()) * 31) + this.f59834c.hashCode()) * 31) + this.f59835d.hashCode();
        }

        public String toString() {
            return "GiftRankingRankUpStreamer(eventId=" + this.f59832a + ", giftItem=" + this.f59833b + ", liveId=" + this.f59834c + ", liveSentGiftId=" + this.f59835d + ')';
        }
    }

    public a() {
    }

    public /* synthetic */ a(jo.h hVar) {
        this();
    }
}
