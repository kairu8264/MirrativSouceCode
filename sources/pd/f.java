package pd;

import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarPartsResponse;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarResponse;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrativ.mirrativapi.closet.ClosetResponse;
import com.dena.mirrativ.mirrativapi.closet.ClosetsResponse;
import com.dena.mirrativ.mirrativapi.closet.UpdateCompanionNameResponse;
import com.dena.mirrativ.mirrativapi.closet.UpdatePartTextResponse;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.request.UpdateClosetImagesRequest;
import com.dena.mirrorman.net.api.request.UpdateClosetNameRequest;
import com.dena.mirrorman.net.api.response.PurchaseAvatarsResponse;
import com.dena.mirrorman.net.api.response.UserCurrencyResponse;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class f {

    /* loaded from: classes2.dex */
    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f46732a = new a();

        public a() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final a0 f46733a = new a0();

        public a0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f46734a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final jf.c f46735a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(jf.c cVar) {
            super(null);
            jo.p.h(cVar, "closetAvatarModel");
            this.f46735a = cVar;
        }

        public final jf.c a() {
            return this.f46735a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && jo.p.c(this.f46735a, ((b0) obj).f46735a);
        }

        public int hashCode() {
            return this.f46735a.hashCode();
        }

        public String toString() {
            return "SetClosetAvatarModel(closetAvatarModel=" + this.f46735a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f46736a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final ClosetAvatar f46737a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ClosetAvatar closetAvatar) {
            super(null);
            jo.p.h(closetAvatar, "closetAvatar");
            this.f46737a = closetAvatar;
        }

        public final ClosetAvatar a() {
            return this.f46737a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && jo.p.c(this.f46737a, ((c0) obj).f46737a);
        }

        public int hashCode() {
            return this.f46737a.hashCode();
        }

        public String toString() {
            return "SetEditingAvatar(closetAvatar=" + this.f46737a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46738a;

        /* renamed from: b  reason: collision with root package name */
        public final MRError f46739b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46738a = i10;
            this.f46739b = mRError;
        }

        public final int a() {
            return this.f46738a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f46738a == dVar.f46738a && jo.p.c(this.f46739b, dVar.f46739b);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f46738a) * 31) + this.f46739b.hashCode();
        }

        public String toString() {
            return "FailFetchCloset(closetId=" + this.f46738a + ", error=" + this.f46739b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46740a;

        public d0(int i10) {
            super(null);
            this.f46740a = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && this.f46740a == ((d0) obj).f46740a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46740a);
        }

        public String toString() {
            return "StartFetchCloset(closetId=" + this.f46740a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends f {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46741a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46741a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f46741a, ((e) obj).f46741a);
        }

        public int hashCode() {
            return this.f46741a.hashCode();
        }

        public String toString() {
            return "FailFetchClosetParts(error=" + this.f46741a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final e0 f46742a = new e0();

        public e0() {
            super(null);
        }
    }

    /* renamed from: pd.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0714f extends f {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46743a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0714f(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46743a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0714f) && jo.p.c(this.f46743a, ((C0714f) obj).f46743a);
        }

        public int hashCode() {
            return this.f46743a.hashCode();
        }

        public String toString() {
            return "FailFetchCurrentCloset(error=" + this.f46743a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final f0 f46744a = new f0();

        public f0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46745a;

        /* renamed from: b  reason: collision with root package name */
        public final MRError f46746b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i10, MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46745a = i10;
            this.f46746b = mRError;
        }

        public final int a() {
            return this.f46745a;
        }

        public final MRError b() {
            return this.f46746b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return this.f46745a == gVar.f46745a && jo.p.c(this.f46746b, gVar.f46746b);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f46745a) * 31) + this.f46746b.hashCode();
        }

        public String toString() {
            return "FailUpdateCloset(closetId=" + this.f46745a + ", error=" + this.f46746b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46747a;

        public g0(int i10) {
            super(null);
            this.f46747a = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g0) && this.f46747a == ((g0) obj).f46747a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46747a);
        }

        public String toString() {
            return "StartUpdateCloset(closetId=" + this.f46747a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46748a;

        /* renamed from: b  reason: collision with root package name */
        public final UpdateClosetImagesRequest f46749b;

        /* renamed from: c  reason: collision with root package name */
        public final MRError f46750c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i10, UpdateClosetImagesRequest updateClosetImagesRequest, MRError mRError) {
            super(null);
            jo.p.h(updateClosetImagesRequest, "updateClosetImagesRequest");
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46748a = i10;
            this.f46749b = updateClosetImagesRequest;
            this.f46750c = mRError;
        }

        public final UpdateClosetImagesRequest a() {
            return this.f46749b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return this.f46748a == hVar.f46748a && jo.p.c(this.f46749b, hVar.f46749b) && jo.p.c(this.f46750c, hVar.f46750c);
            }
            return false;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f46748a) * 31) + this.f46749b.hashCode()) * 31) + this.f46750c.hashCode();
        }

        public String toString() {
            return "FailUpdateClosetAndClosetImages(closetId=" + this.f46748a + ", updateClosetImagesRequest=" + this.f46749b + ", error=" + this.f46750c + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46751a;

        public h0(int i10) {
            super(null);
            this.f46751a = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h0) && this.f46751a == ((h0) obj).f46751a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46751a);
        }

        public String toString() {
            return "StartUpdateClosetAndClosetImages(closetId=" + this.f46751a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46752a;

        /* renamed from: b  reason: collision with root package name */
        public final UpdateClosetImagesRequest f46753b;

        /* renamed from: c  reason: collision with root package name */
        public final MRError f46754c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i10, UpdateClosetImagesRequest updateClosetImagesRequest, MRError mRError) {
            super(null);
            jo.p.h(updateClosetImagesRequest, "updateClosetImagesRequest");
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46752a = i10;
            this.f46753b = updateClosetImagesRequest;
            this.f46754c = mRError;
        }

        public final UpdateClosetImagesRequest a() {
            return this.f46753b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof i) {
                i iVar = (i) obj;
                return this.f46752a == iVar.f46752a && jo.p.c(this.f46753b, iVar.f46753b) && jo.p.c(this.f46754c, iVar.f46754c);
            }
            return false;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f46752a) * 31) + this.f46753b.hashCode()) * 31) + this.f46754c.hashCode();
        }

        public String toString() {
            return "FailUpdateClosetImages(closetId=" + this.f46752a + ", updateClosetImagesRequest=" + this.f46753b + ", error=" + this.f46754c + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46755a;

        public i0(int i10) {
            super(null);
            this.f46755a = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i0) && this.f46755a == ((i0) obj).f46755a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46755a);
        }

        public String toString() {
            return "StartUpdateClosetImages(closetId=" + this.f46755a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46756a;

        /* renamed from: b  reason: collision with root package name */
        public final UpdateClosetNameRequest f46757b;

        /* renamed from: c  reason: collision with root package name */
        public final MRError f46758c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i10, UpdateClosetNameRequest updateClosetNameRequest, MRError mRError) {
            super(null);
            jo.p.h(updateClosetNameRequest, "updateClosetNameRequest");
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46756a = i10;
            this.f46757b = updateClosetNameRequest;
            this.f46758c = mRError;
        }

        public final UpdateClosetNameRequest a() {
            return this.f46757b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return this.f46756a == jVar.f46756a && jo.p.c(this.f46757b, jVar.f46757b) && jo.p.c(this.f46758c, jVar.f46758c);
            }
            return false;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f46756a) * 31) + this.f46757b.hashCode()) * 31) + this.f46758c.hashCode();
        }

        public String toString() {
            return "FailUpdateClosetName(closetId=" + this.f46756a + ", updateClosetNameRequest=" + this.f46757b + ", error=" + this.f46758c + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46759a;

        public j0(int i10) {
            super(null);
            this.f46759a = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j0) && this.f46759a == ((j0) obj).f46759a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46759a);
        }

        public String toString() {
            return "StartUpdateClosetName(closetId=" + this.f46759a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends f {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46760a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46760a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(this.f46760a, ((k) obj).f46760a);
        }

        public int hashCode() {
            return this.f46760a.hashCode();
        }

        public String toString() {
            return "FailUpdateCompanionName(error=" + this.f46760a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final k0 f46761a = new k0();

        public k0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends f {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46762a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46762a = mRError;
        }

        public final MRError a() {
            return this.f46762a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && jo.p.c(this.f46762a, ((l) obj).f46762a);
        }

        public int hashCode() {
            return this.f46762a.hashCode();
        }

        public String toString() {
            return "FailUpdatePartText(error=" + this.f46762a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final l0 f46763a = new l0();

        public l0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends f {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46764a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46764a = mRError;
        }

        public final MRError a() {
            return this.f46764a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && jo.p.c(this.f46764a, ((m) obj).f46764a);
        }

        public int hashCode() {
            return this.f46764a.hashCode();
        }

        public String toString() {
            return "FailedToCreateUserProfile(error=" + this.f46764a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final m0 f46765a = new m0();

        public m0() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46766a;

        /* renamed from: b  reason: collision with root package name */
        public final ClosetAvatarResponse f46767b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i10, ClosetAvatarResponse closetAvatarResponse) {
            super(null);
            jo.p.h(closetAvatarResponse, "response");
            this.f46766a = i10;
            this.f46767b = closetAvatarResponse;
        }

        public final int a() {
            return this.f46766a;
        }

        public final ClosetAvatarResponse b() {
            return this.f46767b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return this.f46766a == nVar.f46766a && jo.p.c(this.f46767b, nVar.f46767b);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f46766a) * 31) + this.f46767b.hashCode();
        }

        public String toString() {
            return "FinishFetchCloset(closetId=" + this.f46766a + ", response=" + this.f46767b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final jf.k0 f46768a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(jf.k0 k0Var) {
            super(null);
            jo.p.h(k0Var, "partsCategory");
            this.f46768a = k0Var;
        }

        public final jf.k0 a() {
            return this.f46768a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n0) && this.f46768a == ((n0) obj).f46768a;
        }

        public int hashCode() {
            return this.f46768a.hashCode();
        }

        public String toString() {
            return "UnEquippedCategoryParts(partsCategory=" + this.f46768a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends f {

        /* renamed from: a  reason: collision with root package name */
        public final ClosetAvatarPartsResponse f46769a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ClosetAvatarPartsResponse closetAvatarPartsResponse) {
            super(null);
            jo.p.h(closetAvatarPartsResponse, "response");
            this.f46769a = closetAvatarPartsResponse;
        }

        public final ClosetAvatarPartsResponse a() {
            return this.f46769a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && jo.p.c(this.f46769a, ((o) obj).f46769a);
        }

        public int hashCode() {
            return this.f46769a.hashCode();
        }

        public String toString() {
            return "FinishFetchClosetParts(response=" + this.f46769a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class o0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46770a;

        public o0(boolean z10) {
            super(null);
            this.f46770a = z10;
        }

        public final boolean a() {
            return this.f46770a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o0) && this.f46770a == ((o0) obj).f46770a;
        }

        public int hashCode() {
            boolean z10 = this.f46770a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "UpdateAvatarPreviewMode(isAvatarPreviewMode=" + this.f46770a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends f {

        /* renamed from: a  reason: collision with root package name */
        public final UserCurrencyResponse f46771a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(UserCurrencyResponse userCurrencyResponse) {
            super(null);
            jo.p.h(userCurrencyResponse, "response");
            this.f46771a = userCurrencyResponse;
        }

        public final UserCurrencyResponse a() {
            return this.f46771a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && jo.p.c(this.f46771a, ((p) obj).f46771a);
        }

        public int hashCode() {
            return this.f46771a.hashCode();
        }

        public String toString() {
            return "FinishFetchCurrency(response=" + this.f46771a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class p0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46772a;

        public p0(int i10) {
            super(null);
            this.f46772a = i10;
        }

        public final int a() {
            return this.f46772a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p0) && this.f46772a == ((p0) obj).f46772a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46772a);
        }

        public String toString() {
            return "UpdateColor(colorId=" + this.f46772a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends f {

        /* renamed from: a  reason: collision with root package name */
        public final ClosetAvatarResponse f46773a;

        /* renamed from: b  reason: collision with root package name */
        public final ClosetsResponse f46774b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ClosetAvatarResponse closetAvatarResponse, ClosetsResponse closetsResponse) {
            super(null);
            jo.p.h(closetAvatarResponse, "currentClosetResponse");
            jo.p.h(closetsResponse, "closetsResponse");
            this.f46773a = closetAvatarResponse;
            this.f46774b = closetsResponse;
        }

        public final ClosetsResponse a() {
            return this.f46774b;
        }

        public final ClosetAvatarResponse b() {
            return this.f46773a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                q qVar = (q) obj;
                return jo.p.c(this.f46773a, qVar.f46773a) && jo.p.c(this.f46774b, qVar.f46774b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f46773a.hashCode() * 31) + this.f46774b.hashCode();
        }

        public String toString() {
            return "FinishFetchCurrentCloset(currentClosetResponse=" + this.f46773a + ", closetsResponse=" + this.f46774b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class q0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final float f46775a;

        /* renamed from: b  reason: collision with root package name */
        public final jf.k0 f46776b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(float f10, jf.k0 k0Var) {
            super(null);
            jo.p.h(k0Var, "partsCategory");
            this.f46775a = f10;
            this.f46776b = k0Var;
        }

        public final jf.k0 a() {
            return this.f46776b;
        }

        public final float b() {
            return this.f46775a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q0) {
                q0 q0Var = (q0) obj;
                return jo.p.c(Float.valueOf(this.f46775a), Float.valueOf(q0Var.f46775a)) && this.f46776b == q0Var.f46776b;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f46775a) * 31) + this.f46776b.hashCode();
        }

        public String toString() {
            return "UpdateColorPercentage(percentage=" + this.f46775a + ", partsCategory=" + this.f46776b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46777a;

        /* renamed from: b  reason: collision with root package name */
        public final ClosetAvatarResponse f46778b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(int i10, ClosetAvatarResponse closetAvatarResponse) {
            super(null);
            jo.p.h(closetAvatarResponse, "response");
            this.f46777a = i10;
            this.f46778b = closetAvatarResponse;
        }

        public final int a() {
            return this.f46777a;
        }

        public final ClosetAvatarResponse b() {
            return this.f46778b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof r) {
                r rVar = (r) obj;
                return this.f46777a == rVar.f46777a && jo.p.c(this.f46778b, rVar.f46778b);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f46777a) * 31) + this.f46778b.hashCode();
        }

        public String toString() {
            return "FinishUpdateCloset(closetId=" + this.f46777a + ", response=" + this.f46778b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class r0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final String f46779a;

        /* renamed from: b  reason: collision with root package name */
        public final jf.k0 f46780b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(String str, jf.k0 k0Var) {
            super(null);
            jo.p.h(str, "partsId");
            jo.p.h(k0Var, "partsCategory");
            this.f46779a = str;
            this.f46780b = k0Var;
        }

        public final jf.k0 a() {
            return this.f46780b;
        }

        public final String b() {
            return this.f46779a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof r0) {
                r0 r0Var = (r0) obj;
                return jo.p.c(this.f46779a, r0Var.f46779a) && this.f46780b == r0Var.f46780b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f46779a.hashCode() * 31) + this.f46780b.hashCode();
        }

        public String toString() {
            return "UpdateParts(partsId=" + this.f46779a + ", partsCategory=" + this.f46780b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46781a;

        /* renamed from: b  reason: collision with root package name */
        public final ClosetAvatarResponse f46782b;

        /* renamed from: c  reason: collision with root package name */
        public final ClosetResponse f46783c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f46784d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(int i10, ClosetAvatarResponse closetAvatarResponse, ClosetResponse closetResponse, boolean z10) {
            super(null);
            jo.p.h(closetAvatarResponse, "avatarResponse");
            jo.p.h(closetResponse, "closetResponse");
            this.f46781a = i10;
            this.f46782b = closetAvatarResponse;
            this.f46783c = closetResponse;
            this.f46784d = z10;
        }

        public final ClosetAvatarResponse a() {
            return this.f46782b;
        }

        public final int b() {
            return this.f46781a;
        }

        public final ClosetResponse c() {
            return this.f46783c;
        }

        public final boolean d() {
            return this.f46784d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s) {
                s sVar = (s) obj;
                return this.f46781a == sVar.f46781a && jo.p.c(this.f46782b, sVar.f46782b) && jo.p.c(this.f46783c, sVar.f46783c) && this.f46784d == sVar.f46784d;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((Integer.hashCode(this.f46781a) * 31) + this.f46782b.hashCode()) * 31) + this.f46783c.hashCode()) * 31;
            boolean z10 = this.f46784d;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "FinishUpdateClosetAndClosetImages(closetId=" + this.f46781a + ", avatarResponse=" + this.f46782b + ", closetResponse=" + this.f46783c + ", fromOnboarding=" + this.f46784d + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class s0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final jf.k0 f46785a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(jf.k0 k0Var) {
            super(null);
            jo.p.h(k0Var, "partsCategory");
            this.f46785a = k0Var;
        }

        public final jf.k0 a() {
            return this.f46785a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s0) && this.f46785a == ((s0) obj).f46785a;
        }

        public int hashCode() {
            return this.f46785a.hashCode();
        }

        public String toString() {
            return "UpdatePartsCategory(partsCategory=" + this.f46785a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46786a;

        /* renamed from: b  reason: collision with root package name */
        public final ClosetResponse f46787b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(int i10, ClosetResponse closetResponse) {
            super(null);
            jo.p.h(closetResponse, "response");
            this.f46786a = i10;
            this.f46787b = closetResponse;
        }

        public final int a() {
            return this.f46786a;
        }

        public final ClosetResponse b() {
            return this.f46787b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof t) {
                t tVar = (t) obj;
                return this.f46786a == tVar.f46786a && jo.p.c(this.f46787b, tVar.f46787b);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f46786a) * 31) + this.f46787b.hashCode();
        }

        public String toString() {
            return "FinishUpdateClosetImages(closetId=" + this.f46786a + ", response=" + this.f46787b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class t0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final jf.m0 f46788a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(jf.m0 m0Var) {
            super(null);
            jo.p.h(m0Var, "partsLargeCategory");
            this.f46788a = m0Var;
        }

        public final jf.m0 a() {
            return this.f46788a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t0) && this.f46788a == ((t0) obj).f46788a;
        }

        public int hashCode() {
            return this.f46788a.hashCode();
        }

        public String toString() {
            return "UpdatePartsLargeCategory(partsLargeCategory=" + this.f46788a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class u extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46789a;

        /* renamed from: b  reason: collision with root package name */
        public final ClosetResponse f46790b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(int i10, ClosetResponse closetResponse) {
            super(null);
            jo.p.h(closetResponse, "response");
            this.f46789a = i10;
            this.f46790b = closetResponse;
        }

        public final int a() {
            return this.f46789a;
        }

        public final ClosetResponse b() {
            return this.f46790b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof u) {
                u uVar = (u) obj;
                return this.f46789a == uVar.f46789a && jo.p.c(this.f46790b, uVar.f46790b);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f46789a) * 31) + this.f46790b.hashCode();
        }

        public String toString() {
            return "FinishUpdateClosetName(closetId=" + this.f46789a + ", response=" + this.f46790b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class u0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final ClosetAvatarSimpleValue f46791a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(ClosetAvatarSimpleValue closetAvatarSimpleValue) {
            super(null);
            jo.p.h(closetAvatarSimpleValue, "pose");
            this.f46791a = closetAvatarSimpleValue;
        }

        public final ClosetAvatarSimpleValue a() {
            return this.f46791a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u0) && jo.p.c(this.f46791a, ((u0) obj).f46791a);
        }

        public int hashCode() {
            return this.f46791a.hashCode();
        }

        public String toString() {
            return "UpdatePose(pose=" + this.f46791a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class v extends f {

        /* renamed from: a  reason: collision with root package name */
        public final String f46792a;

        /* renamed from: b  reason: collision with root package name */
        public final UpdateCompanionNameResponse f46793b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, UpdateCompanionNameResponse updateCompanionNameResponse) {
            super(null);
            jo.p.h(str, "partId");
            jo.p.h(updateCompanionNameResponse, "response");
            this.f46792a = str;
            this.f46793b = updateCompanionNameResponse;
        }

        public final String a() {
            return this.f46792a;
        }

        public final UpdateCompanionNameResponse b() {
            return this.f46793b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof v) {
                v vVar = (v) obj;
                return jo.p.c(this.f46792a, vVar.f46792a) && jo.p.c(this.f46793b, vVar.f46793b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f46792a.hashCode() * 31) + this.f46793b.hashCode();
        }

        public String toString() {
            return "FinishUpdateCompanionName(partId=" + this.f46792a + ", response=" + this.f46793b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class v0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final PurchaseAvatarsResponse f46794a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(PurchaseAvatarsResponse purchaseAvatarsResponse) {
            super(null);
            jo.p.h(purchaseAvatarsResponse, "response");
            this.f46794a = purchaseAvatarsResponse;
        }

        public final PurchaseAvatarsResponse a() {
            return this.f46794a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v0) && jo.p.c(this.f46794a, ((v0) obj).f46794a);
        }

        public int hashCode() {
            return this.f46794a.hashCode();
        }

        public String toString() {
            return "UpdatePurchaseItem(response=" + this.f46794a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends f {

        /* renamed from: a  reason: collision with root package name */
        public final String f46795a;

        /* renamed from: b  reason: collision with root package name */
        public final UpdatePartTextResponse f46796b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(String str, UpdatePartTextResponse updatePartTextResponse) {
            super(null);
            jo.p.h(str, "partId");
            jo.p.h(updatePartTextResponse, "response");
            this.f46795a = str;
            this.f46796b = updatePartTextResponse;
        }

        public final String a() {
            return this.f46795a;
        }

        public final UpdatePartTextResponse b() {
            return this.f46796b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof w) {
                w wVar = (w) obj;
                return jo.p.c(this.f46795a, wVar.f46795a) && jo.p.c(this.f46796b, wVar.f46796b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f46795a.hashCode() * 31) + this.f46796b.hashCode();
        }

        public String toString() {
            return "FinishUpdatePartText(partId=" + this.f46795a + ", response=" + this.f46796b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class w0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f46797a;

        public w0(int i10) {
            super(null);
            this.f46797a = i10;
        }

        public final int a() {
            return this.f46797a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w0) && this.f46797a == ((w0) obj).f46797a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46797a);
        }

        public String toString() {
            return "UpdateSelectedClosetId(closetId=" + this.f46797a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends f {

        /* renamed from: a  reason: collision with root package name */
        public final String f46798a;

        /* renamed from: b  reason: collision with root package name */
        public final String f46799b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f46800c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str, String str2, boolean z10) {
            super(null);
            jo.p.h(str, TtmlNode.ATTR_ID);
            jo.p.h(str2, "iconUrl");
            this.f46798a = str;
            this.f46799b = str2;
            this.f46800c = z10;
        }

        public final String a() {
            return this.f46799b;
        }

        public final String b() {
            return this.f46798a;
        }

        public final boolean c() {
            return this.f46800c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof x) {
                x xVar = (x) obj;
                return jo.p.c(this.f46798a, xVar.f46798a) && jo.p.c(this.f46799b, xVar.f46799b) && this.f46800c == xVar.f46800c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f46798a.hashCode() * 31) + this.f46799b.hashCode()) * 31;
            boolean z10 = this.f46800c;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "PartsDisplayReserved(id=" + this.f46798a + ", iconUrl=" + this.f46799b + ", isTrial=" + this.f46800c + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class x0 extends f {

        /* renamed from: a  reason: collision with root package name */
        public final List<jf.k0> f46801a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public x0(List<? extends jf.k0> list) {
            super(null);
            jo.p.h(list, "shooterCategories");
            this.f46801a = list;
        }

        public final List<jf.k0> a() {
            return this.f46801a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x0) && jo.p.c(this.f46801a, ((x0) obj).f46801a);
        }

        public int hashCode() {
            return this.f46801a.hashCode();
        }

        public String toString() {
            return "UpdateShooterCategories(shooterCategories=" + this.f46801a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class y extends f {

        /* renamed from: a  reason: collision with root package name */
        public final String f46802a;

        /* renamed from: b  reason: collision with root package name */
        public final String f46803b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str, String str2) {
            super(null);
            jo.p.h(str, TtmlNode.ATTR_ID);
            jo.p.h(str2, "iconUrl");
            this.f46802a = str;
            this.f46803b = str2;
        }

        public final String a() {
            return this.f46802a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof y) {
                y yVar = (y) obj;
                return jo.p.c(this.f46802a, yVar.f46802a) && jo.p.c(this.f46803b, yVar.f46803b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f46802a.hashCode() * 31) + this.f46803b.hashCode();
        }

        public String toString() {
            return "PartsDisplayed(id=" + this.f46802a + ", iconUrl=" + this.f46803b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class z extends f {

        /* renamed from: a  reason: collision with root package name */
        public final ClosetAvatar f46804a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ClosetAvatar closetAvatar) {
            super(null);
            jo.p.h(closetAvatar, "closetAvatar");
            this.f46804a = closetAvatar;
        }

        public final ClosetAvatar a() {
            return this.f46804a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && jo.p.c(this.f46804a, ((z) obj).f46804a);
        }

        public int hashCode() {
            return this.f46804a.hashCode();
        }

        public String toString() {
            return "ResetEditingAvatar(closetAvatar=" + this.f46804a + ')';
        }
    }

    public f() {
    }

    public /* synthetic */ f(jo.h hVar) {
        this();
    }
}
