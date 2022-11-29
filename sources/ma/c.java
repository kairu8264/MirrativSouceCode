package ma;

import com.dena.mirrativ.mirrativapi.livegame.LiveGameGift;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameGiftHelpResponse;
import java.util.ArrayList;
import java.util.List;
import jo.p;
import xn.t;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f40637d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f40638e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final e f40639a;

    /* renamed from: b  reason: collision with root package name */
    public final List<j> f40640b;

    /* renamed from: c  reason: collision with root package name */
    public final String f40641c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(LiveGameGiftHelpResponse liveGameGiftHelpResponse) {
            p.h(liveGameGiftHelpResponse, "response");
            e a10 = e.f40653d.a(liveGameGiftHelpResponse);
            List<LiveGameGift> gifts = liveGameGiftHelpResponse.getGifts();
            ArrayList arrayList = new ArrayList(t.u(gifts, 10));
            for (LiveGameGift liveGameGift : gifts) {
                arrayList.add(j.f40699d.a(liveGameGift));
            }
            return new c(a10, arrayList, liveGameGiftHelpResponse.getNotes());
        }
    }

    public c(e eVar, List<j> list, String str) {
        p.h(eVar, "headerBindModel");
        p.h(list, "gifts");
        p.h(str, "notes");
        this.f40639a = eVar;
        this.f40640b = list;
        this.f40641c = str;
    }

    public final List<j> a() {
        return this.f40640b;
    }

    public final e b() {
        return this.f40639a;
    }

    public final String c() {
        return this.f40641c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return p.c(this.f40639a, cVar.f40639a) && p.c(this.f40640b, cVar.f40640b) && p.c(this.f40641c, cVar.f40641c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f40639a.hashCode() * 31) + this.f40640b.hashCode()) * 31) + this.f40641c.hashCode();
    }

    public String toString() {
        return "LiveGameGiftHelpBindModel(headerBindModel=" + this.f40639a + ", gifts=" + this.f40640b + ", notes=" + this.f40641c + ')';
    }
}
