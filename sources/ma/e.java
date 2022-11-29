package ma;

import com.dena.mirrativ.mirrativapi.livegame.LiveGameGiftHelpResponse;
import jo.p;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f40653d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f40654a;

    /* renamed from: b  reason: collision with root package name */
    public final String f40655b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f40656c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e a(LiveGameGiftHelpResponse liveGameGiftHelpResponse) {
            p.h(liveGameGiftHelpResponse, "response");
            return new e(liveGameGiftHelpResponse.getTitle(), liveGameGiftHelpResponse.getGachaRateUrl());
        }
    }

    public e(String str, String str2) {
        p.h(str, "gameTitle");
        p.h(str2, "gachaRateUrl");
        this.f40654a = str;
        this.f40655b = str2;
        this.f40656c = str2.length() > 0;
    }

    public final String a() {
        return this.f40655b;
    }

    public final boolean b() {
        return this.f40656c;
    }

    public final String c() {
        return this.f40654a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return p.c(this.f40654a, eVar.f40654a) && p.c(this.f40655b, eVar.f40655b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f40654a.hashCode() * 31) + this.f40655b.hashCode();
    }

    public String toString() {
        return "LiveGameGiftHelpHeaderBindModel(gameTitle=" + this.f40654a + ", gachaRateUrl=" + this.f40655b + ')';
    }
}
