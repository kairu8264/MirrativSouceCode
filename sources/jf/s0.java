package jf;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.Social;

/* loaded from: classes2.dex */
public abstract class s0 {

    /* loaded from: classes2.dex */
    public static final class a extends s0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f37989a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f37989a = mRError;
        }

        public final MRError a() {
            return this.f37989a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f37989a, ((a) obj).f37989a);
        }

        public int hashCode() {
            return this.f37989a.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.f37989a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends s0 {

        /* renamed from: a  reason: collision with root package name */
        public final Social.SocialAccount f37990a;

        /* renamed from: b  reason: collision with root package name */
        public final t0 f37991b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Social.SocialAccount socialAccount, t0 t0Var) {
            super(null);
            jo.p.h(socialAccount, "socialAccount");
            jo.p.h(t0Var, "resultViewsState");
            this.f37990a = socialAccount;
            this.f37991b = t0Var;
        }

        public final t0 a() {
            return this.f37991b;
        }

        public final Social.SocialAccount b() {
            return this.f37990a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(this.f37990a, bVar.f37990a) && jo.p.c(this.f37991b, bVar.f37991b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f37990a.hashCode() * 31) + this.f37991b.hashCode();
        }

        public String toString() {
            return "Success(socialAccount=" + this.f37990a + ", resultViewsState=" + this.f37991b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends s0 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f37992a = new c();

        public c() {
            super(null);
        }
    }

    public s0() {
    }

    public /* synthetic */ s0(jo.h hVar) {
        this();
    }
}
