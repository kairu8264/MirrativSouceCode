package xc;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public abstract class b {

    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f60131a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: xc.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0999b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f60132a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0999b(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f60132a = mRError;
        }

        public final MRError a() {
            return this.f60132a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0999b) && p.c(this.f60132a, ((C0999b) obj).f60132a);
        }

        public int hashCode() {
            return this.f60132a.hashCode();
        }

        public String toString() {
            return "RegisterDateFailed(error=" + this.f60132a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f60133a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        public final ChatStatus f60134a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ChatStatus chatStatus) {
            super(null);
            p.h(chatStatus, "response");
            this.f60134a = chatStatus;
        }

        public final ChatStatus a() {
            return this.f60134a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p.c(this.f60134a, ((d) obj).f60134a);
        }

        public int hashCode() {
            return this.f60134a.hashCode();
        }

        public String toString() {
            return "RegisterDateSucceeded(response=" + this.f60134a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends b {

        /* renamed from: a  reason: collision with root package name */
        public final int f60135a;

        public e(int i10) {
            super(null);
            this.f60135a = i10;
        }

        public final int a() {
            return this.f60135a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f60135a == ((e) obj).f60135a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f60135a);
        }

        public String toString() {
            return "SelectedDayChanged(currentIndex=" + this.f60135a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final int f60136a;

        public f(int i10) {
            super(null);
            this.f60136a = i10;
        }

        public final int a() {
            return this.f60136a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f60136a == ((f) obj).f60136a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f60136a);
        }

        public String toString() {
            return "SelectedMonthChanged(currentIndex=" + this.f60136a + ')';
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
