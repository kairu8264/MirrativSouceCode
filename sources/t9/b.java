package t9;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestEquipmentGachaResultsResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestGiftGachaResultsResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestOpenGiftEventResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.util.Set;
import jf.k0;
import jo.p;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f53318a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f53318a = mRError;
        }

        public final MRError a() {
            return this.f53318a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p.c(this.f53318a, ((a) obj).f53318a);
        }

        public int hashCode() {
            return this.f53318a.hashCode();
        }

        public String toString() {
            return "FetchAvatarFailed(error=" + this.f53318a + ')';
        }
    }

    /* renamed from: t9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0827b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EmomoQuestOpenGiftEventResponse f53319a;

        /* renamed from: b  reason: collision with root package name */
        public final jf.c f53320b;

        /* renamed from: c  reason: collision with root package name */
        public final Set<k0> f53321c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0827b(EmomoQuestOpenGiftEventResponse emomoQuestOpenGiftEventResponse, jf.c cVar, Set<? extends k0> set) {
            super(null);
            p.h(emomoQuestOpenGiftEventResponse, "openGiftEvent");
            p.h(cVar, "closetAvatar");
            p.h(set, "updateParts");
            this.f53319a = emomoQuestOpenGiftEventResponse;
            this.f53320b = cVar;
            this.f53321c = set;
        }

        public final jf.c a() {
            return this.f53320b;
        }

        public final EmomoQuestOpenGiftEventResponse b() {
            return this.f53319a;
        }

        public final Set<k0> c() {
            return this.f53321c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0827b) {
                C0827b c0827b = (C0827b) obj;
                return p.c(this.f53319a, c0827b.f53319a) && p.c(this.f53320b, c0827b.f53320b) && p.c(this.f53321c, c0827b.f53321c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f53319a.hashCode() * 31) + this.f53320b.hashCode()) * 31) + this.f53321c.hashCode();
        }

        public String toString() {
            return "FetchAvatarSucceeded(openGiftEvent=" + this.f53319a + ", closetAvatar=" + this.f53320b + ", updateParts=" + this.f53321c + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f53322a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f53322a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p.c(this.f53322a, ((c) obj).f53322a);
        }

        public int hashCode() {
            return this.f53322a.hashCode();
        }

        public String toString() {
            return "PostGameEndFailed(error=" + this.f53322a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f53323a = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f53324a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f53324a = mRError;
        }

        public final MRError a() {
            return this.f53324a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p.c(this.f53324a, ((e) obj).f53324a);
        }

        public int hashCode() {
            return this.f53324a.hashCode();
        }

        public String toString() {
            return "PostOpenEquipmentGachaFailed(error=" + this.f53324a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EmomoQuestEquipmentGachaResultsResponse f53325a;

        /* renamed from: b  reason: collision with root package name */
        public final String f53326b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EmomoQuestEquipmentGachaResultsResponse emomoQuestEquipmentGachaResultsResponse, String str) {
            super(null);
            p.h(emomoQuestEquipmentGachaResultsResponse, "response");
            p.h(str, "responseJson");
            this.f53325a = emomoQuestEquipmentGachaResultsResponse;
            this.f53326b = str;
        }

        public final EmomoQuestEquipmentGachaResultsResponse a() {
            return this.f53325a;
        }

        public final String b() {
            return this.f53326b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return p.c(this.f53325a, fVar.f53325a) && p.c(this.f53326b, fVar.f53326b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f53325a.hashCode() * 31) + this.f53326b.hashCode();
        }

        public String toString() {
            return "PostOpenEquipmentGachaSucceeded(response=" + this.f53325a + ", responseJson=" + this.f53326b + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f53327a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f53327a = mRError;
        }

        public final MRError a() {
            return this.f53327a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && p.c(this.f53327a, ((g) obj).f53327a);
        }

        public int hashCode() {
            return this.f53327a.hashCode();
        }

        public String toString() {
            return "PostOpenGiftGachaFailed(error=" + this.f53327a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EmomoQuestGiftGachaResultsResponse f53328a;

        /* renamed from: b  reason: collision with root package name */
        public final String f53329b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(EmomoQuestGiftGachaResultsResponse emomoQuestGiftGachaResultsResponse, String str) {
            super(null);
            p.h(emomoQuestGiftGachaResultsResponse, "giftGachaResultsResponse");
            p.h(str, "responseJson");
            this.f53328a = emomoQuestGiftGachaResultsResponse;
            this.f53329b = str;
        }

        public final EmomoQuestGiftGachaResultsResponse a() {
            return this.f53328a;
        }

        public final String b() {
            return this.f53329b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return p.c(this.f53328a, hVar.f53328a) && p.c(this.f53329b, hVar.f53329b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f53328a.hashCode() * 31) + this.f53329b.hashCode();
        }

        public String toString() {
            return "PostOpenGiftGachaSucceeded(giftGachaResultsResponse=" + this.f53328a + ", responseJson=" + this.f53329b + ')';
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
